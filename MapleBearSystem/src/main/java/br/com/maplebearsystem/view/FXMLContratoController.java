package br.com.maplebearsystem.view;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.ContratoController;
import br.com.maplebearsystem.model.constants.PessoaConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.TextFieldFormatterHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

	private FXMLDefaultControllerInterface sourceController;
	private ContratoController ContratoController;

	@FXML
    void salvarpedido(ActionEvent event) {
    	ContratoController.validar(tfieldnome.getText(),
    			dtdianasc.getValue(),
    			tfieldNacionalidade.getText(),
    			tfieldprofissao.getText(),
    			tfieldEstCivil.getText(),
    			tfieldCPF.getText(),
    			tfieldRG.getText(),
    			tfieldEnd.getText(),
    			tfieldNum.getText(),
    			tfieldComp.getText(),
    			tfieldCidade.getText(),
    			tfieldCep.getText(),
    			tfieldEstado.getText(),
    			tfieldnome3.getText(),
    			dtdianasc2.getValue(),
    			tfieldNacionalidade1.getText(),
    			tfieldprofissao1.getText(),
    			tfieldEstCivil1.getText(),
    			tfieldCPF1.getText(),
    			tfieldRG1.getText(),
    			tfieldEnd1.getText(),
    			tfieldNum1.getText(),
    			tfieldComp1.getText(),
    			tfieldCidade1.getText(),
    			tfieldCep1.getText(),
    			tfieldEstado1.getText(),
    			tfieldAluno.getText(),
    			tfieldTurma.getText(),
    			tfieldTurno.getText(),
    			tfieldGuarda.getText(),
    			tfieldPreco.getText(),
    			tfieldParcela.getText());
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
		// TODO Auto-generated method stub

	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initTextFieldMasks();
		ContratoController.setupNewContrato();

	}

}
