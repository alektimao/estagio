package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.RestricaoController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.model.Restricao;
import br.com.maplebearsystem.model.Restricao_Alimento;
import br.com.maplebearsystem.model.Restricao_Remedio;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLAlunoSearchController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
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
    private HBox Hali;
    
    @FXML
    private JFXButton btBuscarAluno;

    @FXML
    private JFXTextField tfieldnome;

    @FXML
    private JFXTextField tfieldMatricula;

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
    
    private FXMLDefaultControllerInterface sourceController;
    
    private RestricaoController modelcontroller;
    
    List<Exception> mainErrorList;
    
    @FXML
    void buscar(ActionEvent event) {
    	try {
			FXMLAlunoSearchController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_ALUNO_BUSCAR, null, 0.0)
					.<FXMLAlunoSearchController>getController();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}
    }

    @FXML
    void addalimento(ActionEvent event) {
    	mainErrorList = modelcontroller.validar(modelcontroller.getaluno(),tfieldGravidade.getText(),tfieldAlimento.getText(),txtinfo.getText(),txtinfo1.getText());
    	if (mainErrorList.size()>0) {
    		//podesalvar = false;
    		String text = "";

			for (Exception e : mainErrorList) {
				text = text + e.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(text, FXNotification.NotificationType.WARNING);
			notification.show();
		}
    	else
    	{
    		//podesalvar = true;
    		FXUISetup.getInstance().clearTextInputs(Hali);
			FXUISetup.getInstance().clearTableViews(Hali);
    		loadTableView();
    		FXNotification notification = new FXNotification("Documento Inserido na Tabela,",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
    	}

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
    	try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	private void carregarcampos(Aluno resultado) {
		modelcontroller.setAluno(resultado);
		modelcontroller.getRestricaos(resultado.getId());
		tfieldnome.setText(resultado.getNome());
		tfieldTurma.setText(resultado.getTurmaAtual());
		tfieldMatricula.setText(resultado.getNumeromatricula());
		//
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
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLAlunoSearchController) {
			if (data instanceof Aluno) {
				Aluno resultado = (Aluno) data;
				carregarcampos(resultado);
				loadTableView();
			}
		}
	}
	private void loadTableView() {
		try {
			ObservableList<Restricao_Alimento> modelo;
			modelo = FXCollections.observableArrayList(modelcontroller.getRestricao().getRequisicao_Alimento());
			if (tviewAlimento.getItems() != null)
				tviewAlimento.getItems().clear();
			tviewAlimento.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
		try {
			ObservableList<Restricao_Remedio> modelo;
			modelo = FXCollections.observableArrayList(modelcontroller.getRestricao().getRequisicao_Remedio());
			if (tviewRemedio.getItems() != null)
				tviewRemedio.getItems().clear();
			tviewRemedio.setItems(modelo);
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
		modelcontroller = new RestricaoController();
		modelcontroller.setupNewRestricao();
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
			return new SimpleStringProperty("" + data.getValue().getDe() + " até " + data.getValue().getAte());
		});
		colRemedio.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getRemedio());
		});
		colGravidadeRemedio.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getGravidade());
		});
		colPeriodoRemedio.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDe() + " até " + data.getValue().getAte());
		});
	}
}
