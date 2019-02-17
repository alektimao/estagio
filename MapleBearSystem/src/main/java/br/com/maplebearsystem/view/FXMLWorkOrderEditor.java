package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.naming.OperationNotSupportedException;

import com.dwor.controller.WorkOrderController;
import com.dwor.model.Pessoa;
import com.dwor.model.PessoaJuridica;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.JFXTreeTableView;

import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.view.component.FXMLContactSearchController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class FXMLWorkOrderEditor implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private StackPane rootPane;
	@FXML
	private FlowPane pnIntermediaryOrganizationForm;
	@FXML
	private JFXTextField tfieldCustomerName;
	@FXML
	private JFXTextField tfieldCustomerCPFCPNJ;
	@FXML
	private JFXTextField tfieldCustomerPhone;
	@FXML
	private JFXTextField tfieldIntermediaryOrganizationName;
	@FXML
	private JFXTextField tfieldIntermediaryOrganizationCNPJ;
	@FXML
	private JFXTextField tfieldIntermediaryOrganizationPhone;
	@FXML
	private JFXTextField tfieldEquipmentBrand;
	@FXML
	private JFXTextField tfieldSerialNumber;
	@FXML
	private JFXTextField tfieldModel;
	@FXML
	private JFXTextField tfieldPat;
	@FXML
	private JFXTextField tfieldItemsAndAcessories;
	@FXML
	private JFXTextField tfieldTravelledDistance;
	@FXML
	private JFXTextField tfieldFeesAndTaxes;
	@FXML
	private JFXTextField tfieldKmPrice;
	@FXML
	private JFXTextField tfieldTotalTravellCost;
	@FXML
	private JFXCheckBox chkboxPageCounter;
	@FXML
	private JFXTextField tfieldPageCounter;
	@FXML
	private JFXTextArea tareaRequestAndProblem;
	@FXML
	private JFXTextArea tareaDiagnostic;
	@FXML
	private JFXTextArea tareaServicesSolutionsProvided;
	@FXML
	private JFXToggleButton tgglebtnSwitchIntermediaryOrganizationEnabled;
	@FXML
	private JFXComboBox<?> cmbbxEquipmentType;
	@FXML
	private JFXToggleButton tgglebtnSwitchOrderSchedulinglEnabled;
	@FXML
	private JFXDatePicker dtpickerScheduledDate;
	@FXML
	private JFXTimePicker timepickerScheduledTime;
	@FXML
	private JFXToggleButton tgglebtnEnableTravel;
	@FXML
	private JFXCheckBox chkboxServiceCallPerformed;
	@FXML
	private JFXDatePicker dtpickerFinalizationDate;
	@FXML
	private JFXTreeTableView<?> tviewServices;
	@FXML
	private TreeTableColumn<?, ?> tfieldServiceDescription;
	@FXML
	private TreeTableColumn<?, ?> tviewServiceSuggestedValue;
	@FXML
	private TreeTableColumn<?, ?> tviewServiceValue;
	@FXML
	private JFXTreeTableView<?> tviewPartProducts;
	@FXML
	private TreeTableColumn<?, ?> tviewPartProductDescription;
	@FXML
	private JFXButton btnSearchCustomer;
	@FXML
	private JFXButton btnVisualizeCustomerInfo;
	@FXML
	private JFXButton btnSearchIntermediryOrganization;
	@FXML
	private JFXButton btnVisualizeIntermediryOrganizationInfo;
	@FXML
	private JFXButton btnSearchBrand;
	@FXML
	private JFXButton btnSearchModel;
	@FXML
	private JFXButton btnAddService;
	@FXML
	private JFXButton btnEditSelectedService;
	@FXML
	private JFXButton btnRemoveSelectedService;
	@FXML
	private JFXButton btnAddPartProduct;
	@FXML
	private JFXButton btnEditSelectedPartProduct;
	@FXML
	private JFXButton btnRemoveSelectedPartProduct;
	@FXML
	private JFXButton btnSave;
	@FXML
	private JFXButton btnCancel;

	private FXMLDefaultControllerInterface sourceController;
	private FXMLDworHomeController homeController;

	private FXMLContactSearchController customerSearchController;
	private FXMLContactSearchController IntermediaryOrganizationSearchController;

// SECTION FXMLControler Main Attributes

	private WorkOrderController controller;

// ENDSECTION FXMLControler Main Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		initUI();
		controller = new WorkOrderController();
	}

