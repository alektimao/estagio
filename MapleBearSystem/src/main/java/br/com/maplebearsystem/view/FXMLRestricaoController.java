package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLRestricaoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
    private StackPane rootMenuPane;

    @FXML
    private StackPane rootPane;

    @FXML
    private VBox panelMain;

    @FXML
    private JFXTextField tfieldnome;

    @FXML
    private JFXTextField tfieldSala;

    @FXML
    private JFXTextField tfieldTurma;

    @FXML
    private VBox vboxprodutos;

    @FXML
    private JFXTextField tfieldGravidade;

    @FXML
    private JFXTextField tfieldAlimento;

    @FXML
    private JFXDatePicker dtperiodode;

    @FXML
    private JFXDatePicker dtperiodoate;

    @FXML
    private JFXTextArea txtinfo;

    @FXML
    private JFXTextArea txtinfo1;

    @FXML
    private TableView<?> tviewAlimento;

    @FXML
    private TableColumn<?, ?> colproduto;

    @FXML
    private TableColumn<?, ?> colqtd;

    @FXML
    private TableColumn<?, ?> colqtdpedido;

    @FXML
    private JFXButton btadd1;

    @FXML
    private JFXButton btremover1;

    @FXML
    private VBox vboxprodutos2;

    @FXML
    private JFXTextField tfieldGravidade2;

    @FXML
    private JFXTextField tfieldRemedio;

    @FXML
    private JFXTextField tfieldPosologia;

    @FXML
    private JFXTextField tfieldDosagem;

    @FXML
    private JFXTextField tfieldPlano;

    @FXML
    private JFXDatePicker dtperiodode2;

    @FXML
    private JFXDatePicker dtperiodoate2;

    @FXML
    private JFXTextArea txtSintomasRemedio;

    @FXML
    private JFXTextArea txtCondutaRemedio;

    @FXML
    private TableView<?> tviewRemedio;

    @FXML
    private TableColumn<?, ?> colRemedio;

    @FXML
    private TableColumn<?, ?> colGravidadeRemedio;

    @FXML
    private TableColumn<?, ?> colPeriodoRemedio;

    @FXML
    private JFXButton btaddRemedio;

    @FXML
    private JFXButton btremoverRemedio;

    @FXML
    private JFXButton btsalvar;

    @FXML
    private JFXButton btcancelar;

    @FXML
    void addalimento(ActionEvent event) {

    }

    @FXML
    void addremedio(ActionEvent event) {

    }

    @FXML
    void removeralimento(ActionEvent event) {

    }

    @FXML
    void removerremedio(ActionEvent event) {

    }

    @FXML
    void salvar(ActionEvent event) {

    }

    @FXML
    void voltar(ActionEvent event) {

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
		// TODO Auto-generated method stub
		
	}
}
