package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Telephone
 *
 */
@Entity
public class Phone implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false)
	private Pessoa pessoa;
	private Integer ddd;
	private Integer number;
	private String telcomCompany;

	private PhoneType type;

	public Phone() {
		super();
	}

	public Phone(Long id, Pessoa pessoa, Integer ddd, Integer number, String telcomCompany) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.ddd = ddd;
		this.number = number;
		this.telcomCompany = telcomCompany;
	}

	public Integer getDdd() {
		return ddd;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getNumber() {
		return number;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public String getPhoneStringWithoutFormat() {
		String phoneString = "";
		
		try {
			return phoneString + String.format("%2d%d",ddd.intValue(), number.intValue());
		} catch (Exception e) {
			return phoneString;
		}
	}
	
	public String getPhoneString() {
		String phoneString = "";
		
		try {
			return phoneString + String.format("(%2d) %d",ddd.intValue(), number.intValue());
		} catch (Exception e) {
			return phoneString;
		}
	}

	public String getTelcomCompany() {
		return telcomCompany;
	}

	public PhoneType getType() {
		return type;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setTelcomCompany(String telcomCompany) {
		this.telcomCompany = telcomCompany;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return getPhoneString() + ", " + telcomCompany + ", " + type;
	}
	
	public enum PhoneType {

		RESIDENTIAL("Residencial"), COMMERCIAL("Comercial"), CELLPHONE("Celular"), OTHERS("Outros");

		String type;

		PhoneType(String method) {
			this.type = method;
		}

		@Override
		public String toString() {
			return type;
		}

	}

}
