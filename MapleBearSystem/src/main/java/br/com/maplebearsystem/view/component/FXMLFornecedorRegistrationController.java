package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.maplebearsystem.controller.EstoqueController;
import br.com.maplebearsystem.controller.FornecedorController;
import br.com.maplebearsystem.controller.ProductController;
import br.com.maplebearsystem.dao.FornecedorDAO;
import br.com.maplebearsystem.dao.FornecedorProductDAO;
import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.model.Fornecedor;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;
import javafx.fxml.Initializable;

import com.jfoenix.controls.JFXButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLFornecedorRegistrationController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private StackPane rootPane;

	@FXML
	private VBox pnButtons;

	@FXML
	private HBox pnEditorMode;

	@FXML
	private JFXButton btnNew;

	@FXML
	private JFXButton btnGoBack;

	@FXML
	private StackPane pnFornecedorProdutoForm;

	@FXML
	private FXMLProductFornecedorFormController pnFornecedorProdutoFormController;

	private FXMLDefaultControllerInterface sourceController;
	private List<Product> lista;
	FornecedorController modelController;

	private void initUI() {
		modelController = new FornecedorController();
		try {
			modelController.setupNewFornecedor();
			pnFornecedorProdutoFormController.setSourceFXMLController(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Failed to set pnProductFormController controller - " + e.getMessage());
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
	void actSPNew(ActionEvent event) {
		
		modelController.setupNewFornecedor();
		List<Exception> errList = new ArrayList<Exception>();
		errList = modelController.salvar(pnFornecedorProdutoFormController.getFornecedorController().getFornecedor(), pnFornecedorProdutoFormController.getFornecedorController().getProduct());
		if (errList.size() == 0) {
			FXNotification notification = new FXNotification("Fornecedor Salvo",FXNotification.NotificationType.INFORMATION);
			notification.show();
		}
		else
		{
			String text = "";

			for (Exception e : errList) {
				text = text + e.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(text, FXNotification.NotificationType.WARNING);
			notification.show();
		}
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initUI();
	}

	public StackPane getRootPane() {
		// TODO Auto-generated method stub
		return this.rootPane;
	}

}
