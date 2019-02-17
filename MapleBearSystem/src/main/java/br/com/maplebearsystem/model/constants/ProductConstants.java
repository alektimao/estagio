package br.com.maplebearsystem.model.constants;

public enum ProductConstants {

	MAXLEN_PARTPRODUCT_DESCRIPTION(50),
	MAXLEN_PARTPRODUCT_PARTNUMBER(40),
	MAXLEN_PARTPRODUCT_OTHERNUMBERS(100),
	MAXLEN_PARTPRODUCT_STOCKQUANTITY(8),
	MAXLEN_PARTPRODUCT_EXTENDEDDESCRIPTION(400),
	MAXLEN_PARTPRODUCT_PRICE(9);

	private int value;

	ProductConstants(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
