package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: PartRequest
 *
 */
@Entity

public class PedidoFunc implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date requestDate;
	@OneToMany(mappedBy = "prodPedidoFunc", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PedidoFunc_Produto> requisicao_Produtos;
	private String descricao;
	@OneToOne
	private Funcionario funcionario;
	private boolean pedidorecebido;

	public PedidoFunc() {
		super();
		requisicao_Produtos = new ArrayList<PedidoFunc_Produto>();
	}

	public Long getId() {
		return id;
	}

	public Date getRequestDate() {
		return requestDate;
	}
	public List<PedidoFunc_Produto> getRequestedParts() {
		return requisicao_Produtos;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public void setRequestedParts(List<PedidoFunc_Produto> requisicao_Produtos) {
		this.requisicao_Produtos = requisicao_Produtos;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPedidorecebido() {
		return pedidorecebido;
	}

	public void setPedidorecebido(boolean pedidorecebido) {
		this.pedidorecebido = pedidorecebido;
	}

	public void addProdutoPedidoFunc(PedidoFunc_Produto requisicao_Produto) {
		if (requisicao_Produtos.contains(requisicao_Produto))
			return;

		requisicao_Produtos.add(requisicao_Produto);
		requisicao_Produto.setPedidoFunc(this);

	}

	public void removeProdutoPedidoFunc(PedidoFunc_Produto requisicao_Produto) {
		if (!requisicao_Produtos.contains(requisicao_Produto))
			return;

		requisicao_Produtos.remove(requisicao_Produto);
		requisicao_Produto.setPedidoFunc(null);

	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
