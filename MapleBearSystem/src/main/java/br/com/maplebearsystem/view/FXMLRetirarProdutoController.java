package br.com.maplebearsystem.view;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.controller.ProductMovementController;
import br.com.maplebearsystem.controller.RetirarController;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLContactSearchController;
import br.com.maplebearsystem.view.component.FXMLFuncionarioSearchController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import br.com.maplebearsystem.view.component.FXMLProdutoSearchController;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

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
	private JFXTextField tfieldFunc;

	@FXML
	private JFXDatePicker dtdiapedido;

	@FXML
	private VBox vboxprodutos;

	@FXML
	private TableView<ProdutoAlterado> tviewProducts;

	@FXML
	private TableColumn<ProdutoAlterado, String> colproduto;

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

	private FXMLDefaultControllerInterface sourceController;
	private ProductMovementController controlerMovement;
	private RetirarController controlerRetirar;
	private ProdutoAlterado produto;
	private List<ProdutoAlterado> listproduto;
	private List<Exception> mainErrorList;
	private List<ProductMovement> listMovement;

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

	@FXML
	void buscarpedido(ActionEvent event) {

	}

	@FXML
	void buscarFunc(MouseEvent event) {
		loadtela(FXResourcePath.FXML_MAPLE_FUNCIONARIO_BUSCA);
	}

	public void loadtela(URL url) {
		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, url, new DropShadow(20.0, Color.BLACK), 10.0)
					.<FXMLDefaultControllerInterface>getController();

			controller.setSourceFXMLController(this);
			if (controller instanceof FXMLFuncionarioSearchController) {
				((FXMLFuncionarioSearchController) controller).switchToSelectorMode();
			}
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to load menu: " + url.getPath(), e);
		}
	}

	@FXML
	void removerproduto(ActionEvent event) {
		ObservableList<ProdutoAlterado> modelo;
		List<ProdutoAlterado> tabela = new ArrayList<ProdutoAlterado>();
		controlerMovement.setupNewProductMovement();
		for (ProdutoAlterado t : tviewProducts.getItems()) {
			if (t.getProduto().getEstoque() != null && t.getRestante() - t.getRetirar() >= 0 && t.getQtd() > 0) {
				t.setRestante(t.getRestante() - t.getRetirar());
				controlerMovement.saveProductMovement("Retirada de Produto", null, LocalDate.now(), t.getProduto(),
						(-t.getRetirar()), t.getRestante(),controlerRetirar.getRetiramovimento().getFuncionario());
				listMovement.add(controlerMovement.getProductMovement());
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
			controlerMovement.setupNewProductMovement();
			listMovement = new ArrayList<ProductMovement>();
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);
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
			if (listMovement.isEmpty() || listMovement.size() == 0) {
				mainErrorList.add(new Exception("Confirme pelo menos uma retirada antes de salvar"));
				return false;
			}
			for (ProductMovement productMovement : listMovement) {
				mainErrorList = controlerMovement.SalvarMovimentoaoSalvarRecebimento(productMovement);
			}
			if (mainErrorList.isEmpty() && listMovement.size() > 0) {
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
				controlerRetirar.validateListaProduto(resultado);
				listproduto = controlerRetirar.InserereProdutoAlterado();
				loadTableView();
			}
		}
		if (sender instanceof FXMLFuncionarioSearchController) {
			if (data instanceof Funcionario) {
				Funcionario resultado = (Funcionario) data;
				controlerRetirar.setupNewRetirar();
				controlerRetirar.getRetiramovimento().setFuncionario(resultado.getId());
				FXUISetup.getInstance().clearTextInputs(rootPane);
				FXUISetup.getInstance().clearTableViews(rootPane);
				tfieldFunc.setText(resultado.getPessoa().getName());
			}
		}

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLFuncionarioSearchController) {
			FXMLFuncionarioSearchController obj = (FXMLFuncionarioSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProdutoSearchController) {
			FXMLProdutoSearchController obj = (FXMLProdutoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		controlerRetirar = new RetirarController();
		controlerMovement = new ProductMovementController();
		controlerRetirar.setupNewRetirar();
		listMovement = new ArrayList<ProductMovement>();
		mainErrorList = new ArrayList<Exception>(); 
		initTableViews();
	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProduto().getShortDescription());
		});
		colqtd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProduto().getEstoque().getQtd());
		});
		colqtdpedido.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getRetirar());
		});
		colqtdpedido.setCellFactory(TextFieldTableCell.<ProdutoAlterado>forTableColumn());

		colqtdpedido.setOnEditCommit((CellEditEvent<ProdutoAlterado, String> event) -> {
			TablePosition<ProdutoAlterado, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			ProdutoAlterado pedido = event.getTableView().getItems().get(row);

			if (Integer.parseInt(newFullName) > 0 && pedido.getQtd() >= Integer.parseInt(newFullName)) {

				pedido.setRetirar(Integer.parseInt(newFullName));

			} else {
				pedido.setRetirar(0);
			}
			tviewProducts.getItems().set(row, pedido);
		});
	}
}
