package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private Date requestDate;
	private Date expectedDeliveryDate;
	@OneToMany(mappedBy = "prodRequisicao",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Requisicao_Produto> requisicao_Produtos;
	private String descricao;
	private BigDecimal priceTotal;
	private BigDecimal frete;
	private boolean pedidorecebido;
	private boolean aturorizar;

	public Requisicao() {
		super();
		requisicao_Produtos = new ArrayList<Requisicao_Produto>();
	}

	public Long getId() {
		return id;
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

	public boolean isAturorizar() {
		return aturorizar;
	}

	public void setAturorizar(boolean aturorizar) {
		this.aturorizar = aturorizar;
	}

	public void addProdutoRequisicao(Requisicao_Produto requisicao_Produto) {
		if (requisicao_Produtos.contains(requisicao_Produto))
			return;
		
		requisicao_Produtos.add(requisicao_Produto);
		requisicao_Produto.setRequisicao(this);
		
	}

	public void removeProdutoRequisicao(Requisicao_Produto requisicao_Produto) {
		if (!requisicao_Produtos.contains(requisicao_Produto))
			return;

		requisicao_Produtos.remove(requisicao_Produto);
		requisicao_Produto.setRequisicao(null);
		
	}

	public BigDecimal getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(BigDecimal priceTotal) {
		this.priceTotal = priceTotal;
	}
	

}
