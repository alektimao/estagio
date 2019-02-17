package br.com.maplebearsystem.model;

import br.com.maplebearsystem.model.Pessoa;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
public class PessoaJuridica extends Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String cnpj;
	private String iestadual;
	private String imunicipal;
	private String razaoSocial;
	private String contactName;
	
	public PessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getIestadual() {
		return iestadual;
	}

	public String getImunicipal() {
		return imunicipal;
	}

	public String getContactName() {
		return contactName;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setIestadual(String iestadual) {
		this.iestadual = iestadual;
	}

	public void setImunicipal(String imunicipal) {
		this.imunicipal = imunicipal;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Override
	public String getPessoaCNumber() {
		return cnpj;
	}
	
}
