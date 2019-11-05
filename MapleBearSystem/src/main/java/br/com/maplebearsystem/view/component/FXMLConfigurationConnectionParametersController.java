package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.maplebearsystem.controller.MaplePreferences;
import br.com.maplebearsystem.controller.UserInputException;
import br.com.maplebearsystem.controller.UserInputExceptionCombo;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.notifications.FXNotification.NotificationType;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.ui.util.TextUtils;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class FXMLConfigurationConnectionParametersController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private JFXTextField tfieldIPAddress;

	@FXML
	private JFXTextField tfieldPort;

	@FXML
	private JFXTextField tfieldLogin;

	@FXML
	private JFXPasswordField tfieldPassword;

	@FXML
	private JFXPasswordField tfieldPassowordRepeat;

	@FXML
	private JFXButton btnChange;

	@FXML
	private JFXButton btnSave;

	@FXML
	private JFXButton btnCancel;

	private FXMLDefaultControllerInterface sourceController;

	public FXMLDefaultControllerInterface getSourceController() {
		return sourceController;
	}
	
	@FXML
	private void actCancel(ActionEvent event) {
		FXUISetup.getInstance().setTextInputsEditable(rootPane, false);
		btnChange.setDisable(false);
		btnSave.setDisable(true);
		btnCancel.setDisable(true);
		loadData();
	}

	@FXML
	private void actChange(ActionEvent event) {
		FXUISetup.getInstance().setTextInputsEditable(rootPane, true);
		btnChange.setDisable(true);
		btnSave.setDisable(false);
		btnCancel.setDisable(false);
		tfieldIPAddress.requestFocus();
	}

	@FXML
	private void actSave(ActionEvent event) {
		try {

			validateSave();

			FXNotification notification = new FXNotification(
					"Configurações Alteradas com sucesso!",
					FXNotification.NotificationType.INFORMATION);
			notification.show();

			FXUISetup.getInstance().setTextInputsEditable(rootPane, false);
			btnChange.setDisable(false);
			btnSave.setDisable(true);
			btnCancel.setDisable(true);
		} catch (UserInputExceptionCombo userInputException) {
			new FXNotification(userInputException.getMessagesInLines(), FXNotification.NotificationType.WARNING).show();

		} catch (Exception e) {
			new FXNotification(
					"Um Erro desconhecido foi encontrado, falha ao Salvar configurações",
					NotificationType.ERROR).show();
		}
	}

	private void validateSave() throws UserInputExceptionCombo {

		UserInputExceptionCombo userInputExceptionCombo = new UserInputExceptionCombo();

		String ipaddr = tfieldIPAddress.textProperty().getValueSafe();
		ipaddr = TextUtils.trimLeadingAndTrailingWhiteSpaces(ipaddr);

		String port = tfieldPort.textProperty().getValueSafe();
		port = TextUtils.trimLeadingAndTrailingWhiteSpaces(port);

		String login = tfieldLogin.textProperty().getValueSafe();
		login = TextUtils.trimLeadingAndTrailingWhiteSpaces(login);

		String password = tfieldPassword.textProperty().getValueSafe();
		password = TextUtils.trimLeadingAndTrailingWhiteSpaces(password);

		String passwordrepeat = tfieldPassowordRepeat.textProperty().getValueSafe();
		passwordrepeat = TextUtils.trimLeadingAndTrailingWhiteSpaces(passwordrepeat);

		if (ipaddr.equals(""))
			userInputExceptionCombo.add(new UserInputException("Endereço IP em Branco!"));

		if (port.equals(""))
			userInputExceptionCombo.add(new UserInputException("Porta não especificada!"));

		if (login.equals(""))
			userInputExceptionCombo.add(new UserInputException("Login encontra-se em branco!"));

		if (!password.equals(passwordrepeat))
			userInputExceptionCombo.add(new UserInputException("Password inserido diverge do password repetido!"));

		if (!userInputExceptionCombo.isEmpty())
			throw userInputExceptionCombo;

		MaplePreferences.putString(MaplePreferences.DWOR_DATABASEMANAGER_HOST, ipaddr);
		MaplePreferences.putString(MaplePreferences.DWOR_DATABASEMANAGER_PORT, port);
		MaplePreferences.putString(MaplePreferences.DWOR_DATABASEMANAGER_USERNAME, login);
		MaplePreferences.putString(MaplePreferences.DWOR_DATABASEMANAGER_PASS, password);

	}

	@Override
	public void reset() {
		throw new UnsupportedOperationException();

	}

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
		throw new UnsupportedOperationException();

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		throw new UnsupportedOperationException();

	}

	public Parent getRootPane() {
		return this.rootPane;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		FXUISetup.getInstance().setTextInputsEditable(rootPane, false);
		btnChange.setDisable(false);
		btnSave.setDisable(true);
		btnCancel.setDisable(true);

		tfieldPort.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[0-9]*", 4));

		loadData();

	}

	private void loadData() {
		tfieldIPAddress.setText(MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_HOST));
		tfieldLogin.setText(MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_USERNAME));
		tfieldPort.setText(MaplePreferences.getString(MaplePreferences.DWOR_DATABASEMANAGER_PORT));
		tfieldPassowordRepeat.clear();
		tfieldPassword.clear();
	}

}
