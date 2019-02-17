package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.OperationNotSupportedException;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import com.jfoenix.controls.JFXButton;

import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class FXMLDworHomeController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private BorderPane rootPane;
	@FXML
	private HBox pnSidebar;
	@FXML
	private VBox pnSidebarButtons;
	@FXML
	private Label labelDWORname;
	@FXML
	private Label labelDWORversion;
	@FXML
	private SubScene subScene;
	@FXML
	private VBox mainAreaContainer;
	@FXML
	private JFXButton btnSidebarEquipments;
	@FXML
	private JFXButton btnSidebarContacts;
	@FXML
	private JFXButton btnSidebarConfigs;
	@FXML
	private JFXButton btnSidebarExit;
	@FXML
	private JFXButton btnSidebarWorkOrders;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		initUI();
	}

	// SECTION Main FXMLController Methods

	public void doLogin(String str1, String str2) {

	}
	
// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	public void hideSidebar(boolean flag) {
		
		if(flag) {
			if (pnSidebar.getChildren().contains(pnSidebarButtons))
				pnSidebar.getChildren().remove(pnSidebarButtons);
		}else {
			if(!pnSidebar.getChildren().contains(pnSidebarButtons)) {
				pnSidebar.getChildren().add(pnSidebarButtons);
			}
		}
		

	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	public void actExit(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}

	@FXML
	public void actManageEquipments(ActionEvent event) {
		try {
			FXMLEquipmentMenuController controller = FXUISetup.getInstance()
					.loadFXMLIntoVbox(mainAreaContainer, MapleBearSystemDesktopClient.class,
							FXMLResourcePathsEnum.FXML_DWOR_EQUIPMENTMENU.getPath())
					.<FXMLEquipmentMenuController>getController();

			controller.setSourceFXMLController(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FXML
	public void actManageContacts(ActionEvent event) {

		try {
			FXMLContactManagerController controller = FXUISetup.getInstance()
					.loadFXMLIntoVbox(mainAreaContainer, MapleBearSystemDesktopClient.class,
							FXMLResourcePathsEnum.FXML_DWOR_CONTACTMANAGER.getPath())
					.<FXMLContactManagerController>getController();

			controller.setSourceFXMLController(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	public void actConfigure(ActionEvent event) {
	}

	@FXML
	public void actManageWorkOrders(ActionEvent event) {

		try {
			FXMLWorkOrderMenuController controller = FXUISetup.getInstance()
					.loadFXMLIntoVbox(mainAreaContainer, MapleBearSystemDesktopClient.class,
							FXMLResourcePathsEnum.FXML_DWOR_WORKORDERMENU.getPath())
					.<FXMLWorkOrderMenuController>getController();

			controller.setSourceFXMLController(this);
			controller.setParentPane(mainAreaContainer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new OperationNotSupportedException("Not implemented");
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new OperationNotSupportedException("Not implemented");
	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		throw new OperationNotSupportedException("Not implemented");
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		throw new OperationNotSupportedException("Not implemented");
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
