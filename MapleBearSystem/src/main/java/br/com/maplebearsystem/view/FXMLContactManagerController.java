package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.dwor.controller.PessoaController;
import com.dwor.model.Pessoa;
import com.dwor.model.PessoaFisica;
import com.dwor.model.PessoaJuridica;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.view.component.ContactFormController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLContactManagerController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private SplitPane primaryPane;
	@FXML
	private VBox pnEdit;
	@FXML
	private VBox pnSearch;
	@FXML
	private HBox pnRdbtLegal;
	@FXML
	private JFXTextField tfieldSearch;
	@FXML
	private JFXButton btnSPSearch;
	@FXML
	private TableView<Pessoa> tviewPessoas;
	@FXML
	private TableColumn<Pessoa, Long> tviewColID;
	@FXML
	private TableColumn<Pessoa, String> tviewColName;
	@FXML
	private TableColumn<Pessoa, String> tviewColCPF;
	@FXML
	private TableColumn<Pessoa, String> tviewColCNPJ;
	@FXML
	private JFXButton btnSPNew;
	@FXML
	private JFXButton btnSPEdit;
	@FXML
	private JFXButton btnSPDelete;
	@FXML
	private JFXButton btSave;
	@FXML
	private JFXButton btDelete;
	@FXML
	private JFXButton btCancel;
	@FXML
	private JFXRadioButton rdbtPessoaFisica;
	@FXML
	private JFXRadioButton rdbtPessoaJuridica;
	@FXML
	private ToggleGroup rdbtGroupLegal;
	
	@FXML
	private VBox pnContactForm;
	@FXML
	private ContactFormController pnContactFormController;
	
// SECTION FXMLControler Main Attributes

	private PessoaController controller;
	private boolean pessoaJurMode;

// ENDSECTION FXMLControler Main Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		controller = new PessoaController();
		pnContactFormController.setController(controller);
		initUI();
		
	}

