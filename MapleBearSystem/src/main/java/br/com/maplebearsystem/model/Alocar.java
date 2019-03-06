package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Alocar implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "funcionarioID", referencedColumnName = "id")
	private Funcionario funcionario;
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	private int quantidade;
	private boolean enabled;
	private Date Dia;
	
	@ManyToMany(
			targetEntity = Product.class,
			fetch = FetchType.LAZY)
	private List<Product> produtos;
	


	public Alocar() {
		produtos = new ArrayList<Product>();
	}



	public Alocar(Funcionario funcionario, int quantidade, boolean enabled, Date dia, List<Product> produtos) {
		super();
		this.funcionario = funcionario;
		this.quantidade = quantidade;
		this.enabled = enabled;
		Dia = dia;
		this.produtos = produtos;
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
		return Dia;
	}



	public void setDia(Date dia) {
		Dia = dia;
	}



	public List<Product> getProducts() {
		return produtos;
	}



	public void setProducts(List<Product> produtos) {
		this.produtos = produtos;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	
}
