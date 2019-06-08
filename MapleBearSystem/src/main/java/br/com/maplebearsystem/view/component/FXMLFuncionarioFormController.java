package br.com.maplebearsystem.view.component;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

import br.com.maplebearsystem.controller.FuncionarioController;
import br.com.maplebearsystem.model.Ativo;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Nivel;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.ui.util.FXResourcePath;
import br.com.maplebearsystem.view.FXMLDefaultControllerInterface;
import br.com.maplebearsystem.view.util.FXUISetup;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class FXMLFuncionarioFormController implements FXMLDefaultControllerInterface, Initializable {

	@FXML
	private StackPane rootPane;

    @FXML
    private JFXTextField tfieldMatricula;

    @FXML
    private JFXTextField tfieldNome;

    @FXML
    private JFXTextField tfieldFuncao;

    @FXML
    private JFXComboBox<Nivel> cbNivel;

    @FXML
    private JFXDatePicker dtadmissão;

    @FXML
    private JFXTextField tfieldLogin;

    @FXML
    private JFXTextField tfieldSenha;

    @FXML
    private JFXComboBox<Ativo> cbativo;


	private FXMLDefaultControllerInterface sourceController;

	private FuncionarioController funcontroler;

	@FXML
	void actbuscar(MouseEvent event) {
		loadtela(FXResourcePath.FXML_PESSOA_BUSCAR);
	}

	public void loadtela(URL url) {
		try {

			FXMLDefaultControllerInterface controller = FXUISetup.getInstance()
					.loadFXMLIntoStackPane(rootPane, url, new DropShadow(20.0, Color.BLACK), 10.0)
					.<FXMLDefaultControllerInterface>getController();

			controller.setSourceFXMLController(this);
			if (controller instanceof FXMLContactSearchController) {
				((FXMLContactSearchController) controller).setfisicaModeOnly(true);
				((FXMLContactSearchController) controller).switchToSelectorMode2();
			}
		} catch (Exception e) {
			Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
					"Error: failed to load menu: " + url.getPath(), e);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cbNivel.setItems( FXCollections.observableArrayList( Nivel.values()));
		cbativo.setItems( FXCollections.observableArrayList( Ativo.values()));
		tfieldMatricula.setDisable(true);
		funcontroler = new FuncionarioController();
		funcontroler.setupNewFuncionario();
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
		if (sender instanceof FXMLContactSearchController) {
			if (data instanceof Pessoa) {
				Pessoa resultado = (Pessoa) data;
				loadPessoa(resultado);
			}
		}
	}

	@Override
	public void closeSenderNode(FXMLDefaultControllerInterface sender) throws Exception {
		if (sender instanceof FXMLContactSearchController) {
			FXMLContactSearchController obj = (FXMLContactSearchController) sender;
			rootPane.getChildren().remove(obj.getRootPane());
		}
		// TODO Auto-generated method stub

	}
	public StackPane getRootPane() {
		return rootPane;
	}
	public JFXTextField gettfieldMatricula() {
		return tfieldMatricula;
	}
	public JFXTextField gettfieldNome() {
		return tfieldNome;
	}
	public JFXTextField gettfieldFuncao() {
		return tfieldFuncao;
	}
	public JFXComboBox getcbNivel() {
		return cbNivel;
	}
	public JFXDatePicker getdtadmissão() {
		return dtadmissão;
	}
	public JFXTextField gettfieldLogin() {
		return tfieldLogin;
	}
	public JFXTextField gettfieldSenha() {
		return tfieldSenha;
	}
	public JFXComboBox getcbativo() {
		return cbativo;
	}
	public FuncionarioController getFuncionarioController() {
		return funcontroler;
	}

	private void loadPessoa(Funcionario funcionario) {
		funcontroler.getFuncionario().setPessoa((PessoaFisica) funcionario.getPessoa());
		tfieldNome.setText(funcionario.getPessoa().getName());
		tfieldFuncao.setText(funcionario.getJob());
		tfieldMatricula.setText(funcionario.getId().toString());
	    cbNivel.setValue(funcionario.getNivel());
	    dtadmissão.setValue(funcionario.getAdmissao().toLocalDate());
	    tfieldLogin.setText(funcionario.getLogin());
	    tfieldSenha.setText(funcionario.getSenha());
	    cbativo.setValue(funcionario.getAtivo());

	}
	
	private void loadPessoa(Pessoa resultado) {
		funcontroler.getFuncionario().setPessoa((PessoaFisica) resultado);
		tfieldNome.setText(funcontroler.getFuncionario().getPessoa().getName());
	}

	public void CarregaCampos(FuncionarioController modelController) {
		loadPessoa(modelController.getFuncionario());
		funcontroler = modelController;
	}

}
