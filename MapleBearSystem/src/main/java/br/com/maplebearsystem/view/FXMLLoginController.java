package br.com.maplebearsystem.view;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class FXMLLoginController {

    @FXML
    private VBox rootPanel;
    
    @FXML
    private JFXTextField txtfieldLogin;
    
    @FXML
    private JFXPasswordField txtfieldPassword;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private JFXButton btnCancel;
    
    public void Login() {
		try {
			FXMLDworHomeController dworHomeController = FXUISetup.getInstance()
					.changeSceneFromDWORMainStage(FXMLResourcePathsEnum.FXML_DWOR_HOME.getPath())
					.<FXMLDworHomeController>getController();
			
			dworHomeController.doLogin("Teste","Teste2");
		} catch (IOException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
		}
	}
    
    @FXML
    void actCancel(ActionEvent event) {

    }

    @FXML
    void actLogin(ActionEvent event) {
    	Login();
    }

}

