package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.view.component.FXMLProductRegistrationController;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
import br.com.maplebearsystem.view.component.FXMLProdutoSearchController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLProductManagerController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private HBox pnPrimaryContainer;

	@FXML
	private VBox pnProductSearch;

	@FXML
	private FXMLProdutoSearchController pnProductSearchController;

	@FXML
	private StackPane pnProductRegistration;
	@FXML
	private FXMLProductRegistrationController pnProductRegistrationController;

	private FXMLDefaultControllerInterface sourceController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initUI();
	}

// SECTION Main FXMLController Methods

// ENDSECTION Main FXMLController Methods

	public void editProduct(Product service) {

		try {
			pnProductRegistrationController.receiveData(service, this);
			enablePnProductRegistration();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		enablePnProductRegistration();
	}

	public void addNewProduct() {

		pnProductRegistrationController.setupNewProduct();
		enablePnProductRegistration();

	}

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		try {
			pnProductSearchController.setSourceFXMLController(this);
			pnProductSearchController.setTargetFXMLController(pnProductRegistrationController);
			pnProductRegistrationController.setSourceFXMLController(this);

			pnProductSearchController.switchToEditorMode();
			enablePnProductSearch();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	private void enablePnProductSearch() {
		if (pnPrimaryContainer.getChildren().contains(pnProductRegistration)) {
			pnPrimaryContainer.getChildren().remove(pnProductRegistration);
		}
		if (!pnPrimaryContainer.getChildren().contains(pnProductSearch)) {
			pnPrimaryContainer.getChildren().add(pnProductSearch);
		}
	}

	private void enablePnProductRegistration() {
		if (pnPrimaryContainer.getChildren().contains(pnProductSearch)) {
			pnPrimaryContainer.getChildren().remove(pnProductSearch);
		}
		if (!pnPrimaryContainer.getChildren().contains(pnProductRegistration)) {
			pnPrimaryContainer.getChildren().add(pnProductRegistration);
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
		if (sender.equals(pnProductRegistrationController)) {
			pnProductSearchController.reloadTableView();
			enablePnProductSearch();
			return;
		}

		if (sender.equals(pnProductSearchController)) {
			closeAndGoBack();
			return;
		}
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
