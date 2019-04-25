package br.com.maplebearsystem.view.util;

public enum FXMLResourcePathsEnum {

	FXML_LOGIN("/com/dwor/view/FXMLLogin.fxml"), 
	FXML_DWOR_HOME("/com/dwor/view/FXMLDworHome.fxml"),
	FXML_MAPLE_PRODUCTMANAGER("/br/com/maplebearsystem/view/FXMLProductManager.fxml"),
	FXML_DWOR_INITSETUP("/com/dwor/view/FXMLInitSetup.fxml"),
	DWOR_ICON("/com/dwor/resources/images/icon.png"),
	FXML_MAPLE_PEDIDO_MANAGER("/br/com/maplebearsystem/view/FXMLPedirProduto.fxml"),
	FXML_MAPLE_RECEBER_MANAGER("/br/com/maplebearsystem/view/FXMLReceberPedido.fxml"),
	FXML_MAPLE_RETIRAR_MANAGER("/br/com/maplebearsystem/view/FXMLRetirarProduto.fxml"),
	FXML_MAPLE_PRODUTO_BUSCA("/br/com/maplebearsystem/view/component/FXMLProductSearch.fxml"),
	FXML_MAPLE_PEDIDO_BUSCA("/br/com/maplebearsystem/view/component/FXMLPedidoBusca.fxml"),
	FXML_MAPLE_SAIDA_REGISTRATION("/br/com/maplebearsystem/view/component/FXMLSaidaRegistration.fxml"),
	FXML_MAPLE_SAIDA_MANAGER("/br/com/maplebearsystem/view/FXMLSaidaManager.fxml"),
	FXML_MAPLE_MENU_HOME("/br/com/maplebearsystem/view/FXMLMenuPrincipal.fxml");
	String path;

	private FXMLResourcePathsEnum(String path) {
		this.path = path;
	};

	public String getPath() {
		return path;
	}

}
