package br.com.maplebearsystem.model;

public enum WeekDays {
	SEGUNDA("Segunda"),
	TERCA("Terça"),
	QUARTA("Quarta"),
	QUINTA("Quinta"),
	SEXTA("Sexta"),
	SABADO("Sabado"),
	DOMINGO("Domingo");
	
	String valor;
	
	WeekDays(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return this.valor;
	}
	
	
}
