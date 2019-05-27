package br.com.maplebearsystem.view.component;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.transaction.Transactional.TxType;

import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.FornecedorController;
import br.com.maplebearsystem.controller.FornecedorProductController;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLMenuHomeController;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.DropShadow;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class FXMLProductFornecedorFormController implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private StackPane rootPane;

	@FXML
	private JFXTextField tfieldInternalCod;

	@FXML
	private JFXTextField tfieldNome;

	@FXML
	private JFXTextField tfieldTelefone;

	@FXML
	private JFXTextField tfieldEndereco;

	@FXML
	private TableView<Product> TbProdutos;

	@FXML
	private TableColumn<Product, String> colproduto;

	private FXMLDefaultControllerInterface sourceController;

	private FornecedorController fornproduct;

	@FXML
	void addprod(ActionEvent event) {
		try {
			FXMLProdutoSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLE_PRODUTO_BUSCA, new DropShadow(70.0, Color.BLACK), 10.0)
					.<FXMLProdutoSearchController>getController();
			controler.switchToSelectorMode();
			controler.setSourceFXMLController(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void remove(ActionEvent event) {
		try {
			Product product = TbProdutos.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION,
					"Deseja remover a seguinte produto adicionado:\n" + product.getShortDescription() + "?",
					ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				fornproduct.removeProduct(product);
				loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadTableView() {
		try {
			ObservableList<Product> modelo;
			modelo = FXCollections.observableArrayList(fornproduct.getProduct());
			if (TbProdutos.getItems() != null)
				TbProdutos.getItems().clear();
			TbProdutos.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getShortDescription());
		});
	}

	@FXML
	void buscarpessoa(MouseEvent event) {
		loadtela(FXResourcePath.FXML_PESSOA_BUSCAR);
	}

	public void loadtela(URL url) {
		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, url, new DropShadow(20.0, Color.BLACK), 10.0)
					.<FXMLDefaultControllerInterface>getController();

			controller.setSourceFXMLController(this);
			if (controller instanceof FXMLContactSearchController) {
				((FXMLContactSearchController) controller).setJuridicaModeOnly(true);
				((FXMLContactSearchController) controller).switchToSelectorMode2();
			}
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to load menu: " + url.getPath(), e);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fornproduct = new FornecedorController();
		fornproduct.setupNewFornecedor();
		initTableViews();
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
		if (sender instanceof FXMLContactSearchController) {
			if (data instanceof Pessoa) {
				Pessoa resultado = (Pessoa) data;
				loadPessoa(resultado);
			}
		}
		if (sender instanceof FXMLProdutoSearchController) {
			if (data instanceof List<?>) {
				List<Product> resultado = (List<Product>) data;
				fornproduct.validateListaProduto(resultado);
				loadTableView();
			}
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLContactSearchController) {
			FXMLContactSearchController obj = (FXMLContactSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProdutoSearchController) {
			FXMLProdutoSearchController obj = (FXMLProdutoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		// TODO Auto-generated method stub

	}
	
	public StackPane getRootPane() {
		return rootPane;
	}
	public FornecedorController getFornecedorController() {
		return fornproduct;
	}

	private void loadPessoa(Pessoa resultado) {
		fornproduct.getFornecedor().setPessoa((PessoaJuridica) resultado);
		tfieldNome.setText(fornproduct.getFornecedor().getPessoa().getRazaoSocial());
		tfieldEndereco.setText(fornproduct.getFornecedor().getPessoa().getPrimaryAddress().getAddress());
		tfieldTelefone.setText(fornproduct.getFornecedor().getPessoa().getPrimaryPhone().getPhoneString());
	}

}
