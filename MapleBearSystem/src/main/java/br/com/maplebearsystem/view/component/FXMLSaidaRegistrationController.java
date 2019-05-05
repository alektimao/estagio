package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.maplebearsystem.controller.EstoqueController;
import br.com.maplebearsystem.controller.ProductController;
import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;
import javafx.fxml.Initializable;

import com.jfoenix.controls.JFXButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLSaidaRegistrationController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private VBox rootPane;

	@FXML
	private TableView<ProdutoAlterado> tviewSearch;

	@FXML
	private TableColumn<ProdutoAlterado, Long> tviewColID;

	@FXML
	private TableColumn<ProdutoAlterado, String> tviewColProductDescription;

	@FXML
	private TableColumn<ProdutoAlterado, String> tviewColPartUnitQuant;

	@FXML
	private TableColumn<ProdutoAlterado, String> tviewColPartUnitQuantM;
	
	@FXML
	private TableColumn<ProdutoAlterado, String> tviewColPartUnitQuantMax;

	@FXML
	private VBox pnButtons;

	@FXML
	private HBox pnEditorMode;

	@FXML
	private VBox pnSaidaForm;
	@FXML
	private FXMLProductSaidaFormController pnSaidaFormController;

	private FXMLDefaultControllerInterface sourceController;
	private ProdutoAlterado tempproduct;
	private List<ProdutoAlterado> lista;
	ProductController modelController;
	private void initUI() {
		modelController = new ProductController();
		initTableViews();
	}

	private void initTableViews() {

		tviewColID.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, Long>("id"));
		tviewColProductDescription.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, String>("shortDescription"));
		tviewColPartUnitQuant.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, String>("qtd"));
		tviewColPartUnitQuantM.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, String>("max"));
		tviewColPartUnitQuantMax.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, String>("min"));
	}

	@FXML
	private JFXButton btnNew;

	@FXML
	private JFXButton btnGoBack;
	@FXML
	private JFXButton btnDeletar;

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
	void actSPNew(ActionEvent event) {
		List<Product> items = new ArrayList<Product>();
		for (ProdutoAlterado p : tviewSearch.getItems()) {
			items.add(p.getProduto());
		}

		new ProductDAO().save(items);
	}
	
	@FXML
	void actSPDelete(ActionEvent event) {
//		List<Product> items = new ArrayList<Product>();
//
//		for (ProdutoAlterado p : tviewSearch.getItems()) {
//			p.getProduto().setStockQuantity(new Integer(p.getProduto().getStockQuantity().intValue() - p.getQtd()));
//			//items.add(p.getProduto());
//			estoqueController.deleteEstoque();
//		}

	}

	@FXML
	void actTableviewSelectItem() {
		try {

			// checar se tem valor
			if (tempproduct != null) {
				int value = Integer.parseInt(pnSaidaFormController.getTfieldUnitQuant().getText());
				tempproduct.getProduto().getEstoque().setQtd(value);
			}

			tempproduct = tviewSearch.getSelectionModel().getSelectedItem();

			pnSaidaFormController.loadData(tempproduct);

			tviewSearch.refresh();
			// popular
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub
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
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initUI();
	}

	public void setData(List<Product> dado) {
		// TODO Auto-generated method stub

		List<ProdutoAlterado> lista = new ArrayList<ProdutoAlterado>();

		for (Product product : dado) {
			lista.add(new ProdutoAlterado(product, 0,0));
		}

		this.lista = lista;

		recarregarTabela(lista);
	}

	public VBox getRootPane() {
		// TODO Auto-generated method stub
		return this.rootPane;
	}

	private void recarregarTabela(List<ProdutoAlterado> dado) {

		ObservableList<ProdutoAlterado> modelo;

		modelo = FXCollections.observableArrayList(dado);

		tviewSearch.setItems(null);
		tviewSearch.setItems(modelo);
	}

}
