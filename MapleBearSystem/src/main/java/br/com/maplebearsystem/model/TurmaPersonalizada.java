package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;

/**
 * Entity implementation class for Entity: PartProduct
 *
 */
@Entity
public class TurmaPersonalizada implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nometurma;
	private String responsavel;
	private String periodo;
	private String info;
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Aluno> alunos;
	@ElementCollection(fetch = FetchType.LAZY, targetClass = WeekDays.class) 
	@Enumerated(EnumType.STRING) 
	@Column(name = "WeekDays", length = 30) 
	private	List<WeekDays> diasDaSemana;

	public TurmaPersonalizada() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNometurma() {
		return nometurma;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public String getPeriodo() {
		return periodo;
	}

	public String getInfo() {
		return info;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setNometurma(String nometurma) {
		this.nometurma = nometurma;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public void removeAlunos(Aluno aluno) {
		if (!alunos.contains(aluno))
			return;

		alunos.remove(aluno);
	}

	public List<WeekDays> getDiasDaSemana() {
		return diasDaSemana;
	}

	public void setDiasDaSemana(List<WeekDays> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof TurmaPersonalizada) {
			TurmaPersonalizada new_name = (TurmaPersonalizada) obj;
			if (this.id.equals(new_name.getId())) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
