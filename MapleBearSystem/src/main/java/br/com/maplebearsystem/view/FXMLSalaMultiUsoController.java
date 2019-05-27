package br.com.maplebearsystem.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.controller.ProductMovementController;
import br.com.maplebearsystem.controller.ReceberController;
import br.com.maplebearsystem.dao.ProductMovementDAO;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLBuscaPedidoController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.effect.DropShadow;
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
	private TableView<?> tviewTurma;

	@FXML
	private TableColumn<?, ?> colAluno;

	@FXML
	private TableColumn<?, ?> colturma;

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
		// TODO Auto-generated method stub
		
	}

}
