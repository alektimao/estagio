package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.InteressadoController;
import br.com.maplebearsystem.model.Interessados;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.FXMLPedidoController;
import br.com.maplebearsystem.view.FXMLInteressadosManagerController;
import br.com.maplebearsystem.view.FXMLRetirarProdutoController;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class FXMLInteressadosSearchController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private VBox rootPane;
	@FXML
	private JFXTextField tfieldSearch;
	@FXML
	private JFXButton btnSearch;
	@FXML
	private TableView<Interessados> tviewSearch;
	@FXML
	private TableColumn<Interessados, String> tviewColNome;
	@FXML
	private TableColumn<Interessados, String> tviewColTelefone;
	@FXML
	private TableColumn<Interessados, String> tviewColMotivo;
	@FXML
	private TableColumn<Interessados, String> tviewColData;
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

	private FXMLDefaultControllerInterface sourceController;
	
	private InteressadoController modelController;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		modelController = new InteressadoController();
		btnEdit.setDisable(true);
		btnDelete.setDisable(true);
		initUI();
	}

// SECTION Main FXMLController Methods

	private boolean selectItem() {

		try {
			sourceController.receiveData(tviewSearch.getSelectionModel().getSelectedItem(), this);
			sourceController.closeSenderNode(this);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}
	
	@FXML
	void actOnTableMouseClicked() {
		if (tviewSearch.getSelectionModel() != null && tviewSearch.getSelectionModel().getSelectedItem() != null) {
			btnDelete.setDisable(false);
			btnEdit.setDisable(false);
		} else {
			btnDelete.setDisable(true);
			btnEdit.setDisable(true);
		}
	}

	private boolean editItem() {

		if (sourceController instanceof FXMLInteressadosManagerController) {
			try {
				if (tviewSearch.getSelectionModel().getSelectedItem() != null) {
					((FXMLInteressadosManagerController) sourceController)
					.editInteressados(tviewSearch.getSelectionModel().getSelectedItem());					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return true;
		}
		return false;
	}

	public void switchToSelectorMode() {

		try {

			tviewSearch.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE );

			if (pnButtons.getChildren().contains(pnEditorMode))
				pnButtons.getChildren().remove(pnEditorMode);
			if (!pnButtons.getChildren().contains(pnSelectorMode))
				pnButtons.getChildren().add(pnSelectorMode);
			btnEdit.setDisable(true);
			btnDelete.setDisable(true);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}
	
	public void switchToEditorMode() {
		try {
			tviewSearch.setRowFactory(tv -> {
				TableRow<Interessados> row = new TableRow<Interessados>();
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
			btnEdit.setDisable(true);
			btnDelete.setDisable(true);

		} catch (Exception e) {
			// TODO log exception e

			System.out.println(e.getMessage());
		}

	}

	public void reloadTableView() {
		loadTableView(tfieldSearch.getText());
	}

	private void loadTableView(String filter) {

//		ObservableList<Interessados> modelo;
//
//		if (filter.equals("")) {
//			modelo = FXCollections.observableArrayList(modelController.getInteressadoss());
//		} else {
//
//			modelo = FXCollections.observableArrayList(modelController.getInteressadoss(filter));
//		}
		ObservableList<Interessados> modelo;

		if (filter.equals("")) {
			modelo = FXCollections.observableArrayList(modelController.getInteressadoss());
		} else {

			modelo = FXCollections.observableArrayList(modelController.getInteressadoss(filter));
		}

		tviewSearch.setItems(modelo);
	}

	private boolean delete() {

		Alert alert = new Alert(Alert.AlertType.WARNING, "Deseja realmente deletar Este Item?", ButtonType.YES,
				ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.NO)
			return false;

		modelController.deleteInteressados();

		return true;
	}

// ENDSECTION Main FXMLController Methods

// SECTION Data Access FXMLController Methods

// ENDSECTION Data Access FXMLController Methods

// SECTION UISetup FXMLController Methods

	private void initUI() {
		initTableViews();
	}

	private void initTableViews() {
		
		tviewColNome.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getNome());
			});
		tviewColTelefone.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getTelefone1());
			});
		tviewColMotivo.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getMotivo());
			});
		tviewColData.setCellValueFactory((data)->{
			return new SimpleStringProperty(""+data.getValue().getData());
			});
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	public void loadResultList(List<Interessados> list) {
		ObservableList<Interessados> modelo;

		modelo = FXCollections.observableArrayList(list);

		tviewSearch.setItems(modelo);

	}

	public void loadResultForFilter(String filter) {
		loadTableView(filter);
	}

// ENDSECTION UISetup FXMLController Methods

// SECTION FXML Event Methods

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
	void actSPDelete(ActionEvent event) {
		try {
			modelController.setupEditInteressados(tviewSearch.getSelectionModel().getSelectedItem());
			if (delete()) {
				loadTableView(tfieldSearch.getText());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: couldn't delete Interessados - " + e.getMessage());
		}
	}

	@FXML
	void actSPEdit(ActionEvent event) {
		editItem();
	}

	@FXML
	void actSPNew(ActionEvent event) {
		if (sourceController instanceof FXMLInteressadosManagerController) {
			((FXMLInteressadosManagerController) sourceController).addNewInteressados();
		}
	}

	@FXML
	void actSPSearch(ActionEvent event) {
		loadTableView(tfieldSearch.getText());
	}

	@FXML
	void actSelectItem(ActionEvent event) {
		if(sourceController instanceof FXMLInteressadosManagerController)
		{
			FXMLInteressadosManagerController controller = (FXMLInteressadosManagerController) sourceController;
			try {
				List<Interessados> resultado = tviewSearch.getSelectionModel().getSelectedItems();
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

	@FXML
	void actGoBack(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

// ENDSECTION FXML Event Methods

// SECTION FXMLDefaultControllerInterface Implementation

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public  VBox getRootPane() {
		// TODO Auto-generated method stub
		return rootPane;
	}

// ENDSECTION FXMLDefaultControllerInterface Implementation

}
