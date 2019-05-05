package br.com.maplebearsystem.ui.util;

import java.net.URL;

//@formatter:off
public class FXResourcePath {

	public static final URL DWOR_ICON = resURL("/com/dwor/resources/images/icon.png");
	public static final URL FXML_MAPLEBEARSYSTEM_HOME = resURL("/br/com/maplebearsystem/view/FXMLMenuPrincipal.fxml");
	public static final URL FXML_DWOR_ADDRESSMANAGER = resURL("/com/dwor/view/component/contact/FXMLAddressManager.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLMenuProduto.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_ALUNOS = resURL("/br/com/maplebearsystem/view/FXMLMenuAluno.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_GERENCIAR_GERAIS = resURL("/br/com/maplebearsystem/view/FXMLMenuGerais.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_PEDIR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLPedirProduto.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_RECEBER_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLReceberPedido.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_RETIRAR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLRetirarProduto.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_CADASTRAR_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLProductManager.fxml");
	public static final URL FXML_MAPLEBEARSYSTEM_BUSCAR_PEDIDO = resURL("/br/com/maplebearsystem/view/component/FXMLPedidoBusca.fxml");
	public static final URL FXML_MAPLE_PRODUTOFORNECEDOR_BUSCA = resURL("/br/com/maplebearsystem/view/component/FXMLProductSearch.fxml");
	public static final URL FXML_MAPLE_PRODUTO_BUSCA = resURL("/br/com/maplebearsystem/view/component/FXMLProdutoSearch.fxml");
	public static final URL FXML_MAPLE_SAIDA_REGISTRATION = resURL("/br/com/maplebearsystem/view/FXMLSaidaRegistration.fxml");
	public static final URL FXML_TELEFONE_GERENCIAR = resURL("/br/com/maplebearsystem/view/FXMLPhoneManager.fxml");
	public static final URL FXML_PESSOA_GERENCIAR = resURL("/br/com/maplebearsystem/view/FXMLContactRegistration.fxml");
	public static final URL FXML_PESSOA_BUSCAR = resURL("/br/com/maplebearsystem/view/FXMLContactSearch.fxml");
	//public static final URL FXML_MAPLEBEARSYSTEM_MENU_PRODUTOS = resURL("/br/com/maplebearsystem/view/FXMLPedirProduto.fxml");
	public static final URL FXML_LOGIN = resURL("/com/dwor/view/FXMLLogin.fxml");
	
	private static URL resURL(String path) {
		return FXResourcePath.class.getResource(path);
	}
}
