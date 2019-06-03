package br.com.maplebearsystem.model;

public enum Nivel {
	SECRETARIA("Secretaria"),
	PROFESSORES("Professores"),
	ADM("Administrção");
	
	String valor;
	
	Nivel(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	
}
