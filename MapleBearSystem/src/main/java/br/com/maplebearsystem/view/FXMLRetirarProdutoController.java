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
import br.com.maplebearsystem.controller.RetirarController;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLProductSearchController;
import br.com.maplebearsystem.view.util.FXMLResourcePathsEnum;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;
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

public class FXMLRetirarProdutoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;
	
	@FXML
	private StackPane rootMenuPane;

	@FXML
	private VBox panelMain;

	@FXML
	private JFXTextField tfieldnome;

	@FXML
	private JFXDatePicker dtdiapedido;

	@FXML
	private JFXButton btbusca;

	@FXML
	private VBox vboxprodutos;

	@FXML
	private TableView<ProdutoAlterado> tviewProducts;

	@FXML
	private TableColumn<ProdutoAlterado, String> colproduto;

	@FXML
	private TableColumn<ProdutoAlterado, String> colfornecedor;

	@FXML
	private TableColumn<ProdutoAlterado, String> colqtd;

	@FXML
	private TableColumn<ProdutoAlterado, String> colqtdpedido;

	@FXML
	private JFXButton btadd1;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXButton btsalvar;
	
	private ProductMovementController controlerMovement;
	private RetirarController controlerRetirar;
	private ProdutoAlterado produto;
	private List<ProdutoAlterado> listproduto;
	private List<Exception> mainErrorList;

	@FXML
	void addproduto(ActionEvent event) {
		try {
			FXMLProductSearchController controler = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLE_PRODUTOFORNECEDOR_BUSCA, null, 0.0)
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
	void buscarpedido(ActionEvent event) {

	}

	@FXML
	void removerproduto(ActionEvent event) {
		ObservableList<ProdutoAlterado> modelo;
		List<ProdutoAlterado> tabela = new ArrayList<ProdutoAlterado>();
		for (ProdutoAlterado t : tviewProducts.getItems()) {
			controlerMovement.setupNewProductMovement();
			if (t.getProduto().getEstoque() != null && t.getRestante() - t.getRetirar() >= 0 && t.getQtd() > 0) {
				t.setRestante(t.getRestante() - t.getRetirar());
				controlerMovement.saveProductMovement("Retirada de Produto", null,
						LocalDate.now(), t.getProduto(), t.getRetirar(), t.getRestante());
			}
			t.setRetirar(0);

			tabela.add(t);
		}

		modelo = FXCollections.observableArrayList(tabela);
		if (tviewProducts.getItems() != null)
			tviewProducts.getItems().clear();
		tviewProducts.setItems(modelo);
	}

	@FXML
	void salvarpedido(ActionEvent event) {
		if (save()) {

			FXNotification notification = new FXNotification("Produto(s) Retirado(s),",
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
			mainErrorList = controlerMovement.SalvarMovimentoaoSalvarRecebimento();
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

	}
	
	public StackPane getRootPane() {
		return rootMenuPane;
	}

	private void loadTableView() {

		try {
			ObservableList<ProdutoAlterado> modelo;
			modelo = FXCollections.observableArrayList(listproduto);
			if (tviewProducts.getItems() != null)
				tviewProducts.getItems().clear();
			tviewProducts.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}
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
				List<FornecedorProduct> resultado = (List<FornecedorProduct>) data;
				controlerRetirar.validateListaProduto(resultado);
				listproduto = controlerRetirar.InserereProdutoAlterado();				
				loadTableView();
			}
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		controlerRetirar = new RetirarController();
		controlerMovement = new ProductMovementController();
		controlerRetirar.setupNewRetirar();
		initTableViews();
	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProduto().getShortDescription());
		});
//		colfornecedor.setCellValueFactory((data) -> {
//			return new SimpleStringProperty("" + data.getValue().getProdFornecedor().getNomefantasia());
//		});
		colqtd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProduto().getEstoque().getQtd());
		});
		colqtdpedido.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getQtd());
		});
		colqtdpedido.setCellFactory(TextFieldTableCell.<ProdutoAlterado>forTableColumn());

		colqtdpedido.setOnEditCommit((CellEditEvent<ProdutoAlterado, String> event) -> {
			TablePosition<ProdutoAlterado, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			ProdutoAlterado pedido = event.getTableView().getItems().get(row);

			if (Integer.parseInt(newFullName) > 0
					&& pedido.getQtd() >= Integer.parseInt(newFullName)) {
				pedido.getProduto().getEstoque().setQtd(Integer.parseInt(newFullName));
			}
			else{
				pedido.getProduto().getEstoque().setQtd(0);
			}
			tviewProducts.getItems().set(row, pedido);
		});
	}
}
