package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SoftwareOperator
 *
 */
@Entity
public class Estoque implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Product produto;
	private Date data;
	private int min;
	private int max;
	private int qtd;
	private int lote;

	public Estoque(Long id, Product produto, Date data, int min, int max, int qtd, int lote) {
		super();
		this.id = id;
		this.produto = produto;
		this.data = data;
		this.min = min;
		this.max = max;
		this.qtd = qtd;
		this.lote = lote;
	}

	public Estoque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return produto;
	}

	public void setProduct(Product produto) {
		this.produto = produto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
