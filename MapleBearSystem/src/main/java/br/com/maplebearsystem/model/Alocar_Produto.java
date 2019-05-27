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
	private Integer qtdemprestado;
	private Integer qtddevolvido;

	public Alocar_Produto() {
	}

	public Alocar_Produto(Long id, Alocar alocar, Product prodAlocar, Integer quantity,Integer devolvido) {
		super();
		this.id = id;
		this.alocar = alocar;
		this.prodAlocar = prodAlocar;
		this.qtdemprestado = quantity;
		this.qtddevolvido = quantity;
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
		return qtdemprestado;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Integer getQtdemprestado() {
		if (qtdemprestado == null) {
			return 0;
		}
		return qtdemprestado;
	}

	public Integer getQtddevolvido() {
		if (qtddevolvido == null) {
			return 0;
		}
		return qtddevolvido;
	}

	public void setQtdemprestado(Integer qtdemprestado) {
		this.qtdemprestado = qtdemprestado;
	}

	public void setQtddevolvido(Integer qtddevolvido) {
		this.qtddevolvido = qtddevolvido;
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
		this.qtdemprestado = quantity;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//		}
//		
//		if (obj instanceof Alocar_Produto) {
//			Alocar_Produto new_name = (Alocar_Produto) obj;
//			if (this.id.equals(new_name.getId())) {
//				return true;
//			}
//		}
//		return super.equals(obj);
//	}

}