package br.com.maplebearsystem.ui.util;

import java.net.URL;

//@formatter:off
public class FXResourcePath {

	public static final URL DWOR_ICON = resURL("/com/dwor/resources/images/icon.png");
	public static final URL FXML_MAPLEBEARSYSTEM_HOME = resURL("/br/com/maplebearsystem/view/FXMLMenuPrincipal.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_LOGIN = resURL("/br/com/maplebearsystem/view/FXMLLogin.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_ADDRESSMANAGER = resURL("/br/com/maplebearsystem/view/component/FXMLAddressManager.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLMenuProduto.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_ALUNOS = resURL("/br/com/maplebearsystem/view/FXMLMenuAluno.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_GERAIS = resURL("/br/com/maplebearsystem/view/FXMLMenuGerais.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_PEDIR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLPedirProduto.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_RECEBER_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLReceberPedido.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_RETIRAR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLRetirarProduto.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_CADASTRAR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLProductManager.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_CADASTRAR_FORNECEDOR = resURL("/br/com/maplebearsystem/view/component/FXMLFornecedorRegistration.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_EMPRESTAR_BUSCAR = resURL("/br/com/maplebearsystem/view/component/FXMLBuscaEmprestimo.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_CADASTRAR_FUNCIONARIO = resURL("/br/com/maplebearsystem/view/component/FXMLFuncionariosRegistration.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_EMPRESTAR = resURL("/br/com/maplebearsystem/view/FXMLAlocarEquipamento.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_BUSCAR_PEDIDO = resURL("/br/com/maplebearsystem/view/component/FXMLPedidoBusca.fxml");
	public static final URL FXML_MAPLE_PRODUTOFORNECEDOR_BUSCA = resURL("/br/com/maplebearsystem/view/component/FXMLProductFornecedorSearch.fxml");
	public static final URL FXML_MAPLE_FORNECEDOR_BUSCA = resURL("/br/com/maplebearsystem/view/component/FXMLFornecedorSearch.fxml");
	public static final URL FXML_MAPLE_FUNCIONARIO_BUSCA = resURL("/br/com/maplebearsystem/view/component/FXMLFuncionariosSearch.fxml");
	public static final URL FXML_MAPLE_ALUNO_CADASTRAR = resURL("/br/com/maplebearsystem/view/component/FXMLAlunoSearch.fxml");
	public static final URL FXML_MAPLE_PRODUTO_BUSCA = resURL("/br/com/maplebearsystem/view/component/FXMLProdutoSearch.fxml");
	public static final URL FXML_TELEFONE_GERENCIAR = resURL("/br/com/maplebearsystem/view/component/FXMLPhoneManager.fxml");
	public static final URL FXML_PESSOA_GERENCIAR = resURL("/br/com/maplebearsystem/view/component/FXMLContactRegistration.fxml");
	public static final URL FXML_PESSOA_BUSCAR = resURL("/br/com/maplebearsystem/view/component/FXMLContactSearch.fxml");
	public static final URL FXML_INTERESSADOS_BUSCAR = resURL("/br/com/maplebearsystem/view/component/FXMLInteressadosSearch.fxml");
	public static final URL FXML_ALUNO_BUSCAR = resURL("/br/com/maplebearsystem/view/component/FXMLAlunoBuscaBase.fxml");
	public static final URL FXML_INTERESSADOS_GERENCIAR = resURL("/br/com/maplebearsystem/view/FXMLInteressadosManager.fxml");
	public static final URL FXML_MAPLE_SALA_MULTI = resURL("/br/com/maplebearsystem/view/FXMLSalaMultiUso.fxml");
	public static final URL FXML_MAPLE_TURMA = resURL("/br/com/maplebearsystem/view/FXMLTurmaPersonalizada.fxml");
	public static final URL FXML_MAPLE_RESTRICAO = resURL("/br/com/maplebearsystem/view/FXMLRestricao.fxml");
	public static final URL FXML_MAPLE_CONTRATO = resURL("/br/com/maplebearsystem/view/FXMLContrato.fxml");
	public static final URL FXML_MAPLE_DOCUMENTO = resURL("/br/com/maplebearsystem/view/FXMLDocumento.fxml");
	//public static final URL FXML_MAPLEBEARSYSTEM_MENU_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLPedirProduto.fxml");
	public static final URL FXML_LOGIN = resURL("/com/dwor/view/FXMLLogin.fxml");
	
	private static URL resURL(String path) {
		return FXResourcePath.class.getResource(path);
	}
}
