package br.com.maplebearsystem.view.component;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.view.controller.FXMLDefaultControllerInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

import com.dwor.controller.PessoaController;
import com.dwor.model.Pessoa;

import javafx.fxml.Initializable;

public class FXMLContactSearchController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox rootPane;
	@FXML
	private JFXTextField tfieldSearch;
	@FXML
	private JFXButton btnSearch;
	@FXML
	private TableView<Pessoa> tviewPessoas;
	@FXML
	private TableColumn<Pessoa, Long> tviewColID;
	@FXML
	private TableColumn<Pessoa, String> tviewColName;
	@FXML
	private TableColumn<Pessoa, String> tviewColCPFCNPJ;
	@FXML
	private TableColumn<Pessoa, String> tviewColPhones;
	@FXML
	private TableColumn<Pessoa, String> tviewColAddresses;
	@FXML
	private VBox pnButtons;
	@FXML
	private HBox pnEditorMode;
	@FXML
	private JFXButton btnNew;
	@FXML
	private JFXButton btnEdit;
	@FXML
	private JFXButton btnDelete;
	@FXML
	private HBox pnSelectorMode;
	@FXML
	private JFXButton btnSelect;
	@FXML
	private JFXButton btnCancel;

	private FXMLDefaultControllerInterface sourceController;
	private boolean JuridicaModeOnly;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		JuridicaModeOnly = false;

		initUI();

		tviewColID.setCellValueFactory(new PropertyValueFactory<Pessoa, Long>("id"));
		tviewColName.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("name"));
		tviewColCPFCNPJ.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("pessoaCNumber"));
		tviewColPhones.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("phoneListBriefString"));
		tviewColAddresses.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("addressListBriefString"));

	}

// SECTION Main FXMLController Methods

	private boolean selectItem() {

		try {
			sourceController.receiveData(tviewPessoas.getSelectionModel().getSelectedItem(), this);
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	public void switchToSelectorMode() {

		try {
			tviewPessoas.setRowFactory(tv -> {
				TableRow<Pessoa> row = new TableRow<Pessoa>();
				row.setOnMouseClicked(event -> {
					if (event.getClickCount() == 2 && (!row.isEmpty())) {
						selectItem();
					}
				});
				return row;
			});

			if (pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().remove(pnEditorMode);
			if (!pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().add(pnSelectorMode);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public void switchToJuridicaModeOnly() {
		JuridicaModeOnly = true;
	}

	private void LoadTableView(String filter) {
		PessoaController ctr = new PessoaController();

		ObservableList<Pessoa> modelo;

		if (filter.equals("")) {

			if (JuridicaModeOnly) {
				modelo = FXCollections.observableArrayList(ctr.getJuridicas());
			} else {
				modelo = FXCollections.observableArrayList(ctr.getPessoas());
			}
		} else {
			if (JuridicaModeOnly) {
				modelo = FXCollections.observableArrayList(ctr.getJuridicas(filter));
			} else {
				modelo = FXCollections.observableList(ctr.getPessoas(filter));
			}
		}

		tviewPessoas.setItems(modelo);
	}

// ENDSECTION Main FXMLController Methods

	private void initUI() {

	}

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actSPDelete(ActionEvent event) {

	}

	@FXML
	void actSPEdit(ActionEvent event) {

	}

	@FXML
	void actSPNew(ActionEvent event) {

	}

	@FXML
	void actSPSearch(ActionEvent event) {
		LoadTableView(tfieldSearch.getText().toLowerCase());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		selectItem();
	}

	@FXML
	void actSelectorEdit(ActionEvent event) {

	}

	@FXML
	void actCancel(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO log exception E
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
		// TODO Auto-generated method stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
