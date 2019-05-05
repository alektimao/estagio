package br.com.maplebearsystem.model;

import br.com.maplebearsystem.model.ProvinceState;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: City
 *
 */
@Entity
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne
	private ProvinceState provinceState;

	public City() {
		super();
	}

	public City(Long id, String name, ProvinceState provinceState) {
		super();
		this.id = id;
		this.name = name;
		this.provinceState = provinceState;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProvinceState getProvinceState() {
		return provinceState;
	}

	public void setProvinceState(ProvinceState provinceState) {
		this.provinceState = provinceState;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof City) {
			City city = (City) obj;

			return (city.getId().equals(this.getId()) && city.getName().equals(this.getName()));
		}

		return false;
	}

	@Override
	public String toString() {
		return "" + this.name;
	}

	public String getCityAndProvinceStateAbbreviationText() {
		try {
			return "" + this.name + "/" + this.provinceState.getAbbreviation();
		} catch (Exception e) {
			return "";
		}
	}
}
