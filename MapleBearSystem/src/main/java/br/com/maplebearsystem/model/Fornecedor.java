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
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private PessoaJuridica pessoa;
	private String nomefantasia;
	
	public Fornecedor(Long id, PessoaJuridica pessoa, String nomefantasia) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.nomefantasia = nomefantasia;
	}
	public Fornecedor() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PessoaJuridica getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaJuridica pessoa) {
		this.pessoa = pessoa;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
