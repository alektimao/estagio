package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLDocumentoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
    private StackPane rootPane;

    @FXML
    private VBox panelMain;

    @FXML
    private JFXTextField txtaluno;

    @FXML
    private JFXTextField txtsala;

    @FXML
    private JFXTextField txtturma;

    @FXML
    private JFXButton btBuscarAluno;

    @FXML
    private TableView<?> tviewdoc;

    @FXML
    private TableColumn<?, ?> coldocumento;

    @FXML
    private TableColumn<?, ?> colsala;

    @FXML
    private TableColumn<?, ?> colturma;

    @FXML
    private TableColumn<?, ?> colpasta;

    @FXML
    private JFXTextField txtdocumento;

    @FXML
    private JFXTextField txtpasta;

    @FXML
    private JFXButton btguardar;

    @FXML
    private JFXButton btremover1;

    @FXML
    private JFXButton btSalvar;

    @FXML
    private JFXButton btCancelar;

    @FXML
    void buscar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void guardar(ActionEvent event) {

    }

    @FXML
    void remover(ActionEvent event) {

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
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
