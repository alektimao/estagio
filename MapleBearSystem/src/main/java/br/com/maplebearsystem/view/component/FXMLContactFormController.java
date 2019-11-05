package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.controller.PessoaController;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.constants.PessoaConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.component.FXMLAddressFormController;
import br.com.maplebearsystem.view.component.FXMLAddressManagerController;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class FXMLContactFormController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private VBox primaryPane;
	@FXML
	private VBox pnBasicForm;
	@FXML
	private JFXTextField tfieldName;
	@FXML
	private JFXTextField tfieldCPFCNPJ;
	@FXML
	private JFXTextField tfieldRGIE;
	@FXML
	private JFXTextField tfieldEmail;
	@FXML
	private HBox pnJurExtras;
	@FXML
	private JFXTextField tfieldOtherName;
	@FXML
	private JFXTextField tfieldIMunicipal;

	@FXML
	private HBox pnPrimaryPhoneForm;
	@FXML
	private FXMLPhoneFormController pnPrimaryPhoneFormController;

	@FXML
	private VBox pnPrimaryAddress;
	@FXML
	private FXMLAddressFormController pnPrimaryAddressController;

// SECTION FXMLControler Main Attributes

	private PessoaController modelController;
	private int pnJurExtrasIndex;

// ENDSECTION FXMLControler Main Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION Main FXMLController Methods
	public void validateSetPrimaryPhoneAndAddress() throws Exception {

		modelController.validateSavePrimaryPhone(
				pnPrimaryPhoneFormController.getTfieldPhone().getText(),
				pnPrimaryPhoneFormController.getTfieldTelecomCompany().getText(),
				pnPrimaryPhoneFormController.getCmbboxPhoneType().getSelectionModel().getSelectedItem());

		modelController.validateSavePrimaryAddress(
				pnPrimaryAddressController.getTfieldPostalCode().getText(),
				pnPrimaryAddressController.getTfieldAddress().getText(),
				pnPrimaryAddressController.getTfieldAddressNumber().getText(),
				pnPrimaryAddressController.getTfieldDistrict().getText(),
				pnPrimaryAddressController.getTfieldAddressComplement().getText(),
				pnPrimaryAddressController.getCmbboxCity().getSelectionModel().getSelectedItem());

	}
// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

// ENDSECTION Helper FXMLController Methods

