package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.AlocarController;
import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.FXMLAlocarEquipamentoController;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLPedidoController;
import br.com.maplebearsystem.view.FXMLReceberController;
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

public class FXMLBuscaEmprestimoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private JFXTextField tfieldSearch;

	@FXML
	private JFXButton btnSearch;

	@FXML
	private TableView<Alocar> tviewSearch;

	@FXML
	private TableColumn<Alocar, String> tviewColID;

	@FXML
	private TableColumn<Alocar, String> tviewColDescription;

	@FXML
	private TableColumn<Alocar, String> tviewColdata;

	@FXML
	private TableColumn<Alocar, String> tviewColValortotal;

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

	private AlocarController modelController;

	private FXMLDefaultControllerInterface sourceController;

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
	void actGoBack(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void actSPDelete(ActionEvent event) {
		delete();
	}

	@FXML
	void actSPEdit(ActionEvent event) {
		editItem();
	}

	@FXML
	void actSPNew(ActionEvent event) {
		try {
			FXMLAlocarEquipamentoController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_EMPRESTAR, null, 0.0)
					.<FXMLAlocarEquipamentoController>getController();
			controller.setSourceFXMLController(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
		}
	}

	private boolean editItem() {
		if (tviewSearch.getSelectionModel().getSelectedItem() != null) {
			try {
				FXMLAlocarEquipamentoController controller = FXUISetup
						.getInstance().loadFXMLIntoStackPane(rootPane,
								FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_EMPRESTAR, null, 0.0)
						.<FXMLAlocarEquipamentoController>getController();
				controller.setSourceFXMLController(this);
				controller.receiveData(tviewSearch.getSelectionModel().getSelectedItem(), this);

				return true;
			} catch (Exception e) {
				Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
			}
		}
		return false;

	}

	@FXML
	void actSPSearch(ActionEvent event) {
		loadTableView(tfieldSearch.getText());
	}

	private void loadTableView(String filter) {
		ObservableList<Alocar> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(modelController.getPedidos());
		} else {

			modelo = FXCollections.observableArrayList(modelController.getPedidos(filter));
		}

		tviewSearch.setItems(modelo);
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		if (sourceController instanceof FXMLAlocarEquipamentoController) {
			FXMLAlocarEquipamentoController controller = (FXMLAlocarEquipamentoController) sourceController;
			try {
				Alocar resultado = tviewSearch.getSelectionModel().getSelectedItem();
//				controller.abrePainelSaidaRegistration(resultado);
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

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		try {
			Alocar itemToRemove = tviewSearch.getSelectionModel().getSelectedItem();
			modelController.deleteAlocar(itemToRemove);
			tviewSearch.getItems().remove(itemToRemove);
		} catch (PersistenceException ex) {
			new FXNotification("Não e possivel deletar Emprestimo com produtos", FXNotification.NotificationType.ERROR)
					.show();
			return false;
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.FINE, "Info: failed to save contact", e);
			new FXNotification("Error: " + e.getMessage() + e.getCause(), FXNotification.NotificationType.ERROR).show();
			return false;
		}

		return true;
	}

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {
		tviewColID.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getId());
		});
		tviewColDescription.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getFuncionario().getPessoa().getName());
		});
		tviewColdata.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDia());
		});
		tviewColValortotal.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getSala());
		});
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLAlocarEquipamentoController) {
			FXMLAlocarEquipamentoController obj = (FXMLAlocarEquipamentoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
			loadTableView("");
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new AlocarController();
		switchToEditorMode();
		initUI();
	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

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
				TableRow<Alocar> row = new TableRow<Alocar>();
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

	public StackPane getRootPane() {
		return rootPane;
	}

}
