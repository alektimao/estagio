package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.ContratoController;
import br.com.maplebearsystem.model.Contrato;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLContratoSearchController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox rootPane;

	@FXML
	private JFXTextField tfieldNome;

	@FXML
	private JFXTextField tfieldResponsavel;

	@FXML
	private JFXTextField tfieldTurma;

	@FXML
	private JFXButton btnSPSearch;

	@FXML
	private TableView<Contrato> tviewPessoas;

	@FXML
	private TableColumn<Contrato, String> tviewColID;

	@FXML
	private TableColumn<Contrato, String> tviewColName;

	@FXML
	private TableColumn<Contrato, String> tviewColResponsavel;

	@FXML
	private TableColumn<Contrato, String> tviewColTurma;

	@FXML
	private HBox pnSelectorMode;

	@FXML
	private JFXButton btnSelect;

	@FXML
	private JFXButton btnEdit;

	@FXML
	private JFXButton btnSPDelete;

	@FXML
	private JFXButton btnCancel;

// SECTION Main FXMLController Attributes
	private FXMLDefaultControllerInterface sourceController;
	private ContratoController modelController;
	private FXMLContactRegistrationController contactRegistrationController;
// ENDSECTION Main FXMLController Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setModelController(new ContratoController());
		//tfieldResponsavel.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		initTableViews();
	}

// SECTION Main FXMLController Methods

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		try {
			Contrato itemToRemove = tviewPessoas.getSelectionModel().getSelectedItem();
			getModelController().deleteContrato(itemToRemove);
			tviewPessoas.getItems().remove(itemToRemove);
		}
		catch (PersistenceException ex)
		{
			new FXNotification("Não e possivel deletar Contrato pois ele e utlizado em outras funções do sistema", FXNotification.NotificationType.ERROR).show();
			return false;
		}
		catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.FINE, "Info: failed to save contact", e);
			new FXNotification("Error: " + e.getMessage() + e.getCause(), FXNotification.NotificationType.ERROR).show();
			return false;
		}

		return true;
	}

	private boolean selectItem() {

		try {
			sourceController.receiveData(tviewPessoas.getSelectionModel().getSelectedItem(), this);
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to switch to selectItem",
					e);
		}

		return false;
	}

	public void switchToSelectorMode() {

		try {
			tviewPessoas.setRowFactory(tv -> {
				TableRow<Contrato> row = new TableRow<Contrato>();
				row.setOnMouseClicked(event -> {
					if (event.getClickCount() == 2 && (!row.isEmpty())) {
						selectItem();
					}
				});
				return row;
			});
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to switch to SelectorMode",
					e);
			this.actCancel(null);
		}

	}

	public void reloadTableView() {
		LoadTableView(tfieldResponsavel.getText(), tfieldTurma.getText(),tfieldNome.getText());
	}

	private void LoadTableView(String responsavel, String turma, String aluno) {
		if (responsavel.equals("") && turma.equals("") && aluno.equals("")) {
			try {
				ObservableList<Contrato> modelo;
				modelo = FXCollections.observableArrayList(modelController.getContratos());
				if (tviewPessoas.getItems() != null)
					tviewPessoas.getItems().clear();
				tviewPessoas.setItems(modelo);
			} catch (Exception e) {
				System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
			}
		} else {
			try {
				ObservableList<Contrato> modelo;
				modelo = FXCollections.observableArrayList(modelController.getContratos(responsavel, turma, aluno));
				if (tviewPessoas.getItems() != null)
					tviewPessoas.getItems().clear();
				tviewPessoas.setItems(modelo);
			} catch (Exception e) {
				System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
			}
		}
	}

// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

// ENDSECTION Helper FXMLController Methods

// SECTION Data Manipulation FXMLController Methods

// ENDSECTION Data Manipulation FXMLController Methods

// SECTION UISetup FXMLController Methods
	@Override
	public void reset() {
		throw new UnsupportedOperationException();
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actSPDelete(ActionEvent event) {
		if (delete()) {
			LoadTableView(tfieldResponsavel.getText(), tfieldTurma.getText(),tfieldNome.getText());
		}
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		LoadTableView(tfieldResponsavel.getText(), tfieldTurma.getText(),tfieldNome.getText());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		selectItem();
	}

	@FXML
	void actCancel(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to close", e);
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

	public ContratoController getModelController() {
		return modelController;
	}

	public void setModelController(ContratoController modelController) {
		this.modelController = modelController;
	}
	
	private void initTableViews() {
		tviewColID.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getId());
		});
		tviewColResponsavel.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getResponsavel());
		});
		tviewColName.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getAluno());
		});
		tviewColTurma.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getTurma());
		});
	}

	public VBox getRootPane() {
		// TODO Auto-generated method stub
		return rootPane;
	}
}
