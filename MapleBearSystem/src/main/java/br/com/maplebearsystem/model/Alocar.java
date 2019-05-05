package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Alocar implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "funcionarioID", referencedColumnName = "id")
	private Funcionario funcionario;
	private int quantidade;
	private boolean enabled;
	private Date dia;
	private Date devolucao;
	private String obs;

	@OneToMany(mappedBy = "prodAlocar",fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<Alocar_Produto> produtos;

	public Alocar() {
	}

	public Alocar(Long id, Funcionario funcionario, int quantidade, boolean enabled, Date dia, Date devolucao,
			String obs, List<Alocar_Produto> produtos) {
		super();
		this.id = id;
		this.funcionario = funcionario;
		this.quantidade = quantidade;
		this.enabled = enabled;
		this.dia = dia;
		this.devolucao = devolucao;
		this.obs = obs;
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Date getDia() {
		return this.dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getDevolucao() {
		return devolucao;
	}

	public List<Alocar_Produto> getProdutos() {
		return produtos;
	}

	public void setDevolucao(Date devolucao) {
		this.devolucao = devolucao;
	}

	public void setProdutos(List<Alocar_Produto> produtos) {
		this.produtos = produtos;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void addProdutoAlocar(Alocar_Produto requisicao_Produto) {
		if (produtos.contains(requisicao_Produto))
			return;
		
		produtos.add(requisicao_Produto);
		requisicao_Produto.setAlocar(this);
	}
	public void removeProdutoAlocar(Alocar_Produto requisicao_Produto) {
		if (!produtos.contains(requisicao_Produto))
			return;

		produtos.remove(requisicao_Produto);
		requisicao_Produto.setAlocar(null);
		
	}

}
