package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.controller.PessoaController;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLContactRegistrationController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private VBox primaryPane;
	@FXML
	private HBox pnRdbtLegal;
	@FXML
	private JFXRadioButton rdbtPessoaFisica;
	@FXML
	private ToggleGroup rdbtGroupLegal;
	@FXML
	private JFXRadioButton rdbtPessoaJuridica;
	@FXML
	private JFXButton btSave;
	@FXML
	private JFXButton btDelete;
	@FXML
	private JFXButton btCancel;

	@FXML
	private StackPane pnContactForm;
	@FXML
	private FXMLContactFormController pnContactFormController;

// SECTION Main FXMLController Attributes

	private FXMLDefaultControllerInterface sourceController;

	private PessoaController modelController;
	private boolean pessoaJurMode;

// ENDSECTION Main FXMLController Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new PessoaController();

		try {
			pnContactFormController.setModelController(modelController);
			pnContactFormController.setSourceFXMLController(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to initialize controller", e);
		}

		initUI();
	}

// SECTION Main FXMLController Methods

	public void setupNewContact() {
		pnContactFormController.switchToNewContact();
	}

	private boolean save() {
		
		
		pnContactFormController.validateSetPrimaryPhoneAndAddress();
		
		List<Exception> errorList = modelController.savePessoa(pnContactFormController.getTfieldName().getText(),
				pnContactFormController.getTfieldOtherName().getText(),
				pnContactFormController.getTfieldRGIE().getText(), pnContactFormController.getTfieldCPFCNPJ().getText(),
				pnContactFormController.getTfieldIMunicipal().getText(),
				pnContactFormController.getTfieldEmail().getText());

		if (errorList.isEmpty()) {
			FXNotification notification = new FXNotification("Contato Salvo!",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
			return true;

		} else {
			String text = "";

			for (Exception e : errorList) {
				text = text + e.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(text, FXNotification.NotificationType.WARNING);
			notification.show();


			pnContactFormController.validateTextFields();
			return false;
		}

	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deseja realmente deletar este item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		try {
			modelController.deleteStagedPessoa();
			modelController.reset();
			FXNotification notification = new FXNotification("Contato Removido!",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
			return true;
		} catch (Exception e) {

			Alert alert2 = new Alert(Alert.AlertType.WARNING, "Impossivel deletar, o registro pode estar em uso",
					ButtonType.OK);
			alert2.showAndWait();
			return false;
		}
	}

// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

	private void modePessoaFisica() {

		pessoaJurMode = false;
		pnContactFormController.switchToPessoaFisicaMode();
		pnContactFormController.setDisable(false);
	}

	private void modePessoaJuridica() {
		pessoaJurMode = true;
		pnContactFormController.switchToPessoaJuridicaMode();
		pnContactFormController.setDisable(false);
	}

	private void modeUpdate(Boolean pessoaJurMode) {

		if (pessoaJurMode) {
			modePessoaJuridica();
			rdbtPessoaJuridica.setSelected(true);

		} else {
			modePessoaFisica();
			rdbtPessoaFisica.setSelected(true);
		}

		pnContactForm.setDisable(false);
		btSave.setDisable(false);
		btDelete.setDisable(false);
		pnRdbtLegal.setDisable(true);
	}

// ENDSECTION Helper FXMLController Methods

// SECTION Data Management FXMLController Methods

	private void loadData() {

		if (modelController.getStagedPessoa() instanceof PessoaJuridica) {
			pessoaJurMode = true;
			modeUpdate(pessoaJurMode);

		} else if (modelController.getStagedPessoa() instanceof PessoaFisica) {
			pessoaJurMode = false;
			modeUpdate(pessoaJurMode);

		}
		pnContactFormController.loadData(modelController.getStagedPessoa());
	}

// ENDSECTION Data Management FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {

		pnContactForm.setDisable(true);

		addRdbtGroupLegalEvent();
	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException();
	}

	private void addRdbtGroupLegalEvent() {

		rdbtGroupLegal.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {

			if (newValue == (Toggle) rdbtPessoaJuridica) {
				applySelectedPessoaMode(true);
			} else {
				applySelectedPessoaMode(false);
			}

		});
	}

	private void applySelectedPessoaMode(Boolean pessoaJurMode) {

		if (pessoaJurMode) {
			switchToPessoaJuridicaMode();
		} else {
			switchToPessoaFisicaMode();
		}

		pnContactForm.setDisable(false);
		pnRdbtLegal.setDisable(false);
		btSave.setDisable(false);
		btDelete.setDisable(true);

	}

	private void switchToPessoaFisicaMode() {
		pessoaJurMode = false;
		modelController.checkOrSwitchToPessoaFisica();
		pnContactFormController.switchToPessoaFisicaMode();
		pnContactFormController.setDisable(false);
	}

	private void switchToPessoaJuridicaMode() {
		pessoaJurMode = true;
		modelController.checkOrSwitchtoPessoaJuridica();
		pnContactFormController.switchToPessoaJuridicaMode();
		pnContactFormController.setDisable(false);
	}

	private void switchToEditorMode() {
		btDelete.setDisable(false);
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actSave(ActionEvent event) {
		boolean ok = save();

		if (ok) {
			try {
				sourceController.closeSenderNode(this);
			} catch (Exception e) {
				Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to save contact", e);
			}
			modelController.reset();
		}
	}

	@FXML
	void actCancel(ActionEvent event) {
		try {

			modelController.reset();
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to close", e);
		}
		modelController.reset();
	}

	@FXML
	void actDelete(ActionEvent event) {
		boolean ok = delete();
		if (ok) {
			try {
				sourceController.closeSenderNode(this);
			} catch (Exception e) {
				Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to delete contact", e);
			}
			modelController.reset();
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		this.sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new UnsupportedOperationException();

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		if (data == null) {
			return;
		}

		if (data instanceof Pessoa) {
			modelController.setupEditPessoa((Pessoa) data);
			switchToEditorMode();
			loadData();
		}

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		throw new UnsupportedOperationException();
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

	public StackPane getRootPane() {
		return rootPane;
	}
}
