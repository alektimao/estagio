package br.com.maplebearsystem.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.ArrayList;
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
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.PedidoFunc;
import br.com.maplebearsystem.model.PedidoFunc_Produto;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.model.constants.PedidoConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLBuscaPedidoController;
import br.com.maplebearsystem.view.component.FXMLBuscaPedidoFuncController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
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

public class FXMLPedidoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private VBox panelMain;

	@FXML
	private StackPane rootPane;

	@FXML
	private JFXTextField tfieldnome;

	@FXML
	private JFXButton btbusca;

	@FXML
	private TableView<Requisicao_Produto> tviewProducts;
	@FXML
	private VBox vboxprodutos;
	@FXML
	private TableColumn<Requisicao_Produto, String> colproduto;
	@FXML
	private TableColumn<Requisicao_Produto, String> colfornecedor;

	@FXML
	private TableColumn<Requisicao_Produto, String> colqtd;

	@FXML
	private TableColumn<Requisicao_Produto, String> colqtdpedido;

	@FXML
	private TableColumn<Requisicao_Produto, String> colvalor;

	@FXML
	private TableColumn<Requisicao_Produto, String> coltotal;

	@FXML
	private JFXButton btadd1;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXDatePicker dtdiapedido;

	@FXML
	private JFXDatePicker dtdiaentrega;

	@FXML
	private JFXTextField txtfrete;

	@FXML
	private JFXTextField txtvalor;

	@FXML
	private JFXButton btsalvar;

	@FXML
	private JFXButton btautorizar;

	@FXML
	private JFXButton btpedfunc;

	private PedidoController controlerPedido;

	private FXMLDefaultControllerInterface sourceController;
	List<Exception> mainErrorList;
	public static List<PedidoFunc_Produto> produtos = new ArrayList<PedidoFunc_Produto>();

	@FXML
	void buscarpedidofunc(ActionEvent event) {
		try {
			FXMLBuscaPedidoFuncController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLEBEARSYSTEM_BUSCAR_PEDIDOFUNC, null, 0.0)
					.<FXMLBuscaPedidoFuncController>getController();
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

	
	@FXML
	void addproduto(ActionEvent event) {
		try {
			FXMLProductFornecedorSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLE_PRODUTOFORNECEDOR_BUSCA, null, 0.0)
					.<FXMLProductFornecedorSearchController>getController();
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
			Requisicao_Produto product = tviewProducts.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover a seguinte peça / produto adicionado:\n"
					+ product.getProdRequisicao().getShortDescription() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				controlerPedido.removeProduct(product);
				loadTableView();
				if (controlerPedido.getRequisicao().getRequestedParts().size() == 0) {
					FXUISetup.getInstance().clearTextInputs(rootPane);
					FXUISetup.getInstance().clearTableViews(rootPane);
				}
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
//			tviewProducts.setDisable(true);
//			btsalvar.setDisable(true);
//			vboxprodutos.setDisable(true);
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);

			FXNotification notification = new FXNotification("Pedido Salvo,",
					FXNotification.NotificationType.INFORMATION);
			notification.show();
			try {
				sourceController.closeSenderNode(this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
			mainErrorList = controlerPedido.validateSalvar(txtvalor.getText(), txtfrete.getText(), tfieldnome.getText(),
					dtdiapedido.getValue(), dtdiaentrega.getValue(), tviewProducts.getItems());
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
		if (sender instanceof FXMLProductFornecedorSearchController) {
			if (data instanceof List<?>) {
				List<FornecedorProduct> resultado = (List<FornecedorProduct>) data;
				controlerPedido.validateListaProduto(resultado);
				loadTableView();
			}
		}
		if (sender instanceof FXMLBuscaPedidoController) {
			if (data instanceof Requisicao) {
				Requisicao resultado = (Requisicao) data;
				carregarcampos(resultado);
				loadRequisicao(resultado);
				loadTableView();
			}
		}
		if (sender instanceof FXMLBuscaPedidoFuncController) {
			if (data instanceof PedidoFunc) {
				PedidoFunc resultado = (PedidoFunc) data;
				produtos = controlerPedido.BuscaProdutosPedidosFunc(resultado.getId());
				// controlerPedido.validateListaProduto(resultado.getRequestedParts());
				// loadTableView();
			}
		}

	}

	private void loadRequisicao(Requisicao requisicao) {
		controlerPedido.editarRequisicao(requisicao);
		controlerPedido.getRequisicao().setRequestedParts(controlerPedido.BuscaProdutosPedidos(requisicao.getId()));
		loadTableView();
	}

	private void carregarcampos(Requisicao resultado) {
		tfieldnome.setText(resultado.getDescricao());
		dtdiapedido.setValue(resultado.getRequestDate().toLocalDate());
		dtdiaentrega.setValue(resultado.getExpectedDeliveryDate().toLocalDate());
		txtfrete.setText(resultado.getFrete().toString());
		txtvalor.setText(resultado.getPriceTotal().toString());
	}

	private void loadTableView() {

		try {
			ObservableList<Requisicao_Produto> modelo;
			modelo = FXCollections.observableArrayList(controlerPedido.getRequisicao().getRequestedParts());
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
		if (sender instanceof FXMLBuscaPedidoController) {
			FXMLBuscaPedidoController obj = (FXMLBuscaPedidoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLRetirarProdutoController) {
			FXMLRetirarProdutoController obj = (FXMLRetirarProdutoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLBuscaPedidoFuncController) {
			FXMLBuscaPedidoFuncController obj = (FXMLBuscaPedidoFuncController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdRequisicao().getShortDescription());
		});
		colfornecedor.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdFornecedor().getNomefantasia());
		});
		colqtd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdRequisicao().getEstoque().getQtd());
		});
		colqtdpedido.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getQuantity());
		});
		colqtdpedido.setCellFactory(TextFieldTableCell.<Requisicao_Produto>forTableColumn());

		colqtdpedido.setOnEditCommit((CellEditEvent<Requisicao_Produto, String> event) -> {
			TablePosition<Requisicao_Produto, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			Requisicao_Produto pedido = event.getTableView().getItems().get(row);

			Double valor = Double.parseDouble(newFullName);
			if (valor > 0) {
				pedido.setQuantity(valor.intValue());
			}
			if (valor > 0 && pedido.getUnitPrice().intValue() > 0) {
				pedido.setQuantity(valor.intValue());
				BigDecimal multiplicar = new BigDecimal(pedido.getQuantity());
				pedido.setPriceTotal(pedido.getUnitPrice().multiply(multiplicar));
			}
			if (pedido.getQuantity() <= 0) {
				pedido.setUnitPrice(BigDecimal.ZERO);
				pedido.setQuantity(0);
				pedido.setPriceTotal(BigDecimal.ZERO);
			}
			tviewProducts.getItems().set(row, pedido);
			calculartotal();
		});
		colvalor.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getUnitPrice());
		});
		colvalor.setCellFactory(TextFieldTableCell.<Requisicao_Produto>forTableColumn());

		colvalor.setOnEditCommit((CellEditEvent<Requisicao_Produto, String> event) -> {
			TablePosition<Requisicao_Produto, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			Requisicao_Produto pedido = event.getTableView().getItems().get(row);
			Requisicao_Produto item = tviewProducts.getItems().get(row);

			BigDecimal valor = new BigDecimal(newFullName.replace(',', '.'));
			valor = valor.setScale(2, RoundingMode.HALF_UP);
			// pra garantir arredondamento em escala de 2 algarismos
			Double valor2 = valor.doubleValue();
			if (valor2 > 0) {
				pedido.setUnitPrice(valor);
			}
			if (item.getQuantity() <= 0) {
				pedido.setUnitPrice(BigDecimal.ZERO);
			}
			if (item.getQuantity() > 0 && valor2 > 0) {
				BigDecimal multiplicar = new BigDecimal(item.getQuantity());
				pedido.setPriceTotal(valor.multiply(multiplicar));
			}

			tviewProducts.getItems().set(row, pedido);
			calculartotal();
		});
		coltotal.setCellValueFactory((data) -> {
			if (data.getValue().getPriceTotal() == null) {
				return new SimpleStringProperty("" + 0);
			} else {
				return new SimpleStringProperty("" + data.getValue().getPriceTotal());
			}
		});
	}

	private void calculartotal() {
		BigDecimal valor = BigDecimal.ZERO;
		List<Requisicao_Produto> produtos = tviewProducts.getItems();
		for (Requisicao_Produto rp : produtos) {
			if (rp.getPriceTotal() != null) {
				// int test = rp.getPriceTotal().toBigInteger().intValue();
				valor = valor.add(rp.getPriceTotal());
			}
		}
		txtvalor.setText(valor.setScale(2, RoundingMode.HALF_UP).toString());
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		controlerPedido = new PedidoController();
		controlerPedido.setupNewRequisicao();
		initTableViews();
		initMascara();
	}

	private void initMascara() {
		txtfrete.setTextFormatter(TextFieldFormatterHelper.getTextFieldDoubleFormatter(9, 2));
		txtvalor.setTextFormatter(TextFieldFormatterHelper.getTextFieldDoubleFormatter(9, 2));
		tfieldnome.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_DESCRIPTION.getValue(), PedidoConstants.MAXLEN_DESCRIPTION));
	}

	@FXML
	void autorizarpedido(ActionEvent event) {
		if (controlerPedido.getRequisicao().isAturorizar() == true) {
			controlerPedido.getRequisicao().setAturorizar(false);
		}
		if (controlerPedido.getRequisicao().isAturorizar() == false) {
			controlerPedido.getRequisicao().setAturorizar(true);
		}
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
