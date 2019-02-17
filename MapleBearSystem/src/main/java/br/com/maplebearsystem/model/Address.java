package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Address
 *
 */
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "PESSOA_ID", nullable = false)
	private Pessoa pessoa;
	private String district;
	private String address;
	private String addressComplement;
	private String postalCode;
	@ManyToOne
	private City city;

	public Address() {

	}

	public Address(Long id, Pessoa pessoa, String adress, City city) {
		this.id = id;
		this.pessoa = pessoa;
		this.address = adress;
		this.city = city;
	}

	public Long getId() {
		return this.id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String getAddress() {
		return address;
	}

	public String getDistrict() {
		return district;
	}

	public String getAddressComplement() {
		return addressComplement;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public City getCity() {
		return city;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		String extra = ((addressComplement.equals("") || addressComplement == null) ? ""
				: " Complemento: " + addressComplement);

		return "" + address + " - " + city.getName() + "/" + city.getProvinceState().getAbbreviation() + " - "
				+ "CEP: " + postalCode + extra;
	}

}
