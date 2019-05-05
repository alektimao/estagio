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
public class Alocar_Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "AlocarID", referencedColumnName = "id")
	private Alocar alocar;
	@ManyToOne
	@JoinColumn(name = "produtoAlocarID", referencedColumnName = "id")
	private Product prodAlocar;
	private Integer quantity;
	private boolean atraso;

	public Alocar_Produto() {
	}

	public Alocar_Produto(Long id, Alocar alocar, Product prodAlocar, Integer quantity, boolean atraso) {
		super();
		this.id = id;
		this.alocar = alocar;
		this.prodAlocar = prodAlocar;
		this.quantity = quantity;
		this.atraso = atraso;
	}

	public Long getId() {
		return id;
	}

	public Alocar getAlocar() {
		return alocar;
	}

	public Product getProdAlocar() {
		return prodAlocar;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public boolean isAtraso() {
		return atraso;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private boolean sameAsFormer(Alocar novo) {
		return this.alocar == null ? novo == null : this.alocar.equals(novo);
	}
	
	public void setAlocar(Alocar requisicao) {
		if (sameAsFormer(requisicao))
			return;
		// set new work
		Alocar old = this.alocar;
		this.alocar = requisicao;
		// remove from the old work
		if (old != null)
			old.removeProdutoAlocar(this);
		// set myself into new work
		if (requisicao != null)
			requisicao.addProdutoAlocar(this);
	}

	public void setProdAlocar(Product prodAlocar) {
		this.prodAlocar = prodAlocar;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setAtraso(boolean atraso) {
		this.atraso = atraso;
	}

}