// SECTION UISetup FXMLController Methods
	
	private void initUI() {
		
		pnContactForm.setDisable(true);
		
		primaryPane.getItems().remove(pnEdit);
//      makeFadeIn();
		
		setValidators();

		tviewColID.setCellValueFactory(new PropertyValueFactory<Pessoa, Long>("id"));
		tviewColName.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("name"));
		tviewColCPF.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("cpf"));
		tviewColCNPJ.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("cnpj"));

		tviewPessoas.setRowFactory(tv -> {
			TableRow<Pessoa> row = new TableRow<Pessoa>();
			row.setOnMouseClicked(event -> {
				if (event.getClickCount() == 2 && (!row.isEmpty())) {
					clearPnEdit();
					enablePnEdit();
					edit();
				}
			});
			return row;
		});

		addRdbtGroupLegalEvent();
	}
	
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}
	
	private void clearPnEdit() {

		FXUISetup.getInstance().clearTextInputs(pnEdit);

		rdbtPessoaJuridica.setSelected(false);
		rdbtPessoaFisica.setSelected(false);
		rdbtGroupLegal.selectToggle(null);
	}

	private void enablePnSearch() {
		if (pnEdit.getParent() != null) {
			primaryPane.getItems().remove(pnEdit);
		}
		primaryPane.getItems().add(0, pnSearch);
		primaryPane.setDividerPosition(0, 0.5);
	}

	private void enablePnEdit() {
		if (pnSearch.getParent() != null) {
			primaryPane.getItems().remove(pnSearch);
		}
		primaryPane.getItems().add(0, pnEdit);
		primaryPane.setDividerPosition(0, 0.5);
		
		pnContactFormController.reset();
	}

	private void setValidators() {

//		ArrayList<JFXTextField> nodelist = new ArrayList<>(Arrays.asList(tfieldName, tfieldCPFCNPJ, tfieldRGIE,
//				tfieldDistrict, tfieldAddress, tfieldCEP, tfieldPhone, tfieldEmail));
//
//		for (JFXTextField node : nodelist) {
//			RequiredFieldValidator RequiredValidator = new RequiredFieldValidator();
//			RequiredValidator.setMessage("Requerido");
//			node.getValidators().add(RequiredValidator);
//			node.focusedProperty().addListener((observable, oldValue, newValue) -> {
//				if (!newValue) {
//					node.validate();
//				}
//			});
//		}

	}

	private void applySelectedPessoaMode(Boolean pessoaJurMode) {

		if (pessoaJurMode) {
			modePessoaJuridica();
		} else {
			modePessoaFisica();
		}
		
		pnContactForm.setDisable(false);
		pnRdbtLegal.setDisable(false);
		btSave.setDisable(false);
		btDelete.setDisable(true);

	}

	private void modeUpdate(Boolean pessoaJurMode) {

		if (pessoaJurMode) {
			modePessoaJuridica();
			rdbtPessoaJuridica.setSelected(true);

		} else {
			modePessoaFisica();
			rdbtPessoaFisica.setSelected(true);
		}
		
		pnContactForm.setDisable(false);
		btSave.setDisable(false);
		btDelete.setDisable(false);
		pnRdbtLegal.setDisable(true);
	}

	private void modePessoaFisica() {

		pessoaJurMode = false;
		pnContactFormController.setPessoaFisicaMode();
		pnContactFormController.setDisable(false);
	}

	private void modePessoaJuridica() {
		pessoaJurMode = true;
		pnContactFormController.setPessoaJuridicaMode();
		pnContactFormController.setDisable(false);
	}

	private void addRdbtGroupLegalEvent() {

		rdbtGroupLegal.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {

			if (newValue == (Toggle) rdbtPessoaJuridica) {
				applySelectedPessoaMode(true);
			} else {
				applySelectedPessoaMode(false);
			}

		});
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION Main FXMLController Methods

	private void LoadTableView(String filter) {
		PessoaController ctr = new PessoaController();

		ObservableList<Pessoa> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(ctr.getPessoas());
		} else {
			modelo = FXCollections.observableList(ctr.getPessoas(filter));
		}

		tviewPessoas.setItems(modelo);
	}

	private boolean save() {
		ArrayList<String> requiredFieldErrList = new ArrayList<>();

		// if new pessoa
		if (controller.getPessoa() == null) {
			return false;
		}

		try {
			controller.setName(pnContactFormController.getTfieldName().getText());
		} catch (Exception ex) {
			requiredFieldErrList.add(ex.getMessage());
		}

		if (pessoaJurMode) {
			try {
				controller.setIEstadual(pnContactFormController.getTfieldRGIE().getText());
			} catch (Exception ex) {
				// Logger.getLogger(this.getClass().getName()).log(Level.FINE, null, ex);
				requiredFieldErrList.add(ex.getMessage());
			}

			try {
				controller.setCNPJ(pnContactFormController.getTfieldCPFCNPJ().getText());
			} catch (Exception ex) {
				// Logger.getLogger(this.getClass().getName()).log(Level.FINE, null, ex);
				requiredFieldErrList.add(ex.getMessage());
			}

		} else {
			try {
				controller.setRG(pnContactFormController.getTfieldRGIE().getText());
			} catch (Exception ex) {
				// Logger.getLogger(this.getClass().getName()).log(Level.FINE, null, ex);
				requiredFieldErrList.add(ex.getMessage());
			}

			try {
				controller.setCPF(pnContactFormController.getTfieldCPFCNPJ().getText());
			} catch (Exception ex) {
				// Logger.getLogger(this.getClass().getName()).log(Level.FINE, null, ex);
				requiredFieldErrList.add(ex.getMessage());
			}
		}

		try {
			controller.setEmail(pnContactFormController.getTfieldEmail().getText());
		} catch (Exception ex) {
			Logger.getLogger(this.getClass().getName()).log(Level.FINE, null, ex);
			requiredFieldErrList.add(ex.getMessage());
		}

		if (requiredFieldErrList.isEmpty()) {
			controller.save();
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
			alert.showAndWait();
			return true;
		} else {
			String text = "";

			for (String string : requiredFieldErrList) {
				text = text + string + "\n";
			}

			Alert errAlert = new Alert(Alert.AlertType.WARNING, text, ButtonType.OK);
			errAlert.showAndWait();

			return false;
		}
	}

	private void edit() {

		controller.setPessoa((Pessoa) tviewPessoas.getSelectionModel().getSelectedItem());

		if (controller.getPessoa() != null) {
			
			pnContactFormController.updateMode();
			

			if (controller.getPessoa() instanceof PessoaJuridica) {
				pessoaJurMode = true;
				modeUpdate(pessoaJurMode);

			} else if (controller.getPessoa() instanceof PessoaFisica) {
				pessoaJurMode = false;
				modeUpdate(pessoaJurMode);

			}

		}
	}

	private void cancel() {
		controller.reset();
	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deseja realmente deletar este item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();
		if (alert.getResult() == ButtonType.YES) {
			try {
				controller.delete();
				controller.reset();
				LoadTableView("");
				Alert alert2 = new Alert(Alert.AlertType.INFORMATION, "Deletado", ButtonType.OK);
				alert2.showAndWait();
				btnSPDelete.setDisable(true);
				return true;
			} catch (Exception e) {

				Alert alert2 = new Alert(Alert.AlertType.WARNING, "Impossivel deletar, o registro pode estar em uso",
						ButtonType.OK);
				alert2.showAndWait();
				return false;
			}

		}

		return false;
	}

// ENDSECTION Main FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actCancel(ActionEvent event) {
		clearPnEdit();
		enablePnSearch();
		cancel();
	}

	@FXML
	void actDelete(ActionEvent event) {
		boolean ok = delete();
		if (ok) {
			enablePnSearch();
			LoadTableView("");
		}
	}

	@FXML
	void actSPDelete(ActionEvent event) {
		if (tviewPessoas.getSelectionModel() != null) {
			controller.setPessoa((Pessoa) tviewPessoas.getSelectionModel().getSelectedItem());

			boolean ok = delete();
			if (ok) {
				LoadTableView("");
				btnSPDelete.setDisable(true);
			}
		}
	}

	@FXML
	void actSPNew(ActionEvent event) {
		clearPnEdit();
		enablePnEdit();
		controller.createPessoa(pessoaJurMode);
		btSave.setDisable(false);
	}

	@FXML
	void actSPEdit(ActionEvent event) {
		clearPnEdit();
		enablePnEdit();
		edit();
		/**
		 * TODO
		 */
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		LoadTableView(tfieldSearch.getText().toLowerCase());
	}

	@FXML
	void actSave(ActionEvent event) {
		boolean ok = save();

		if (ok) {
			enablePnSearch();
			LoadTableView("");
			controller.reset();
		}
	}

	@FXML
	void actSelectCity(ActionEvent event) {

	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated type stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation
}
