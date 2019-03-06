package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;


import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Tab;
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
	private JFXButton btnSave;
	@FXML
	private JFXButton actCancel;
	@FXML
	private VBox pnAdminInfoForm;
	@FXML
	private VBox pnOrganizationInfoForm;
	@FXML
	private ContactFormController pnOrganizationInfoFormController;
	@FXML
	private ContactFormController pnAdminInfoFormController;

// SECTION FXMLControler Main Attributes



// ENDSECTION FXMLControler Main Attributes
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();

	}

	
// SECTION UISetup FXMLController Methods

	private void initUI() {
		ProgramParameterController.getInstance().setupParameterizationMode();
		
		pnOrganizationInfoFormController.setController(
				ProgramParameterController.getInstance().getPessoaOrganizationController());
		pnOrganizationInfoFormController.setPessoaJuridicaMode();
		
		pnAdminInfoFormController.setController(
				ProgramParameterController.getInstance().getPessoaAdminController());
		pnAdminInfoFormController.setPessoaFisicaMode();

	}
	
// ENDSECTION UISetup FXMLController Methods
	
	private boolean save() {

		ProgramParameterController modelController = ProgramParameterController.getInstance();
		
		List<Exception> errorList = modelController.save(
				pnOrganizationInfoFormController.getTfieldName().getText(),
				pnOrganizationInfoFormController.getTfieldCPFCNPJ().getText(),
				pnOrganizationInfoFormController.getTfieldRGIE().getText(),
				pnOrganizationInfoFormController.getTfieldEmail().getText(),
				pnOrganizationInfoFormController.getTfieldIMunicipal().getText(),
				pnOrganizationInfoFormController.getTfieldOtherName().getText(),
				pnAdminInfoFormController.getTfieldName().getText(),
				pnAdminInfoFormController.getTfieldCPFCNPJ().getText(),
				pnAdminInfoFormController.getTfieldRGIE().getText(),
				pnAdminInfoFormController.getTfieldEmail().getText(),
				tfieldLoginUsername.getText(),
				tfieldLoginPassword.getText(),
				tfieldLoginPasswordRepeated.getText()
				);

		if (errorList.isEmpty()) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
			alert.showAndWait();
			return true;

		} else {
			String text = "";

			for (Exception e : errorList) {
				text = text + e.getMessage() + "\n";
			}

			Alert errAlert = new Alert(Alert.AlertType.WARNING, text, ButtonType.OK);
			errAlert.showAndWait();

			return false;
		}
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
		if (save()) {
			try {
				FXUISetup.getInstance().changeSceneFromDWORMainStage(FXMLResourcePathsEnum.FXML_DWOR_HOME.getPath());

				ProgramParameterController.getInstance().setLoggedUser(
						ProgramParameterController.getInstance().getProgramParameter().getAdministrator());
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}
	}

	/*
	 * End FXML Event Methods
	 **************************************************************************/

}
