package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.EstoqueDAO;
import br.com.maplebearsystem.model.Estoque;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.validators.FieldValidators;


public class EstoqueController {

	private Estoque estoque;

	public EstoqueController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Estoque Methods

	public Estoque getEstoque() {
		return estoque;
	}

	public void setupEditEstoque(Estoque partProduct) {
		this.estoque = partProduct;

	}

	public void setupNewEstoque() {
		estoque = new Estoque();

	}

	public List<Exception> saveEstoque(Product produto, int qtd,int max, int min) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (estoque == null) {
			estoque = new Estoque();
		}

		try {
			setEstoque(qtd);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

//		try {
//			setEstoqueLote(lote);
//		} catch (Exception e) {
//			// TODO log user input exception
//			errorList.add(e);
//			System.out.println("Info:" + e.getMessage());
//		}

		try {
			setEstoqueMax(max);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setEstoqueMin(min);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setEstoqueProduto(produto);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		if (errorList.isEmpty()) {
			try {
				saveEstoque(this.estoque);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Produto Já cadastrado"));
				System.out.println("Info: Estoque \"" + estoque.getId()
						+ "\" already registered - " + e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	public void saveEstoque(Estoque Product) {
		EstoqueDAO dao = new EstoqueDAO();
		dao.save(Product);
	}

	public void deleteEstoque() {
		EstoqueDAO dao = new EstoqueDAO();
		dao.delete(estoque);

	}

	public void setEstoqueMax(int quantidade) throws Exception {

//		int value = Integer.parseInt(quantidade);
//		if (quantidade == null) {
////			throw new Exception("Campo Descrição Detalhada deve ser preenchido");
//			value = 0;
//		}
		//estoque.setMax(Integer.parseInt(quantidade));
		estoque.setMax(quantidade);
	}

	public void setEstoqueMin(int min) throws Exception {

//		int value = Integer.parseInt(min);
//		if (min == null) {
////			throw new Exception("Campo Descrição Detalhada deve ser preenchido");
//			value = 0;
//		}
		estoque.setMin(min);

	}

	public void setEstoqueLote(String lote) throws Exception {

		int value;
		try {
			value = Integer.parseInt(lote);
		} catch (NumberFormatException e) {
			throw new Exception("Formato do unidade inválido");
		}

		if (lote == null || !lote.equals("")) {
			// throw new Exception("Campo PartNumber deve ser preenchido");
			value = 0;
		}
		
		estoque.setLote(value);

	}

	public void setEstoque(int qtd) throws Exception {

//		int value;
//		try {
//			value = Integer.parseInt(qtd);
//		} catch (NumberFormatException e) {
//			throw new Exception("Formato do unidade inválido");
//		}
		
		estoque.setQtd(qtd);
	}

	public void setEstoqueProduto(Product produto) throws Exception {

		estoque.setProduct(produto);

	}

// ENDSECTION Estoque Methods

// SECTION Controller to DAO Methods

	public List<Estoque> getEstoques() {
		EstoqueDAO dao = new EstoqueDAO();

		return dao.listAllEstoque();
	}

	public List<Estoque> getEstoques(Product produto) {
		EstoqueDAO dao = new EstoqueDAO();

		return dao.listEstoque(produto);
	}

// ENDSECTION Controller to DAO Methods

}
