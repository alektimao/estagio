package br.com.maplebearsystem.model.constants;

public enum ServiceConstants {
	
	MAXLEN_SERVICE_DESCRIPTION(50),
	MAXLEN_SERVICE_EXTENDEDDESCRIPTION(400),
	MAXLEN_SERVICE_PRICE(9);
	
	private int value;
	
	ServiceConstants(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
