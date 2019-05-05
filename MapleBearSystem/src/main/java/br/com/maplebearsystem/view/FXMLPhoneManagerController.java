package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.controller.PessoaController;
import br.com.maplebearsystem.model.Phone;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLPhoneManagerController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	@FXML
	private VBox primaryPane;
	@FXML
	private JFXListView<Phone> listViewPhones;
	@FXML
	private JFXButton btnEditItem;
	@FXML
	private JFXButton btnAdd;
	@FXML
	private VBox pnEdit;
	@FXML
	private JFXButton btnRemove;
	@FXML
	private JFXButton btnSave;

	@FXML
	private HBox pnPhoneForm;
	@FXML
	private FXMLPhoneFormController pnPhoneFormController;

// SECTION Main FXMLController Attributes

	PessoaController pessoaController;
	private FXMLDefaultControllerInterface sourceController;

// ENDSECTION Main FXMLController Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setEditPaneEnabled(false);
	}

// SECTION UISetup FXMLController Methods

	@Override
	public void reset() {
		throw new UnsupportedOperationException();

	}

// ENDSECTION UISetup FXMLController Methods

// SECTION Main FXMLController Methods

	private Boolean savePhone() {

		List<Exception> errorList = pessoaController.validateSavePhone(
				pnPhoneFormController.getTfieldPhone().getText(),
				pnPhoneFormController.getTfieldTelecomCompany().getText(),
				pnPhoneFormController.getCmbboxPhoneType().getSelectionModel().getSelectedItem());

		if (errorList.isEmpty()) {

			new FXNotification("Telefone salvo com sucesso!", FXNotification.NotificationType.INFORMATION).show();

			return true;
		} else {
			String errorMessages = "";
			for (Exception exception : errorList) {
				errorMessages = errorMessages + exception.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(errorMessages, FXNotification.NotificationType.WARNING);
			notification.show();

		}

		return false;
	}

	private void addNewPhone() {
		pessoaController.setupNewPhone();

		btnRemove.setDisable(true);
		btnSave.setText("Adicionar");
		pnPhoneFormController.reset();
		setEditPaneEnabled(true);
	}

	private void editPhone() {
		Phone phone = listViewPhones.getSelectionModel().getSelectedItem();

		if (phone != null) {
			pessoaController.setupEditPhone(phone);
			pnPhoneFormController.reset();
			pnPhoneFormController.setData(phone.getPhoneString(), phone.getTelcomCompany(), phone.getType());

			setEditPaneEnabled(true);
			btnRemove.setDisable(false);
			btnSave.setText("Alterar");
		}

	}

// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

	private void loadListViewPhones() {

		Task<ObservableList<Phone>> task = new Task<ObservableList<Phone>>() {

			@Override
			protected ObservableList<Phone> call() throws Exception {
				return FXCollections.observableArrayList(pessoaController.getStagedPessoa().getPhones());
			}

		};

		task.setOnSucceeded((event) -> {
			Platform.runLater(() -> {
				try {
					listViewPhones.getItems().clear();
					if (task.get() != null)
						listViewPhones.setItems(task.get());
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName())
							.log(Level.WARNING, "Warning: failed to load listViewPhones items", e);
				}
			});
		});

		new Thread(task).run();

	}

	private void setEditPaneEnabled(boolean enable) {
		if (enable) {
			pnEdit.setDisable(false);
		} else {
			pnEdit.setDisable(true);
			FXUISetup.getInstance().clearTextInputs(pnEdit);
		}
	}

// ENDSECTION Helper FXMLController Methods

// SECTION Data Manipulation FXMLController Methods

	public void setPessoaController(PessoaController modelController) {
		this.pessoaController = modelController;
		loadListViewPhones();
		setEditPaneEnabled(false);
	}

// ENDSECTION Data Manipulation FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actAdd(ActionEvent event) {
		addNewPhone();
	}

	@FXML
	void actCancel(ActionEvent event) {
		setEditPaneEnabled(false);
	}

	@FXML
	void actEditItem(ActionEvent event) {
		editPhone();
	}

	@FXML
	void actRemove(ActionEvent event) {
		try {
			pessoaController.removePhone();

			setEditPaneEnabled(false);
			loadListViewPhones();
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to remove", e);
		}

	}

	@FXML
	void actSave(ActionEvent event) {

		boolean ok = savePhone();

		if (ok) {
			loadListViewPhones();
			setEditPaneEnabled(false);
		}
	}

	@FXML
	void actGoBack(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to close", e);
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

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

// ENDSECTION FXMLDefaultControllerInterface Implementation

	public StackPane getRootPane() {
		return rootPane;
	}

}
