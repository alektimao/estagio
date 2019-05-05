package br.com.maplebearsystem.test.dao;

import br.com.maplebearsystem.dao.GenericDAO;

public class TestDAO<Template> extends GenericDAO<Template> {

	/**
	 * @param templateClass
	 */

	
	public TestDAO(Class<Template> templateClass) {
		super(templateClass);
	}

	@Override
	public Long getID(Template obj) {
		// TODO Auto-generated type stub
		return null;
	}


}