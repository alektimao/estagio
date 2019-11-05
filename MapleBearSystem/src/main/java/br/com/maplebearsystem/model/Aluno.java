package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;

/**
 * Entity implementation class for Entity: PartProduct
 *
 */
@Entity
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer idalunowebservice;
	private String nome;
	private String cpf;
	private String rg;
	private String numeromatricula;
	private Date datanascimento;
	private String TurmaAtual;
	private String responsavel;
	private String responsavel2;
	private String endereco;
	private String numeroendereco;
	private String cep;
	private String cidade;

//	public Aluno(Long id, Integer idalunowebservice, String nome, String cpf, String rg, String numeromatricula,
//			Date datanascimento, String turmaAtual) {
//		super();
//		this.id = id;
//		this.idalunowebservice = idalunowebservice;
//		this.nome = nome;
//		this.cpf = cpf;
//		this.rg = rg;
//		this.numeromatricula = numeromatricula;
//		this.datanascimento = datanascimento;
//		TurmaAtual = turmaAtual;
//	}
	
	public Aluno(Long id, Integer idalunowebservice, String nome, String cpf, String rg, String numeromatricula,
			Date datanascimento, String turmaAtual, String responsavel, String responsavel2, String endereco,
			String numeroendereco, String cep, String cidade) {
		super();
		this.id = id;
		this.idalunowebservice = idalunowebservice;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.numeromatricula = numeromatricula;
		this.datanascimento = datanascimento;
		TurmaAtual = turmaAtual;
		this.responsavel = responsavel;
		this.responsavel2 = responsavel2;
		this.endereco = endereco;
		this.numeroendereco = numeroendereco;
		this.cep = cep;
		this.cidade = cidade;
	}

	public Aluno () {
		super();	
	}

	public Long getId() {
		return id;
	}

	public Integer getIdalunowebservice() {
		return idalunowebservice;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getNumeromatricula() {
		return numeromatricula;
	}

	public Date getDatanascimento() {
		return datanascimento;
	}

	public String getTurmaAtual() {
		return TurmaAtual;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setIdalunowebservice(Integer idalunowebservice) {
		this.idalunowebservice = idalunowebservice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setNumeromatricula(String numeromatricula) {
		this.numeromatricula = numeromatricula;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public void setTurmaAtual(String turmaAtual) {
		TurmaAtual = turmaAtual;
	}
	

	public String getResponsavel() {
		return responsavel;
	}
	public String getResponsavel2() {
		return responsavel2;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNumeroendereco() {
		return numeroendereco;
	}
	public String getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public void setResponsavel2(String responsavel2) {
		this.responsavel2 = responsavel2;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setNumeroendereco(String numeroendereco) {
		this.numeroendereco = numeroendereco;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj instanceof Aluno) {
			Aluno new_name = (Aluno) obj;
			if (this.id.equals(new_name.getId())) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
