package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * Entity implementation class for Entity: RequestedPart
 *
 */
@Entity
public class PedidoFunc_Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "PedidoFuncID", referencedColumnName = "id")
	private PedidoFunc requisicao;
	@ManyToOne
	@JoinColumn(name = "produtoPedidoFuncID", referencedColumnName = "id")
	private Product prodPedidoFunc;
	private Integer quantity;
	private boolean produtorecebido;

	public PedidoFunc_Produto() {
	}

	public Long getId() {
		return id;
	}

	public PedidoFunc getPedidoFunc() {
		return requisicao;
	}

	public Product getProdPedidoFunc() {
		return prodPedidoFunc;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	private boolean sameAsFormer(PedidoFunc novo) {
		return this.requisicao == null ? novo == null : this.requisicao.equals(novo);
	}

	public void setPedidoFunc(PedidoFunc requisicao) {
		if (sameAsFormer(requisicao))
			return;
		// set new work
		PedidoFunc old = this.requisicao;
		this.requisicao = requisicao;
		// remove from the old work
		if (old != null)
			old.removeProdutoPedidoFunc(this);
		// set myself into new work
		if (requisicao != null)
			requisicao.addProdutoPedidoFunc(this);
	}

	public void setProdPedidoFunc(Product prodPedidoFunc) {
		this.prodPedidoFunc = prodPedidoFunc;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public boolean isProdutorecebido() {
		return produtorecebido;
	}

	public void setProdutorecebido(boolean produtorecebido) {
		this.produtorecebido = produtorecebido;
	}
	
}
