package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLMenuProdutoController implements Initializable, FXMLDefaultControllerInterface {

    @FXML
    private StackPane mainAreaContainer;

    @FXML
    private HBox hbox;

    @FXML
    private JFXButton btnCadastroProduto;
    
    @FXML
    private JFXButton btnCadastroFornecedor;
    
    @FXML
    private JFXButton btnCadastroEmprestar;

    @FXML
    private JFXButton btnPedirProduto;

    @FXML
    private JFXButton btnReceberProduto;

    @FXML
    private JFXButton btnRetirarProdutos;

	private FXMLMenuHomeController sourceController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
		Platform.runLater(() -> {

			new FXNotification("Teste aviso", FXNotification.NotificationType.WARNING).show();
		});
	}
	public StackPane getRootPane() {
		return mainAreaContainer;
	}

	private void initUI() {
		// Platform.runLater(() -> hbox = (HBox) primaryPane.getParent());

	}

	@FXML
	void actCadastroProduto(ActionEvent event) {
		sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_CADASTRAR_PRODUTOS);
	}
	
	@FXML
	void actCadastroFornecedor(ActionEvent event) {
		sourceController.loadForm(FXResourcePath.FXML_MAPLE_FORNECEDOR_BUSCA);
	}
	
	@FXML
	void actCadastroEmprestar(ActionEvent event) {
		//sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_EMPRESTAR);
		sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_EMPRESTAR_BUSCAR);
	}

	@FXML
	void actConfigure(ActionEvent event) {

	}

	@FXML
	void actExit(ActionEvent event) {
		try {
			sourceController.closeSenderNodeMenu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void actPedirProduto(ActionEvent event) {
		sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_PEDIR_PRODUTOS);
	}

	@FXML
	void actReceberProduto(ActionEvent event) {
		sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_RECEBER_PRODUTOS);
	}

	@FXML
	void actRetirarProdutos(ActionEvent event) {
		sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_RETIRAR_PRODUTOS);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		this.sourceController = (FXMLMenuHomeController) controller;

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
		if (sender == null)
			throw new UnsupportedOperationException();

		// this.parentPane.getChildren().clear();
		// this.parentPane.getChildren().add(primaryPane);s
//		if (sender instanceof FXMLPedidoController) {
//			FXMLPedidoController obj = (FXMLPedidoController) sender;
//			mainAreaContainer.getChildren().remove(obj.getRootPane());
//		}
	}

}
