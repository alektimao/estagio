package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
import br.com.maplebearsystem.view.component.FXMLSaidaRegistrationController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLSaidaManagerController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootpane;
	@FXML
	private HBox pnPrimaryContainer;
	@FXML
	private VBox pnProductSearch;
	@FXML
	private FXMLProductSearchController pnProductSearchController;

	private FXMLSaidaRegistrationController SaidaRegistrationController;

	private void initUI() {
		try {
			pnProductSearchController.setSourceFXMLController(this);
			pnProductSearchController.switchToSelectorMode();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void abrePainelSaidaRegistration(List<Product> resultado) {
		// TODO Auto-generated method stub
		try {
			SaidaRegistrationController = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootpane, FXResourcePath.FXML_MAPLE_SAIDA_REGISTRATION, null, 0.0)
					.<FXMLSaidaRegistrationController>getController();
			SaidaRegistrationController.setSourceFXMLController(this);
			SaidaRegistrationController.setData(resultado);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		if (sender == null)
			return;
		if (sender.equals(SaidaRegistrationController)) {
			pnProductSearchController.reloadTableView();
			rootpane.getChildren().remove(SaidaRegistrationController.getRootPane());
			return;
		}
		
//		if(sender.equals(pnProductSearchController)) {
//			closeAndGoBack();
//			return;
//		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		initUI();
	}

}
