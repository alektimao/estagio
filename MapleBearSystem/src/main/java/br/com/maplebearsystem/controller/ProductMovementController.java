package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.EstoqueDAO;
import br.com.maplebearsystem.dao.FornecedorProductDAO;
import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.dao.ProductMovementDAO;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.view.FXMLLoginController;

public class ProductMovementController {

	private ProductMovement movimento;

	public ProductMovementController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Product Methods

	public ProductMovement getProductMovement() {
		return movimento;
	}

	public void setupEditProduct(ProductMovement movimento) {
		this.movimento = movimento;

	}

	public void setupNewProductMovement() {
		movimento = new ProductMovement();
	}

	public List<Exception> saveProductMovement(String description, Requisicao pedido, LocalDate date, Product produto,
			Integer recebido, Integer restante, Long func) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (movimento == null) {
			movimento = new ProductMovement();
		}
		try {
			setProductDescription(description);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setPedido(pedido);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setData(date);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setProduto(produto);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setEstoque(recebido);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setRecebido(recebido);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setRestante(restante);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setFunc(func);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		return errorList;
	}

	public List<Exception> saveMovimento(ProductMovement movimento) {
		List<Exception> errorList = new ArrayList<Exception>();
		try {
			ProductMovementDAO dao = new ProductMovementDAO();
			dao.save(movimento);
			EstoqueDAO prodestoque = new EstoqueDAO();
			prodestoque.save(movimento.getProduto().getEstoque());
			
		} catch (Exception e) {
			errorList.add(new Exception("Erro ao salvar verifique as informações e tente novamente"));
		}
		return errorList;
	}
	
	public List<Exception> SalvarMovimentoaoSalvarRecebimento(ProductMovement mov) {
		return saveMovimento(mov);
	}

	public void setProductDescription(String description) throws Exception {

//		if (description == null || description.equals("")) {
//			throw new Exception("Campo Descrição deve ser preenchido");
//		}

		movimento.setDescription(description);

	}

	public void setData(LocalDate date) throws Exception {

//		if (date == null) {
//			date = LocalDate.now();
//		}
		movimento.setDate(Date.valueOf(date));
	}

	public void setRestante(Integer restante) throws Exception {

//		if (restantes == null || restantes <=0) {
//			// throw new Exception("Campo PartNumber deve ser preenchido");
//			throw new Exception("Quantidade resteante de produto Inválido");
//		}
		movimento.setRestante(restante);
	}
	public void setFunc(Long func) throws Exception {
		if(func == null) {
			func = FXMLLoginController.logado.getId();
		}
		movimento.setFuncionario(func);
	}

	public void setRecebido(Integer recebido) throws Exception {
		movimento.setRecebido(recebido);
	}

	public void setPedido(Requisicao pedido) throws Exception {
		movimento.setPedido(pedido);
	}

	public void setProduto(Product produto) throws Exception {
		movimento.setProduto(produto);
	}

	public void setEstoque(Integer estoque) throws Exception {
		//EstoqueDAO prodestoque = new EstoqueDAO();
		Integer quantidade = movimento.getProduto().getEstoque().getQtd();
		movimento.getProduto().getEstoque().setQtd(estoque + quantidade);
		//prodestoque.save(movimento.getProduto().getEstoque());
	}

// ENDSECTION Product Methods

// SECTION Controller to DAO Methods

	public List<Product> getProducts() {
		ProductDAO dao = new ProductDAO();

		return dao.listAllProduct();
	}

	public List<Product> getProducts(String filter) {
		ProductDAO dao = new ProductDAO();

		return dao.listProduct(filter);
	}

// ENDSECTION Controller to DAO Methods

}
