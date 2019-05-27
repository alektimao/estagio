package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

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
public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Responsavel;
	private Date dtnasc;
	private String cpf;
	private String rg;
	private String nacionalidade;
	private String estadocivil;
	private String profissao;
	private String end;
	private String comp;
	private String num;
	private String cidade;
	private String cep;
	private String estado;
	private String Responsavel2;
	private Date dtnasc2;
	private String cpf2;
	private String rg2;
	private String nacionalidade2;
	private String estadocivil2;
	private String profissao2;
	private String end2;
	private String comp2;
	private String num2;
	private String cidade2;
	private String cep2;
	private String estado2;
	private String Aluno;
	private String Turma;
	private String Turno;
	private String Guarda;
	private String Parcela;
	private BigDecimal Preco;

	public Contrato() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getResponsavel() {
		return Responsavel;
	}

	public Date getDtnasc() {
		return dtnasc;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public String getProfissao() {
		return profissao;
	}

	public String getEnd() {
		return end;
	}

	public String getComp() {
		return comp;
	}

	public String getNum() {
		return num;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCep() {
		return cep;
	}

	public String getEstado() {
		return estado;
	}

	public String getResponsavel2() {
		return Responsavel2;
	}

	public Date getDtnasc2() {
		return dtnasc2;
	}

	public String getCpf2() {
		return cpf2;
	}

	public String getRg2() {
		return rg2;
	}

	public String getNacionalidade2() {
		return nacionalidade2;
	}

	public String getEstadocivil2() {
		return estadocivil2;
	}

	public String getProfissao2() {
		return profissao2;
	}

	public String getEnd2() {
		return end2;
	}

	public String getComp2() {
		return comp2;
	}

	public String getNum2() {
		return num2;
	}

	public String getCidade2() {
		return cidade2;
	}

	public String getCep2() {
		return cep2;
	}

	public String getEstado2() {
		return estado2;
	}

	public String getAluno() {
		return Aluno;
	}

	public String getTurma() {
		return Turma;
	}

	public String getTurno() {
		return Turno;
	}

	public String getGuarda() {
		return Guarda;
	}

	public String getParcela() {
		return Parcela;
	}

	public BigDecimal getPreco() {
		return Preco;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setResponsavel(String responsavel) {
		Responsavel = responsavel;
	}

	public void setDtnasc(Date dtnasc) {
		this.dtnasc = dtnasc;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setResponsavel2(String responsavel2) {
		Responsavel2 = responsavel2;
	}

	public void setDtnasc2(Date dtnasc2) {
		this.dtnasc2 = dtnasc2;
	}

	public void setCpf2(String cpf2) {
		this.cpf2 = cpf2;
	}

	public void setRg2(String rg2) {
		this.rg2 = rg2;
	}

	public void setNacionalidade2(String nacionalidade2) {
		this.nacionalidade2 = nacionalidade2;
	}

	public void setEstadocivil2(String estadocivil2) {
		this.estadocivil2 = estadocivil2;
	}

	public void setProfissao2(String profissao2) {
		this.profissao2 = profissao2;
	}

	public void setEnd2(String end2) {
		this.end2 = end2;
	}

	public void setComp2(String comp2) {
		this.comp2 = comp2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public void setCidade2(String cidade2) {
		this.cidade2 = cidade2;
	}

	public void setCep2(String cep2) {
		this.cep2 = cep2;
	}

	public void setEstado2(String estado2) {
		this.estado2 = estado2;
	}

	public void setAluno(String aluno) {
		Aluno = aluno;
	}

	public void setTurma(String turma) {
		Turma = turma;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}

	public void setGuarda(String guarda) {
		Guarda = guarda;
	}

	public void setParcela(String parcela) {
		Parcela = parcela;
	}

	public void setPreco(BigDecimal preco) {
		Preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj instanceof Contrato) {
			Contrato new_name = (Contrato) obj;
			if (this.id.equals(new_name.getId())) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
