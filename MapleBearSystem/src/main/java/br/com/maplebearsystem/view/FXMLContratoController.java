package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.ContratoController;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Contrato;
import br.com.maplebearsystem.model.constants.PessoaConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import br.com.maplebearsystem.view.component.FXMLAlunoSearchController;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FXMLContratoController implements Initializable, FXMLDefaultControllerInterface {

	@FXML
	private StackPane rootMenuPane;

	@FXML
	private StackPane rootPane;

	@FXML
	private VBox panelMain;

	@FXML
	private VBox vboxprodutos;

	@FXML
	private JFXTextField tfieldnome;

	@FXML
	private JFXDatePicker dtdianasc;

	@FXML
	private JFXTextField tfieldNacionalidade;

	@FXML
	private JFXTextField tfieldprofissao;

	@FXML
	private JFXTextField tfieldEstCivil;

	@FXML
	private JFXTextField tfieldCPF;

	@FXML
	private JFXTextField tfieldRG;

	@FXML
	private JFXTextField tfieldEnd;

	@FXML
	private JFXTextField tfieldNum;

	@FXML
	private JFXTextField tfieldComp;

	@FXML
	private JFXTextField tfieldCidade;

	@FXML
	private JFXTextField tfieldCep;

	@FXML
	private JFXTextField tfieldEstado;

	@FXML
	private VBox vboxprodutos3;

	@FXML
	private JFXTextField tfieldnome3;

	@FXML
	private JFXDatePicker dtdianasc2;

	@FXML
	private JFXTextField tfieldNacionalidade1;

	@FXML
	private JFXTextField tfieldprofissao1;

	@FXML
	private JFXTextField tfieldEstCivil1;

	@FXML
	private JFXTextField tfieldCPF1;

	@FXML
	private JFXTextField tfieldRG1;

	@FXML
	private JFXTextField tfieldEnd1;

	@FXML
	private JFXTextField tfieldNum1;

	@FXML
	private JFXTextField tfieldComp1;

	@FXML
	private JFXTextField tfieldCidade1;

	@FXML
	private JFXTextField tfieldCep1;

	@FXML
	private JFXTextField tfieldEstado1;

	@FXML
	private VBox vboxprodutos2;

	@FXML
	private JFXTextField tfieldAluno;

	@FXML
	private JFXTextField tfieldTurma;

	@FXML
	private JFXTextField tfieldTurno;

	@FXML
	private JFXTextField tfieldGuarda;

	@FXML
	private JFXTextField tfieldPreco;

	@FXML
	private JFXTextField tfieldParcela;

	@FXML
	private JFXButton btsalvar;

	@FXML
	private JFXDatePicker dtpagamento;

	@FXML
	private JFXButton btbuscaralu;

	@FXML
	private JFXButton btbuscarcon;

	private FXMLDefaultControllerInterface sourceController;
	private ContratoController ContratoController;

	@FXML
	void salvarpedido(ActionEvent event) {
		List<Exception> errorList = ContratoController.validar(tfieldnome.getText(), dtdianasc.getValue(), tfieldNacionalidade.getText(),
				tfieldprofissao.getText(), tfieldEstCivil.getText(), tfieldCPF.getText(), tfieldRG.getText(),
				tfieldEnd.getText(), tfieldNum.getText(), tfieldComp.getText(), tfieldCidade.getText(),
				tfieldCep.getText(), tfieldEstado.getText(), tfieldnome3.getText(), dtdianasc2.getValue(),
				tfieldNacionalidade1.getText(), tfieldprofissao1.getText(), tfieldEstCivil1.getText(),
				tfieldCPF1.getText(), tfieldRG1.getText(), tfieldEnd1.getText(), tfieldNum1.getText(),
				tfieldComp1.getText(), tfieldCidade1.getText(), tfieldCep1.getText(), tfieldEstado1.getText(),
				tfieldAluno.getText(), tfieldTurma.getText(), tfieldTurno.getText(), tfieldGuarda.getText(),
				tfieldPreco.getText(), tfieldParcela.getText());
		
		if (errorList.isEmpty()) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Salvo", ButtonType.OK);
			alert.showAndWait();

		} else {
			String text = "";

			for (Exception e : errorList) {
				text = text + e.getMessage() + "\n";
			}

			Alert errAlert = new Alert(Alert.AlertType.WARNING, text, ButtonType.OK);
			errAlert.showAndWait();
		}
	}

	private void carregarcampos(Aluno resultado) {
		tfieldnome.setText(resultado.getResponsavel());
		tfieldEnd.setText(resultado.getEndereco());
		tfieldCep.setText(resultado.getCep());
		tfieldNum.setText(resultado.getNumeroendereco());
		tfieldnome3.setText(resultado.getResponsavel2());
		tfieldEnd1.setText(resultado.getEndereco());
		tfieldCep1.setText(resultado.getCep());
		tfieldNum1.setText(resultado.getNumeroendereco());
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

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@FXML
	void buscaraluno(ActionEvent event) {
		try {
			FXMLAlunoSearchController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_ALUNO_BUSCAR, null, 0.0)
					.<FXMLAlunoSearchController>getController();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}
	}

	@FXML
	void buscarcontrato(ActionEvent event) {
		try {
			FXMLAlunoSearchController controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, FXResourcePath.FXML_ALUNO_BUSCAR, null, 0.0)
					.<FXMLAlunoSearchController>getController();
			controller.setSourceFXMLController(this);

		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to open FXMLEquipmentRegistration", e);
		}
	}

	private void initTextFieldMasks() {
		tfieldnome.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(), PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldnome3.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(), PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldAluno.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOA_NAME.getValue(), PessoaConstants.MAXLEN_NAME.getValue()));
		tfieldCPF.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		tfieldCPF1.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[0-9]*", "###.###.###-##"));
		tfieldRG.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOAFISICA_RG.getValue(),
				PessoaConstants.MAXLEN_RG.getValue()));
		tfieldRG1.setTextFormatter(TextFieldFormatterHelper.getTextFieldFormatter(
				FieldValidators.RegexCharsets.CHARSET_PESSOAFISICA_RG.getValue(),
				PessoaConstants.MAXLEN_RG.getValue()));
		tfieldCep.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[\\d]*", "#####-###"));
		tfieldCep1.setTextFormatter(TextFieldFormatterHelper.getTextFieldMaskFormatter("[\\d]*", "#####-###"));
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
		if (sender instanceof FXMLAlunoSearchController) {
			if (data instanceof Aluno) {
				Aluno resultado = (Aluno) data;
				carregarcampos(resultado);
			}
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLAlunoSearchController) {
			FXMLAlunoSearchController obj = (FXMLAlunoSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initTextFieldMasks();
		ContratoController = new ContratoController();
		ContratoController.setupNewContrato();

	}

}
