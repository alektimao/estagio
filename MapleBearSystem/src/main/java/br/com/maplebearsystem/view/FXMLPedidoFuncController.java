package br.com.maplebearsystem.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;

import br.com.maplebearsystem.ui.notifications.FXNotification;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.controller.PedidoFuncController;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.PedidoFunc;
import br.com.maplebearsystem.model.PedidoFunc_Produto;
import br.com.maplebearsystem.model.constants.PedidoConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLBuscaPedidoController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import br.com.maplebearsystem.view.component.FXMLProdutoSearchController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLPedidoFuncController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox panelMain;

	@FXML
	private StackPane rootPane;

	@FXML
	private JFXTextField tfieldnome;

	@FXML
	private JFXButton btbusca;

	@FXML
	private TableView<PedidoFunc_Produto> tviewProducts;
	@FXML
	private VBox vboxprodutos;
	@FXML
	private TableColumn<PedidoFunc_Produto, String> colproduto;

	@FXML
	private TableColumn<PedidoFunc_Produto, String> colqtd;

	@FXML
	private TableColumn<PedidoFunc_Produto, String> colqtdpedido;

	@FXML
	private JFXButton btadd1;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXDatePicker dtdiapedido;

	@FXML
	private JFXButton btsalvar;

	@FXML
	private JFXButton btautorizar;

	private PedidoFuncController controlerPedido;

	private FXMLDefaultControllerInterface sourceController;
	List<Exception> mainErrorList;

	@FXML
	void addproduto(ActionEvent event) {
		try {
			FXMLProdutoSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLE_PRODUTO_BUSCA, null, 0.0)
					.<FXMLProdutoSearchController>getController();
			controler.switchToSelectorMode();
			controler.setSourceFXMLController(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public StackPane getRootPane() {
		return rootPane;
	}

	@FXML
	void removerproduto(ActionEvent event) {
		try {
			PedidoFunc_Produto product = tviewProducts.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover a seguinte peça / produto adicionado:\n"
					+ product.getProdPedidoFunc().getShortDescription() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				controlerPedido.removeProduct(product);
				loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FXML
	void salvarpedido(ActionEvent event) {
		if (save()) {
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);

			FXNotification notification = new FXNotification("Pedido Salvo,",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
		} else {
			String text = "";

			for (Exception e : mainErrorList) {
				text = text + e.getMessage() + "\n";
			}

			FXNotification notification = new FXNotification(text, FXNotification.NotificationType.WARNING);
			notification.show();
		}
	}

	private boolean save() {
		try {
			mainErrorList = controlerPedido.validateSalvar(tfieldnome.getText(),
					dtdiapedido.getValue(), tviewProducts.getItems());
			if (mainErrorList.isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

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

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSourceFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		this.sourceController = controller;
	}

	@Override
	public void setTargetFXMLController(FXMLDefaultControllerInterface controller) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void receiveData(Object data, FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLProdutoSearchController) {
			if (data instanceof List<?>) {
				List<Product> resultado = (List<Product>) data;
				controlerPedido.validateListaProduto(resultado);
				loadTableView();
			}
		}
		if (sender instanceof FXMLBuscaPedidoController) {
			if (data instanceof PedidoFunc) {
				PedidoFunc resultado = (PedidoFunc) data;
				carregarcampos(resultado);
				loadPedidoFunc(resultado);
				loadTableView();
			}
		}

	}

	private void loadPedidoFunc(PedidoFunc requisicao) {
		controlerPedido.editarPedidoFunc(requisicao);
		controlerPedido.getPedidoFunc().setRequestedParts(controlerPedido.BuscaProdutosPedidos(requisicao.getId()));
		loadTableView();
	}

	private void carregarcampos(PedidoFunc resultado) {
		tfieldnome.setText(resultado.getDescricao());
		dtdiapedido.setValue(resultado.getRequestDate().toLocalDate());
	}

	private void loadTableView() {

		try {
			ObservableList<PedidoFunc_Produto> modelo;
			modelo = FXCollections.observableArrayList(controlerPedido.getPedidoFunc().getRequestedParts());
			if (tviewProducts.getItems() != null)
				tviewProducts.getItems().clear();
			tviewProducts.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();
		}
		if (sender instanceof FXMLProductFornecedorSearchController) {
			FXMLProductFornecedorSearchController obj = (FXMLProductFornecedorSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProdutoSearchController) {
			FXMLProdutoSearchController obj = (FXMLProdutoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLBuscaPedidoController) {
			FXMLBuscaPedidoController obj = (FXMLBuscaPedidoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLRetirarProdutoController) {
			FXMLRetirarProdutoController obj = (FXMLRetirarProdutoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdPedidoFunc().getShortDescription());
		});
		colqtd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdPedidoFunc().getEstoque().getQtd());
		});
		colqtdpedido.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getQuantity());
		});
		colqtdpedido.setCellFactory(TextFieldTableCell.<PedidoFunc_Produto>forTableColumn());

		colqtdpedido.setOnEditCommit((CellEditEvent<PedidoFunc_Produto, String> event) -> {
			TablePosition<PedidoFunc_Produto, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			PedidoFunc_Produto pedido = event.getTableView().getItems().get(row);
			
			Double valor = Double.parseDouble(newFullName);
			if (valor > 0) {
				pedido.setQuantity(valor.intValue());
			}
			if (pedido.getQuantity() <= 0) {
				pedido.setQuantity(0);
			}
			tviewProducts.getItems().set(row, pedido);
		});
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		controlerPedido = new PedidoFuncController();
		controlerPedido.setupNewPedidoFunc();
		initTableViews();
		initMascara();
	}

	private void initMascara() {
		tfieldnome.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(FieldValidators.RegexCharsets.CHARSET_DESCRIPTION.getValue(), PedidoConstants.MAXLEN_DESCRIPTION));
	}

	@FXML
	void autorizarpedido(ActionEvent event) {

	}

	@FXML
	void buscarpedido(ActionEvent event) {
		try {
			FXMLBuscaPedidoController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLEBEARSYSTEM_BUSCAR_PEDIDO, null, 0.0)
					.<FXMLBuscaPedidoController>getController();
			controller.switchToSelectorMode();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}

	}
}
