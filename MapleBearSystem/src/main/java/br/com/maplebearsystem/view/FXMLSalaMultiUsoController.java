package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.persistence.PersistenceException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.SalaMultiUsoController;
import br.com.maplebearsystem.controller.TurmaPersonalizadaController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Nivel;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.WeekDays;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.component.FXMLAlunoSearchController;
import br.com.maplebearsystem.view.component.FXMLBuscaTurmaController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLSalaMultiUsoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox panelMain;

	@FXML
	private JFXTextField txtnome;

	@FXML
	private JFXTextField txtresponsavel;

	@FXML
	private TableView<TurmaPersonalizada> tviewTurma;

	@FXML
	private TableColumn<TurmaPersonalizada, String> colResponsavel;

	@FXML
	private TableColumn<TurmaPersonalizada, String> colTurma;

	@FXML
	private JFXButton btadd;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXComboBox<WeekDays> cbDiasemana;

	@FXML
	private JFXTextField txtde;

	@FXML
	private JFXTextField txtate;

	@FXML
	private JFXTextArea txtinfo;

	@FXML
	private JFXButton btSalvar;

	@FXML
	private JFXButton btCancelar;

	private SalaMultiUsoController modelController;
	private FXMLDefaultControllerInterface sourceController;
	List<Exception> mainErrorList;

	@FXML
	void addTurma(ActionEvent event) {
		try {
			if (cbDiasemana.getValue() == null) {
				FXNotification notification = new FXNotification("Selecione o dia que ira agendar,",
						FXNotification.NotificationType.INFORMATION);
				notification.show();
			}
			else
			{
				FXMLBuscaTurmaController controler = FXUISetup.getInstance()
						.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLEBEARSYSTEM_TURMA_BUSCAR, null, 0.0)
						.<FXMLBuscaTurmaController>getController();
				controler.switchToSelectorMode();
				controler.setSourceFXMLController(this);
				controler.setDia(cbDiasemana.getValue());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void cancelar(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void removerTurma(ActionEvent event) {
		try {
			TurmaPersonalizada turma = tviewTurma.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION,
					"Deseja remover a turma adicionada:\n" + turma.getNometurma() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				modelController.remove(turma);
				loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadTableView() {
		try {
			ObservableList<TurmaPersonalizada> modelo;
			modelo = FXCollections.observableArrayList(modelController.getSalaMultiUso().getTurma());
			// modelo = FXCollections.observableArrayList(alunos);
			if (tviewTurma.getItems() != null)
				tviewTurma.getItems().clear();
			tviewTurma.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
	}

	@FXML
	void salvar(ActionEvent event) {
		if (save()) {

			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);

			FXNotification notification = new FXNotification("Horario da Sala Salva,",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
			try {
				sourceController.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			String text = "";

			for (Exception e : mainErrorList) {
				text = text + e.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(text, FXNotification.NotificationType.WARNING);
			notification.show();
		}
	}

	public StackPane getRootPane() {
		return this.rootPane;
	}

	private boolean save() {
		//try {
			mainErrorList = modelController.validar(tviewTurma.getItems(), txtde.getText(), txtate.getText(),
					cbDiasemana.getValue(), txtresponsavel.getText(), txtinfo.getText(),txtnome.getText());
			if (mainErrorList.isEmpty()) {
				return true;
			}
		/*} catch (PersistenceException e) {
			e.printStackTrace();
			mainErrorList = modelController.validar(tviewTurma.getItems(), txtde.getText(), txtate.getText(),
					cbDiasemana.getValue(), txtresponsavel.getText(), txtinfo.getText(),txtnome.getText());
			if (mainErrorList.isEmpty()) {
				return true;
			}
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

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
		if (sender instanceof FXMLBuscaTurmaController) {
			if (data instanceof TurmaPersonalizada) {
				TurmaPersonalizada aluno = (TurmaPersonalizada) data;
				modelController.getSalaMultiUso().getTurma().add(aluno);
				// alunos.add(aluno);
				loadTableView();
				cbDiasemana.setDisable(true);
			}
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLBuscaTurmaController) {
			FXMLBuscaTurmaController obj = (FXMLBuscaTurmaController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new SalaMultiUsoController();
		modelController.setupNewSalaMultiUso();
		mainErrorList = new ArrayList<Exception>();
		cbDiasemana.setItems( FXCollections.observableArrayList( WeekDays.values()));
		txtde.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "##:##"));
		txtate.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "##:##"));
		initTableViews();

	}

	private void initTableViews() {
		colTurma.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNometurma());
		});
		colResponsavel.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getResponsavel());
		});
	}
}
