package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.ui.util.FXResourcePath;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.ProgramParameterController;
import br.com.maplebearsystem.view.component.FXMLContactFormController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tab;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLInitSetupController implements Initializable {

	@FXML
	private VBox rootPane;
	@FXML
	private JFXTabPane mainTabPane;
	@FXML
	private Tab tabOrganizationInfo;
	@FXML
	private Tab tabAdminSetup;
	@FXML
	private Tab tabOtherConfigs;
	@FXML
	private JFXTextField tfieldLoginUsername;
	@FXML
	private JFXPasswordField tfieldLoginPassword;
	@FXML
	private JFXPasswordField tfieldLoginPasswordRepeated;
	@FXML
	private JFXButton btnAdministratorConfigGoBack;
	@FXML
	private JFXButton btnAdministratorConfigNext;
	@FXML
	private JFXButton btnOrgInfoNext;

	@FXML
	private StackPane pnAdminInfoForm;
	@FXML
	private FXMLContactFormController pnAdminInfoFormController;
	@FXML
	private StackPane pnOrganizationInfoForm;
	@FXML
	private FXMLContactFormController pnOrganizationInfoFormController;

// SECTION FXMLControler Main Attributes

// ENDSECTION FXMLControler Main Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		ProgramParameterController.getInstance().setupParameterizationMode();
		
		initUI();

	}

// SECTION UISetup FXMLController Methods

	private void initUI() {

		pnOrganizationInfoFormController.switchToPessoaJuridicaMode();

		pnAdminInfoFormController.switchToPessoaFisicaMode();

	}

// ENDSECTION UISetup FXMLController Methods

	private boolean save() {

//		ProgramParameterController modelController = ProgramParameterController.getInstance();
//
//		pnOrganizationInfoFormController.validateSetPrimaryPhoneAndAddress();
//
//		
//
//		List<Exception> errorList = modelController.save();
//
//		if (errorList.isEmpty()) {
//			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
//			alert.showAndWait();
//			return true;
//
//		} else {
//			String text = "";
//
//			for (Exception e : errorList) {
//				text = text + e.getMessage() + "\n";
//			}
//
//			Alert errAlert = new Alert(Alert.AlertType.WARNING, text, ButtonType.OK);
//			errAlert.showAndWait();
//
			return false;
//		}
	}

	/*
	 * End Main FXMLController Methods
	 **************************************************************************/

	/*
	 * FXML Event Methods
	 **************************************************************************/

	@FXML
	void actAdministratorConfigGoBack(ActionEvent event) {
		mainTabPane.getSelectionModel().select(tabOrganizationInfo);
	}

	@FXML
	void actAdministratorConfigNext(ActionEvent event) {
		mainTabPane.getSelectionModel().select(tabOtherConfigs);
	}

	@FXML
	void actOrgInfoNext(ActionEvent event) {
		mainTabPane.getSelectionModel().select(tabAdminSetup);
	}

	@FXML
	void actSave(ActionEvent event) {
		
	}

	@FXML
	void actCancel(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		//TODO Properly close InitSetup
	}

	public VBox getRootPane() {
		return rootPane;
	}

	/*
	 * End FXML Event Methods
	 **************************************************************************/

}
