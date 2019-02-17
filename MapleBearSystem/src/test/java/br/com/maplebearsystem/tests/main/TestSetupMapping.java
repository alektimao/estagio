package br.com.maplebearsystem.tests.main;

import br.com.maplebearsystem.persistance.JPAUtil;

public class TestSetupMapping {

	public TestSetupMapping() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		JPAUtil.getEntityManager();
	}

}
