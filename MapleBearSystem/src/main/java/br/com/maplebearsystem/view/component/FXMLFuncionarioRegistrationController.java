package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import br.com.maplebearsystem.controller.FuncionarioController;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLFuncionarioRegistrationController implements Initializable, FXMLDefaultControllerInterface {
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
	private StackPane pnFuncionarioForm;

	@FXML
	private FXMLFuncionarioFormController pnFuncionarioFormController;

	private FXMLDefaultControllerInterface sourceController;
	FuncionarioController modelController;

	private void initUI() {
		modelController = new FuncionarioController();
		try {
			modelController.setupNewFuncionario();
			pnFuncionarioFormController.setSourceFXMLController(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Failed to set pnProductFormController controller - " + e.getMessage());
		}
	}

	@FXML
	void actCancel(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void actDelete(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void actSave(ActionEvent event) {
		if (modelController == null) {
			modelController.setupNewFuncionario();
		}
		List<Exception> errList = new ArrayList<Exception>();
		errList = modelController.salvar(pnFuncionarioFormController.getFuncionarioController().getFuncionario().getPessoa(),
				pnFuncionarioFormController.getcbativo().getValue(),
				pnFuncionarioFormController.gettfieldFuncao().getText(),
				pnFuncionarioFormController.gettfieldLogin().getText(), pnFuncionarioFormController.getcbNivel().getValue(),
				pnFuncionarioFormController.gettfieldSenha().getText(),
				pnFuncionarioFormController.getdtadmissão().getValue());
		if (errList.size() == 0) {
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);
			FXNotification notification = new FXNotification("Funcionario Salvo",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
		} else {
			String text = "";

			for (Exception e : errList) {
				text = text + e.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(text, FXNotification.NotificationType.WARNING);
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
		sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		if (sourceController instanceof FXMLFuncionarioSearchController) {
			if (data instanceof Funcionario) {
				modelController.setupEditFuncionario((Funcionario) data);
				CarregarCampos();
			}
		}

	}

	private void CarregarCampos() {
		pnFuncionarioFormController.CarregaCampos(modelController);

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();
		}
		if (sender instanceof FXMLFuncionarioRegistrationController) {
			FXMLFuncionarioRegistrationController obj = (FXMLFuncionarioRegistrationController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initUI();
	}

	public StackPane getRootPane() {
		// TODO Auto-generated method stub
		return this.rootPane;
	}

}
