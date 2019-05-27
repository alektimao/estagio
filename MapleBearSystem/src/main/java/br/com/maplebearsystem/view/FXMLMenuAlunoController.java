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
import javafx.scene.layout.StackPane;

public class FXMLMenuAlunoController implements Initializable, FXMLDefaultControllerInterface{

	@FXML
    private StackPane mainAreaContainer;
	
    @FXML
    private HBox hbox;

    @FXML
    private JFXButton btnCadastroAluno;

    @FXML
    private JFXButton btnRestAlimentar;

    @FXML
    private JFXButton btnRestMedicamento;

    @FXML
    private JFXButton btnContrato;

    @FXML
    private JFXButton btnDocumento;

    @FXML
    private JFXButton btnRelatorio;
    
    private FXMLMenuHomeController sourceController;
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		//initUI();
		Platform.runLater(() -> {

			new FXNotification("Teste aviso", FXNotification.NotificationType.WARNING).show();
		});
	}
    
//    public StackPane getRootPane() {
//		return mainAreaContainer;
//	}

    @FXML
    void actCadastroProduto(ActionEvent event) {
    	sourceController.loadForm(FXResourcePath.FXML_MAPLE_ALUNO_CADASTRAR);
    }

    @FXML
    void actContrato(ActionEvent event) {

    }

    @FXML
    void actDocumento(ActionEvent event) {

    }

    @FXML
    void actRelatorio(ActionEvent event) {

    }

    @FXML
    void actRestAlimentar(ActionEvent event) {

    }

    @FXML
    void actRestMedicamento(ActionEvent event) {

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

	public StackPane getRootPane() {
		return mainAreaContainer;
	}

}
