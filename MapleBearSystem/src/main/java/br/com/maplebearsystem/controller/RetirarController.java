package br.com.maplebearsystem.controller;

import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.model.Requisicao;
import br.com.maplebearsystem.model.Requisicao_Produto;
import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.maplebearsystem.model.FornecedorProduct;
import br.com.maplebearsystem.model.Product;

public class RetirarController {

	private ProdutoAlterado produto;
	private ProductMovement retiramovimento;
	private List<Product> produtostabela;

	public RetirarController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public RetirarController(ProdutoAlterado requisicao, ProductMovement receber) {
		super();
		this.produto = requisicao;
		this.retiramovimento = receber;
	}

	public ProdutoAlterado getProduto() {
		return produto;
	}

	public ProductMovement getRetiramovimento() {
		return retiramovimento;
	}

	public List<Product> getProdutostabela() {
		return produtostabela;
	}

	public void setProduto(ProdutoAlterado produto) {
		this.produto = produto;
	}

	public void setRetiramovimento(ProductMovement retiramovimento) {
		this.retiramovimento = retiramovimento;
	}

	public void setProdutostabela(List<Product> produtostabela) {
		this.produtostabela = produtostabela;
	}

	public void setupNewRetirar() {
		produto = new ProdutoAlterado();
		retiramovimento = new ProductMovement();
		produtostabela = new ArrayList<Product>();
	}

	public void validateListaProduto(List<Product> data) {

		List<Product> listaaux = new ArrayList<Product>();
		// fazer dentro da controler
		for (Product product : data) {
			Product p = new Product();
			p = (product);
			listaaux.add(p);
		}

		if (produtostabela == null || produtostabela.size() == 0) {
			produtostabela = listaaux;
		} else {
			for (Product produto : listaaux) {
				if (!produtostabela.contains(produto))
				{
					produtostabela.add(produto);
				}
			}
		}
		// controlerPedido.getRequisicao().getRequestedParts().addAll(lrp);
	}
	public void addProduto(Product Produto) {
		if (produtostabela.contains(Produto))
			return;
		
		produtostabela.add(Produto);		
	}

	public List<ProdutoAlterado> InserereProdutoAlterado() {
		List<ProdutoAlterado> prodtabela = new ArrayList<ProdutoAlterado>();

		for (Product produtoAlterado : produtostabela) {
			prodtabela.add(new ProdutoAlterado(produtoAlterado, 0, produtoAlterado.getEstoque().getQtd()));
		}
		return prodtabela;
	}

}
