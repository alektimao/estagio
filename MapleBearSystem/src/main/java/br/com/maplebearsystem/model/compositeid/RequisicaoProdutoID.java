package br.com.maplebearsystem.model.compositeid;

import java.io.Serializable;


public class RequisicaoProdutoID implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long requisicao;
	private Long prodRequisicao;

	public RequisicaoProdutoID() {
		super();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof RequisicaoProdutoID) {
			RequisicaoProdutoID objIDclass = (RequisicaoProdutoID) obj;

			return objIDclass.getPartRequest().longValue() == requisicao.longValue()
					&& objIDclass.getPartProduct().longValue() == prodRequisicao.longValue();
		}

		return false;
	}

	@Override
	public int hashCode() {
		return (int) (requisicao + prodRequisicao);
	}

	public Long getPartProduct() {
		return prodRequisicao;
	}

	public void setPartProduct(Long partProductID) {
		this.prodRequisicao = partProductID;
	}

	public Long getPartRequest() {
		return requisicao;
	}

	public void setPartRequest(Long partRequestID) {
		this.requisicao = partRequestID;
	}

}
