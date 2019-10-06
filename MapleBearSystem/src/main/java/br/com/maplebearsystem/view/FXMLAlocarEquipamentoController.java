package br.com.maplebearsystem.view;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.AlocarController;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Alocar_Produto;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.model.constants.PedidoConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.component.FXMLBuscaEmprestimoController;
import br.com.maplebearsystem.view.component.FXMLBuscaPedidoController;
import br.com.maplebearsystem.view.component.FXMLFuncionarioSearchController;
import br.com.maplebearsystem.view.component.FXMLProductFornecedorSearchController;
import br.com.maplebearsystem.view.component.FXMLProdutoSearchController;
import br.com.maplebearsystem.view.util.FXUISetup;
import br.com.maplebearsystem.view.util.TextFieldFormatterHelper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLAlocarEquipamentoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox panelMain;

	@FXML
	private JFXTextField tfieldFuncionario;

	@FXML
	private JFXButton btbusca;

	@FXML
	private VBox vboxprodutos;

	@FXML
	private TableView<Alocar_Produto> tviewProducts;

	@FXML
	private TableColumn<Alocar_Produto, String> colproduto;

	@FXML
	private TableColumn<Alocar_Produto, String> colqtd;

	@FXML
	private TableColumn<Alocar_Produto, String> colqtdpedido;

	@FXML
	private TableColumn<Alocar_Produto, String> coldevolver;

	@FXML
	private JFXButton btadd1;

	@FXML
	private JFXButton btremover1;

	@FXML
	private JFXTextField txtsala;

	@FXML
	private JFXTextField txtaula;

	@FXML
	private JFXButton btsalvar;

	@FXML
	private JFXTextArea txtobs;

	@FXML
	private JFXDatePicker dtemprestimo;

	@FXML
	private JFXDatePicker dtdevolucao;

	private AlocarController controlerAlocar;
	private List<Alocar_Produto> listproduto;
	private List<Exception> mainErrorList;
	private FXMLDefaultControllerInterface sourceController;

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
		try {
			FXMLFuncionarioSearchController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_MAPLE_FUNCIONARIO_BUSCA, null, 0.0)
					.<FXMLFuncionarioSearchController>getController();
			controller.switchToSelectorMode();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}
	}

	@FXML
	void removerproduto(ActionEvent event) {
		try {
			Alocar_Produto product = tviewProducts.getSelectionModel().getSelectedItem();

			Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja remover a seguinte produto adicionado:\n"
					+ product.getProdAlocar().getShortDescription() + "?", ButtonType.YES, ButtonType.NO);

			alert.showAndWait();

			if (alert.getResult() == ButtonType.YES) {
				controlerAlocar.removeProduct(product);
				loadTableView();
				// calculateValues();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadTableView() {
		try {
			ObservableList<Alocar_Produto> modelo;
			modelo = FXCollections.observableArrayList(controlerAlocar.getAlocar().getProdutos());
			if (tviewProducts.getItems() != null)
				tviewProducts.getItems().clear();
			tviewProducts.setItems(modelo);
		} catch (Exception e) {
			System.out.println("Error: failed to load OrderPartProductTableview - " + e.getMessage());
		}

	}

	@FXML
	void salvarpedido(ActionEvent event) {
		if (save()) {
			
			FXUISetup.getInstance().clearTextInputs(rootPane);
			FXUISetup.getInstance().clearTableViews(rootPane);
			
			FXNotification notification = new FXNotification("Produto(s) Emprestado(s),",
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
			mainErrorList = controlerAlocar.validateSalvar(txtaula.getText(), txtsala.getText(), txtobs.getText(),dtdevolucao.getValue(), dtemprestimo.getValue(), tviewProducts.getItems());
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
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLProdutoSearchController) {
			if (data instanceof List<?>) {
				List<Product> resultado = (List<Product>) data;
				controlerAlocar.validateListaProduto(resultado);
				loadTableView();
			}
		}
		if (sender instanceof FXMLFuncionarioSearchController) {
			if (data instanceof Funcionario) {
				Funcionario resultado = (Funcionario) data;
				controlerAlocar.setupNewAlocar();
				controlerAlocar.getAlocar().setFuncionario(resultado);
				FXUISetup.getInstance().clearTextInputs(rootPane);
				FXUISetup.getInstance().clearTableViews(rootPane);
				tfieldFuncionario.setText(controlerAlocar.getAlocar().getFuncionario().getPessoa().getName());
			}
		}
		if (sender instanceof FXMLBuscaEmprestimoController) {
			if (data instanceof Alocar) {
				Alocar resultado = (Alocar) data;
				controlerAlocar.setupEditAlocar(resultado);
				tfieldFuncionario.setText(controlerAlocar.getAlocar().getFuncionario().getPessoa().getName());
				txtsala.setText(controlerAlocar.getAlocar().getSala());
				txtaula.setText(controlerAlocar.getAlocar().getSala());
				dtdevolucao.setValue(controlerAlocar.getAlocar().getDevolucao().toLocalDate());
				dtemprestimo.setValue(controlerAlocar.getAlocar().getDia().toLocalDate());
				loadTableView();
			}
		}	
		
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender == null) {
			throw new UnsupportedOperationException();

		}
		if (sender instanceof FXMLBuscaEmprestimoController) {
			FXMLBuscaEmprestimoController obj = (FXMLBuscaEmprestimoController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLProdutoSearchController) {
			FXMLProdutoSearchController obj = (FXMLProdutoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		if (sender instanceof FXMLFuncionarioSearchController) {
			FXMLFuncionarioSearchController obj = (FXMLFuncionarioSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		controlerAlocar = new AlocarController();
		controlerAlocar.setupNewAlocar();
		initTableViews();
		initMascara();

	}

	private void initMascara() {
		txtaula.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_DESCRIPTION.getValue(), PedidoConstants.MAXLEN_DESCRIPTION));
		txtsala.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_DESCRIPTION.getValue(), PedidoConstants.MAXLEN_DESCRIPTION));
	}

	private void initTableViews() {
		colproduto.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdAlocar().getShortDescription());
		});
		colqtd.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getProdAlocar().getEstoque().getQtd());
		});
		colqtdpedido.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getQtdemprestado());
		});
		colqtdpedido.setCellFactory(TextFieldTableCell.<Alocar_Produto>forTableColumn());

		colqtdpedido.setOnEditCommit((CellEditEvent<Alocar_Produto, String> event) -> {
			TablePosition<Alocar_Produto, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			Alocar_Produto pedido = event.getTableView().getItems().get(row);

			if (Integer.parseInt(newFullName) > 0
					&& pedido.getProdAlocar().getEstoque().getQtd() >= Integer.parseInt(newFullName)) {

				pedido.setQtdemprestado(Integer.parseInt(newFullName));
				//pedido.getProdAlocar().getEstoque().setQtd(pedido.getProdAlocar().getEstoque().getQtd()-pedido.getQtdemprestado());

			} else {
				pedido.setQtdemprestado(0);
			}
			tviewProducts.getItems().set(row, pedido);
		});
		coldevolver.setCellValueFactory((data) -> {
			return new SimpleStringProperty("" + data.getValue().getQtddevolvido());
		});
		coldevolver.setCellFactory(TextFieldTableCell.<Alocar_Produto>forTableColumn());

		coldevolver.setOnEditCommit((CellEditEvent<Alocar_Produto, String> event) -> {
			TablePosition<Alocar_Produto, String> pos = event.getTablePosition();

			String newFullName = event.getNewValue();

			int row = pos.getRow();
			Alocar_Produto pedido = event.getTableView().getItems().get(row);

			if (Integer.parseInt(newFullName) > 0 && pedido.getQtdemprestado() >= Integer.parseInt(newFullName)) {

				pedido.setQtddevolvido(Integer.parseInt(newFullName));
				//pedido.getProdAlocar().getEstoque().setQtd(pedido.getProdAlocar().getEstoque().getQtd()+pedido.getQtddevolvido());

			} else {
				pedido.setQtddevolvido(0);
			}
			tviewProducts.getItems().set(row, pedido);
		});
	}

	public Object getRootPane() {
		return rootPane;
	}

}
