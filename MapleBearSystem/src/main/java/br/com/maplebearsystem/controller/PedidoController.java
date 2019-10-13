package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.PedidoFunc_ProductDAO;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.dao.Requisicao_ProductDAO;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.PedidoFunc_Produto;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;

public class PedidoController {

	private Requisicao requisicao;
	private Requisicao_Produto requisicao_produto;

	public PedidoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Requisicao Methods

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public Requisicao_Produto getRequisicao_produto() {
		return requisicao_produto;
	}

	public void setRequisicao_produto(Requisicao_Produto requisicao_produto) {
		this.requisicao_produto = requisicao_produto;
	}

	public void setupEditRequisicao(Requisicao partProduct) {
		this.requisicao = partProduct;

	}

	public void setupNewRequisicao() {
		requisicao = new Requisicao();
		setRequisicao_produto(new Requisicao_Produto());
	}

	public List<Exception> tratarinfoRequisicao(Requisicao requisicao) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (requisicao == null) {
			requisicao = new Requisicao();
		}
		try {
			setRequisicaoDataPedido(requisicao.getRequestDate());
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
//		
//		try {
//			setRequisicaoDataDe(requisicao.getRequestDate());
//		} catch (Exception e) {
//			// TODO log user input exception
//			errorList.add(e);
//			System.out.println("Info:" + e.getMessage());
//		}
		if (errorList.isEmpty()) {
			try {
				tratarinfoRequisicao(this.requisicao);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Requisição Já cadastrada"));
				System.out.println(
						"Info: Requisicao \"" + requisicao.getId() + "\" already registered - " + e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	private void setRequisicaoDataPedido(Date requestDate) throws Exception {
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

	public void saveRequisicao(Requisicao Product) {
		RequisicaoDAO dao = new RequisicaoDAO();
		dao.save(Product);
	}

	public void deleteRequisicao() {
		RequisicaoDAO dao = new RequisicaoDAO();
		dao.delete(requisicao);

	}

	public void validateValorTotal(String text) throws Exception {

		String textM = text;

		if (text == null || text.equals("")) {
			throw new Exception("Defina o Valor Total do peidido!");
		}

		textM = textM.trim();

		BigDecimal bigdecimalvalue;

		try {
			bigdecimalvalue = new BigDecimal(Double.parseDouble(textM));
		} catch (NumberFormatException e) {
			throw new Exception("Valor Total em formato inválido!");
		}

		if (bigdecimalvalue.doubleValue() < 0) {
			throw new Exception("Valor Total em valor negativo!");
		}

		bigdecimalvalue = bigdecimalvalue.setScale(2, RoundingMode.HALF_UP);

		requisicao.setPriceTotal(bigdecimalvalue);

	}
// ENDSECTION Requisicao Methods

// SECTION Controller to DAO Methods
	public List<Requisicao> getPedidos() {
		RequisicaoDAO dao = new RequisicaoDAO();

		return dao.listAllPedidos();
	}

	public List<Requisicao> getPedidos(String filter) {
		RequisicaoDAO dao = new RequisicaoDAO();

		return dao.listPedidos(filter);
	}

	public void validateListaProduto(List<FornecedorProduct> data) {

		List<Requisicao_Produto> lrp = new ArrayList<Requisicao_Produto>();
		// fazer dentro da controler
		for (FornecedorProduct product : data) {
			Requisicao_Produto p = new Requisicao_Produto();
			p.setProdRequisicao(product.getProduct());
			p.setProdFornecedor(product.getFornecedor());
			p.setQuantity(0);
			p.setUnitPrice(BigDecimal.ZERO);
			lrp.add(p);
		}

		if (requisicao.getRequestedParts() == null) {
			for (Requisicao_Produto requisicao_Produto : lrp) {
				requisicao.addProdutoRequisicao(requisicao_Produto);
			}
		} else {
 
			for (FornecedorProduct produto : data) {
				Requisicao_Produto query;
				try {
					query = requisicao.getRequestedParts().stream()
							.filter((Requisicao_Produto produtorequisitado) -> produtorequisitado.getProdRequisicao()
									.equals(produto.getProduct()))
							.findFirst().get();
				} catch (NoSuchElementException e) {
					Requisicao_Produto p = new Requisicao_Produto();
					p.setProdRequisicao(produto.getProduct());
					p.setProdFornecedor(produto.getFornecedor());
					p.setQuantity(0);
					p.setUnitPrice(BigDecimal.ZERO);
					requisicao.addProdutoRequisicao(p);
				}
			}
		}
		// controlerPedido.getRequisicao().getRequestedParts().addAll(lrp);
	}

	public List<Exception> validateSalvar(String valor, String frete, String descricao, LocalDate datapedido,
			LocalDate dataentrega, List<Requisicao_Produto> produtos) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateFrete(frete);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateValorTotal(valor);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
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
			validateDataEntrega(dataentrega);
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
				saveRequisicao(requisicao);
			} catch (Exception e) {
				System.out.println("Error: Failed to save WorkOrder - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	private void validateListaProdutos(List<Requisicao_Produto> produtos) throws Exception {
		if (produtos.isEmpty()) {
			throw new Exception("Pedido Sem Produtos");
		}
		for (Requisicao_Produto requisicao_Produto : produtos) {
			if (requisicao_Produto.getQuantity() == 0 || requisicao_Produto.getUnitPrice().doubleValue() == 0) {
				throw new Exception("Pedido Com Quantidade ou Valor nao informado");
			}
		}
		requisicao.setRequestedParts(produtos);
	}

	private void validateDataEntrega(LocalDate dataentrega) throws Exception {
		if (dataentrega != null) {
			if (!requisicao.getRequestDate().before(Date.valueOf(dataentrega))) {
				throw new Exception("Data prevista de entrega deve ser apos a data do pedido");
			}
			requisicao.setExpectedDeliveryDate(Date.valueOf(dataentrega));
		}
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

	private void validateFrete(String frete) throws Exception {
		String textM = frete;

		if (frete == null || frete.equals("")) {
			throw new Exception("Defina o Valor Total do Frete!");
		}

		textM = textM.trim();

		BigDecimal bigdecimalvalue;

		try {
			bigdecimalvalue = new BigDecimal(Double.parseDouble(textM));
		} catch (NumberFormatException e) {
			throw new Exception("Valor Total em formato inválido!");
		}

		if (bigdecimalvalue.doubleValue() < 0) {
			throw new Exception("Valor Total em valor negativo!");
		}

		bigdecimalvalue = bigdecimalvalue.setScale(2, RoundingMode.HALF_UP);
		requisicao.setFrete(bigdecimalvalue);
	}

	public void removeProduct(Requisicao_Produto product) {
		if (product.getRestante() == product.getQuantity() || product.getRestante() == null) {
			requisicao.removeProdutoRequisicao(product);
			Requisicao_ProductDAO r = new Requisicao_ProductDAO();
			r.delete(product);
			if (requisicao.getRequestedParts().size() == 0) {
				RequisicaoDAO del = new RequisicaoDAO();
				del.delete(requisicao);
			}
		}
	}

	public void editarRequisicao(Requisicao requisicao2) {
		this.requisicao = requisicao2;
		
	}

	public List<Requisicao_Produto> BuscaProdutosPedidos(Long id) {
		Requisicao_ProductDAO dao = new Requisicao_ProductDAO();

		return dao.listProdutosPedidos(id);
	}

	public List<PedidoFunc_Produto> BuscaProdutosPedidosFunc(Long id) {
		// TODO Auto-generated method stub
		PedidoFunc_ProductDAO dao = new PedidoFunc_ProductDAO();

		return dao.listProdutosPedidos(id);
	}

// ENDSECTION Controller to DAO Methods

}
