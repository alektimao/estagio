package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.controller.PedidoFuncController;
import br.com.maplebearsystem.model.PedidoFunc;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLPedidoController;
import br.com.maplebearsystem.view.FXMLPedidoFuncController;
import br.com.maplebearsystem.view.FXMLReceberController;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLBuscaPedidoFuncController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox rootPane;

	@FXML
	private JFXTextField tfieldSearch;

	@FXML
	private JFXButton btnSearch;

	@FXML
	private TableView<PedidoFunc> tviewSearch;

	@FXML
	private TableColumn<PedidoFunc, String> tviewColID;

	@FXML
	private TableColumn<PedidoFunc, String> tviewColProd;

	@FXML
	private TableColumn<PedidoFunc, String> tviewColData;

	@FXML
	private TableColumn<PedidoFunc, String> tviewColAutorizado;

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

	private PedidoFuncController modelController;

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

	}

	@FXML
	void actSPEdit(ActionEvent event) {

	}

	@FXML
	void actSPNew(ActionEvent event) {

	}

	@FXML
	void actSPSearch(ActionEvent event) {
		loadTableView(tfieldSearch.getText());
	}

	private void loadTableView(String filter) {
		ObservableList<PedidoFunc> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(modelController.getPedidos());
		} else {

			modelo = FXCollections.observableArrayList(modelController.getPedidos(filter));
		}

		tviewSearch.setItems(modelo);
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		if(sourceController instanceof FXMLPedidoController)
		{
			FXMLPedidoController controller = (FXMLPedidoController) sourceController;
			try {
				PedidoFunc resultado = tviewSearch.getSelectionModel().getSelectedItem();
//				controller.abrePainelSaidaRegistration(resultado);
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (sourceController instanceof FXMLReceberController) {
			FXMLReceberController controller = (FXMLReceberController) sourceController;
			try {
				PedidoFunc resultado = tviewSearch.getSelectionModel().getSelectedItem();
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sourceController instanceof FXMLPedidoFuncController)
		{
			FXMLPedidoFuncController controller = (FXMLPedidoFuncController) sourceController;
			try {
				PedidoFunc resultado = tviewSearch.getSelectionModel().getSelectedItem();
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

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {
		tviewColProd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDescricao());
		});
		tviewColData.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getRequestDate());
		});
		tviewColAutorizado.setCellValueFactory((data)->{
			return new SimpleStringProperty(data.getValue().getFuncionario() != null ? data.getValue().getFuncionario().getPessoa().getName():"");
			});
		tviewColID.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getId());
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
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new PedidoFuncController();
		modelController.setupNewPedidoFunc();
		initUI();
	}
	
//	public void switchToEditorMode() {
//		try {
//			tviewSearch.setRowFactory(tv -> {
//				TableRow<Product> row = new TableRow<Product>();
//				row.setOnMouseClicked(event -> {
//					if (event.getClickCount() == 2 && (!row.isEmpty())) {
//						editItem();
//					}
//				});
//				return row;
//			});
//
//			if (pnButtons.getChildren().contains(pnSelectorMode))
//				pnButtons.getChildren().remove(pnSelectorMode);
//			if (!pnButtons.getChildren().contains(pnEditorMode))
//				pnButtons.getChildren().add(pnEditorMode);
//
//		} catch (Exception e) {
//			// TODO log exception e
//
//			System.out.println(e.getMessage());
//		}
//
//	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.SINGLE );

			if (pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().remove(pnEditorMode);
			if (!pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().add(pnSelectorMode);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public VBox getRootPane() {
		return rootPane;
	}
	
//	private boolean editItem() {
//
//		if (sourceController instanceof FXMLPedidoController) {
//			try {
////				((FXMLPedidoController) sourceController)
////						.editProduct(tviewSearch.getSelectionModel().getSelectedItem());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			return true;
//		}
//		return false;
//	}
}
