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

public class Restricao_Remedio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "RestricaoRemedioID", referencedColumnName = "id")
	private Restricao remRest;
	private String Gravidade;
	private String Posologia;
	private String Remedio;
	private String Dosagem;
	private String Plano;
	private String sintomas;
	private String condutas;
	private Date de;
	private Date ate;

	public Restricao_Remedio() {
		super();
	}
	
	private boolean sameAsFormer(Restricao novo) {
		return this.remRest == null ? novo == null : this.remRest.equals(novo);
	}

	public void setRequisicao(Restricao requisicao) {
		if (sameAsFormer(requisicao))
			return;
		// set new work
		Restricao old = this.remRest;
		this.remRest = requisicao;
		// remove from the old work
		if (old != null)
			old.removeRestricaoRemedio(this);
		// set myself into new work
		if (requisicao != null)
			requisicao.addRestricaoRemedio(this);
	}

	public Long getId() {
		return id;
	}

	public Restricao getRemRest() {
		return remRest;
	}

	public String getGravidade() {
		return Gravidade;
	}

	public String getPosologia() {
		return Posologia;
	}

	public String getRemedio() {
		return Remedio;
	}

	public String getDosagem() {
		return Dosagem;
	}

	public String getPlano() {
		return Plano;
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

	public void setRemRest(Restricao remRest) {
		this.remRest = remRest;
	}

	public void setGravidade(String gravidade) {
		Gravidade = gravidade;
	}

	public void setPosologia(String posologia) {
		Posologia = posologia;
	}

	public void setRemedio(String remedio) {
		Remedio = remedio;
	}

	public void setDosagem(String dosagem) {
		Dosagem = dosagem;
	}

	public void setPlano(String plano) {
		Plano = plano;
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
	
	
}
