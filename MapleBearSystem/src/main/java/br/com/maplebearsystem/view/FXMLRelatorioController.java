package br.com.maplebearsystem.view;

import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import br.com.maplebearsystem.dao.Banco;
import br.com.maplebearsystem.dao.Conexao;
import br.com.maplebearsystem.main.MapleBearSystemDesktopClient;
import br.com.maplebearsystem.model.Relatorio;
import br.com.maplebearsystem.model.WeekDays;
import br.com.maplebearsystem.ui.notifications.FXNotification;
import br.com.maplebearsystem.view.util.FXUISetup;

public class FXMLRelatorioController implements Initializable, FXMLDefaultControllerInterface {
	@FXML
	private StackPane rootpane;

	@FXML
	private VBox vboxRelatorio;

	@FXML
	private HBox hboxJasperMaldito;

	@FXML
	private Tooltip ttp_lblStatus;

	@FXML
	private JFXComboBox<String> cbb_usuario;

	@FXML
	private Tooltip ttp_status;

	@FXML
	private ContextMenu ctm_status;

	@FXML
	private MenuItem mi_status;

	@FXML
	private Label lbl_abertura;

	@FXML
	private Tooltip ttp_lblClienteT1;

	@FXML
	private JFXDatePicker dp_aberturaIni;

	@FXML
	private Label lbl_aberturaFinal;

	@FXML
	private Tooltip ttp_lblVencimentoT1;

	@FXML
	private JFXDatePicker dp_aberturaFim;

	@FXML
	private JFXButton btn_Gerar;

	@FXML
	private Tooltip ttp_btnGravar;

	@FXML
	private JFXButton btn_VoltarOnHell;

	@FXML
	private Tooltip ttp_btnVoltar1;
	@FXML
	private JFXTextField txtProd;

	@FXML
	private JFXTextField txtTipo;

	private FXMLDefaultControllerInterface sourceController;
	SwingNode sn = new SwingNode();

	@FXML
	void OnActionGerar(ActionEvent event) {
		gerar();
	}

	private void gerar() {
		Date DataVencimentoT = null, DataAberturaT = null;
		String relatorio = "";
		if (cbb_usuario.getValue().equals("ANIVERSARIO FUNCIONARIOS")
				|| cbb_usuario.getValue().equals("PEDIDO FUNCIONARIOS")
				|| cbb_usuario.getValue().equals("COMPRAR PRODUTOS")) {
			if (dp_aberturaIni.getValue() == null || dp_aberturaFim == null || cbb_usuario.getValue() == null) {
				FXNotification notification = new FXNotification("Informe Todos os filtros,",
						FXNotification.NotificationType.WARNING);
				notification.show();
			} else {
				DataVencimentoT = Date.valueOf(dp_aberturaIni.getValue().toString());
				DataAberturaT = Date.valueOf(dp_aberturaFim.getValue().toString());
				// Relatorio e = cbb_usuario.getSelectionModel().getSelectedItem();

				if (cbb_usuario.getValue().equals("PEDIDO FUNCIONARIOS")) {
					relatorio = "PEDIDO FUNCIONARIOS";
					// exibeRelatorio(relatorio, DataVencimentoT, DataAberturaT);
				} else if (cbb_usuario.getValue().equals("COMPRAR PRODUTOS")) {
					relatorio = "COMPRAR PRODUTOS";
				} else if (cbb_usuario.getValue().equals("ANIVERSARIO FUNCIONARIOS")) {
					relatorio = "ANIVERSARIO FUNCIONARIOS";
				}
				exibeRelatorio(relatorio, DataVencimentoT, DataAberturaT);
			}
		}
		if (cbb_usuario.getValue().equals("ESTOQUE PRODUTOS")) {
			String tipo = "";
			String nomeprod = "";
			relatorio = "ESTOQUE PRODUTOS";
			if (txtProd.getText().equals("") && txtTipo.getText().equals("")) {
				relatorio = "ESTOQUE PRODUTOS2";
			}
			nomeprod = txtProd.getText().toUpperCase();
			tipo = txtTipo.getText();

			exibeRelatorio(relatorio, tipo, nomeprod);
			// FXUISetup.getInstance().clearTextInputs(rootpane);

		}
		if (cbb_usuario.getValue().equals("MOVIMENTO PRODUTOS")) {
			String tipo = "";
			relatorio = "MOVIMENTO PRODUTOS";			
			if (dp_aberturaIni.getValue() == null || dp_aberturaFim == null || cbb_usuario.getValue() == null) {
				FXNotification notification = new FXNotification("Informe os filtros de data,",
						FXNotification.NotificationType.WARNING);
				notification.show();
			} else {
				DataVencimentoT = Date.valueOf(dp_aberturaIni.getValue().toString());
				DataAberturaT = Date.valueOf(dp_aberturaFim.getValue().toString());
				if (txtProd.getText().equals("") && txtTipo.getText().equals("")) {
					relatorio = "MOVIMENTO PRODUTOS2";
				}
				else
				{
					tipo = txtTipo.getText();
					if (tipo.toLowerCase().contains("entrada")) {
						tipo = "Entrada de Produto";
					}
					else
					{
						tipo = "Retirada de Produto";
					}
				}
				exibeRelatorio( relatorio,  DataVencimentoT,  DataAberturaT, tipo);
			}
		}
	}

