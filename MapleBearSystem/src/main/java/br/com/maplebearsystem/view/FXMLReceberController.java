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

public class FXMLReceberController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox panelMain;

	@FXML
	private JFXTextField txtdescricao;

	@FXML
	private JFXDatePicker dtdatapedido;

	@FXML
	private JFXTextField txtvalortotal;

	@FXML
	private JFXButton btBuscarPedido;

	@FXML
	private TableView<Requisicao_Produto> tviewprodutos;

	@FXML
	private TableColumn<Requisicao_Produto, String> colproduto;

	@FXML
	private TableColumn<Requisicao_Produto, String> colfornecedor;

	@FXML
	private TableColumn<Requisicao_Produto, String> colqtd;

	@FXML
	private TableColumn<Requisicao_Produto, String> colRecebido;

	@FXML
	private TableColumn<Requisicao_Produto, String> colrestante;

	@FXML
	private JFXButton btReceber;

	@FXML
	private JFXButton btCancelar;

	@FXML
	private JFXButton btSalvar;

	private PedidoController controlerPedido;
	private ProductMovementController controlerMovement;
	private List<ProductMovement> ListMovement;
	private ReceberController controlerReceber;
	private FXMLDefaultControllerInterface sourceController;
	private List<Exception> mainErrorList;

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
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLBuscaPedidoController) {
			if (data instanceof Requisicao) {
				Requisicao resultado = (Requisicao) data;
				loadRequisicao(resultado);
			}
		}
	}

	private void loadRequisicao(Requisicao requisicao) {
		controlerPedido.editarRequisicao(requisicao);
		controlerPedido.getRequisicao().setRequestedParts(controlerPedido.BuscaProdutosPedidos(requisicao.getId()));
		loadTableView();
	}

	private void loadTableView() {
		try {
			ObservableList<Requisicao_Produto> modelo;
			modelo = FXCollections.observableArrayList(controlerPedido.getRequisicao().getRequestedParts());
			if (tviewprodutos.getItems() != null)
				tviewprodutos.getItems().clear();
			tviewprodutos.setItems(modelo);
			txtdescricao.setText(controlerPedido.getRequisicao().getDescricao());
			BigDecimal valor = controlerPedido.getRequisicao().getPriceTotal();
			txtvalortotal.setText(valor.setScale(2, RoundingMode.HALF_UP).toString());
			dtdatapedido.setValue(controlerPedido.getRequisicao().getRequestDate().toLocalDate());
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();

		}

		if (sender instanceof FXMLBuscaPedidoController) {
			FXMLBuscaPedidoController obj = (FXMLBuscaPedidoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		controlerPedido = new PedidoController();
		controlerReceber = new ReceberController();
		controlerMovement = new ProductMovementController();
		ListMovement = new ArrayList<ProductMovement>();
		initTables();

	}

	private void initTables() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdRequisicao().getShortDescription());
		});
		colqtd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getQuantity());
		});
		colfornecedor.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdFornecedor().getNomefantasia());
		});
		colrestante.setCellValueFactory((data) -> {
			if (data.getValue().getRestante() == null) {
				data.getValue().setRestante(data.getValue().getQuantity());
				return new SimpleStringProperty("" + data.getValue().getQuantity());
			} else {
				return new SimpleStringProperty("" + data.getValue().getRestante());
			}
		});
		colRecebido.setCellValueFactory((data) -> {
			if (data.getValue().getRecebido() == null) {
				return new SimpleStringProperty("" + 0);
			} else {
				return new SimpleStringProperty("" + data.getValue().getRecebido());
			}
		});
		colRecebido.setCellFactory(TextFieldTableCell.<Requisicao_Produto>forTableColumn());

		colRecebido.setOnEditCommit((CellEditEvent<Requisicao_Produto, String> event) -> {
			TablePosition<Requisicao_Produto, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			Requisicao_Produto receber = event.getTableView().getItems().get(row);
			Requisicao_Produto item = tviewprodutos.getItems().get(row);

			BigDecimal valor = new BigDecimal(newFullName);
			valor = valor.setScale(2, RoundingMode.HALF_UP);
			// pra garantir arredondamento em escala de 2 algarismos

			if (valor.toBigInteger().intValue() > 0) {
				receber.setRecebido(valor.toBigInteger().intValue());
			}
			if (valor.toBigInteger().intValue() <= 0 || valor.toBigInteger().intValue() > item.getQuantity()
					|| valor.toBigInteger().intValue() > receber.getRestante()) {
				receber.setRecebido(0);
			}

			tviewprodutos.getItems().set(row, receber);
		});
	}

	@FXML
	void receberpedido(ActionEvent event) {
		ObservableList<Requisicao_Produto> modelo;
		List<Requisicao_Produto> tabela = new ArrayList<Requisicao_Produto>();
		for (Requisicao_Produto t : tviewprodutos.getItems()) {
			controlerMovement.setupNewProductMovement();
			if (t.getRecebido() != null && t.getRestante() - t.getRecebido() >= 0 && t.getRecebido() > 0) {
				t.setRestante(t.getRestante() - t.getRecebido());
				Requisicao requisicao = controlerPedido.getRequisicao();
				controlerMovement.saveProductMovement("Entrada de Produto",requisicao,LocalDate.now(), t.getProdRequisicao(), t.getRecebido(), t.getRestante());
				ListMovement.add(controlerMovement.getProductMovement());
			}
			t.setRecebido(0);

			tabela.add(t);
		}

		modelo = FXCollections.observableArrayList(tabela);
		if (tviewprodutos.getItems() != null)
			tviewprodutos.getItems().clear();
		tviewprodutos.setItems(modelo);

	}

	@FXML
	void salvarrecebimento(ActionEvent event) {
		if (save()) {
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);
			FXNotification notification = new FXNotification("Pedido Recebido,",
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
			for (ProductMovement productMovement : ListMovement) {
				mainErrorList = controlerMovement.SalvarMovimentoaoSalvarRecebimento(productMovement);				
			}
			if (mainErrorList.isEmpty() && ListMovement.size() > 0) {
				RequisicaoDAO pedido = new RequisicaoDAO();
				pedido.save(controlerPedido.getRequisicao());
				return true;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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

	public StackPane getRootPane() {
		return rootPane;
	}

	@FXML
	void buscarpedido(ActionEvent event) {
		try {
			FXMLBuscaPedidoController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLEBEARSYSTEM_BUSCAR_PEDIDO, null, 0.0)
					.<FXMLBuscaPedidoController>getController();
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
}
