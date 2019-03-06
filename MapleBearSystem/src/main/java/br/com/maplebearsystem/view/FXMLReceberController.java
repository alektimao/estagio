package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.view.component.FXMLBuscaPedidoController;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLReceberController implements Initializable, FXMLDefaultControllerInterface {

   	@FXML
	private VBox panelMain;
	@FXML
	private StackPane rootPane;
    @FXML
    private JFXTextField txtdescricao;

    @FXML
    private JFXDatePicker dtdatapedido;

    @FXML
    private JFXTextField txtvalortotal;

    @FXML
    private JFXButton btBuscarPedido;

    @FXML
    private TableView<Requisicao_Produto> tviewprodutos;

    @FXML
    private TableColumn<Requisicao_Produto, String> colproduto;

    @FXML
    private TableColumn<Requisicao_Produto, String> colfornecedor;

    @FXML
    private TableColumn<Requisicao_Produto, String> colqtd;

    @FXML
    private TableColumn<Requisicao_Produto, String> colvalor;

    @FXML
    private TableColumn<Requisicao_Produto, String> coltotal;

    @FXML
    private TableColumn<Requisicao_Produto, String> coldata;

    @FXML
    private TableColumn<Requisicao_Produto, String> colrecebido;

    @FXML
    private JFXButton btReceber;

    @FXML
    private JFXButton btSalvar;

    @FXML
    private JFXButton btCancelar;
	
    private PedidoController controlerPedido;
 
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
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLBuscaPedidoController) {
			if (data instanceof List<?>) {
				List<Requisicao> resultado = (List<Requisicao>) data;
//				controlerPedido.validateListaProduto(resultado);
				loadTableView();
			}
		}
	}

	private void loadTableView() {
		try {
			ObservableList<Requisicao_Produto> modelo;
			modelo = FXCollections.observableArrayList(controlerPedido.getRequisicao().getRequestedParts());
			if (tviewprodutos.getItems() != null)
				tviewprodutos.getItems().clear();
			tviewprodutos.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
		
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();

		}

		if (sender instanceof FXMLProductSearchController) {
			FXMLBuscaPedidoController obj = (FXMLBuscaPedidoController) sender;
			//rootPane.getChildren().remove(obj.getRootPane());

		}
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	void receberpedido(ActionEvent event) {
		try {
			FXMLBuscaPedidoController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, MapleBearSystemDesktopClient.class,
							FXMLResourcePathsEnum.FXML_MAPLE_PEDIDO_BUSCA.getPath(), new DropShadow(), 100.0)
					.<FXMLBuscaPedidoController>getController();
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
}
