package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.controller.PessoaController;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class FXMLContactSearchController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private VBox primaryPane;
	@FXML
	private JFXTextField tfieldSearch;
	@FXML
	private JFXButton btnSearch;
	@FXML
	private TableView<Pessoa> tviewPessoas;
	@FXML
	private TableColumn<Pessoa, Long> tviewColID;
	@FXML
	private TableColumn<Pessoa, String> tviewColName;
	@FXML
	private TableColumn<Pessoa, String> tviewColCPFCNPJ;
	@FXML
	private TableColumn<Pessoa, String> tviewColPhone;
	@FXML
	private TableColumn<Pessoa, String> tviewColAddress;
	@FXML
	private TableColumn<Pessoa, String> tviewColAddressDistrict;
	@FXML
	private TableColumn<Pessoa, String> tviewColCityUF;
	@FXML
	private VBox pnButtons;
	@FXML
	private HBox pnEditorMode;
	@FXML
	private JFXButton btnNew;
	@FXML
	private JFXButton btnEdit;
	@FXML
	private JFXButton btnDelete;
	@FXML
	private HBox pnSelectorMode;
	@FXML
	private JFXButton btnSelect;
	@FXML
	private JFXButton btnCancel;

// SECTION Main FXMLController Attributes
	private FXMLDefaultControllerInterface sourceController;
	private boolean JuridicaModeOnly;
	private PessoaController modelController;
	private FXMLContactRegistrationController contactRegistrationController;
// ENDSECTION Main FXMLController Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setModelController(new PessoaController());

		initUI();
	}

