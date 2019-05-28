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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: PartRequest
 *
 */
@Entity

public class Restricao_Alimento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "RestricaoAlimentoID", referencedColumnName = "id")
	private Restricao aliRest;
	private String Gravidade;
	private String Alimento;
	private String sintomas;
	private String condutas;
	private Date de;
	private Date ate;

	public Restricao_Alimento() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getGravidade() {
		return Gravidade;
	}

	public String getSintomas() {
		return sintomas;
	}

	public String getCondutas() {
		return condutas;
	}

	public Date getDe() {
		return de;
	}

	public Date getAte() {
		return ate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setGravidade(String gravidade) {
		Gravidade = gravidade;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public void setCondutas(String condutas) {
		this.condutas = condutas;
	}

	public void setDe(Date de) {
		this.de = de;
	}

	public void setAte(Date ate) {
		this.ate = ate;
	}

	public Restricao getAliRest() {
		return aliRest;
	}

	public void setAliRest(Restricao aliRest) {
		this.aliRest = aliRest;
	}

	public String getAlimento() {
		return Alimento;
	}

	public void setAlimento(String alimento) {
		Alimento = alimento;
	}
	
}
