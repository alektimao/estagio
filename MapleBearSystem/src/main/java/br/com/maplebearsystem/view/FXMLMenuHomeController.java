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
import br.com.maplebearsystem.view.component.FXMLAlunoRegistrationController;
import br.com.maplebearsystem.view.component.FXMLContactRegistrationController;
import br.com.maplebearsystem.view.component.FXMLContactSearchController;
import br.com.maplebearsystem.view.component.FXMLFornecedorRegistrationController;
import br.com.maplebearsystem.view.component.FXMLFornecedorSearchController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import br.com.maplebearsystem.view.component.FXMLProdutoSearchController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

public class FXMLMenuHomeController implements FXMLDefaultControllerInterface, Initializable {

	private FXMLDefaultControllerInterface currentFXController;

	private FXMLDefaultControllerInterface currentFXMenuController;

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
	void actExit(ActionEvent event) throws Exception {
		closeSenderNode(currentFXController);
		closeSenderNode(currentFXMenuController);
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

	public void closeSenderNodeMenu() throws Exception {
		closeSenderNode(currentFXController);
		closeSenderNode(currentFXMenuController);
	}

	public void loadForm(URL url) {

		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(mainAreaContainer, url, null)
					.<FXMLDefaultControllerInterface>getController();

			if (currentFXController != null) {
				closeSenderNode(currentFXController);
			}
			controller.setSourceFXMLController(this);
			verificarmode(controller);
			currentFXController = controller;
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to load menu: " + url.getPath(), e);
		}
	}

	private void verificarmode(FXMLDefaultControllerInterface controller) {
		if (controller instanceof FXMLContactSearchController) {
			((FXMLContactSearchController) controller).switchToSelectorMode();
		}
	}

	private void loadMenu(URL url) {

		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(menuAreaContainer, url, null)
					.<FXMLDefaultControllerInterface>getController();

			controller.setSourceFXMLController(this);

			currentFXMenuController = controller;
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
		//sub-menus
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
		if (sender instanceof FXMLProductFornecedorSearchController) {
			FXMLProductFornecedorSearchController obj = (FXMLProductFornecedorSearchController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProdutoSearchController) {
			FXMLProdutoSearchController obj = (FXMLProdutoSearchController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLFornecedorSearchController) {
			FXMLFornecedorSearchController obj = (FXMLFornecedorSearchController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLAlocarEquipamentoController) {
			FXMLAlocarEquipamentoController obj = (FXMLAlocarEquipamentoController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLFornecedorRegistrationController) {
			FXMLFornecedorRegistrationController obj = (FXMLFornecedorRegistrationController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLAlunoRegistrationController) {
			FXMLAlunoRegistrationController obj = (FXMLAlunoRegistrationController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLInteressadosManagerController) {
			FXMLInteressadosManagerController obj = (FXMLInteressadosManagerController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLContactSearchController) {
			FXMLContactSearchController obj = (FXMLContactSearchController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLContactRegistrationController) {
			FXMLContactRegistrationController obj = (FXMLContactRegistrationController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProductManagerController) {
			FXMLProductManagerController obj = (FXMLProductManagerController) sender;
			mainAreaContainer.getChildren().remove(obj.getRootPane());
		}
		//menu
		if (sender instanceof FXMLMenuProdutoController) {
			FXMLMenuProdutoController obj = (FXMLMenuProdutoController) sender;
			menuAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLMenuAlunoController) {
			FXMLMenuAlunoController obj = (FXMLMenuAlunoController) sender;
			menuAreaContainer.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLMenuGeraisController) {
			FXMLMenuGeraisController obj = (FXMLMenuGeraisController) sender;
			menuAreaContainer.getChildren().remove(obj.getRootPane());
		}

	}

}
