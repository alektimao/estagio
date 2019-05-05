package br.com.maplebearsystem.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.maplebearsystem.controller.PedidoController;
import br.com.maplebearsystem.dao.FornecedorProductDAO;
import br.com.maplebearsystem.model.FornecedorProduct;

public class GravaRequisicao {

	@Test
	public void test() {

		PedidoController controller = new PedidoController();

		try {

			List<FornecedorProduct> list = new FornecedorProductDAO().listAllProduct();

			controller.setupNewRequisicao();
			controller.validateListaProduto(list);
			controller.validateValorTotal("200.00");
			List<Exception> errlist = controller.validateSalvar("200.00", "0.00", "nada", LocalDate.now(), LocalDate.of(2019, 4, 1),
					controller.getRequisicao().getRequestedParts());

			if(!errlist.isEmpty())
				fail("deu ruim");
			
		} catch (Exception e) {

			e.printStackTrace();
			fail("deu ruim");
		}
	}

}
