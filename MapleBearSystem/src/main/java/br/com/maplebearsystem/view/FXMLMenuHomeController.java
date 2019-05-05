package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;

import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.notifications.FXNotificationFactory;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

public class FXMLMenuHomeController implements FXMLDefaultControllerInterface, Initializable {

	private FXMLDefaultControllerInterface currentFXController;

	@FXML
	private JFXButton btnSidebarContacts;

	@FXML
	private JFXButton btnSidebarEquipments;

	@FXML
	private JFXButton btnSidebarWorkOrders;

	@FXML
	private JFXButton btnAlunos;

	@FXML
	private StackPane mainAreaContainer;

	@FXML
	private StackPane menuAreaContainer;

	@FXML
	private JFXButton btnSidebarExit;

	@FXML
	private JFXButton btnSidebarConfigs;
	
	@FXML
	private JFXButton btnGerais;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// inicializa FXNotificationFactory
		FXNotificationFactory.initialize(mainAreaContainer);
		new FXNotification("Programa inicializado", FXNotification.NotificationType.INFORMATION).show();

	}

	@FXML
	void actGerenciarProdutos(ActionEvent event) {
		loadMenu(FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_PRODUTOS);
		// loadMenu(FXResourcePath.FXML_MAPLEBEARSYSTEM_PEDIR_PRODUTOS);

	}

	@FXML
	void actConfigure(ActionEvent event) {

	}

	@FXML
	void actAlunos(ActionEvent event) {
		loadMenu(FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_ALUNOS);
	}

	@FXML
	void actExit(ActionEvent event) {

	}
	
	@FXML
    void actGerais(ActionEvent event) {
		loadMenu(FXResourcePath.FXML_MAPLEBEARSYSTEM_GERENCIAR_GERAIS);
    }

	@FXML
	void actManageContacts(ActionEvent event) {

	}

	@FXML
	void actManageWorkOrders(ActionEvent event) {
		new FXNotification("Teste error", FXNotification.NotificationType.ERROR).show();
	}

	public void loadForm(URL url) {

		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(mainAreaContainer, url, null)
					.<FXMLDefaultControllerInterface>getController();

			controller.setSourceFXMLController(this);

			currentFXController = controller;
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to load menu: " + url.getPath(), e);
		}
	}

	private void loadMenu(URL url) {

		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(menuAreaContainer, url, null)
					.<FXMLDefaultControllerInterface>getController();

			controller.setSourceFXMLController(this);

			currentFXController = controller;
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to load menu: " + url.getPath(), e);
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
		if (sender instanceof FXMLReceberController) {
			FXMLReceberController obj = (FXMLReceberController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLPedidoController) {
			FXMLPedidoController obj = (FXMLPedidoController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLRetirarProdutoController) {
			FXMLRetirarProdutoController obj = (FXMLRetirarProdutoController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProductSearchController) {
			FXMLProductSearchController obj = (FXMLProductSearchController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
	}

}
