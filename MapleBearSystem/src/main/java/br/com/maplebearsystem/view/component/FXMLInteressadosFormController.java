package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.Interessados;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.constants.ProductConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class FXMLInteressadosFormController implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private VBox rootPane;

	@FXML
	private JFXTextField tfieldInternalCod;

	@FXML
	private JFXTextField tfieldNome;

	@FXML
	private JFXDatePicker dtdatainteresse;

	@FXML
	private JFXTextField tftelefone1;

	@FXML
	private JFXTextField tfemail1;

	@FXML
	private JFXTextField tftelefone2;

	@FXML
	private JFXTextField tfemail2;

	@FXML
	private JFXTextArea tareaMotivo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION Main FXMLController Methods

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	public void setData(Interessados interessado) {

		// TODO InternalCode Question
		try {
			tfieldInternalCod.setText(interessado.getId().toString());
			tfieldNome.setText(interessado.getNome());
			tfemail1.setText(interessado.getEmail1());
			tfemail2.setText(interessado.getEmail2());
			tftelefone1.setText(interessado.getTelefone1());
			tftelefone2.setText(interessado.getTelefone2());
			tareaMotivo.setText(interessado.getMotivo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public JFXTextField gettfieldNome() {
		return tfieldNome;
	}
	
	public JFXDatePicker getdtData() {
		return dtdatainteresse;
	}
	
	public JFXTextField gettfemail1() {
		return tfemail1;
	}

	public JFXTextField gettfemail2() {
		return tfemail2;
	}

	public JFXTextField gettftelefone1() {
		return tftelefone1;
	}

	public JFXTextField gettftelefone2() {
		return tftelefone2;
	}

	public JFXTextArea gettareaMotivo() {
		return tareaMotivo;
	}

// ENDSECTION UISetup FXMLController Methods

	private void initUI() {
		initTextFieldMasks();
		tfieldInternalCod.setEditable(false);
	}

	private void initTextFieldMasks() {

		tfieldNome.setTextFormatter(TextFieldFormatterHelper.getTextFieldToUpperFormatter(
				FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_DESCRIPTION.getValue(),
				ProductConstants.MAXLEN_PARTPRODUCT_DESCRIPTION.getValue()));

		tareaMotivo.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_EXTENDEDDESCRIPTION.getValue(),
				ProductConstants.MAXLEN_PARTPRODUCT_EXTENDEDDESCRIPTION.getValue()));
		
		tftelefone1.setTextFormatter(TextFieldFormatterHelper.getTextFieldPhoneDDDAndNumberFormatter());
		tftelefone2.setTextFormatter(TextFieldFormatterHelper.getTextFieldPhoneDDDAndNumberFormatter());

	}

	@Override
	public void reset() {
		FXUISetup.getInstance().clearTextInputs(rootPane);
		tfieldInternalCod.setEditable(false);
	}

	public void switchToDisplayOnlyMode() {
		FXUISetup.getInstance().setTextInputsEditable(rootPane, false);

	}

	public void switchToEditorMode() {
		FXUISetup.getInstance().setTextInputsEditable(rootPane, true);
		tfieldInternalCod.setEditable(false);
	}

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
