package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;

/**
 * Entity implementation class for Entity: PartProduct
 *
 */
@Entity
public class SalaMultiUso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeatividade;
	private String responsavelativade;
	private String diadasemana;
	private String de;
	private String ate;
	private String info;
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<TurmaPersonalizada> turma;

	public SalaMultiUso() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeatividade() {
		return nomeatividade;
	}

	public String getResponsavelativade() {
		return responsavelativade;
	}

	public String getDiadasemana() {
		return diadasemana;
	}

	public String getDe() {
		return de;
	}

	public String getAte() {
		return ate;
	}

	public String getInfo() {
		return info;
	}

	public List<TurmaPersonalizada> getTurma() {
		return turma;
	}

	public void setNomeatividade(String nomeatividade) {
		this.nomeatividade = nomeatividade;
	}

	public void setResponsavelativade(String responsavelativade) {
		this.responsavelativade = responsavelativade;
	}

	public void setDiadasemana(String diadasemana) {
		this.diadasemana = diadasemana;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public void setAte(String ate) {
		this.ate = ate;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setTurma(List<TurmaPersonalizada> turma) {
		this.turma = turma;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof SalaMultiUso) {
			SalaMultiUso new_name = (SalaMultiUso) obj;
			if (this.id.equals(new_name.getId())) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
