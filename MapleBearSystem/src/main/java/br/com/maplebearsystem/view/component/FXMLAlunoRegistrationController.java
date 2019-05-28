package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;

import javax.persistence.NoResultException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.AlunoController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLProductManagerController;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.net.sponteeducacional.api.WSAPIEduSoapProxy;
import br.net.sponteeducacional.api.WsAluno;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLAlunoRegistrationController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private VBox rootPane;

	@FXML
	private JFXTextField tfieldNome;

	@FXML
	private JFXTextField tfieldcpf;

	@FXML
	private JFXTextField tfieldmatricula;

	@FXML
	private JFXButton btnSearch;

	@FXML
	private TableView<WsAluno> tviewSearch;

	@FXML
	private TableColumn<WsAluno, String> tviewColNome;

	@FXML
	private TableColumn<WsAluno, String> tviewColCPF;

	@FXML
	private TableColumn<WsAluno, String> tviewColNumero;

	@FXML
	private TableColumn<WsAluno, String> tviewColDT;

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
	private JFXButton btnGoBack;

	@FXML
	private HBox pnSelectorMode;

	@FXML
	private JFXButton btnSelect;

	@FXML
	private JFXButton btnCancel;

	private FXMLDefaultControllerInterface sourceController;

	private AlunoController modelController;

	private String parametro;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new AlunoController();
		parametro = "";
		initUI();
	}

