package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: PartProductMovement
 *
 */
@Entity
//@IdClass(PartProductMovementID.class)
public class ProductMovement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	@ManyToOne
//	@JoinColumn(name = "partProductID", referencedColumnName = "id")
	private Product produto;
//	@Id
	@ManyToOne
//	@JoinColumn(name = "paymentID", referencedColumnName = "id")
	private Requisicao pedido;
	private Date date;
	private Integer recebido;
	private Integer restante;
	private String description;
	
	
	public ProductMovement() {
		super();
	}


	public ProductMovement(Long id, Product produto, Requisicao pedido, Date date, Integer recebido,Integer restante,
			String description) {
		super();
		this.id = id;
		this.produto = produto;
		this.pedido = pedido;
		this.date = date;
		this.recebido = recebido;
		this.restante = restante;
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public Product getProduto() {
		return produto;
	}


	public Requisicao getPedido() {
		return pedido;
	}


	public Date getDate() {
		return date;
	}


	public Integer getRecebido() {
		return recebido;
	}
	
	public Integer getRestante() {
		return restante;
	}

	public String getDescription() {
		return description;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setProduto(Product produto) {
		this.produto = produto;
	}


	public void setPedido(Requisicao pedido) {
		this.pedido = pedido;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public void setRecebido(Integer recebido) {
		this.recebido = recebido;
	}
	
	public void setRestante(Integer restante) {
		this.restante = restante;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
