package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: SoftwareOperator
 *
 */
@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipo;
	private String nome;
	
//	@ManyToMany(
//			targetEntity = Alocar.class, 
//			fetch = FetchType.LAZY)
//	private List<Alocar> acalocacoes;

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(Long id, String tipo, String nome, Alocar alocar) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
