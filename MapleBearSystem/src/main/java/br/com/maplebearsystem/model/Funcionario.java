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
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private PessoaFisica pessoa;
	private String job;
	@Column(unique = true)
	private String login;
	private String senha;
	private Nivel nivel;
	private Date admissao;
	private Ativo ativo;

	public String getSenha() {
		return senha;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public Funcionario() {
		super();
	}

	public Long getId() {
		return id;
	}

	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public String getJob() {
		return job;
	}

	public String getLogin() {
		return login;
	}

	public String getPsswdHash() {
		return senha;
	}

	public Nivel getLevel() {
		return nivel;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setLevel(Nivel level) {
		this.nivel = level;
	}

	public enum NivelFuncionario {

		ADMINISTRATOR("Administrador"), PROFESSOR("Professor"), ATTENDANT("Atendente");

		String level;

		NivelFuncionario(String level) {
			this.level = level;
		}

		@Override
		public String toString() {
			return level;
		}
	}
}
