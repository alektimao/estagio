package br.com.maplebearsystem.model;

import br.com.maplebearsystem.model.Pessoa;
import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity

public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cpf;
	private String rg;
	private Date birthDate;

	public PessoaFisica() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param enabled
	 * @param email
	 * @param adresses
	 * @param phones
	 * @param cpf
	 * @param rg
	 * @param birthDate
	 */
	public PessoaFisica(Long id, String name, boolean enabled, String email, List<Address> adresses, List<Phone> phones,
			String cpf, String rg, Date birthDate) {
		super(id, name, enabled, email, adresses, phones);
		this.cpf = cpf;
		this.rg = rg;
		this.birthDate = birthDate;
	}

	/**
	 * @param address    - Address entity class that will be inseted as the first
	 *                  Address in Address list.
	 * @param phone     - Phone entity class that will be inseted as the first phone
	 *                  in phones list.
	 * @param cpf		- <b>C</b>adastro de <b>P</b>essoa <b>F</b>ísica
	 * @param rg
	 */
	public PessoaFisica(Long id, String name, boolean enabled, String email, Address address, Phone phone, String cpf,
			String rg, Date birthDate) {
		super(id, name, enabled, email, address, phone);
		this.cpf = cpf;
		this.rg = rg;
		this.birthDate = birthDate;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String getPessoaCNumber() {
		return cpf;
	}
	
	
}
