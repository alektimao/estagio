package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProvinceState
 *
 */
@Entity
public class Parametrizacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String token;
	private String codigodocliente;

	public Parametrizacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parametrizacao(Long id, String name, String token, String codigodocliente) {
		super();
		this.id = id;
		this.name = name;
		this.token = token;
		this.codigodocliente = codigodocliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getCodigodocliente() {
		return codigodocliente;
	}

	public void setCodigodocliente(String codigodocliente) {
		this.codigodocliente = codigodocliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
