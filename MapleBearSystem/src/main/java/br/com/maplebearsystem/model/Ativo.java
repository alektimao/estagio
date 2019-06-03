package br.com.maplebearsystem.model;

public enum Ativo {
	ATIVO("Ativo"),
	DESATIVADO("Desativado");
	
	String valor;
	
	Ativo(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	
}
