package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.persistence.PersistenceException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.DocumentoController;
import br.com.maplebearsystem.controller.TurmaPersonalizadaController;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Alocar_Produto;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.WeekDays;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLAlunoSearchController;
import br.com.maplebearsystem.view.component.FXMLBuscaEmprestimoController;
import br.com.maplebearsystem.view.component.FXMLBuscaTurmaController;
import br.com.maplebearsystem.view.component.FXMLFuncionarioSearchController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
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

public class FXMLTurmaPersonalizadaController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox panelMain;

	@FXML
	private JFXTextField txtnome;

	@FXML
	private JFXTextField txtresponsavel;

	@FXML
	private JFXTextField txtperiodo;

	@FXML
	private JFXCheckBox ckseg;

	@FXML
	private JFXCheckBox ckTer;

	@FXML
	private JFXCheckBox ckQua;

	@FXML
	private JFXCheckBox ckQui;

	@FXML
	private JFXCheckBox cksex;

	@FXML
	private JFXCheckBox cksab;

	@FXML
	private TableView<Aluno> tviewalu;

	@FXML
	private TableColumn<Aluno, String> colAluno;

	@FXML
	private TableColumn<Aluno, String> colMatricula;

	@FXML
	private TableColumn<Aluno, String> colturma;

	@FXML
	private JFXButton btadd;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXCheckBox cksim;

	@FXML
	private JFXCheckBox cknao;

	@FXML
	private JFXTextArea txtinfo;

	@FXML
	private JFXButton btSalvar;

	@FXML
	private JFXButton btCancelar;

	private TurmaPersonalizadaController modelController;
	private FXMLDefaultControllerInterface sourceController;
	List<Exception> mainErrorList;
	List<Aluno> alunos;

	public List<WeekDays> check() {
		List<WeekDays> days = new ArrayList<WeekDays>();
		if (ckseg.isSelected()) {
			days.add(WeekDays.SEGUNDA);
		}
		if (ckTer.isSelected()) {
			days.add(WeekDays.TERCA);
		}
		if (ckQua.isSelected()) {
			days.add(WeekDays.QUARTA);
		}
		if (ckQui.isSelected()) {
			days.add(WeekDays.QUINTA);
		}
		if (cksex.isSelected()) {
			days.add(WeekDays.SEXTA);
		}
		if (cksab.isSelected()) {
			days.add(WeekDays.SABADO);
		}
		return days;
	}

	public void checkLanche() {
		if (cknao.isSelected()) {
			modelController.getTurmaPersonalizada().setLanchar(false);
			cksim.setSelected(false);
		}
		if (cksim.isSelected()) {
			modelController.getTurmaPersonalizada().setLanchar(true);
			cknao.setSelected(false);
		}
	}

	@FXML
	void addAluno(ActionEvent event) {
		try {
			FXMLAlunoSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_ALUNO_BUSCAR, null, 0.0)
					.<FXMLAlunoSearchController>getController();
			// controler.switchToSelectorMode();
			controler.setSourceFXMLController(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public StackPane getRootPane() {
		return rootPane;
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
	void removeraluno(ActionEvent event) {
		try {
			Aluno turma = tviewalu.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION,
					"Deseja remover o aluno adicionado:\n" + turma.getNome() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				modelController.removeAluno(turma);
				loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void salvar(ActionEvent event) {
		if (save()) {

			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);

			FXNotification notification = new FXNotification("Turma Salva,",
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

	@FXML
	void clicknao(ActionEvent event) {
		checkLanche();
	}

	@FXML
	void clicksim(ActionEvent event) {
		checkLanche();
	}

	private boolean save() {
		try {
			mainErrorList = modelController.validar(tviewalu.getItems(), txtnome.getText(), txtresponsavel.getText(),
					txtinfo.getText(), check());
			if (mainErrorList.isEmpty()) {
				return true;
			}
		} catch (PersistenceException e) {
			mainErrorList = modelController.validar(tviewalu.getItems(), txtnome.getText(), txtresponsavel.getText(),
					txtinfo.getText(), check());
			if (mainErrorList.isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		if (sender instanceof FXMLAlunoSearchController) {
			if (data instanceof Aluno) {
				Aluno aluno = (Aluno) data;
				modelController.getTurmaPersonalizada().addAlunos(aluno);
				// alunos.add(aluno);
				loadTableView();
			}
		}
		if (sender instanceof FXMLBuscaTurmaController) {
			if (data instanceof TurmaPersonalizada) {
				TurmaPersonalizada resultado = (TurmaPersonalizada) data;
				modelController.setupEdit(resultado);
				txtinfo.setText(modelController.getTurmaPersonalizada().getInfo());
				txtnome.setText(modelController.getTurmaPersonalizada().getNometurma());
				txtresponsavel.setText(modelController.getTurmaPersonalizada().getResponsavel());
				checar();
				loadTableView();
			}
		}

	}

	private void checar() {
		if (modelController.getTurmaPersonalizada().getDiasDaSemana().contains(WeekDays.SEGUNDA)) {
			ckseg.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().getDiasDaSemana().contains(WeekDays.TERCA)) {
			ckTer.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().getDiasDaSemana().contains(WeekDays.QUARTA)) {
			ckQua.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().getDiasDaSemana().contains(WeekDays.QUINTA)) {
			ckQui.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().getDiasDaSemana().contains(WeekDays.SEXTA)) {
			cksex.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().getDiasDaSemana().contains(WeekDays.SABADO)) {
			cksab.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().isLanchar() == true) {
			cksim.setSelected(true);
		}
		if (modelController.getTurmaPersonalizada().isLanchar() == false) {
			cknao.setSelected(true);
		}
	}

	private void loadTableView() {
		try {
			ObservableList<Aluno> modelo;
			modelo = FXCollections.observableArrayList(modelController.getTurmaPersonalizada().getAlunos());
			// modelo = FXCollections.observableArrayList(alunos);
			if (tviewalu.getItems() != null)
				tviewalu.getItems().clear();
			tviewalu.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLAlunoSearchController) {
			FXMLAlunoSearchController obj = (FXMLAlunoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new TurmaPersonalizadaController();
		modelController.setupNewTurmaPersonalizada();
		alunos = new ArrayList<Aluno>();
		initTableViews();
	}

	private void initTableViews() {
		colAluno.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNome());
		});
		colturma.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getTurmaAtual());
		});
		colMatricula.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNumeromatricula());
		});
	}

}
