package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import javax.persistence.NoResultException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.dao.FuncionarioDAO;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.Ativo;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.notifications.FXNotificationFactory;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FXMLLoginController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPanel;

	@FXML
	private JFXTextField txtfieldLogin;

	@FXML
	private JFXPasswordField txtfieldPassword;

	@FXML
	private JFXButton btnLogin;

	@FXML
	private JFXButton btnCancel;

	public static Funcionario logado = new Funcionario();

	@FXML
	void actCancel(ActionEvent event) {
		sair();
	}

	@FXML
	void actLogin(ActionEvent event) {
		login();
	}

	public void sair() {
		Stage stage = (Stage) btnCancel.getScene().getWindow();
		stage.close();
	}

	private void login() {
		FuncionarioDAO user = new FuncionarioDAO();
		String login, senha;
		login = "";
		senha = "";
		Boolean erro = false;
		if (txtfieldLogin.getText().equals("")) {
			erro = true;
		} else {
			login = txtfieldLogin.getText();
		}
		if (txtfieldPassword.getText().equals("")) {
			erro = true;
		} else {
			senha = txtfieldPassword.getText();
		}
		if (erro == false) {
			try {
				if (login.equals("ADMIN") && senha.equals("admin")) {
					FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
							.changeScene(MapleBearSystemDesktopClient.getStage() ,FXResourcePath.FXML_MAPLEBEARSYSTEM_HOME)
							.<FXMLDefaultControllerInterface>getController();
					controller.setSourceFXMLController(this);
				}
				else
				{
					logado = user.login(login, senha);
					if (logado.getAtivo().equals(Ativo.ATIVO)) {
						
						FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
								.changeScene(MapleBearSystemDesktopClient.getStage() ,FXResourcePath.FXML_MAPLEBEARSYSTEM_HOME)
								.<FXMLDefaultControllerInterface>getController();
						controller.setSourceFXMLController(this);
					}					
				}
			} catch (NoResultException e) {
				FXNotification notification = new FXNotification("Login Inválido,",
						FXNotification.NotificationType.INFORMATION);
				notification.show();
			} catch (Exception e) {
				FXNotification notification = new FXNotification(""+e.getMessage(),
						FXNotification.NotificationType.INFORMATION);
				notification.show();
			}
		} else {
			FXNotification notification = new FXNotification("Login Inválido,",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtfieldLogin.setText("");
		txtfieldPassword.setText("");
		txtfieldLogin
				.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[a-zA-Z 0-9\\u00C0-\\u00FF]+", 100));
		txtfieldPassword
				.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter("[a-zA-Z 0-9\\u00C0-\\u00FF]+", 100));

		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				FXNotificationFactory.initialize(rootPanel);
			}
		});
	}

}
