package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.dwor.controller.PessoaController;
import com.dwor.model.Address;
import com.dwor.model.PessoaFisica;
import com.dwor.model.PessoaJuridica;
import com.dwor.model.Phone;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.constants.PessoaConstantsEnum;
import br.com.maplebearsystem.view.controller.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContactFormController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox pnRoot;
	@FXML
	private VBox pnBasicForm;
	@FXML
	private HBox pnJurExtras;
	@FXML
	private VBox pnPhones;
	@FXML
	private VBox pnPhoneEdit;
	@FXML
	private VBox pnAddresses;
	@FXML
	private VBox pnAddressEdit;
	@FXML
	private JFXButton btnAddNewPhone;
	@FXML
	private JFXButton btnEditPhone;
	@FXML
	private JFXButton btnRemovePhone;
	@FXML
	private JFXButton btnSavePhone;
	@FXML
	private JFXButton btnCancelPhoneEdit;
	@FXML
	private JFXButton btnAddNewAddress;
	@FXML
	private JFXButton btnEditAddress;
	@FXML
	private JFXButton btnRemoveAddress;
	@FXML
	private JFXButton btnSaveAddress;
	@FXML
	private JFXButton btnCancelAddressEdit;
	@FXML
	private JFXTextField tfieldName;
	@FXML
	private JFXTextField tfieldCPFCNPJ;
	@FXML
	private JFXTextField tfieldRGIE;
	@FXML
	private JFXTextField tfieldEmail;
	@FXML
	private JFXTextField tfieldOtherName;
	@FXML
	private JFXTextField tfieldIMunicipal;
	@FXML
	private JFXListView<Phone> listViewPhones;
	@FXML
	private JFXListView<Address> listViewAddresses;
	@FXML
	private HBox pnPhoneForm;
	@FXML
	private PhoneFormController pnPhoneFormController;
	@FXML
	private VBox pnAddressForm;
	@FXML
	private AddressFormController pnAddressFormController;

// SECTION FXMLControler Main Attributes

	private PessoaController controller;
	private int pnAddressEditIndex;
	private int pnJurExtrasIndex;
	private int pnPhoneEditIndex;

// ENDSECTION FXMLControler Main Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
		initTextFieldMasks();
	}

