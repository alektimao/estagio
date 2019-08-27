package br.com.maplebearsystem.model;

public enum Relatorio {
	PEDIDOFUNCIONARIOS("PEDIDO FUNCIONARIOS"),
	COMPAR("COMPRAR PRODUTOS");
	
	String valor;
	
	Relatorio(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	
}
