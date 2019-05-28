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
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: PartRequest
 *
 */
@Entity

public class Restricao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Aluno aluno;
	@OneToMany(mappedBy = "aliRest",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Restricao_Alimento> requisicao_Alimento;
	@OneToMany(mappedBy = "remRest",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Restricao_Remedio> requisicao_Remedio;

	public Restricao() {
		super();
		requisicao_Alimento = new ArrayList<Restricao_Alimento>();
		requisicao_Remedio = new ArrayList<Restricao_Remedio>();
	}

	public Long getId() {
		return id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public List<Restricao_Alimento> getRequisicao_Alimento() {
		return requisicao_Alimento;
	}

	public List<Restricao_Remedio> getRequisicao_Remedio() {
		return requisicao_Remedio;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setRequisicao_Alimento(List<Restricao_Alimento> requisicao_Alimento) {
		this.requisicao_Alimento = requisicao_Alimento;
	}

	public void setRequisicao_Remedio(List<Restricao_Remedio> requisicao_Remedio) {
		this.requisicao_Remedio = requisicao_Remedio;
	}
	
}
