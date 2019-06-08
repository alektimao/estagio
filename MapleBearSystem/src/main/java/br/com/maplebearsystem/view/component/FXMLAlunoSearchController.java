package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;

import br.com.maplebearsystem.controller.AlunoController;
import br.com.maplebearsystem.controller.PessoaController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class FXMLAlunoSearchController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox rootPane;

	@FXML
	private JFXTextField tfieldNome;

	@FXML
	private JFXTextField tfieldcpf;

	@FXML
	private JFXTextField tfieldNumero;

	@FXML
	private JFXButton btnSPSearch;

	@FXML
	private TableView<Aluno> tviewPessoas;

	@FXML
	private TableColumn<Aluno, String> tviewColID;

	@FXML
	private TableColumn<Aluno, String> tviewColName;

	@FXML
	private TableColumn<Aluno, String> tviewColCPF;

	@FXML
	private TableColumn<Aluno, String> tviewColNumero;

	@FXML
	private HBox pnSelectorMode;

	@FXML
	private JFXButton btnSelect;

	@FXML
	private JFXButton btnEdit;

	@FXML
	private JFXButton btnSPDelete;

	@FXML
	private JFXButton btnCancel;

// SECTION Main FXMLController Attributes
	private FXMLDefaultControllerInterface sourceController;
	private AlunoController modelController;
	private FXMLContactRegistrationController contactRegistrationController;
// ENDSECTION Main FXMLController Attributes

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setModelController(new AlunoController());
		tfieldcpf.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		initTableViews();
	}

// SECTION Main FXMLController Methods

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		try {
			Aluno itemToRemove = tviewPessoas.getSelectionModel().getSelectedItem();
			getModelController().deleteAluno(itemToRemove);
			tviewPessoas.getItems().remove(itemToRemove);
		}
		catch (PersistenceException ex)
		{
			new FXNotification("Não e possivel deletar aluno pois ele e utlizado em outras funções do sistema", FXNotification.NotificationType.ERROR).show();
			return false;
		}
		catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.FINE, "Info: failed to save contact", e);
			new FXNotification("Error: " + e.getMessage() + e.getCause(), FXNotification.NotificationType.ERROR).show();
			return false;
		}

		return true;
	}

	private boolean selectItem() {

		try {
			sourceController.receiveData(tviewPessoas.getSelectionModel().getSelectedItem(), this);
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to switch to selectItem",
					e);
		}

		return false;
	}

	public void switchToSelectorMode() {

		try {
			tviewPessoas.setRowFactory(tv -> {
				TableRow<Aluno> row = new TableRow<Aluno>();
				row.setOnMouseClicked(event -> {
					if (event.getClickCount() == 2 && (!row.isEmpty())) {
						selectItem();
					}
				});
				return row;
			});
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: failed to switch to SelectorMode",
					e);
			this.actCancel(null);
		}

	}

	public void reloadTableView() {
		LoadTableView(tfieldcpf.getText(), tfieldNome.getText(), tfieldNumero.getText());
	}

	private void LoadTableView(String cpf, String nome, String numero) {
		if (cpf.equals("") && nome.equals("") && numero.equals("")) {
			try {
				ObservableList<Aluno> modelo;
				modelo = FXCollections.observableArrayList(modelController.getAlunos());
				if (tviewPessoas.getItems() != null)
					tviewPessoas.getItems().clear();
				tviewPessoas.setItems(modelo);
			} catch (Exception e) {
				System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
			}
		} else {
			try {
				ObservableList<Aluno> modelo;
				modelo = FXCollections.observableArrayList(modelController.getAlunos(cpf, nome, numero));
				if (tviewPessoas.getItems() != null)
					tviewPessoas.getItems().clear();
				tviewPessoas.setItems(modelo);
			} catch (Exception e) {
				System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
			}
		}
	}

// ENDSECTION Main FXMLController Methods

// SECTION Helper FXMLController Methods

// ENDSECTION Helper FXMLController Methods

// SECTION Data Manipulation FXMLController Methods

// ENDSECTION Data Manipulation FXMLController Methods

// SECTION UISetup FXMLController Methods
	@Override
	public void reset() {
		throw new UnsupportedOperationException();
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

	@FXML
	void actSPDelete(ActionEvent event) {
		if (delete()) {
			LoadTableView(tfieldcpf.getText(), tfieldNome.getText(), tfieldNumero.getText());
		}
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		LoadTableView(tfieldcpf.getText(), tfieldNome.getText(), tfieldNumero.getText());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		selectItem();
	}

	@FXML
	void actCancel(ActionEvent event) {
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
		sourceController = controller;

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
		if (sender == null) {
			throw new UnsupportedOperationException("Sender cannot be null");
		}

		if (sender instanceof FXMLContactRegistrationController) {
			rootPane.getChildren().remove(this.contactRegistrationController.getRootPane());
			contactRegistrationController = null;
			reloadTableView();
			return;
		}
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

	public AlunoController getModelController() {
		return modelController;
	}

	public void setModelController(AlunoController modelController) {
		this.modelController = modelController;
	}
	
	private void initTableViews() {
		tviewColID.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getId());
		});
		tviewColCPF.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getCpf());
		});
		tviewColName.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNome());
		});
		tviewColNumero.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNumeromatricula());
		});
	}

	public VBox getRootPane() {
		// TODO Auto-generated method stub
		return rootPane;
	}
}
