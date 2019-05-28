package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.model.TurmaPersonalizada;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
	private TableColumn<TurmaPersonalizada,String> colResponsavel;

	@FXML
	private TableColumn<TurmaPersonalizada,String> colTurma;

	@FXML
	private JFXButton btadd;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXTextField txtdia;

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

	@FXML
	void addTurma(ActionEvent event) {

	}

	@FXML
	void cancelar(ActionEvent event) {

	}

	@FXML
	void removerTurma(ActionEvent event) {

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
		colTurma.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getNometurma());
		});
		colResponsavel.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getResponsavel());
		});
	}
}
