package br.com.maplebearsystem.model.constants;

public enum EquipmentConstants {
	
	MAXLEN_MODEL(30),
    MAXLEN_BRANDNAME(30),
    MAXLEN_EQUIPMENTTYPETEXT(30),
    MAXLEN_PATNUMBER(20),
    MAXLEN_SERIALNUMBER(30);
	
	private int value;
	
	EquipmentConstants(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
