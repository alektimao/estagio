package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.FornecedorDAO;
import br.com.maplebearsystem.dao.FornecedorProductDAO;
import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.model.Fornecedor;
import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.model.validators.FieldValidators;

public class FornecedorController {

	private List<Product> produtos;
	private Fornecedor fornecedor;

	public FornecedorController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Product Methods

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public List<Product> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Product> produtos) {
		this.produtos = produtos;
	}

	public void setFornProdutos(List<FornecedorProduct> produtos) {
		for (FornecedorProduct fornecedorProduct : produtos) {
			this.produtos.add(fornecedorProduct.getProduct());
		}
	}

	public void setupEditFornecedor(Fornecedor Fornecedor) {
		this.fornecedor = Fornecedor;

	}

	public void setupNewFornecedor() {
		fornecedor = new Fornecedor();
		produtos = new ArrayList<Product>();
	}

	public void saveFornecedor(Fornecedor partProduct) {
		FornecedorDAO dao = new FornecedorDAO();
		dao.save(partProduct);
	}

	public void deleteFornecedor() {
		for (FornecedorProduct fornecedorProduct : getlistProdFornecedor(fornecedor.getId())) {
			FornecedorProductDAO d = new FornecedorProductDAO();
			d.delete(fornecedorProduct);
		}
		FornecedorDAO dao = new FornecedorDAO();
		dao.delete(fornecedor);

	}

	public List<Exception> validateSalvar(Fornecedor valor, List<Product> produtos) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateFornecedor(valor);
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
				saveFornecedor(fornecedor);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Fornecedor - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar Fornecedor"));
			}
		}
		return errList;
	}

// ENDSECTION Product Methods

// SECTION Controller to DAO Methods

	private void validateListaProdutos(List<Product> produtos2) {
		// TODO Auto-generated method stub

	}

	private void validateFornecedor(Fornecedor valor) {
		// TODO Auto-generated method stub

	}

	public List<Fornecedor> getlistFornecedor() {
		FornecedorDAO dao = new FornecedorDAO();

		return dao.listAllFornecedor();
	}

	public List<Fornecedor> getlistFornecedor(String filter) {
		FornecedorDAO dao = new FornecedorDAO();

		return dao.listFornecedor(filter);
	}

	public List<FornecedorProduct> getlistProdFornecedor(Long filter) {
		FornecedorProductDAO dao = new FornecedorProductDAO();

		return dao.listProdutosForn(filter);
	}

	public List<Product> getProducts() {
		ProductDAO dao = new ProductDAO();

		return dao.listAllProduct();
	}

	public List<Product> getProducts(String filter) {
		ProductDAO dao = new ProductDAO();

		return dao.listProduct(filter);
	}

	public void removeProduct(Product product) {
		produtos.remove(product);
	}

	public void validateListaProduto(List<Product> data) {

		List<Product> listaaux = new ArrayList<Product>();
		// fazer dentro da controler
		for (Product product : data) {
			Product p = new Product();
			p = (product);
			listaaux.add(p);
		}

		if (produtos == null || produtos.size() == 0) {
			produtos = listaaux;
		} else {
			for (Product produto : listaaux) {
				if (!produtos.contains(produto)) {
					produtos.add(produto);
				}
			}
		}
		// controlerPedido.getRequisicao().getRequestedParts().addAll(lrp);
	}

	public List<Exception> salvar(Fornecedor forne, List<Product> produtos) {
		List<Exception> errList = new ArrayList<Exception>();
		if (forne.getId() == null) {
			try {
				if (forne.getPessoa() != null) {
					FornecedorDAO fornecedor = new FornecedorDAO();
					forne.setNomefantasia(forne.getPessoa().getRazaoSocial());
					fornecedor.save(forne);
					
					if (produtos.size() > 0) {
						for (Product product : produtos) {
							FornecedorProduct fornecedorproduto = new FornecedorProduct();
							fornecedorproduto.setFornecedor(forne);
							fornecedorproduto.setProduct(product);
							FornecedorProductDAO fornecedorprod = new FornecedorProductDAO();
							fornecedorprod.save(fornecedorproduto);
						}
					}
					
				}
			} catch (Exception e) {
				errList.add(new Exception("Falha ao Salvar Fornecedor"));
			}
		}
		else
		{
			try {
				for (FornecedorProduct fornecedorProduct : getlistProdFornecedor(forne.getId())) {
					FornecedorProductDAO d = new FornecedorProductDAO();
					d.delete(fornecedorProduct);
				}
				if (produtos.size() > 0) {
					for (Product product : produtos) {
						FornecedorProduct fornecedor = new FornecedorProduct();
						fornecedor.setFornecedor(forne);
						fornecedor.setProduct(product);
						FornecedorProductDAO fornecedorprod = new FornecedorProductDAO();
						fornecedorprod.save(fornecedor);
					}
				}
			} catch (Exception e) {
				errList.add(new Exception("Falha ao Salvar os Produtos do Fornecedor"));
			}
		}
		return errList;
	}

// ENDSECTION Controller to DAO Methods

}
