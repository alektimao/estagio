package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.AlocarController;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Alocar_Produto;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLAlocarEquipamentoController implements Initializable, FXMLDefaultControllerInterface{

    @FXML
    private StackPane rootPane;

    @FXML
    private VBox panelMain;

    @FXML
    private JFXTextField tfieldFuncionario;

    @FXML
    private JFXButton btbusca;

    @FXML
    private VBox vboxprodutos;

    @FXML
    private TableView<Alocar_Produto> tviewProducts;

    @FXML
    private TableColumn<Alocar_Produto, String> colproduto;

    @FXML
    private TableColumn<Alocar_Produto, String> colqtd;

    @FXML
    private TableColumn<Alocar_Produto, String> colqtdpedido;

    @FXML
    private JFXButton btadd1;

    @FXML
    private JFXButton btremover1;

    @FXML
    private JFXTextField txtsala;

    @FXML
    private JFXTextField txtaula;

    @FXML
    private JFXButton btsalvar;
    
    @FXML
    private JFXTextArea txtobs;

    @FXML
    private JFXDatePicker dtemprestimo;

    @FXML
    private JFXDatePicker dtdevolucao;
    
    private AlocarController controlerAlocar;

    @FXML
    void addproduto(ActionEvent event) {
    	try {
			FXMLProductSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLE_PRODUTOFORNECEDOR_BUSCA, null, 0.0)
					.<FXMLProductSearchController>getController();
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
    void buscarpedido(ActionEvent event) {

    }

    @FXML
    void removerproduto(ActionEvent event) {
    	try {
			Alocar_Produto product = tviewProducts.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover a seguinte peça / produto adicionado:\n"
					+ product.getProdAlocar().getShortDescription() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				controlerAlocar.removeProduct(product);
				loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void loadTableView() {
		// TODO Auto-generated method stub
		
	}

	@FXML
    void salvarpedido(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {

    }

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub
		
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
		
	}

}
