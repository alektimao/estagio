package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.com.maplebearsystem.model.compositeid.FornecedorProductID;

/**
 * Entity implementation class for Entity: SoftwareOperator
 *
 */
@Entity
//@IdClass(FornecedorProductID.class)
public class FornecedorProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
//	@Id
	@ManyToOne
//	@JoinColumn(name = "produtoID", referencedColumnName = "id")
	private Product produto;
//	@Id
	@ManyToOne
//	@JoinColumn(name = "fornecedorID", referencedColumnName = "id")
	private Fornecedor fornecedor;
	private Integer quantity;
	private BigDecimal unitPrice;
	

	public FornecedorProduct() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product getProduct() {
		return produto;
	}


	public void setProduct(Product produto) {
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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	


}
