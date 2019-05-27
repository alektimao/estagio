package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SoftwareOperator
 *
 */
@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private PessoaFisica pessoa;
	private String job;
	@Column(unique = true)
	private String login;
	private String psswdHash;
	@Enumerated(EnumType.STRING)
	private SoftwareOperatorLevel level;

	public Employee() {
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
		return psswdHash;
	}

	public SoftwareOperatorLevel getLevel() {
		return level;
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

	public void setPsswdHash(String psswdHash) {
		this.psswdHash = psswdHash;
	}

	public void setLevel(SoftwareOperatorLevel level) {
		this.level = level;
	}

	public enum SoftwareOperatorLevel {

		ADMINISTRATOR("Administrador"), TECHNICIAN("Técnico"), ATTENDANT("Atendente");

		String level;

		SoftwareOperatorLevel(String level) {
			this.level = level;
		}

		@Override
		public String toString() {
			return level;
		}
	}
}
