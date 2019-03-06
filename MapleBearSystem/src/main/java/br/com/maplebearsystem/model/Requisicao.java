package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: PartRequest
 *
 */
@Entity

public class Requisicao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Fornecedor fornecedor;
	private Date requestDate;
	private Date expectedDeliveryDate;
	@OneToMany(mappedBy = "prodRequisicao", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Requisicao_Produto> requisicao_Produtos;
	private String descricao;
	private BigDecimal frete;
	private boolean pedidorecebido;

	public Requisicao() {
		super();
	}

	public Long getId() {
		return id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public Date getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public List<Requisicao_Produto> getRequestedParts() {
		return requisicao_Produtos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public void setRequestedParts(List<Requisicao_Produto> requisicao_Produtos) {
		this.requisicao_Produtos = requisicao_Produtos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public boolean isPedidorecebido() {
		return pedidorecebido;
	}

	public void setPedidorecebido(boolean pedidorecebido) {
		this.pedidorecebido = pedidorecebido;
	}

}