// SECTION Main FXMLController Methods

	private boolean selectItem() {

		try {
			receiveData(tviewSearch.getSelectionModel().getSelectedItem(), this);
			// closeSenderNode(this);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	private boolean editItem() {

//		if (sourceController instanceof FXMLProductManagerController) {
//			try {
//				((FXMLProductManagerController) sourceController)
//						.editProduct(tviewSearch.getSelectionModel().getSelectedItem());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			return true;
//		}
		return false;
	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

			if (pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().remove(pnEditorMode);
			if (!pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().add(pnSelectorMode);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public void switchToEditorMode() {
		try {
			tviewSearch.setRowFactory(tv -> {
				TableRow<WsAluno> row = new TableRow<WsAluno>();
				row.setOnMouseClicked(event -> {
					if (event.getClickCount() == 2 && (!row.isEmpty())) {
						// editItem();
					}
				});
				return row;
			});

			if (pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().remove(pnSelectorMode);
			if (!pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().add(pnEditorMode);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public void reloadTableView() {
		loadTableView(tfieldNome.getText());
	}

	private void loadTableView(String filter) {

		List<WsAluno> resultado = new ArrayList<WsAluno>();
		ObservableList<WsAluno> modelo;

		WSAPIEduSoapProxy buscar = new WSAPIEduSoapProxy();
		try {
			WsAluno[] alunos = buscar.getAlunos(43394, "T8WNOyNLwNPx", parametro);
			for (WsAluno result : alunos) {
				resultado.add(result);
			}
			modelo = FXCollections.observableArrayList(resultado);
			tviewSearch.setItems(modelo);
		} catch (Exception e) {
			FXNotification notification = new FXNotification("Ocorreu Algum erro ao buscar o aluno no web service,",
					FXNotification.NotificationType.WARNING);
			notification.show();
		}
	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.WARNING, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		//modelController.deleteAluno();

		return true;
	}

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		initTableViews();
		switchToSelectorMode();
	}

	private void initTableViews() {

		tviewColNome.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNome());
		});
		tviewColCPF.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getCPF());
		});
		tviewColDT.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDataNascimento());
		});
		tviewColNumero.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNumeroMatricula());
		});
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	public void loadResultForFilter(String filter) {
		loadTableView(filter);
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

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
	void actSPDelete(ActionEvent event) {
//		try {
//			modelController.setupEditAluno(tviewSearch.getSelectionModel().getSelectedItem());
//			if (delete()) {
//				loadTableView(tfieldSearch.getText());
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Error: couldn't delete Product - " + e.getMessage());
//		}
	}

	@FXML
	void actSPEdit(ActionEvent event) {

	}

	@FXML
	void actSPNew(ActionEvent event) {
		if (sourceController instanceof FXMLProductManagerController) {
			((FXMLProductManagerController) sourceController).addNewProduct();
		}
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		MontarBuscar(tfieldcpf.getText(), tfieldmatricula.getText(), tfieldNome.getText());
		loadTableView(parametro);
	}

	private void MontarBuscar(String cpf, String numero, String Nome) {
		parametro = "";
		String parametro1 = "";
		String parametro2 = "";
		String parametro3 = "";

		if (Nome != null && !Nome.equals("")) {
			parametro1 = "Nome=" + Nome;
		}
		if (numero != null && !numero.equals("")) {
			parametro2 = "NumeroMatricula=" + numero;
		}
		if (cpf != null && !cpf.equals("")) {
			parametro3 = "CPF=" + cpf;
		}
		parametro = parametro.join(";", parametro1, parametro2, parametro3);
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		Aluno result = new Aluno();
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosexistente = new ArrayList<Aluno>();
		List<WsAluno> resultado = tviewSearch.getSelectionModel().getSelectedItems();
		List<WsAluno> Wsalunosexistente = new ArrayList<WsAluno>();
		// receiveData(resultado, this);
		for (WsAluno wsAluno : resultado) {
			try {
				result = modelController.getAlunoId(wsAluno.getAlunoID());

			} catch (NoResultException e) {
				result = null;
			}
			catch (Exception e) {
				//result = null;
			}
			if (result != null) {
				alunosexistente.add(result);
				Wsalunosexistente.add(wsAluno);
			} else {
				modelController.saveinfoAluno(wsAluno.getNome(), wsAluno.getAlunoID(), wsAluno.getCPF(),
						wsAluno.getRG(), wsAluno.getNumeroMatricula(), wsAluno.getDataNascimento(),
						wsAluno.getTurmaAtual());
			}
		}
		if (alunosexistente.size() > 0) {
			Alert alert = new Alert(Alert.AlertType.WARNING, "Ja Existe no sistema o(s) Aluno(s) Escolhido(s), deseja atualizar sua informações?", ButtonType.YES,
					ButtonType.NO);
			alert.showAndWait();
			if (alert.getResult() == ButtonType.YES)
			{
				Aluno[] info = (Aluno[]) alunosexistente.toArray();
				WsAluno[] atualiza = (WsAluno[]) Wsalunosexistente.toArray();
				for (int i = 0; i < info.length; i++) {
					modelController.setupEditAluno(info[i]);
					modelController.saveinfoAluno(atualiza[i].getNome(), atualiza[i].getAlunoID(), atualiza[i].getCPF(),
							atualiza[i].getRG(), atualiza[i].getNumeroMatricula(), atualiza[i].getDataNascimento(),
							atualiza[i].getTurmaAtual());
				}
			}
		}
		FXNotification notification = new FXNotification("Aluno(s) Inserido(s),",
				FXNotification.NotificationType.INFORMATION);
		notification.show();
		FXUISetup.getInstance().clearTextInputs(rootPane);
		FXUISetup.getInstance().clearTableViews(rootPane);
	}

	@FXML
	void actSelectorEdit(ActionEvent event) {

	}

	@FXML
	void actGoBack(ActionEvent event) {
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

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosexistente = new ArrayList<Aluno>();

		if (data instanceof List<?>) {
			List<WsAluno> resultado = (List<WsAluno>) data;
			for (WsAluno wsAluno : resultado) {
				Aluno result = new Aluno();
				try {
					result = modelController.getAlunoId(wsAluno.getAlunoID());
				} catch (NoSuchElementException e) {
					result = null;
				} catch (Exception e) {

				}

				if (result != null) {
					alunosexistente.add(result);
				} else {
					modelController.saveinfoAluno(wsAluno.getNome(), wsAluno.getAlunoID(), wsAluno.getCPF(),
							wsAluno.getRG(), wsAluno.getNumeroMatricula(), wsAluno.getDataNascimento(),
							wsAluno.getTurmaAtual());
				}
			}
		}
	}

	public VBox getRootPane() {
		// TODO Auto-generated method stub
		return rootPane;
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
