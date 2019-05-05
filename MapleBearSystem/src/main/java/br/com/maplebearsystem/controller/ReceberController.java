package br.com.maplebearsystem.controller;

import br.com.maplebearsystem.model.ProductMovement;
import br.com.maplebearsystem.model.Requisicao;

public class ReceberController {

	private Requisicao requisicao;
	private ProductMovement receber;

	public ReceberController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public ReceberController(Requisicao requisicao, ProductMovement receber) {
		super();
		this.requisicao = requisicao;
		this.receber = receber;
	}

	public Requisicao getRequisicao() {
		return requisicao;
	}

	public ProductMovement getReceber() {
		return receber;
	}

	public void setRequisicao(Requisicao requisicao) {
		this.requisicao = requisicao;
	}

	public void setReceber(ProductMovement receber) {
		this.receber = receber;
	}

	

}
