package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;

import br.com.maplebearsystem.controller.InteressadoController;
import br.com.maplebearsystem.model.Interessados;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLInteressadoRegistrationController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private VBox primaryPane;
	@FXML
	private HBox pnButtons;
	@FXML
	private JFXButton btnSave;
	@FXML
	private JFXButton btnDelete;
	@FXML
	private JFXButton btnCancel;
    
	@FXML
	private VBox pnInteressadosForm;
	@FXML
	private FXMLInteressadosFormController pnInteressadosFormController;

// SECTION Main FXMLController Attributes

	private FXMLDefaultControllerInterface sourceController;
	private InteressadoController modelController;

// SECTION Main FXMLController Attributes
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new InteressadoController();
		initUI();
		try {
			pnInteressadosFormController.setSourceFXMLController(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Failed to set pnInteressadoFormController controller - " + e.getMessage());
		}
	}

// SECTION Main FXMLController Methods

// ENDSECTION Main FXMLController Methods

	private boolean save() {

		List<Exception> errorList = modelController.saveInteressados(
				pnInteressadosFormController.gettfieldNome().getText(),
				pnInteressadosFormController.gettareaMotivo().getText(),
				pnInteressadosFormController.getdtData().getValue(),
				pnInteressadosFormController.gettftelefone1().getText(),
				pnInteressadosFormController.gettftelefone2().getText(),
				pnInteressadosFormController.gettfemail1().getText(),
				pnInteressadosFormController.gettfemail2().getText());

		if (errorList.isEmpty()) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
			alert.showAndWait();
			return true;

		} else {
			String text = "";

			for (Exception e : errorList) {
				text = text + e.getMessage() + "\n";
			}

			Alert errAlert = new Alert(Alert.AlertType.WARNING, text, ButtonType.OK);
			errAlert.showAndWait();

			return false;
		}

	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.WARNING, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		modelController.deleteInteressados();

		return true;
	}

	public void setupNewInteressado() {
		reset();
		modelController.setupNewInteressados();
		btnDelete.setDisable(true);
	}

	public void setupEditInteressado(Interessados partInteressado, boolean deleteEnabled) {
		modelController.setupEditInteressados(partInteressado);
		btnDelete.setDisable(!deleteEnabled);
		pnInteressadosFormController.setData(partInteressado);
	}

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {

		pnInteressadosFormController.switchToEditorMode();
	}

	@Override
	public void reset() {

		pnInteressadosFormController.reset();

	}

	private void switchToEditorMode() {
		reset();
		btnDelete.setDisable(false);
	}

	private void loadData() {
		pnInteressadosFormController.setData(modelController.getInteressados());
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	public void actSave(ActionEvent event) {

		if (save()) {
			try {
				sourceController.receiveData(modelController.getInteressados(), this);
				sourceController.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@FXML
	public void actDelete(ActionEvent event) {
		if (delete()) {
			try {
				sourceController.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FXML
	public void actCancel(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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

		if (data == null) {
			return;
		}

		if (data instanceof Interessados) {
			modelController.setupEditInteressados((Interessados) data);
			switchToEditorMode();
			loadData();
		}

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {

	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
