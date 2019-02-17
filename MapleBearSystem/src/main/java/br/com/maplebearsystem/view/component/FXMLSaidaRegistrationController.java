package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

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
	private VBox pnButtons;

	@FXML
	private HBox pnEditorMode;
	
	private FXMLDefaultControllerInterface sourceController;

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {

		tviewColID.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, Long>("id"));
		tviewColProductDescription.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, String>("shortDescription"));
		tviewColPartUnitQuant.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado, String>("stockQuantity"));
		tviewColPartUnitQuantM.setCellValueFactory(new PropertyValueFactory<ProdutoAlterado,String>("qtd"));
	}

	@FXML
	private JFXButton btnNew;

	@FXML
	private JFXButton btnGoBack;

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

	public void setData(List<Product> resultado) {
		// TODO Auto-generated method stub
		ObservableList<ProdutoAlterado> modelo;
		
		List<ProdutoAlterado> lista = new ArrayList<ProdutoAlterado>();
		
		for (Product product : resultado) {
			lista.add(new ProdutoAlterado(product,0));
		}

		modelo = FXCollections.observableArrayList(lista);

		tviewSearch.setItems(null);
		tviewSearch.setItems(modelo);
	}

	public void switchToSaidaMode() {
		btnNew.setText("Retirar Produto(s)");
	}

	public VBox getRootPane() {
		// TODO Auto-generated method stub
		return this.rootPane;
	}

}
