package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.AlocarDAO;
import br.com.maplebearsystem.dao.Alocar_ProductDAO;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Alocar_Produto;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.view.util.MaskedTextField;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Alocar_Produto;

public class AlocarController {

	private Alocar alocar;
	private Alocar_Produto alocar_produto;
	
	private MaskedTextField text;
	
	public AlocarController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {
		text = new MaskedTextField("(###)#####-####");
	}

// SECTION Alocar Methods

	public Alocar getAlocar() {
		return alocar;
	}

	public Alocar_Produto getAlocar_produto() {
		return alocar_produto;
	}

	public void setAlocar_produto(Alocar_Produto requisicao_produto) {
		this.alocar_produto = requisicao_produto;
	}

	public void setupEditAlocar(Alocar partProduct) {
		this.alocar = partProduct;

	}

	public void setupNewAlocar() {
		alocar = new Alocar();
		setAlocar_produto(new Alocar_Produto());
	}

	public List<Exception> tratarinfoAlocar(Alocar requisicao) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (requisicao == null) {
			requisicao = new Alocar();
		}
		try {
			setAlocarDataPedido(requisicao.getDia());
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		
		if (errorList.isEmpty()) {
			try {
				tratarinfoAlocar(this.alocar);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Emprestimo Já cadastrado"));
				System.out.println(
						"Info: Emprestimo \"" + requisicao.getId() + "\" already registered - " + e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	private void setAlocarDataPedido(Date requestDate) throws Exception {
		LocalDate localDateTime = LocalDate.now();
		if (requestDate == null || localDateTime == null) {
			throw new Exception("Data / Hora de abertura não definida");
		}
		try {
			if (alocar.getDia().toLocalDate().isBefore(localDateTime)) {
				throw new Exception("Data e hora de finalização do agendamento é anterior a data e hora agendada");
			}
		} catch (NullPointerException e) {
			System.out.println("Info: workDone date and time must be null - " + e.getMessage() + " - " + e.getCause());
		}
		alocar.setDia(requestDate);
	}

	public void saveAlocar(Alocar Product) {
		AlocarDAO dao = new AlocarDAO();
		dao.save(Product);
	}

	public void deleteAlocar() {
		AlocarDAO dao = new AlocarDAO();
		dao.delete(alocar);

	}

	// ENDSECTION Alocar Methods

// SECTION Controller to DAO Methods
	public List<Alocar> getPedidos() {
		AlocarDAO dao = new AlocarDAO();

		return dao.listAllAlocar();
	}

	public List<Alocar> getPedidos(String filter) {
		AlocarDAO dao = new AlocarDAO();

		return dao.listAlocar(filter);
	}

	public void validateListaProduto(List<FornecedorProduct> data) {

		List<Alocar_Produto> lrp = new ArrayList<Alocar_Produto>();
		// fazer dentro da controler
		for (FornecedorProduct product : data) {
			Alocar_Produto p = new Alocar_Produto();
			p.setProdAlocar(product.getProduct());
			p.setQuantity(0);
			lrp.add(p);
		}

		if (alocar.getProdutos() == null) {
			for (Alocar_Produto requisicao_Produto : lrp) {
				alocar.addProdutoAlocar(requisicao_Produto);
			}
		} else {
 
			for (FornecedorProduct produto : data) {
				Alocar_Produto query;
				try {
					query = alocar.getProdutos().stream()
							.filter((Alocar_Produto produtorequisitado) -> produtorequisitado.getProdAlocar()
									.equals(produto.getProduct()))
							.findFirst().get();
				}catch (NoSuchElementException e) {
					Alocar_Produto p = new Alocar_Produto();
					p.setProdAlocar(produto.getProduct());
					p.setQuantity(0);
					alocar.addProdutoAlocar(p);
				}
			}
		}
		// controlerPedido.getAlocar().getRequestedParts().addAll(lrp);
	}

	public List<Exception> validateSalvar(String valor, String descricao, LocalDate datapedido,
			LocalDate dataentrega, List<Alocar_Produto> produtos) {
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
				saveAlocar(alocar);
			} catch (Exception e) {
				System.out.println("Error: Failed to save WorkOrder - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar Ordem de Serviço"));
			}
		}
		return errList;
	}

	private void validateListaProdutos(List<Alocar_Produto> produtos) throws Exception {
		if (produtos.isEmpty()) {
			throw new Exception("Emprestimo Sem Produtos");
		}
		alocar.setProdutos(produtos);
	}

	private void validateDataEntrega(LocalDate dataentrega) throws Exception {
		if (dataentrega != null) {
			if (!alocar.getDia().before(Date.valueOf(dataentrega))) {
				throw new Exception("Data de devolução deve ser apos a data do emprestimo");
			}
		}
		alocar.setDevolucao(Date.valueOf(dataentrega));
	}

	private void validateData(LocalDate datapedido) throws Exception {
		if (datapedido == null) {
			throw new Exception("Data do Emprestimo não selecionada");
		}
		if (datapedido.getDayOfYear() < 19) {
			throw new Exception("Data do Emprestimo inválida");
		}
		alocar.setDia(Date.valueOf(datapedido));
	}

	private void validateDescricao(String descricao) {
		String text = descricao;

		if (text == null) {
			text = "";
		}
		alocar.setObs(text);
	}

	public void removeProduct(Alocar_Produto product) {
		alocar.getProdutos().remove(product);
	}

	public void editarAlocar(Alocar requisicao2) {
		this.alocar = requisicao2;
		
	}

	public List<Alocar_Produto> BuscaProdutosPedidos(Long id) {
		Alocar_ProductDAO dao = new Alocar_ProductDAO();
		return dao.listProdutosPedidos(id);
	}

// ENDSECTION Controller to DAO Methods

}
