package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

public class FXMLMenuConfigController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
    private HBox hbox;

    @FXML
    private JFXButton btnConexao;

    @FXML
    private JFXButton btnConfigPedido;

    @FXML
    private JFXButton btnBackup;

    @FXML
    private JFXButton btnRestore;
    
    private FXMLMenuHomeController sourceController;
    
    @FXML
    void actRestore(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_BACKUP);
    }

    @FXML
    void actConfigPedido(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_INTERESSADOS_GERENCIAR);
    }

    @FXML
    void actConexao(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_CONFIGURATION_CONNECTION_PARAMS);
    }
    @FXML
    void actBackup(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_BACKUP);
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

	public HBox getRootPane() {
		return hbox;
	}
}
