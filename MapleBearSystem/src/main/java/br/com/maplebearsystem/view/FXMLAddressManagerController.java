package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.controller.PessoaController;
import br.com.maplebearsystem.model.Address;
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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLAddressManagerController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private StackPane rootPane;
	@FXML
	private VBox primaryPane;
	@FXML
	private JFXListView<Address> listViewAddresses;
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
	private VBox pnAddressForm;
	@FXML
	private FXMLAddressFormController pnAddressFormController;

// SECTION Main FXMLController Attributes

	private PessoaController pessoaController;
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

	private boolean saveAddress() {

		List<Exception> errorList = pessoaController.validateSaveAddress(
				pnAddressFormController.getTfieldPostalCode().getText(),
				pnAddressFormController.getTfieldAddress().getText(),
				pnAddressFormController.getTfieldAddressNumber().getText(),
				pnAddressFormController.getTfieldDistrict().getText(),
				pnAddressFormController.getTfieldAddressComplement().getText(),
				pnAddressFormController.getCmbboxCity().getSelectionModel().getSelectedItem());

		if (errorList.isEmpty()) {

			new FXNotification("Endereço salvo com sucesso!", FXNotification.NotificationType.INFORMATION).show();

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

	private void addNewAddress() {
		pessoaController.setupNewAddress();

		btnRemove.setDisable(true);
		btnSave.setText("Adicionar");
		pnAddressFormController.reset();
		setEditPaneEnabled(true);
	}

	private void editAddress() {

		Address address = listViewAddresses.getSelectionModel().getSelectedItem();

		if (address != null) {
			pessoaController.setupEditAddress(address);
			pnAddressFormController.reset();
			pnAddressFormController.loadData(
					address.getPostalCode(),
					address.getAddress(),
					address.getDistrict(),
					address.getAddressComplement(),
					address.getCity());

			setEditPaneEnabled(true);
			btnRemove.setDisable(false);
			btnSave.setText("Alterar");
		}

	}

// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

	private void loadListViewAddresses() {

		Task<ObservableList<Address>> task = new Task<ObservableList<Address>>() {

			@Override
			protected ObservableList<Address> call() throws Exception {
				return FXCollections.observableArrayList(pessoaController.getStagedPessoa().getAddresses());
			}

		};

		task.setOnSucceeded((event) -> {
			Platform.runLater(() -> {

				listViewAddresses.getItems().clear();
				try {
					if (task.get() != null)
						listViewAddresses.setItems(task.get());
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to load addresses", e);
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
		loadListViewAddresses();
		setEditPaneEnabled(false);
	}

// ENDSECTION Data Manipulation FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actAddNew(ActionEvent event) {
		addNewAddress();
	}

	@FXML
	void actCancel(ActionEvent event) {
		setEditPaneEnabled(false);
	}

	@FXML
	void actEditItem(ActionEvent event) {
		editAddress();
	}

	@FXML
	void actRemove(ActionEvent event) {
		try {
			pessoaController.removeAddress();

			setEditPaneEnabled(false);
			loadListViewAddresses();
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to remove Address", e);
		}
	}

	@FXML
	void actSave(ActionEvent event) {
		boolean ok = saveAddress();

		if (ok) {
			loadListViewAddresses();
			setEditPaneEnabled(false);
		}
	}

	@FXML
	void actGoBack(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed close AddressManager", e);
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
