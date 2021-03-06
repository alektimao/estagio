package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.FuncionarioController;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.FXMLAlocarEquipamentoController;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLReceberController;
import br.com.maplebearsystem.view.FXMLRetirarProdutoController;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLFuncionarioSearchController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private StackPane rootPane;
	@FXML
	private JFXTextField tfieldSearch;
	@FXML
	private JFXButton btnSearch;
	@FXML
	private TableView<Funcionario> tviewSearch;
	@FXML
	private TableColumn<Funcionario, String> tviewColID;
	@FXML
	private TableColumn<Funcionario, String> tviewFunc;
	@FXML
	private TableColumn<Funcionario, String> tviewNivel;
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
	private JFXButton btnGoBack;
	@FXML
	private HBox pnSelectorMode;
	@FXML
	private JFXButton btnSelect;
	@FXML
	private JFXButton btnCancel;

	private FXMLDefaultControllerInterface sourceController;

	private FuncionarioController modelController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new FuncionarioController();
		switchToEditorMode();
		btnDelete.setDisable(false);
		btnEdit.setDisable(false);
		initUI();
	}

// SECTION Main FXMLController Methods

	private boolean selectItem() {

		try {
			sourceController.receiveData(tviewSearch.getSelectionModel().getSelectedItem(), this);
			sourceController.closeSenderNode(this);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	private boolean editItem() {
		if (tviewSearch.getSelectionModel().getSelectedItem() != null) {
			try {
				FXMLFuncionarioRegistrationController controller = FXUISetup
						.getInstance().loadFXMLIntoStackPane(rootPane,
								FXResourcePath.FXML_MAPLEBEARSYSTEM_CADASTRAR_FUNCIONARIO, null, 0.0)
						.<FXMLFuncionarioRegistrationController>getController();
				controller.setSourceFXMLController(this);
				controller.receiveData(tviewSearch.getSelectionModel().getSelectedItem(), this);

				return true;
			} catch (Exception e) {
				Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
			}
		}
		return false;

	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

			if (pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().remove(pnEditorMode);
			if (!pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().add(pnSelectorMode);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public void switchToEditorMode() {
		try {
			tviewSearch.setRowFactory(tv -> {
				TableRow<Funcionario> row = new TableRow<Funcionario>();
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
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public void reloadTableView() {
		loadTableView(tfieldSearch.getText());
	}

	private void loadTableView(String filter) {

		ObservableList<Funcionario> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(modelController.getlistFuncionario());
		} else {

			modelo = FXCollections.observableArrayList(modelController.getlistFuncionario(filter));
		}

		tviewSearch.setItems(modelo);
	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.WARNING, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		modelController.deleteFuncionario();

		return true;
	}
	
	@FXML
	void actOnTableMouseClicked() {
		if (tviewSearch.getSelectionModel() != null && tviewSearch.getSelectionModel().getSelectedItem() != null) {
			btnDelete.setDisable(false);
			btnEdit.setDisable(false);
		} else {
			btnDelete.setDisable(true);
			btnEdit.setDisable(true);
		}
	}

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {

		tviewColID.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getPessoa().getName());
		});
		tviewNivel.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getLevel());
		});
		tviewFunc.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getJob());
		});
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	public void loadResultList(List<Funcionario> list) {
		ObservableList<Funcionario> modelo;

		modelo = FXCollections.observableArrayList(list);

		tviewSearch.setItems(modelo);

	}

	public void loadResultForFilter(String filter) {
		loadTableView(filter);
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actCancel(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void actSPDelete(ActionEvent event) {
		try {
			modelController.setupEditFuncionario(tviewSearch.getSelectionModel().getSelectedItem());
			if (delete()) {
				loadTableView(tfieldSearch.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: couldn't delete Product - " + e.getMessage());
		}
	}

	@FXML
	void actSPEdit(ActionEvent event) {
		editItem();
	}

	@FXML
	void actSPNew(ActionEvent event) {
		try {
			FXMLFuncionarioRegistrationController controller = FXUISetup
					.getInstance().loadFXMLIntoStackPane(rootPane,
							FXResourcePath.FXML_MAPLEBEARSYSTEM_CADASTRAR_FUNCIONARIO, null, 0.0)
					.<FXMLFuncionarioRegistrationController>getController();
			controller.setSourceFXMLController(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
		}
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		loadTableView(tfieldSearch.getText());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		if (sourceController instanceof FXMLAlocarEquipamentoController) {
			FXMLAlocarEquipamentoController controller = (FXMLAlocarEquipamentoController) sourceController;
			try {
				Funcionario resultado = tviewSearch.getSelectionModel().getSelectedItem();
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (sourceController instanceof FXMLRetirarProdutoController) {
			FXMLRetirarProdutoController controller = (FXMLRetirarProdutoController) sourceController;
			try {
				Funcionario resultado = tviewSearch.getSelectionModel().getSelectedItem();
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FXML
	void actSelectorEdit(ActionEvent event) {

	}

	@FXML
	void actGoBack(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLFuncionarioRegistrationController) {
			FXMLFuncionarioRegistrationController obj = (FXMLFuncionarioRegistrationController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLFuncionarioSearchController) {
			FXMLFuncionarioSearchController obj = (FXMLFuncionarioSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	public StackPane getRootPane() {
		// TODO Auto-generated method stub
		return rootPane;
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
