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

public class FXMLMenuGeraisController implements Initializable, FXMLDefaultControllerInterface {

    @FXML
    private HBox hbox;

    @FXML
    private JFXButton btnCadastroInteressados;

    @FXML
    private JFXButton btnCadastroPessoas;

    @FXML
    private JFXButton btnCadastroFornecedor;

    @FXML
    private JFXButton btnCadastroFuncionario;
    
    private FXMLMenuHomeController sourceController;

    @FXML
    void actCadastroFornecedor(ActionEvent event) {

    }

    @FXML
    void actCadastroFuncionario(ActionEvent event) {
    	
    }

    @FXML
    void actCadastroInteressados(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_INTERESSADOS_GERENCIAR);
    }

    @FXML
    void actCadastroPessoas(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_PESSOA_BUSCAR);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initUI();
		Platform.runLater(() -> {

			new FXNotification("Teste aviso", FXNotification.NotificationType.WARNING).show();
		});
	}
	
//	public StackPane getRootPane() {
//		return mainAreaContainer;
//	}

	private void initUI() {
		// Platform.runLater(() -> hbox = (HBox) primaryPane.getParent());

	}
}
