package br.com.maplebearsystem.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;

public class TesteLeituraRequisicao {

	@Test
	public void test() {
		
		try {
			
			Requisicao req = new RequisicaoDAO().findById(new Long(1));
			
			if(req == null)
				fail("no acho nada");
			
			System.out.println(req);
			
			for(Requisicao_Produto prod : req.getRequestedParts()) {
				System.out.println(prod.getProdRequisicao().getShortDescription() + " " + prod.getQuantity());
			}
		}catch(Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
		
		
	}

}
