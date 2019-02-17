package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.maplebearsystem.model.compositeid.FornecedorProdutoID;

/**
 * Entity implementation class for Entity: SoftwareOperator
 *
 */
@Entity
@IdClass(FornecedorProdutoID.class)
public class FornecedorProduto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "produtoID", referencedColumnName = "id")
	private Produto produto;
	@Id
	@ManyToOne
	@JoinColumn(name = "fornecedorID", referencedColumnName = "id")
	private Fornecedor fornecedor;
	private Integer quantity;
	private BigDecimal unitPrice;
	

	public FornecedorProduto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


}