// SECTION Main FXMLController Methods

	private boolean delete() {

		Alert alert = new Alert(
				Alert.AlertType.CONFIRMATION,
				"Deseja realmente deletar Este Item?",
				ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		try {
			Pessoa itemToRemove = tviewPessoas.getSelectionModel().getSelectedItem();
			getModelController().deletePessoa(itemToRemove);
			tviewPessoas.getItems().remove(itemToRemove);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.FINE, "Info: failed to save contact", e);
			new FXNotification("Error: " + e.getMessage() + e.getCause(), FXNotification.NotificationType.ERROR).show();
			return false;
		}

		return true;
	}

	private boolean editItem() {

		try {
			FXMLContactRegistrationController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_PESSOA_GERENCIAR, null, 0.0)
					.<FXMLContactRegistrationController>getController();
			controller.setSourceFXMLController(this);
			controller.receiveData(tviewPessoas.getSelectionModel().getSelectedItem(), this);
			this.contactRegistrationController = controller;

			return true;
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
		}

		return false;
	}

	private boolean selectItem() {

		try {
			sourceController.receiveData(tviewPessoas.getSelectionModel().getSelectedItem(), this);
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName())
			.log(Level.WARNING, "Warning: failed to switch to selectItem", e);
		}

		return false;
	}

	public void switchToSelectorMode() {

		try {
			tviewPessoas.setRowFactory(tv -> {
				TableRow<Pessoa> row = new TableRow<Pessoa>();
				row.setOnMouseClicked(event -> {
					if (event.getClickCount() == 2 && (!row.isEmpty())) {
						selectItem();
					}
				});
				return row;
			});

			if (pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().remove(pnEditorMode);
			if (!pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().add(pnSelectorMode);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName())
					.log(Level.WARNING, "Warning: failed to switch to SelectorMode", e);
			this.actCancel(null);
		}

	}

	public void switchToEditorMode() {
		try {
			tviewPessoas.setRowFactory(tv -> {
				TableRow<Pessoa> row = new TableRow<Pessoa>();
				row.setOnMouseClicked(event -> {
					if (event.getClickCount() == 2 && (!row.isEmpty())) {
						editItem();
					}
				});
				return row;
			});

			if (pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().remove(pnSelectorMode);
			if (!pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().add(pnEditorMode);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName())
					.log(Level.WARNING, "Warning: failed to switch to SelectorEditor mode", e);
			this.actCancel(null);
		}

	}

	public void reloadTableView() {
		LoadTableView(tfieldSearch.getText());

	}

	public void switchToJuridicaModeOnly() {
		setJuridicaModeOnly(true);
	}

	private void LoadTableView(final String filter) {

		Task<ObservableList<Pessoa>> task = new Task<ObservableList<Pessoa>>() {

			@Override
			protected ObservableList<Pessoa> call() throws Exception {
				setModelController(new PessoaController());
				ObservableList<Pessoa> modelo;

				if (filter.equals("")) {

					if (isJuridicaModeOnly()) {
						modelo = FXCollections.observableArrayList(getModelController().getJuridicas());
					} else {
						modelo = FXCollections.observableArrayList(getModelController().getPessoas());
					}
				} else {
					if (isJuridicaModeOnly()) {
						modelo = FXCollections.observableArrayList(getModelController().getJuridicas(filter));
					} else {
						modelo = FXCollections.observableList(getModelController().getPessoas(filter));
					}
				}
				return modelo;
			}

		};

		task.setOnSucceeded((event) -> {

			Platform.runLater(() -> {
				try {
					tviewPessoas.setItems(task.get());
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName())
							.log(Level.WARNING, "Error: failed to to load contacts into tableview", e);
				}
			});

		});

		new Thread(task).run();
	}

// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

// ENDSECTION Helper FXMLController Methods

// SECTION Data Manipulation FXMLController Methods

// ENDSECTION Data Manipulation FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {

		setJuridicaModeOnly(false);
		btnDelete.setDisable(true);
		btnEdit.setDisable(true);

		tviewColID.setCellValueFactory(new PropertyValueFactory<Pessoa, Long>("id"));
		tviewColName.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("name"));
		// with lambda
		tviewColPhone.setCellValueFactory((CellDataFeatures<Pessoa, String> data) -> {
			try {
				return new SimpleStringProperty(data.getValue().getPrimaryPhone().getPhoneString());
			} catch (Exception e) {
				return new SimpleStringProperty("");
			}
		});
		// with lambda
		tviewColCPFCNPJ.setCellValueFactory((CellDataFeatures<Pessoa, String> data) -> {
			if (data.getValue() instanceof PessoaFisica) {
				return new SimpleStringProperty(((PessoaFisica) data.getValue()).getCpf());
			} else {
				return new SimpleStringProperty(((PessoaJuridica) data.getValue()).getCnpj());
			}
		});
		// with Lambda
		tviewColAddress.setCellValueFactory((CellDataFeatures<Pessoa, String> data) -> {
			return new SimpleStringProperty(data.getValue().getPrimaryAddress().getAddressAndNumber());
		});
		// with Lambda
		tviewColAddressDistrict.setCellValueFactory((CellDataFeatures<Pessoa, String> data) -> {
			return new SimpleStringProperty(data.getValue().getPrimaryAddress().getDistrict());
		});
		// without lambda
		tviewColCityUF.setCellValueFactory(new Callback<CellDataFeatures<Pessoa, String>, ObservableValue<String>>() {
			@Override
			public ObservableValue<String> call(CellDataFeatures<Pessoa, String> data) {
				return new SimpleStringProperty(
						data.getValue().getPrimaryAddress().getCity().getCityAndProvinceStateAbbreviationText());
			}
		});
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException();
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actSPDelete(ActionEvent event) {
		if (delete()) {
			LoadTableView(tfieldSearch.getText());
		}
	}

	@FXML
	void actSPEdit(ActionEvent event) {
		editItem();
	}

	@FXML
	void actSPNew(ActionEvent event) {
		try {
			FXMLContactRegistrationController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_PESSOA_GERENCIAR, null, 0.0)
					.<FXMLContactRegistrationController>getController();

			controller.setSourceFXMLController(this);
			controller.setupNewContact();
			this.contactRegistrationController = controller;

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName())
					.log(Level.WARNING, "Error: failed open FXMLContactRegistrationController", e);
		}

	}

	@FXML
	void actSPSearch(ActionEvent event) {
		LoadTableView(tfieldSearch.getText().toLowerCase());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		selectItem();
	}

	@FXML
	void actSelectorEdit(ActionEvent event) {
		editItem();
	}

	@FXML
	void actCancel(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to close", e);
		}
	}

	@FXML
	void actOnTableMouseClicked() {
		if (tviewPessoas.getSelectionModel() != null && tviewPessoas.getSelectionModel().getSelectedItem() != null) {
			btnDelete.setDisable(false);
			btnEdit.setDisable(false);
		} else {
			btnDelete.setDisable(true);
			btnEdit.setDisable(false);
		}
	}
// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		sourceController = controller;

	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new UnsupportedOperationException();

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		throw new UnsupportedOperationException();

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException("Sender cannot be null");
		}

		if (sender instanceof FXMLContactRegistrationController) {
			rootPane.getChildren().remove(this.contactRegistrationController.getRootPane());
			contactRegistrationController = null;
			reloadTableView();
			return;
		}
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

	public PessoaController getModelController() {
		return modelController;
	}

	public void setModelController(PessoaController modelController) {
		this.modelController = modelController;
	}

	public boolean isJuridicaModeOnly() {
		return JuridicaModeOnly;
	}

	public void setJuridicaModeOnly(boolean juridicaModeOnly) {
		JuridicaModeOnly = juridicaModeOnly;
	}
}
