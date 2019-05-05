package br.com.maplebearsystem.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import br.com.maplebearsystem.dao.FornecedorProductDAO;
import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;

public class GravaSemController {

	@Test
	public void test() {
		try {

			Requisicao req = new Requisicao();
			//List<Requisicao_Produto> rplist = new ArrayList<Requisicao_Produto>();
			for(Product prod : new ProductDAO().listAllProduct()) {
				Requisicao_Produto rp = new Requisicao_Produto();
				rp.setProdRequisicao(prod);
				rp.setQuantity(10);
				req.addProdutoRequisicao(rp);
			}
			
			req.setDescricao("teste");
			req.setFrete(BigDecimal.ZERO);
			req.setPedidorecebido(false);
			req.setRequestDate(Date.valueOf(LocalDate.now()));
			
			new RequisicaoDAO().save(req);
			
			
		} catch (Exception e) {

			e.printStackTrace();
			fail("deu ruim");
		}
	}

}
