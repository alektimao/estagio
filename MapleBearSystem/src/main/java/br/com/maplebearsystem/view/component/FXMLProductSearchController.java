package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.ProductController;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLPedidoController;
import br.com.maplebearsystem.view.FXMLProductManagerController;
import br.com.maplebearsystem.view.FXMLRetirarProdutoController;
import br.com.maplebearsystem.view.FXMLSaidaManagerController;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLProductSearchController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private VBox rootPane;
	@FXML
	private JFXTextField tfieldSearch;
	@FXML
	private JFXButton btnSearch;
	@FXML
	private TableView<FornecedorProduct> tviewSearch;
	@FXML
	private TableColumn<FornecedorProduct, String> tviewColID;
	@FXML
	private TableColumn<FornecedorProduct, String> tviewColProductDescription;
	@FXML
	private TableColumn<FornecedorProduct, String> tviewColProductPrice;
	@FXML
	private TableColumn<FornecedorProduct, String> tviewColPartUnitQuant;
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
	
	private ProductController modelController;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new ProductController();
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

		if (sourceController instanceof FXMLProductManagerController) {
			try {
				((FXMLProductManagerController) sourceController)
						.editProduct(tviewSearch.getSelectionModel().getSelectedItem().getProduct());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;
		}
		return false;
	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE );

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
				TableRow<FornecedorProduct> row = new TableRow<FornecedorProduct>();
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

//		ObservableList<Product> modelo;
//
//		if (filter.equals("")) {
//			modelo = FXCollections.observableArrayList(modelController.getProducts());
//		} else {
//
//			modelo = FXCollections.observableArrayList(modelController.getProducts(filter));
//		}
		ObservableList<FornecedorProduct> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(modelController.getFornecedorProducts());
		} else {

			modelo = FXCollections.observableArrayList(modelController.getFornecedorProducts(filter));
		}

		tviewSearch.setItems(modelo);
	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.WARNING, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		modelController.deleteProduct();

		return true;
	}

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {
		
		tviewColID.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getFornecedor().getNomefantasia());
			});
		tviewColProductDescription.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getProduct().getShortDescription());
			});
		tviewColPartUnitQuant.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getProduct().getEstoque().getQtd());
			});
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	public void loadResultList(List<FornecedorProduct> list) {
		ObservableList<FornecedorProduct> modelo;

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
			modelController.setupEditProduct(tviewSearch.getSelectionModel().getSelectedItem().getProduct());
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

	}

	@FXML
	void actSPNew(ActionEvent event) {
		if (sourceController instanceof FXMLProductManagerController) {
			((FXMLProductManagerController) sourceController).addNewProduct();
		}
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		loadTableView(tfieldSearch.getText());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		if (sourceController instanceof FXMLSaidaManagerController) {
			FXMLSaidaManagerController controller = (FXMLSaidaManagerController) sourceController;
			
			try {
				List<FornecedorProduct> resultado = tviewSearch.getSelectionModel().getSelectedItems();
				//controller.abrePainelSaidaRegistration(resultado);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sourceController instanceof FXMLPedidoController)
		{
			FXMLPedidoController controller = (FXMLPedidoController) sourceController;
			try {
				List<FornecedorProduct> resultado = tviewSearch.getSelectionModel().getSelectedItems();
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sourceController instanceof FXMLRetirarProdutoController)
		{
			FXMLRetirarProdutoController controller = (FXMLRetirarProdutoController) sourceController;
			try {
				List<FornecedorProduct> resultado = tviewSearch.getSelectionModel().getSelectedItems();
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
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public  VBox getRootPane() {
		// TODO Auto-generated method stub
		return rootPane;
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