// SECTION Main FXMLController Methods

	public void setHomeFXMLController(FXMLDefaultControllerInterface homeController) {
		if (homeController instanceof FXMLDworHomeController)
			this.homeController = (FXMLDworHomeController) homeController;

	}

	private void cancel() {

		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {

		try {
			homeController.hideSidebar(true);
		} catch (Exception e) {
			// TODO: handle exception
		}

		enableIntermediaryOrganization(false);

	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	private void loadCustomerInfo() {

		try {
			tfieldCustomerName.setText(controller.getWorkOrder().getCustomer().getName());
			tfieldCustomerCPFCPNJ.setText(controller.getWorkOrder().getCustomer().getPessoaCNumber());
			tfieldCustomerPhone.setText(controller.getWorkOrder().getCustomer().getPhoneListBriefString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private void loadIntermediaryOrganizationInfo() {
		try {
			tfieldIntermediaryOrganizationName
					.setText(controller.getWorkOrder().getIntermediaryOrganization().getName());
			tfieldIntermediaryOrganizationCNPJ
					.setText(controller.getWorkOrder().getIntermediaryOrganization().getCnpj());
			tfieldIntermediaryOrganizationPhone
					.setText(controller.getWorkOrder().getIntermediaryOrganization().getPhoneListBriefString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private FXMLContactSearchController showContactSearchController() {
		try {

			FXMLContactSearchController contactSearchController = FXUISetup.getInstance()
					.loadFXMLIntoNewSubSceneAndPutIntoStackPane(rootPane, MapleBearSystemDesktopClient.class,
							FXMLResourcePathsEnum.FXML_DWOR_CONTACTSEARCH.getPath(), new DropShadow(127, Color.BLACK))
					.<FXMLContactSearchController>getController();

			rootPane.getChildren().get(0).setDisable(true);
			contactSearchController.setSourceFXMLController(this);
			contactSearchController.switchToSelectorMode();

			return contactSearchController;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private void showCustomerSearchPane() {
		customerSearchController = showContactSearchController();
	}

	private void showIntermediaryOrganizationSearchPane() {
		IntermediaryOrganizationSearchController = showContactSearchController();

		if (IntermediaryOrganizationSearchController != null) {
			IntermediaryOrganizationSearchController.switchToJuridicaModeOnly();
		}
	}

	private void enableIntermediaryOrganization(boolean flag) {
		pnIntermediaryOrganizationForm.setDisable(!flag);
		btnSearchIntermediryOrganization.setDisable(!flag);
		btnVisualizeIntermediryOrganizationInfo.setDisable(!flag);

	}
// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actSave(ActionEvent event) {

	}

	@FXML
	void actCancel(ActionEvent event) {
		cancel();
	}

	@FXML
	void actAddPartProduct(ActionEvent event) {

	}

	@FXML
	void actAddService(ActionEvent event) {

	}

	@FXML
	void actEditSelectedPartProduct(ActionEvent event) {

	}

	@FXML
	void actEditSelectedService(ActionEvent event) {

	}

	@FXML
	void actRemoveSelectedPartProduct(ActionEvent event) {

	}

	@FXML
	void actRemoveSelectedService(ActionEvent event) {

	}

	@FXML
	void actSearchCustomer(ActionEvent event) {
		showCustomerSearchPane();
	}

	@FXML
	void actSearchIntermediaryOrganization(ActionEvent event) {
		showIntermediaryOrganizationSearchPane();
	}

	@FXML
	void actSelectEquipmentType(ActionEvent event) {

	}

	@FXML
	void actSwitchIntermediaryOrganizationEnabled(ActionEvent event) {
		if (tgglebtnSwitchIntermediaryOrganizationEnabled.isSelected()) {
			enableIntermediaryOrganization(true);
		} else {
			enableIntermediaryOrganization(false);
		}
	}

	@FXML
	void actSwitchOrderSchedulinglEnabled(ActionEvent event) {

	}

	@FXML
	void actSwitchServiceCallPerformedEnabled(ActionEvent event) {

	}

	@FXML
	void actSwitchTravelEnabled(ActionEvent event) {

	}

	@FXML
	void actVisualizeCustomerInfo(ActionEvent event) {

	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		throw new OperationNotSupportedException("Not implemented");
	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {

		if (data == null) {
			return;
		}

		if (data instanceof Pessoa) {
			if (sender.equals(customerSearchController)) {
				controller.setCustomer((Pessoa) data);
				loadCustomerInfo();
				return;
			}
			if (sender.equals(IntermediaryOrganizationSearchController) && data instanceof PessoaJuridica) {
				controller.setIntermediaryOrganization((PessoaJuridica) data);
				loadIntermediaryOrganizationInfo();
				return;
			}
		}

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {

		if (sender != null) {
			if (sender.equals(customerSearchController)) {

				rootPane.getChildren().remove(1);
				customerSearchController = null;
				rootPane.getChildren().get(0).setDisable(false);

				return;
			}
			if (sender.equals(IntermediaryOrganizationSearchController)) {

				rootPane.getChildren().remove(1);
				customerSearchController = null;
				rootPane.getChildren().get(0).setDisable(false);

				return;
			}
		}

	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
