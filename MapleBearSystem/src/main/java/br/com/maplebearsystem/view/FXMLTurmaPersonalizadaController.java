package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.DocumentoController;
import br.com.maplebearsystem.controller.TurmaPersonalizadaController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLAlunoSearchController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.beans.property.SimpleStringProperty;
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
    private JFXTextArea txtinfo;

    @FXML
    private JFXButton btSalvar;

    @FXML
    private JFXButton btCancelar;
    
    private TurmaPersonalizadaController modelController;
    private FXMLDefaultControllerInterface sourceController;
    List<Exception> mainErrorList;
    
    @FXML
    void addAluno(ActionEvent event) {
    	try {
			FXMLAlunoSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_ALUNO_BUSCAR, null, 0.0)
					.<FXMLAlunoSearchController>getController();
			//controler.switchToSelectorMode();
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

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover a seguinte peça / produto adicionado:\n"
					+ turma.getNome() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				modelController.removeAluno(turma);
				//loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void salvar(ActionEvent event) {

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new TurmaPersonalizadaController();
		modelController.setupNewTurmaPersonalizada();
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
