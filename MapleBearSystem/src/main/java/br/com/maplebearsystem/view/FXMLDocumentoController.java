package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.DocumentoController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLDocumentoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
    private StackPane rootPane;

    @FXML
    private VBox panelMain;
    
    @FXML
    private HBox Hdoc;

    @FXML
    private JFXTextField txtaluno;

    @FXML
    private JFXTextField txtsala;

    @FXML
    private JFXTextField txtturma;

    @FXML
    private JFXButton btBuscarAluno;

    @FXML
    private TableView<Documento> tviewdoc;

    @FXML
    private TableColumn<Documento,String> coldocumento;

    @FXML
    private TableColumn<Documento,String> colsala;

    @FXML
    private TableColumn<Documento,String> colturma;

    @FXML
    private TableColumn<Documento,String> colpasta;

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
    private FXMLDefaultControllerInterface sourceController;
    
    private DocumentoController docController;
    List<Exception> mainErrorList;
    private boolean podesalvar = false;
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
    void cancelar(ActionEvent event) {
    	try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void guardar(ActionEvent event) {
    	mainErrorList = docController.validar(docController.getaluno(),txtdocumento.getText(),txtpasta.getText(),txtsala.getText());
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
    		FXUISetup.getInstance().clearTextInputs(Hdoc);
			FXUISetup.getInstance().clearTableViews(Hdoc);
    		loadTableView();
    		FXNotification notification = new FXNotification("Documento Inserido na Tabela,",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
    	}
    }

    @FXML
    void remover(ActionEvent event) {
    	try {
			Documento doc = tviewdoc.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover o seguinte documento:\n"
					+ doc.getDocumento() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				docController.removeDocumento(doc);
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
    	for (Documento doc : tviewdoc.getItems()) {
			docController.saveDocumento(doc);
		}
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
		//controler de busca de documento
	}
	private void loadTableView() {
		try {
			ObservableList<Documento> modelo;
			modelo = FXCollections.observableArrayList(docController.getListadocumentos());
			if (tviewdoc.getItems() != null)
				tviewdoc.getItems().clear();
			tviewdoc.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
	}


	private void carregarcampos(Aluno resultado) {
		docController.setAluno(resultado);
		docController.getDocAluno(resultado.getId());
		txtaluno.setText(resultado.getNome());
		txtturma.setText(resultado.getTurmaAtual());
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();
		}
		if (sender instanceof FXMLAlunoSearchController) {
			FXMLAlunoSearchController obj = (FXMLAlunoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		docController = new DocumentoController();
		docController.setupNewDocumento();
		initTableViews();
	}
	private void initTableViews() {
		coldocumento.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getDocumento());
		});
		colpasta.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getPasta());
		});
		colturma.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getAluno().getTurmaAtual());
		});
		colsala.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getSala());
		});
	}
}
