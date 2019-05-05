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
public class Interessados implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date data;
	private String nome;
	private String telefone1;
	private String telefone2;
	private String email1;
	private String email2;
	private String motivo;

	public Interessados(Date data, String nome, String telefone1, String telefone2, String email1, String email2,
			String motivo) {
		super();
		this.data = data;
		this.nome = nome;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email1 = email1;
		this.email2 = email2;
		this.motivo = motivo;
	}

	public Interessados() {
		super();
	}

	public Date getData() {
		return data;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public String getEmail1() {
		return email1;
	}

	public String getEmail2() {
		return email2;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
