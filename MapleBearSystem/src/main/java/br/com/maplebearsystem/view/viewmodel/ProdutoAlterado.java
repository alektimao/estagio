package br.com.maplebearsystem.view.viewmodel;

import br.com.maplebearsystem.model.Product;

public class ProdutoAlterado {

	private Product produto;
	private int qtd;
	
	public Product getProduto() {
		return produto;
	}

	public int getQtd() {
		return qtd;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public ProdutoAlterado() {
		// TODO Auto-generated constructor stub
	}
	
	public ProdutoAlterado(Product produto, int qtd) {
		super();
		this.produto = produto;
		this.qtd = qtd;
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
			return produto.getStockQuantity();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
