package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.constants.ProductConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class FXMLProductFormController implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private VBox rootPane;

	@FXML
	private JFXTextField tfieldInternalCod;

	@FXML
	private JFXTextField tfieldDescription;

	@FXML
	private JFXTextField tfieldUnitQuant;

	@FXML
	private JFXTextField tfieldPartNumber;

	@FXML
	private JFXTextArea tareaExtendedDescription;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION Main FXMLController Methods

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	public void setData(Product partProduct) {

		// TODO InternalCode Question
		try {
			tfieldInternalCod.setText(partProduct.getId().toString());
			tfieldDescription.setText(partProduct.getShortDescription());
			tareaExtendedDescription.setText(partProduct.getExtendedDescription());
			tfieldUnitQuant.setText(partProduct.getEstoque().getQtd() + "");
			tfieldPartNumber.setText(partProduct.getPartNumber());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public JFXTextField getTfieldDescription() {
		return tfieldDescription;
	}

	public JFXTextField getTfieldUnitQuant() {
		return tfieldUnitQuant;
	}

	public JFXTextField getTfieldPartNumber() {
		return tfieldPartNumber;
	}

	public JFXTextArea getTareaExtendedDescription() {
		return tareaExtendedDescription;
	}

// ENDSECTION UISetup FXMLController Methods

	private void initUI() {
		initTextFieldMasks();
		tfieldInternalCod.setEditable(false);
	}

	private void initTextFieldMasks() {

		tfieldDescription.setTextFormatter(TextFieldFormatterHelper.getTextFieldToUpperFormatter(
				FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_DESCRIPTION.getValue(),
				ProductConstants.MAXLEN_PARTPRODUCT_DESCRIPTION.getValue()));

		tareaExtendedDescription.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_EXTENDEDDESCRIPTION.getValue(),
				ProductConstants.MAXLEN_PARTPRODUCT_EXTENDEDDESCRIPTION.getValue()));

		tfieldPartNumber.setTextFormatter(TextFieldFormatterHelper.getTextFieldToUpperFormatter(
				FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_PARTNUMBER.getValue(),
				ProductConstants.MAXLEN_PARTPRODUCT_PARTNUMBER.getValue()));

		tfieldUnitQuant.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_STOCKQUANTITY.getValue(),
				ProductConstants.MAXLEN_PARTPRODUCT_STOCKQUANTITY.getValue()));

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