// SECTION Main FXMLController Methods

	private void addNewAddress() {
		controller.setupNewAddress();

		btnRemoveAddress.setDisable(true);
		btnSaveAddress.setText("Adicionar");
		pnAddressFormController.reset();
		enableAddressEditPane(true);
	}

	private void addNewPhone() {
		controller.setupNewPhone();

		btnRemovePhone.setDisable(true);
		btnSavePhone.setText("Adicionar");
		pnPhoneFormController.reset();
		enablePhoneEditPane(true);
	}

	private void editAddress() {

		Address address = listViewAddresses.getSelectionModel().getSelectedItem();

		if (address != null) {
			controller.setupAddressUpdate(address);
			pnAddressFormController.reset();
			pnAddressFormController.setData(address.getPostalCode(), address.getAddress(), address.getDistrict(),
					address.getAddressComplement(), address.getCity());

			enableAddressEditPane(true);
			btnRemoveAddress.setDisable(false);
			btnSaveAddress.setText("Alterar");
		}

	}

	private void editPhone() {
		Phone phone = listViewPhones.getSelectionModel().getSelectedItem();

		if (phone != null) {
			controller.setupPhoneUpdate(phone);
			pnPhoneFormController.reset();
			pnPhoneFormController.setData(phone.getPhoneString(), phone.getTelcomCompany(), phone.getType());

			enablePhoneEditPane(true);
			btnRemovePhone.setDisable(false);
			btnSavePhone.setText("Alterar");
		}

	}

	private boolean saveAddress() {

		ArrayList<Exception> errorList = new ArrayList<Exception>();

		controller.newTransientAddress();

		try {
			controller.setAddressString(pnAddressFormController.getTfieldAddress().getText());
		} catch (Exception e) {
			// TODO log exception e
			errorList.add(e);
		}

		try {
			controller.setCity(pnAddressFormController.getCmbboxCity().getSelectionModel().getSelectedItem());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);
		}

		try {
			controller.setAddressComplement(pnAddressFormController.getTfieldAddressComplement().getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);
		}

		try {
			controller.setDistrict(pnAddressFormController.getTfieldDistrict().getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);
		}

		try {
			controller.setPostalCode(pnAddressFormController.getTfieldPostalCode().getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);
		}

		if (errorList.isEmpty()) {
			// TODO Notify user about informations and errors
			try {
				controller.saveAddress();

//				Alert alert = new Alert(AlertType.INFORMATION, "Endereço Adicionado!", ButtonType.OK);
//				alert.showAndWait();

				return true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Alert alert = new Alert(AlertType.ERROR,
						"Erro desconhecido ao adicionar endereço!: \n" + e.getMessage(), ButtonType.OK);
				alert.showAndWait();

			}
		} else {
			String errorMessages = "";
			for (Exception exception : errorList) {
				errorMessages = errorMessages + exception.getMessage() + "\n";
			}

			Alert alert = new Alert(AlertType.WARNING, errorMessages, ButtonType.OK);
			alert.showAndWait();
		}

		return false;
	}

	private Boolean savePhone() {

		ArrayList<Exception> errorList = new ArrayList<Exception>();

		controller.newTransientPhone();

		try {
			controller.setPhoneNumber(pnPhoneFormController.getTfieldPhone().getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);

		}

		try {
			controller.setPhoneType(pnPhoneFormController.getCmbboxPhoneType().getSelectionModel().getSelectedItem());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);

		}

		try {
			controller.setTelcomCompany(pnPhoneFormController.getTfieldTelecomCompany().getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// TODO log exception e
			errorList.add(e);

		}

		if (errorList.isEmpty()) {
			// TODO Notify user about informations and errors
			try {
				controller.savePhone();
//				Alert alert = new Alert(AlertType.INFORMATION, "Telefone Adicionado!", ButtonType.OK);
//				alert.showAndWait();

				return true;
			} catch (Exception e) {

				Alert alert = new Alert(AlertType.ERROR,
						"Erro desconhecido ao adicionar Telefone!: \n" + e.getMessage(), ButtonType.OK);
				alert.showAndWait();

			}
		} else {
			String errorMessages = "";
			for (Exception exception : errorList) {
				errorMessages = errorMessages + exception.getMessage() + "\n";
			}

			Alert alert = new Alert(AlertType.WARNING, errorMessages, ButtonType.OK);
			alert.showAndWait();
		}

		return false;
	}

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

	public void setController(PessoaController controller) {
		this.controller = controller;
	}

	public PessoaController getController() {
		return controller;
	}

	public void updateMode() {
		tfieldName.setText(controller.getPessoa().getName());
		tfieldEmail.setText(controller.getPessoa().getEmail());

		loadListViewAddresses();
		loadListViewPhones();

		if (controller.getPessoa() instanceof PessoaJuridica) {
			tfieldCPFCNPJ.setText(((PessoaJuridica) controller.getPessoa()).getCnpj());
			tfieldRGIE.setText(((PessoaJuridica) controller.getPessoa()).getIestadual());

		} else if (controller.getPessoa() instanceof PessoaFisica) {
			tfieldCPFCNPJ.setText(((PessoaFisica) controller.getPessoa()).getCpf());
			tfieldRGIE.setText(((PessoaFisica) controller.getPessoa()).getRg());

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

	public JFXListView<Phone> getListViewPhones() {
		return listViewPhones;
	}

	public JFXListView<Address> getListViewAddresses() {
		return listViewAddresses;
	}

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		enableAddressEditPane(false);
		enablePhoneEditPane(false);
	}

	public void reset() {
		FXUISetup.getInstance().clearListViews(pnRoot);
		FXUISetup.getInstance().clearTextInputs(pnRoot);
		enableAddressEditPane(false);
		enablePhoneEditPane(false);

	}

	private void initTextFieldMasks() {
		tfieldName.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[a-zA-ZÀ-ÿ0-9 ]*",
				PessoaConstantsEnum.MAXLEN_NAME.getValue()));
		tfieldOtherName.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[a-zA-ZÀ-ÿ0-9 ]*",
				PessoaConstantsEnum.MAXLEN_NAME.getValue()));
		tfieldIMunicipal.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[0-9\\- ]*",
				PessoaConstantsEnum.MAXLEN_INSCMUNICIPAL.getValue()));

	}

	private void loadListViewPhones() {

		ObservableList<Phone> modelo;
		modelo = FXCollections.observableArrayList(controller.getPessoa().getPhones());

		listViewPhones.setItems(null);
		listViewPhones.setItems(modelo);
	}

	private void loadListViewAddresses() {

		ObservableList<Address> modelo;
		modelo = FXCollections.observableArrayList(controller.getPessoa().getAddresses());

		listViewAddresses.setItems(null);
		listViewAddresses.setItems(modelo);
	}

	private void enableAddressEditPane(boolean enable) {
		if (enable) {
			if (!pnAddresses.getChildren().contains(pnAddressEdit)) {
				pnAddresses.getChildren().add(pnAddressEditIndex, pnAddressEdit);
				btnAddNewAddress.setDisable(true);
			}
		} else {
			if (pnAddresses.getChildren().contains(pnAddressEdit)) {
				pnAddressEditIndex = pnAddresses.getChildren().indexOf(pnAddressEdit);
				pnAddresses.getChildren().remove(pnAddressEdit);
				btnAddNewAddress.setDisable(false);
			}
		}
	}

	private void enablePhoneEditPane(boolean enable) {
		if (enable) {
			if (!pnPhones.getChildren().contains(pnPhoneEdit)) {
				pnPhones.getChildren().add(pnPhoneEditIndex, pnPhoneEdit);
				btnAddNewPhone.setDisable(true);
			}
		} else {
			if (pnPhones.getChildren().contains(pnPhoneEdit)) {
				pnPhoneEditIndex = pnPhones.getChildren().indexOf(pnPhoneEdit);
				pnPhones.getChildren().remove(pnPhoneEdit);
				btnAddNewPhone.setDisable(false);
			}
		}
	}

	public void setPessoaFisicaMode() {
		tfieldName.setPromptText("Nome");
		tfieldCPFCNPJ.setPromptText("CPF");
		tfieldRGIE.setPromptText("RG");

		if (pnBasicForm.getChildren().contains(pnJurExtras)) {
			pnJurExtrasIndex = pnBasicForm.getChildren().indexOf(pnJurExtras);
			pnBasicForm.getChildren().remove(pnJurExtras);
		}

		tfieldCPFCNPJ.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		tfieldRGIE.setTextFormatter(
				TextFieldFormatterHelper.getTextFieldFormatter("[0-9\\- ]*", PessoaConstantsEnum.MAXLEN_RG.getValue()));
	}

	public void setPessoaJuridicaMode() {

		tfieldName.setPromptText("Nome Fantasia");
		tfieldCPFCNPJ.setPromptText("CNPJ");
		tfieldRGIE.setPromptText("Inscrição Estadual");

		if (!pnBasicForm.getChildren().contains(pnJurExtras)) {
			pnBasicForm.getChildren().add(pnJurExtrasIndex, pnJurExtras);
		}

		tfieldCPFCNPJ
				.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "##.###.###/####-##"));
		tfieldRGIE.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[0-9\\- ]*",
				PessoaConstantsEnum.MAXLEN_INSCESTADUAL.getValue()));

	}

	public void setDisable(boolean value) {
		pnRoot.setDisable(value);
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actAddNewAddress(ActionEvent event) {
		addNewAddress();
	}

	@FXML
	void actEditAddress(ActionEvent event) {
		editAddress();
	}

	@FXML
	void actAddNewPhone(ActionEvent event) {
		addNewPhone();
	}

	@FXML
	void actEditPhone(ActionEvent event) {
		editPhone();
	}

	@FXML
	void actCancelAddressEdit(ActionEvent event) {
		enableAddressEditPane(false);
	}

	@FXML
	void actCancelPhoneEdit(ActionEvent event) {
		enablePhoneEditPane(false);
	}

	@FXML
	void actRemoveAdress(ActionEvent event) {

	}

	@FXML
	void actRemovePhone(ActionEvent event) {

	}

	@FXML
	void actSaveAdress(ActionEvent event) {

	}

	@FXML
	void actSavePhone(ActionEvent event) {

		boolean ok = savePhone();

		if (ok) {
			loadListViewPhones();
			enablePhoneEditPane(false);
		}
	}

	@FXML
	void actRemoveAddress(ActionEvent event) {

	}

	@FXML
	void actSaveAddress(ActionEvent event) {
		boolean ok = saveAddress();

		if (ok) {
			loadListViewAddresses();
			enableAddressEditPane(false);
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation
}
