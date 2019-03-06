package br.com.maplebearsystem.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.model.constants.PedidoConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
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
	private TableColumn<Requisicao_Produto, String> colproduto;

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

	private PedidoController controlerPedido;

	@FXML
	void addproduto(ActionEvent event) {
		try {
			FXMLProductSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, MapleBearSystemDesktopClient.class,
							FXMLResourcePathsEnum.FXML_MAPLE_PRODUTO_BUSCA.getPath(), new DropShadow(), 100.0)
					.<FXMLProductSearchController>getController();
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
	void removerproduto(ActionEvent event) {
		try {
			Requisicao_Produto product = tviewProducts.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover a seguinte peça / produto adicionado:\n"
					+ product.getProdRequisicao().getShortDescription() + "?", ButtonType.YES, ButtonType.NO);

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

		}
	}

	private boolean save() {
		try {
			controlerPedido.validateSalvar(txtvalor.getText(), txtfrete.getText(), tfieldnome.getText(),
					dtdiapedido.getValue(), dtdiaentrega.getValue(), tviewProducts.getItems());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

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
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLProductSearchController) {
			if (data instanceof List<?>) {
				List<Product> resultado = (List<Product>) data;
				controlerPedido.validateListaProduto(resultado);
				loadTableView();
			}
		}

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

		if (sender instanceof FXMLProductSearchController) {
			FXMLProductSearchController obj = (FXMLProductSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());

		}

	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdRequisicao().getShortDescription());
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

			if (Integer.parseInt(newFullName) > 0) {
				pedido.setQuantity(Integer.parseInt(newFullName));
			}
			if (Integer.parseInt(newFullName) > 0 && pedido.getUnitPrice().intValue() > 0) {
				pedido.setQuantity(Integer.parseInt(newFullName));
				BigDecimal multiplicar = new BigDecimal(pedido.getQuantity());
				pedido.setPriceTotal(pedido.getUnitPrice().multiply(multiplicar));
			}
			if (pedido.getQuantity() <= 0) {
				pedido.setUnitPrice(BigDecimal.ZERO);
				pedido.setQuantity(0);
				pedido.setPriceTotal(BigDecimal.ZERO);
			}
			tviewProducts.getItems().set(row, pedido);
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

			BigDecimal valor = new BigDecimal(newFullName);
			valor = valor.setScale(2, RoundingMode.HALF_UP);
			// pra garantir arredondamento em escala de 2 algarismos

			if (valor.toBigInteger().intValue() > 0) {
				pedido.setUnitPrice(valor);
			}
			if (item.getQuantity() <= 0) {
				pedido.setUnitPrice(BigDecimal.ZERO);
			}
			if (item.getQuantity() > 0 && valor.toBigInteger().intValue() > 0) {
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
				int test = rp.getPriceTotal().toBigInteger().intValue();
				valor.add(rp.getPriceTotal());
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

}