	@FXML
	void change(ActionEvent event) {
		dp_aberturaIni.setVisible(true);
		dp_aberturaFim.setVisible(true);
		txtProd.setVisible(true);
		txtTipo.setVisible(true);
		if (cbb_usuario.getValue().equals("ESTOQUE PRODUTOS")) {
			dp_aberturaIni.setVisible(false);
			dp_aberturaFim.setVisible(false);
		}
		if (cbb_usuario.getValue().equals("ANIVERSARIO FUNCIONARIOS")
				|| cbb_usuario.getValue().equals("PEDIDO FUNCIONARIOS")
				|| cbb_usuario.getValue().equals("COMPRAR PRODUTOS")) {
			txtProd.setVisible(false);
			txtTipo.setVisible(false);
		}
		if (cbb_usuario.getValue().equals("MOVIMENTO PRODUTOS")) {
			txtProd.setVisible(false);
		}
		// FXUISetup.getInstance().clearTextInputs(rootpane);
	}

	private void exibeRelatorio(String relatorio, String tipo, String prod) {
		FXNotification notification = new FXNotification("Gerando Relatorio,",
				FXNotification.NotificationType.INFORMATION);
		notification.show();
		Task<JRViewer> task = new Task<JRViewer>() {
			@Override
			public JRViewer call() {
				try {
					Banco.getCon();
					Connection con = Conexao.abre();
					HashMap<String, Object> parameters = new HashMap<String, Object>();
					InputStream jasper1 = null;
					if (relatorio.equals("ESTOQUE PRODUTOS")) {
						parameters.put("Tipo", tipo);
						parameters.put("Prod", prod);

						jasper1 = MapleBearSystemDesktopClient.class
								.getResourceAsStream("/br/com/maplebearsystem/relatorio/ProductEstoque.jasper");
						JasperPrint jp = JasperFillManager.fillReport(jasper1, parameters, con);
						JRViewer jr = new JRViewer(jp);

						return jr;
					} else {
						parameters.put("Tipo", tipo);
						parameters.put("Prod", prod);

						jasper1 = MapleBearSystemDesktopClient.class
								.getResourceAsStream("/br/com/maplebearsystem/relatorio/ProductEstoque2.jasper");
						JasperPrint jp = JasperFillManager.fillReport(jasper1, parameters, con);
						JRViewer jr = new JRViewer(jp);

						return jr;
					}
				} catch (Exception e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: an error ocurred when ",
							e);

				}
				return null;
			}
		};

		task.setOnSucceeded((event1) -> {
			Platform.runLater(() -> {
				try {
					vboxRelatorio.setVisible(true);
					hboxJasperMaldito.getChildren().remove(sn);
					HBox.setHgrow(sn, Priority.ALWAYS);
					sn.setContent(task.get());
					hboxJasperMaldito.getChildren().add(sn);
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to load ", e);
				}
			});
		});

