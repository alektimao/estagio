package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.PersistenceException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.TurmaPersonalizadaController;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.WeekDays;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.FXUISetup;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLSalaMultiUsoController;
import br.com.maplebearsystem.view.FXMLTurmaPersonalizadaController;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLBuscaTurmaController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private JFXTextField tfieldSearch;

	@FXML
	private JFXButton btnSearch;
	
	@FXML
    private TableView<TurmaPersonalizada> tviewSearch;

    @FXML
    private TableColumn<TurmaPersonalizada, String> tviewColID;

    @FXML
    private TableColumn<TurmaPersonalizada, String> tviewColDescription;

    @FXML
    private TableColumn<TurmaPersonalizada, String> tviewColdata;

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

	private TurmaPersonalizadaController modelController;

	private FXMLDefaultControllerInterface sourceController;
	WeekDays dia ;

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
	void actGoBack(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void actSPDelete(ActionEvent event) {
		delete();
	}

	@FXML
	void actSPEdit(ActionEvent event) {
		editItem();
	}

	@FXML
	void actSPNew(ActionEvent event) {
		try {
			FXMLTurmaPersonalizadaController controller = FXUISetup.getInstance().loadFXMLIntoStackPane(rootPane,
							FXResourcePath.FXML_MAPLE_TURMA, null, 0.0)
					.<FXMLTurmaPersonalizadaController>getController();
			controller.setSourceFXMLController(this);
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
		}
	}
	private boolean editItem() {
		if (tviewSearch.getSelectionModel().getSelectedItem() != null) {
			try {
				FXMLTurmaPersonalizadaController controller = FXUISetup
						.getInstance().loadFXMLIntoStackPane(rootPane,
								FXResourcePath.FXML_MAPLE_TURMA, null, 0.0)
						.<FXMLTurmaPersonalizadaController>getController();
				controller.setSourceFXMLController(this);
				controller.receiveData(tviewSearch.getSelectionModel().getSelectedItem(), this);

				return true;
			} catch (Exception e) {
				Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to edit contact", e);
			}
		}
		return false;

	}

	@FXML
	void actSPSearch(ActionEvent event) {
		loadTableView(tfieldSearch.getText());
	}

	private void loadTableView(String filter) {
		ObservableList<TurmaPersonalizada> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(modelController.getAllTurmaPersonalizada());
		} else {

			modelo = FXCollections.observableArrayList(modelController.getAllTurmaPersonalizada(filter));
		}

		tviewSearch.setItems(modelo);
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		if(sourceController instanceof FXMLTurmaPersonalizadaController)
		{
			FXMLTurmaPersonalizadaController controller = (FXMLTurmaPersonalizadaController) sourceController;
			try {
				TurmaPersonalizada resultado = tviewSearch.getSelectionModel().getSelectedItem();
//				controller.abrePainelSaidaRegistration(resultado);
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sourceController instanceof FXMLSalaMultiUsoController)
		{
			FXMLSalaMultiUsoController controller = (FXMLSalaMultiUsoController) sourceController;
			try {
				TurmaPersonalizada resultado = tviewSearch.getSelectionModel().getSelectedItem();
//				controller.abrePainelSaidaRegistration(resultado);
				controller.receiveData(resultado, this);
				controller.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FXML
	void actSelectorEdit(ActionEvent event) {

	}
	
	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		try {
			TurmaPersonalizada itemToRemove = tviewSearch.getSelectionModel().getSelectedItem();
			modelController.deleteTurmaPersonalizada(itemToRemove);
			tviewSearch.getItems().remove(itemToRemove);
		}
		catch (PersistenceException ex)
		{
			new FXNotification("Não e possivel Deletar", FXNotification.NotificationType.ERROR).show();
			return false;
		}
		catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.FINE, "Info: failed to save contact", e);
			new FXNotification("Error: " + e.getMessage() + e.getCause(), FXNotification.NotificationType.ERROR).show();
			return false;
		}

		return true;
	}

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {
		tviewColID.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getId());
		});
		tviewColDescription.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getResponsavel());
		});
		tviewColdata.setCellValueFactory((data)->{
			return new SimpleStringProperty("" +data.getValue().getNometurma());
			});
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
		if (sender instanceof FXMLTurmaPersonalizadaController) {
			FXMLTurmaPersonalizadaController obj = (FXMLTurmaPersonalizadaController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new TurmaPersonalizadaController();
		switchToEditorMode();
		initUI();
	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

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
			TableRow<TurmaPersonalizada> row = new TableRow<TurmaPersonalizada>();
			row.setOnMouseClicked(event -> {
				if (event.getClickCount() == 2 && (!row.isEmpty())) {
					editItem();
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

	public StackPane getRootPane() {
		return rootPane;
	}

	public void setDia(WeekDays value) {
		dia = value;
	}

	public WeekDays isDia() {
		return dia;
	}
	
}
