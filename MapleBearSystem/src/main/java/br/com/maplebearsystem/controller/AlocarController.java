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
import br.com.maplebearsystem.dao.FuncionarioDAO;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.dao.Requisicao_ProductDAO;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Alocar_Produto;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Funcionario;
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
		List<Alocar_Produto> l = new ArrayList<Alocar_Produto>();
		AlocarDAO dao = new AlocarDAO();
		dao.save(Product);
		for (Alocar_Produto i : Product.getProdutos()) {
		    i.setAlocar(Product);
		    l.add(i);
		}
		Product.setProdutos(l);
		AlocarDAO d = new AlocarDAO();
		d.save(Product);
	}

	public void deleteAlocar() {
		AlocarDAO dao = new AlocarDAO();
		dao.delete(alocar);
	}
	public void deleteAlocar(Alocar alocar) {
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

	public void validateListaProduto(List<Product> data) {

		List<Alocar_Produto> lrp = new ArrayList<Alocar_Produto>();
		// fazer dentro da controler
		for (Product product : data) {
			Alocar_Produto p = new Alocar_Produto();
			p.setProdAlocar(product);
			p.setQuantity(0);
			lrp.add(p);
		}

		if (alocar.getProdutos() == null) {
			alocar.setProdutos(lrp);
		} else {
			for (Alocar_Produto requisicao_Produto : lrp) {
				alocar.addProdutoAlocar(requisicao_Produto);
			}
		}
		// controlerPedido.getAlocar().getRequestedParts().addAll(lrp);
	}

	public List<Exception> validateSalvar(String aula,String sala,String obs, LocalDate dtdevolver,LocalDate dtemprestimo, List<Alocar_Produto> produtos) {
		List<Exception> errList = new ArrayList<Exception>();
		
		try {
			validateAula(aula);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateSala(aula);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateData(dtemprestimo);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateDataEntrega(dtdevolver);
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
		try {
			validateFuncionario(alocar.getFuncionario());
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				alocar.setObs(!obs.equals("")? obs:"");
				saveAlocar(alocar);
			} catch (Exception e) {
				System.out.println("Error: Failed to save WorkOrder - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	private void validateFuncionario(Funcionario funcionario) throws Exception {
		if (funcionario == null) {
			throw new Exception("Emprestimo sem Funcionario");
		}
	}

	private void validateListaProdutos(List<Alocar_Produto> produtos) throws Exception {
		if (produtos.isEmpty()) {
			throw new Exception("Emprestimo Sem Produtos");
		}
		for (Alocar_Produto requisicao_Produto : produtos) {
			if (requisicao_Produto.getQtdemprestado() == 0) {
				throw new Exception("Emprestimo Com Quantidade não informado");
			}
		}
		alocar.setProdutos(produtos);
	}

	private void validateDataEntrega(LocalDate dataentrega) throws Exception {
		if (dataentrega == null) {
			throw new Exception("Data de devolução nao selecionada");
		}
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

	private void validateAula(String aula) {
		String text = aula;

		if (text == null) {
			text = "";
		}
		alocar.setAula(text);
	}
	
	private void validateSala(String sala) {
		String text = sala;

		if (text == null) {
			text = "";
		}
		alocar.setSala(text);
	}

	public void removeProduct(Alocar_Produto product) {
		//alocar.getProdutos().remove(product);
		//if (product.getQtddevolvido() == product.getQtdemprestado()) {
			alocar.removeProdutoAlocar(product);
			Alocar_ProductDAO r = new Alocar_ProductDAO();
			r.delete(product);
//			if (requisicao.getRequestedParts().size() == 0) {
//				RequisicaoDAO del = new RequisicaoDAO();
//				del.delete(requisicao);
//			}
		//}
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
