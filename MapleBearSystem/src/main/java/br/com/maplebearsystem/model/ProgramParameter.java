package br.com.maplebearsystem.model;

import br.com.maplebearsystem.model.Employee;
import br.com.maplebearsystem.model.PessoaJuridica;
import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProgramParameter
 *
 */
@Entity
public class ProgramParameter implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private PessoaJuridica organization;
	@OneToOne
	private Employee administrator;

	public ProgramParameter() {
		
	}

	public Long getId() {
		return this.id;
	}

	public PessoaJuridica getOrganization() {
		return this.organization;
	}

	public Employee getAdministrator() {
		return this.administrator;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOrganization(PessoaJuridica organization) {
		this.organization = organization;
	}

	public void setAdministrator(Employee administrator) {
		this.administrator = administrator;
	}

}
