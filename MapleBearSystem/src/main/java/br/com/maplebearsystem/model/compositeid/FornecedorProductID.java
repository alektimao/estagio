package br.com.maplebearsystem.model.compositeid;

import java.io.Serializable;

public class FornecedorProductID implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long produto;
	private Long fornecedor;

	public FornecedorProductID() {
		super();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof FornecedorProductID) {
			FornecedorProductID objIDclass = (FornecedorProductID) obj;

			return objIDclass.getProduto().longValue() == produto.longValue()
					&& objIDclass.getFornecedor().longValue() == fornecedor.longValue();
		}

		return false;
	}

	@Override
	public int hashCode() {
		return (int) (produto + fornecedor);
	}

	public Long getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Long Fornecedor) {
		this.fornecedor = Fornecedor;
	}

	public Long getProduto() {
		return produto;
	}

	public void setProduto(Long Produto) {
		this.produto = Produto;
	}

}