package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Entity implementation class for Entity: RequestedPart
 *
 */
@Entity
public class Requisicao_Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "RequisicaoID", referencedColumnName = "id")
	private Requisicao requisicao;
	@ManyToOne
	@JoinColumn(name = "produtoRequisicaoID", referencedColumnName = "id")
	private Product prodRequisicao;
	@ManyToOne
	@JoinColumn(name = "produtoFornecedorID", referencedColumnName = "id")
	private Fornecedor prodFornecedor;
	private Integer quantity;
	private Integer recebido;
	private Integer restante;
	private BigDecimal unitPrice;
	private BigDecimal priceTotal;
	private boolean produtorecebido;

	public Requisicao_Produto() {
	}

	public Long getId() {
		return id;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public Product getProdRequisicao() {
		return prodRequisicao;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	
	private boolean sameAsFormer(Requisicao novo) {
		return this.requisicao == null ? novo == null : this.requisicao.equals(novo);
	}

	public void setRequisicao(Requisicao requisicao) {
		if (sameAsFormer(requisicao))
			return;
		// set new work
		Requisicao old = this.requisicao;
		this.requisicao = requisicao;
		// remove from the old work
		if (old != null)
			old.removeProdutoRequisicao(this);
		// set myself into new work
		if (requisicao != null)
			requisicao.addProdutoRequisicao(this);
	}

	public void setProdRequisicao(Product prodRequisicao) {
		this.prodRequisicao = prodRequisicao;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(BigDecimal priceTotal) {
		this.priceTotal = priceTotal;
	}

	public boolean isProdutorecebido() {
		return produtorecebido;
	}

	public void setProdutorecebido(boolean produtorecebido) {
		this.produtorecebido = produtorecebido;
	}

	public Fornecedor getProdFornecedor() {
		return prodFornecedor;
	}

	public void setProdFornecedor(Fornecedor prodFornecedor) {
		this.prodFornecedor = prodFornecedor;
	}

	public Integer getRecebido() {
		return recebido;
	}

	public Integer getRestante() {
		return restante;
	}

	public void setRecebido(Integer recebido) {
		this.recebido = recebido;
	}

	public void setRestante(Integer restante) {
		this.restante = restante;
	}
	
}
