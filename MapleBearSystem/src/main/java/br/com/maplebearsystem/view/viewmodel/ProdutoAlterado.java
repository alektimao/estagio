package br.com.maplebearsystem.view.viewmodel;

import br.com.maplebearsystem.model.Product;

public class ProdutoAlterado {

	private Product produto;
	private int retirar;
	private int restante;
	
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
	
	
	public int getRetirar() {
		return retirar;
	}

	public int getRestante() {
		return restante;
	}

	public void setRetirar(int retirar) {
		this.retirar = retirar;
	}

	public void setRestante(int restante) {
		this.restante = restante;
	}

	public ProdutoAlterado(Product produto, int retirar, int restante) {
		super();
		this.produto = produto;
		this.restante = restante;
		this.retirar = retirar;
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
