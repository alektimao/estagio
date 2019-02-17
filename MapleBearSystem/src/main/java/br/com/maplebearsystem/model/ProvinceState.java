package br.com.maplebearsystem.model;

import br.com.maplebearsystem.model.Federation;
import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProvinceState
 *
 */
@Entity
public class ProvinceState implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String abbreviation;

	@ManyToOne
	private Federation federation;

	public ProvinceState() {
		super();
	}

	public ProvinceState(Long id, String name, String abbreviation, Federation federation) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.federation = federation;
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

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Federation getFederation() {
		return this.federation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public void setFederation(Federation federation) {
		this.federation = federation;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof ProvinceState) {
			ProvinceState state = (ProvinceState) obj;
			return (state.getId().equals(this.getId()) && state.getName().equals(this.getName())
					&& state.getAbbreviation().equals(this.getAbbreviation()));

		}

		return false;

	}

	@Override
	public String toString() {
		return "" + this.name + " (" + this.abbreviation + ")";
	}
}
