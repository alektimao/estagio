package br.com.maplebearsystem.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.PedidoFuncDAO;
import br.com.maplebearsystem.dao.PedidoFunc_ProductDAO;
import br.com.maplebearsystem.model.PedidoFunc;
import br.com.maplebearsystem.model.PedidoFunc_Produto;
import br.com.maplebearsystem.model.Product;

public class PedidoFuncController {

	private PedidoFunc requisicao;
	private PedidoFunc_Produto requisicao_produto;

	public PedidoFuncController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION PedidoFunc Methods

	public PedidoFunc getPedidoFunc() {
		return requisicao;
	}

	public PedidoFunc_Produto getPedidoFunc_produto() {
		return requisicao_produto;
	}

	public void setPedidoFunc_produto(PedidoFunc_Produto requisicao_produto) {
		this.requisicao_produto = requisicao_produto;
	}

	public void setupEditPedidoFunc(PedidoFunc partProduct) {
		this.requisicao = partProduct;

	}

	public void setupNewPedidoFunc() {
		requisicao = new PedidoFunc();
		setPedidoFunc_produto(new PedidoFunc_Produto());
	}

	public List<Exception> tratarinfoPedidoFunc(PedidoFunc requisicao) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (requisicao == null) {
			requisicao = new PedidoFunc();
		}
		try {
			setPedidoFuncDataPedido(requisicao.getRequestDate());
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
//		
//		try {
//			setPedidoFuncDataDe(requisicao.getRequestDate());
//		} catch (Exception e) {
//			// TODO log user input exception
//			errorList.add(e);
//			System.out.println("Info:" + e.getMessage());
//		}
		if (errorList.isEmpty()) {
			try {
				tratarinfoPedidoFunc(this.requisicao);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Requisição Já cadastrada"));
				System.out.println(
						"Info: PedidoFunc \"" + requisicao.getId() + "\" already registered - " + e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	private void setPedidoFuncDataPedido(Date requestDate) throws Exception {
		LocalDate localDateTime = LocalDate.now();
		if (requestDate == null || localDateTime == null) {
			throw new Exception("Data / Hora de abertura não definida");
		}
		try {
			if (requisicao.getRequestDate().toLocalDate().isBefore(localDateTime)) {
				throw new Exception("Data e hora de finalização do agendamento é anterior a data e hora agendada");
			}
		} catch (NullPointerException e) {
			System.out.println("Info: workDone date and time must be null - " + e.getMessage() + " - " + e.getCause());
		}
		requisicao.setRequestDate(requestDate);
	}

	public void savePedidoFunc(PedidoFunc Product) {
		PedidoFuncDAO dao = new PedidoFuncDAO();
		dao.save(Product);
	}

	public void deletePedidoFunc() {
		PedidoFuncDAO dao = new PedidoFuncDAO();
		dao.delete(requisicao);

	}
// ENDSECTION PedidoFunc Methods

// SECTION Controller to DAO Methods
	public List<PedidoFunc> getPedidos() {
		PedidoFuncDAO dao = new PedidoFuncDAO();

		return dao.listAllPedidos();
	}

	public List<PedidoFunc> getPedidos(String filter) {
		PedidoFuncDAO dao = new PedidoFuncDAO();

		return dao.listPedidos(filter);
	}

	public void validateListaProduto(List<Product> data) {

		List<PedidoFunc_Produto> lrp = new ArrayList<PedidoFunc_Produto>();
		// fazer dentro da controler
		for (Product product : data) {
			PedidoFunc_Produto p = new PedidoFunc_Produto();
			p.setProdPedidoFunc(product);
			p.setQuantity(0);
			lrp.add(p);
		}

		if (requisicao.getRequestedParts() == null) {
			for (PedidoFunc_Produto requisicao_Produto : lrp) {
				requisicao.addProdutoPedidoFunc(requisicao_Produto);
			}
		} else {
 
			for (Product produto : data) {
				PedidoFunc_Produto query;
				try {
					query = requisicao.getRequestedParts().stream()
							.filter((PedidoFunc_Produto produtorequisitado) -> produtorequisitado.getProdPedidoFunc()
									.equals(produto))
							.findFirst().get();
				} catch (NoSuchElementException e) {
					PedidoFunc_Produto p = new PedidoFunc_Produto();
					p.setProdPedidoFunc(produto);
					p.setQuantity(0);
					requisicao.addProdutoPedidoFunc(p);
				}
			}
		}
		// controlerPedido.getPedidoFunc().getRequestedParts().addAll(lrp);
	}

	public List<Exception> validateSalvar(String descricao, LocalDate datapedido,
			List<PedidoFunc_Produto> produtos) {
		List<Exception> errList = new ArrayList<Exception>();
		try {
			validateDescricao(descricao);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateData(datapedido);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateListaProdutos(produtos);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				savePedidoFunc(requisicao);
			} catch (Exception e) {
				System.out.println("Error: Failed to save WorkOrder - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	private void validateListaProdutos(List<PedidoFunc_Produto> produtos) throws Exception {
		if (produtos.isEmpty()) {
			throw new Exception("Pedido Sem Produtos");
		}
		for (PedidoFunc_Produto requisicao_Produto : produtos) {
			if (requisicao_Produto.getQuantity() == 0) {
				throw new Exception("Pedido Com Quantidade nao informado");
			}
		}
		requisicao.setRequestedParts(produtos);
	}
	private void validateData(LocalDate datapedido) throws Exception {
		if (datapedido == null) {
			throw new Exception("Data do Pedido não selecionada");
		}
		if (datapedido.getDayOfYear() < 19) {
			throw new Exception("Data do Pedido inválida");
		}
		requisicao.setRequestDate(Date.valueOf(datapedido));
	}

	private void validateDescricao(String descricao) {
		String text = descricao;

		if (text == null) {
			text = "";
		}
		requisicao.setDescricao(text);
	}

	public void removeProduct(PedidoFunc_Produto product) {
		if (!product.isProdutorecebido()) {
			requisicao.removeProdutoPedidoFunc(product);
			PedidoFunc_ProductDAO r = new PedidoFunc_ProductDAO();
			r.delete(product);
			if (requisicao.getRequestedParts().size() == 0) {
				PedidoFuncDAO del = new PedidoFuncDAO();
				del.delete(requisicao);
			}
		}
	}

	public void editarPedidoFunc(PedidoFunc requisicao2) {
		this.requisicao = requisicao2;
		
	}

	public List<PedidoFunc_Produto> BuscaProdutosPedidos(Long id) {
		PedidoFunc_ProductDAO dao = new PedidoFunc_ProductDAO();

		return dao.listProdutosPedidos(id);
	}

// ENDSECTION Controller to DAO Methods

}
