package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.Restricao;
import br.com.maplebearsystem.model.Restricao_Alimento;
import br.com.maplebearsystem.model.Restricao_Remedio;
import javafx.beans.property.SimpleStringProperty;
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
    private TableView<Restricao_Alimento> tviewAlimento;

    @FXML
    private TableColumn<Restricao_Alimento,String> colAlimento;

    @FXML
    private TableColumn<Restricao_Alimento,String> colGravidadeAlimento;

    @FXML
    private TableColumn<Restricao_Alimento,String> colperiodoalimento;

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
    private TableView<Restricao_Remedio> tviewRemedio;

    @FXML
    private TableColumn<Restricao_Remedio,String> colRemedio;

    @FXML
    private TableColumn<Restricao_Remedio,String> colGravidadeRemedio;

    @FXML
    private TableColumn<Restricao_Remedio,String> colPeriodoRemedio;

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
		initTableViews();
	}
	private void initTableViews() {
		colAlimento.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getAlimento());
		});
		colGravidadeAlimento.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getGravidade());
		});
		colperiodoalimento.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDe() + "até" + data.getValue().getAte());
		});
		colRemedio.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getRemedio());
		});
		colGravidadeRemedio.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getGravidade());
		});
		colPeriodoRemedio.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDe() + "até" + data.getValue().getAte());
		});
	}
}
