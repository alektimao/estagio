package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.Aluno;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

    @FXML
    void addAluno(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void removeraluno(ActionEvent event) {

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
		// TODO Auto-generated method stub
		
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
