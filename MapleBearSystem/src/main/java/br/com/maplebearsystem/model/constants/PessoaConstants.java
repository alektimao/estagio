package br.com.maplebearsystem.model.constants;

public enum PessoaConstants {

    MAXLEN_NAME(50),
    MAXLEN_CONTACTNAME(30),
    MAXLEN_RSOCIAL(50),
    MAXLEN_ADDRESS(100),
    MAXLEN_ADDRESSCOMPLEMENT(100),
    MAXLEN_DISTRICT(50),
    MAXLEN_POSTALCODE(9),
    MAXLEN_CITY(50),
    MAXLEN_PROVINCESTATE(50),
    MAXLEN_INSCESTADUAL(15),
    MAXLEN_INSCMUNICIPAL(20),
    MAXLEN_RG(15);
	
	private int value;
	
	PessoaConstants(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
