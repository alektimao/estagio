package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.maplebearsystem.model.Interessados;
import br.com.maplebearsystem.view.component.FXMLInteressadoRegistrationController;
import br.com.maplebearsystem.view.component.FXMLInteressadosSearchController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLInteressadosManagerController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private HBox pnPrimaryContainer;

	@FXML
	private VBox pnInteressadosSearch;
	@FXML
	private StackPane pnInteressadosRegistration;

	@FXML
	private FXMLInteressadosSearchController pnInteressadosSearchController;
	
	@FXML
	private FXMLInteressadoRegistrationController pnInteressadosRegistrationController;

	private FXMLDefaultControllerInterface sourceController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION Main FXMLController Methods

// ENDSECTION Main FXMLController Methods

	public void editInteressados(Interessados service) {

		try {
			pnInteressadosRegistrationController.receiveData(service, this);
			enablePnInteressadoRegistration();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		enablePnInteressadoRegistration();
	}

	public void addNewInteressados() {

		pnInteressadosRegistrationController.setupNewInteressado();
		enablePnInteressadoRegistration();

	}

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		try {
			pnInteressadosSearchController.setSourceFXMLController(this);
			pnInteressadosSearchController.setTargetFXMLController(pnInteressadosRegistrationController);
			pnInteressadosRegistrationController.setSourceFXMLController(this);

			pnInteressadosSearchController.switchToEditorMode();
			enablePnInteressadosSearch();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	private void enablePnInteressadosSearch() {
		if (pnPrimaryContainer.getChildren().contains(pnInteressadosRegistration)) {
			pnPrimaryContainer.getChildren().remove(pnInteressadosRegistration);
		}
		if (!pnPrimaryContainer.getChildren().contains(pnInteressadosSearch)) {
			pnPrimaryContainer.getChildren().add(pnInteressadosSearch);
		}
	}

	private void enablePnInteressadoRegistration() {
		if (pnPrimaryContainer.getChildren().contains(pnInteressadosSearch)) {
			pnPrimaryContainer.getChildren().remove(pnInteressadosSearch);
		}
		if (!pnPrimaryContainer.getChildren().contains(pnInteressadosRegistration)) {
			pnPrimaryContainer.getChildren().add(pnInteressadosRegistration);
		}
	}

	public void closeAndGoBack() {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		sourceController = controller;
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

		if (sender == null)
			return;
		if (sender.equals(pnInteressadosRegistrationController)) {
			pnInteressadosSearchController.reloadTableView();
			enablePnInteressadosSearch();
			return;
		}

		if (sender.equals(pnInteressadosSearchController)) {
			closeAndGoBack();
			return;
		}
	}

	public StackPane getRootPane() {
		// TODO Auto-generated method stub
		return  rootPane;
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
