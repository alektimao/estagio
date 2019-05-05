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
	private String addressNumber;
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

	public String getAddress() {
		return address;
	}

	public String getAddressComplement() {
		return addressComplement;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public City getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public Long getId() {
		return this.id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private boolean sameAsFormer(Pessoa newObject) {
		return this.pessoa == null ? newObject == null : this.pessoa.equals(newObject);
	}

	public void setPessoa(Pessoa pessoa) {
		if (sameAsFormer(pessoa))
			return;
		// set new work
		Pessoa old = this.pessoa;
		this.pessoa = pessoa;
		// remove from the old work
		if (old != null)
			old.removeAddress(this);
		// set myself into new work
		if (pessoa != null)
			pessoa.addAddress(this);
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddressAndNumberAndDistrictText() {
		try {
			return "" + this.address + ", Nº: " + this.addressNumber + ", " + this.district;
		} catch (Exception e) {
			return "";
		}
	}

	@Override
	public String toString() {
		try {
			String extra = (addressComplement == null || addressComplement.equals("") ? ""
					: " Complemento: " + addressComplement);

			String number = addressNumber == null || addressNumber.equals("") ? "" : ", Nº: " + addressNumber;

			return "" + address + number + " - " + city.getName() + "/" + city.getProvinceState().getAbbreviation()
					+ " - " + "CEP: " + postalCode + extra;
		} catch (Exception e) {
			return "";
		}
	}

	public String getAddressAndNumber() {
		try {
			String number = addressNumber == null || addressNumber.equals("") ? "" : ", Nº: " + addressNumber;

			return "" + address + number;
		} catch (Exception e) {
			return "";
		}
	}

}
