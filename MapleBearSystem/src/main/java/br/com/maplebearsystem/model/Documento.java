package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;

/**
 * Entity implementation class for Entity: PartProduct
 *
 */
@Entity
public class Documento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String documento;
	private String pasta;
	private String sala;
	@OneToOne(cascade = CascadeType.ALL)
	private Aluno aluno;

	public Documento() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public String getDocumento() {
		return documento;
	}

	public String getPasta() {
		return pasta;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setPasta(String pasta) {
		this.pasta = pasta;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof Documento) {
			Documento new_name = (Documento) obj;
			if (this.id.equals(new_name.getId())) {
				return true;
			}
		}
		return super.equals(obj);
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

}
