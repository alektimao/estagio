package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.model.Phone;
import br.com.maplebearsystem.model.Phone.PhoneType;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

public class FXMLPhoneFormController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private HBox rootPane;
	@FXML
	private JFXTextField tfieldPhone;
	@FXML
	private JFXTextField tfieldTelecomCompany;
	@FXML
	private JFXComboBox<PhoneType> cmbboxPhoneType;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initTextFieldMasks();
		cmbboxPhoneType.setItems(FXCollections.observableArrayList(PhoneType.values()));
	}

// SECTION Helper FXMLController Methods

	public void loadData(Phone data) {
		try {
			tfieldPhone.setText(data.getPhoneString());
			tfieldTelecomCompany.setText(data.getTelcomCompany());
			cmbboxPhoneType.getSelectionModel().select(data.getType());
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to load Phone data", e);
		}

	}
// ENDSECTION Helper FXMLController Methods

// SECTION Data Access FXMLController Methods

	public JFXTextField getTfieldPhone() {
		return tfieldPhone;
	}

	public JFXTextField getTfieldTelecomCompany() {
		return tfieldTelecomCompany;
	}

	public JFXComboBox<PhoneType> getCmbboxPhoneType() {
		return cmbboxPhoneType;
	}

	public void setData(String phone, String telecomCompany, PhoneType phoneType) {
		tfieldPhone.setText(phone);
		tfieldTelecomCompany.setText(telecomCompany);
		cmbboxPhoneType.getSelectionModel().select(phoneType);
	}

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	public void reset() {
		FXUISetup.getInstance().clearTextInputs(rootPane);
		cmbboxPhoneType.getSelectionModel().select(null);
	}

	private void initTextFieldMasks() {
		tfieldPhone.setTextFormatter(TextFieldFormatterHelper.getTextFieldPhoneDDDAndNumberFormatter());
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new UnsupportedOperationException();

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
		throw new UnsupportedOperationException();

	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
