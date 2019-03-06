package br.com.maplebearsystem.view.viewmodel;

import br.com.maplebearsystem.model.Product;

public class ProdutoAlterado {

	private Product produto;
	
	public Product getProduto() {
		return produto;
	}

	public int getQtd() {
		return produto.getEstoque().getQtd();
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public ProdutoAlterado() {
		// TODO Auto-generated constructor stub
	}
	
	public ProdutoAlterado(Product produto, int qtd, int max, int min) {
		super();
		this.produto = produto;
	}

	public int getMax() {
		return this.produto.getEstoque().getMax();
	}

	public int getMin() {
		return this.produto.getEstoque().getMin();
	}

	public Long getId()
	{
		try {
			return produto.getId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public String getShortDescription() {
		try {
			return produto.getShortDescription();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	public Integer getStockQuantity() {
		try {
			return produto.getEstoque().getQtd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
