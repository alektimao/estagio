package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;

import com.dwor.model.Phone.PhoneType;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.view.controller.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

public class PhoneFormController implements Initializable, FXMLDefaultControllerInterface {
   
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
		cmbboxPhoneType.setItems(FXCollections.observableArrayList( PhoneType.values()));
	}

// SECTION Main FXMLController Methods

// ENDSECTION Main FXMLController Methods
	
	
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
	
	public void setData(String phone, String telecomCompany, PhoneType phoneType ){
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
		//tfieldPhone.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "(##) #########"));
		tfieldPhone.setTextFormatter(TextFieldFormatterHelper.getTextFieldPhoneDDDAndNumberFormatter());
	}

// ENDSECTION UISetup FXMLController Methods
	
	
// SECTION FXML Event Methods
	
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