// SECTION Data Access FXMLController Methods

	public void loadData(Pessoa pessoa) {
		tfieldName.setText(modelController.getStagedPessoa().getName());
		tfieldEmail.setText(modelController.getStagedPessoa().getEmail());

		if (modelController.getStagedPessoa() instanceof PessoaJuridica) {
			tfieldCPFCNPJ.setText(((PessoaJuridica) modelController.getStagedPessoa()).getCnpj());
			tfieldRGIE.setText(((PessoaJuridica) modelController.getStagedPessoa()).getIestadual());
			tfieldOtherName.setText(((PessoaJuridica) modelController.getStagedPessoa()).getRazaoSocial());

		} else if (modelController.getStagedPessoa() instanceof PessoaFisica) {
			tfieldCPFCNPJ.setText(((PessoaFisica) modelController.getStagedPessoa()).getCpf());
			tfieldRGIE.setText(((PessoaFisica) modelController.getStagedPessoa()).getRg());
		}

		try {
			pnPrimaryAddressController.loadData(modelController.getStagedPessoa().getPrimaryAddress());
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error: failed to set PrimaryAddresController sourceController", e);
		}

		try {
			pnPrimaryPhoneFormController.loadData(modelController.getStagedPessoa().getPrimaryPhone());
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "Error: failed to set PrimaryPhoneController sourceController", e);
		}
	}

	public void setModelController(PessoaController controller) {
		this.modelController = controller;
	}

	public PessoaController getModelController() {
		return modelController;
	}

	public void updateMode() {
		tfieldName.setText(modelController.getStagedPessoa().getName());
		tfieldEmail.setText(modelController.getStagedPessoa().getEmail());

		if (modelController.getStagedPessoa() instanceof PessoaJuridica) {
			tfieldCPFCNPJ.setText(((PessoaJuridica) modelController.getStagedPessoa()).getCnpj());
			tfieldRGIE.setText(((PessoaJuridica) modelController.getStagedPessoa()).getIestadual());

		} else if (modelController.getStagedPessoa() instanceof PessoaFisica) {
			tfieldCPFCNPJ.setText(((PessoaFisica) modelController.getStagedPessoa()).getCpf());
			tfieldRGIE.setText(((PessoaFisica) modelController.getStagedPessoa()).getRg());

		}
	}

	public JFXTextField getTfieldName() {
		return tfieldName;
	}

	public JFXTextField getTfieldCPFCNPJ() {
		return tfieldCPFCNPJ;
	}

	public JFXTextField getTfieldRGIE() {
		return tfieldRGIE;
	}

	public JFXTextField getTfieldEmail() {
		return tfieldEmail;
	}

	public JFXTextField getTfieldOtherName() {
		return tfieldOtherName;
	}

	public JFXTextField getTfieldIMunicipal() {
		return tfieldIMunicipal;
	}

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		initTextFieldValidators();
		initTextFieldMasks();
	}

	public void reset() {
		throw new UnsupportedOperationException();
	}

	private void initTextFieldMasks() {
		tfieldName.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(),
						PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldOtherName.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						FieldValidators.RegexCharsets.CHARSET_PESSOAJURIDICA_RAZAOSOCIAL.getValue(),
						PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldIMunicipal.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						FieldValidators.RegexCharsets.CHARSET_PESSOAJURIDICA_IMUNICIPAL.getValue(),
						PessoaConstants.MAXLEN_INSCMUNICIPAL.getValue()));

	}

	private void initTextFieldValidators() {

		ArrayList<JFXTextField> nodelist = new ArrayList<>(Arrays.asList(tfieldName, tfieldCPFCNPJ
//                tfieldIMunicipal,
//                tfieldOtherName,
//                tfieldEmail
		));

		for (JFXTextField node : nodelist) {
			RequiredFieldValidator RequiredValidator = new RequiredFieldValidator();
			RequiredValidator.setMessage("Campo Obrigatório");
			node.getValidators().add(RequiredValidator);

			node.focusedProperty().addListener((observable, oldValue, newValue) -> {
				if (!newValue) {
					node.validate();
				}
			});
		}

	}

	public void validateTextFields() {
		ArrayList<JFXTextField> nodelist = new ArrayList<>(Arrays.asList(tfieldName, tfieldCPFCNPJ, tfieldRGIE
//                tfieldIMunicipal,
//                tfieldOtherName,
//                tfieldEmail
		));

		for (JFXTextField node : nodelist) {
			node.requestFocus();
			node.validate();
		}
		nodelist.get(0).requestFocus();
	}

	public void switchToPessoaFisicaMode() {
		tfieldName.setPromptText("Nome");
		tfieldCPFCNPJ.setPromptText("CPF");
		tfieldRGIE.setPromptText("RG");

		// Ensure ID Fields are clear
		tfieldCPFCNPJ.clear();
		tfieldRGIE.clear();

		if (pnBasicForm.getChildren().contains(pnJurExtras)) {
			pnJurExtrasIndex = pnBasicForm.getChildren().indexOf(pnJurExtras);
			pnBasicForm.getChildren().remove(pnJurExtras);
		}

		tfieldCPFCNPJ.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		tfieldRGIE.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						FieldValidators.RegexCharsets.CHARSET_PESSOAFISICA_RG.getValue(),
						PessoaConstants.MAXLEN_RG.getValue()));
	}

	public void switchToPessoaJuridicaMode() {

		tfieldName.setPromptText("Nome Fantasia");
		tfieldCPFCNPJ.setPromptText("CNPJ");
		tfieldRGIE.setPromptText("Inscrição Estadual");

		// Ensure ID Fields are clear
		tfieldCPFCNPJ.clear();
		tfieldRGIE.clear();

		if (!pnBasicForm.getChildren().contains(pnJurExtras)) {
			pnBasicForm.getChildren().add(pnJurExtrasIndex, pnJurExtras);
		}

		tfieldCPFCNPJ
				.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "##.###.###/####-##"));
		tfieldRGIE.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter(
						FieldValidators.RegexCharsets.CHARSET_PESSOAJURIDICA_IESTADUAL.getValue(),
						PessoaConstants.MAXLEN_INSCESTADUAL.getValue()));

	}

	public void setDisable(boolean value) {
		primaryPane.setDisable(value);
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	public void actManagePhones(ActionEvent event) {
		try {
			FXMLPhoneManagerController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(
							rootPane,
							FXResourcePath.FXML_TELEFONE_GERENCIAR,
							new DropShadow(70.0, Color.BLACK),
							100.0)
					.<FXMLPhoneManagerController>getController();
			controller.setSourceFXMLController(this);
			controller.setPessoaController(modelController);
		}  catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to open PhoneManager", e);
		}
	}

	@FXML
	public void actManageAddresses(ActionEvent event) {
		try {
			FXMLAddressManagerController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(
							rootPane,
							FXResourcePath.FXML_MAPLEBEARSYSTEM_ADDRESSMANAGER,
							new DropShadow(70.0, Color.BLACK),
							100.0)
					.<FXMLAddressManagerController>getController();
			controller.setSourceFXMLController(this);
			controller.setPessoaController(modelController);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to open AddressManager", e);
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {


	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new UnsupportedOperationException();

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		throw new UnsupportedOperationException();

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null)
			throw new UnsupportedOperationException();

		if (sender instanceof FXMLPhoneManagerController) {
			rootPane.getChildren().remove(((FXMLPhoneManagerController) sender).getRootPane());
			pnPrimaryPhoneFormController.loadData(modelController.getStagedPessoa().getPrimaryPhone());
		}

		if (sender instanceof FXMLAddressManagerController) {
			rootPane.getChildren().remove(((FXMLAddressManagerController) sender).getRootPane());
			pnPrimaryAddressController.loadData(modelController.getStagedPessoa().getPrimaryAddress());
		}

	}

	public void switchToNewContact() {
		pnPrimaryAddressController.switchToNewContact();
		
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation
}