		new Thread(task).start();

	}

	private void exibeRelatorio(String relatorio, Date ini, Date fim) {
		FXNotification notification = new FXNotification("Gerando Relatorio,",
				FXNotification.NotificationType.INFORMATION);
		notification.show();
		Task<JRViewer> task = new Task<JRViewer>() {
			@Override
			public JRViewer call() {
				try {
					Banco.getCon();
					Connection con = Conexao.abre();
					HashMap<String, Object> parameters = new HashMap<String, Object>();
					InputStream jasper1 = null;
					if (relatorio.equals("PEDIDO FUNCIONARIOS")) {
						parameters.put("DataIni", ini);
						parameters.put("DataFim", fim);

						jasper1 = MapleBearSystemDesktopClient.class.getResourceAsStream("/br/com/maplebearsystem/relatorio/PedidosFunc.jasper");
					} else if (relatorio.equals("COMPRAR PRODUTOS")) {
						parameters.put("Comprado", true);
						parameters.put("DataIni", ini);
						parameters.put("DataFim", fim);

						jasper1 = MapleBearSystemDesktopClient.class.getResourceAsStream("/br/com/maplebearsystem/relatorio/Pedidos.jasper");
					} else if (relatorio.equals("ANIVERSARIO FUNCIONARIOS")) {
						parameters.put("DataIni", ini);
						parameters.put("DataFim", fim);
						parameters.put("mesini", ini.toLocalDate().getMonthValue());
						parameters.put("mesfim", fim.toLocalDate().getMonthValue());
						jasper1 = MapleBearSystemDesktopClient.class
								.getResourceAsStream("/br/com/maplebearsystem/relatorio/FuncnNiver.jasper");
					}
					JasperPrint jp = JasperFillManager.fillReport(jasper1, parameters, con);
					JRViewer jr = new JRViewer(jp);

					return jr;
				} catch (Exception e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: an error ocurred when ",
							e);

				}
				return null;
			}
		};

		task.setOnSucceeded((event1) -> {
			Platform.runLater(() -> {
				try {
					vboxRelatorio.setVisible(true);
					hboxJasperMaldito.getChildren().remove(sn);
					HBox.setHgrow(sn, Priority.ALWAYS);
					sn.setContent(task.get());
					hboxJasperMaldito.getChildren().add(sn);
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to load ", e);
				}
			});
		});

		new Thread(task).start();

	}
	private void exibeRelatorio(String relatorio, Date ini, Date fim, String Tipo) {
		FXNotification notification = new FXNotification("Gerando Relatorio,",
				FXNotification.NotificationType.INFORMATION);
		notification.show();
		Task<JRViewer> task = new Task<JRViewer>() {
			@Override
			public JRViewer call() {
				try {
					Banco.getCon();
					Connection con = Conexao.abre();
					HashMap<String, Object> parameters = new HashMap<String, Object>();
					InputStream jasper1 = null;
					if (relatorio.equals("MOVIMENTO PRODUTOS")) {
						parameters.put("DataIni", ini);
						parameters.put("DataFim", fim);
						parameters.put("Tipo", Tipo);
						jasper1 = MapleBearSystemDesktopClient.class.getResourceAsStream("/br/com/maplebearsystem/relatorio/EntradaSaidaProduto.jasper");
					} else {
						parameters.put("DataIni", ini);
						parameters.put("DataFim", fim);
						jasper1 = MapleBearSystemDesktopClient.class
								.getResourceAsStream("/br/com/maplebearsystem/relatorio/EntradaSaidaProduto2.jasper");
					}
					JasperPrint jp = JasperFillManager.fillReport(jasper1, parameters, con);
					JRViewer jr = new JRViewer(jp);

					return jr;
				} catch (Exception e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Warning: an error ocurred when ",
							e);

				}
				return null;
			}
		};

		task.setOnSucceeded((event1) -> {
			Platform.runLater(() -> {
				try {
					vboxRelatorio.setVisible(true);
					hboxJasperMaldito.getChildren().remove(sn);
					HBox.setHgrow(sn, Priority.ALWAYS);
					sn.setContent(task.get());
					hboxJasperMaldito.getChildren().add(sn);
				} catch (InterruptedException | ExecutionException e) {
					Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Error: failed to load ", e);
				}
			});
		});

		new Thread(task).start();

	}

	@FXML
	void OnActionVoltarOnHell(ActionEvent event) {
		try {
			sourceController.closeSenderNode(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public StackPane getRootPane() {
		return rootpane;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cbb_usuario.getItems().addAll("PEDIDO FUNCIONARIOS", "COMPRAR PRODUTOS", "ESTOQUE PRODUTOS",
				"ANIVERSARIO FUNCIONARIOS","MOVIMENTO PRODUTOS");
	}

}
