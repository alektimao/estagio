package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.AlunoDAO;
import br.com.maplebearsystem.dao.RestricaoDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.model.Restricao;
import br.com.maplebearsystem.model.Restricao_Alimento;
import br.com.maplebearsystem.model.Restricao_Remedio;

public class RestricaoController {

	private Restricao restricao;
	private Restricao_Alimento requisicao_alimento;
	private Restricao_Remedio requisicao_remedio;
	private List<Restricao_Alimento> listalimento;
	private List<Restricao_Remedio> listremedio;

	public RestricaoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public Restricao getRestricao() {
		return restricao;
	}

	public Restricao_Alimento getRequisicao_alimento() {
		return requisicao_alimento;
	}

	public Restricao_Remedio getRequisicao_remedio() {
		return requisicao_remedio;
	}

	public void setRestricao(Restricao restricao) {
		this.restricao = restricao;
	}

	public void setRequisicao_alimento(Restricao_Alimento requisicao_alimento) {
		this.requisicao_alimento = requisicao_alimento;
	}

	public void setRequisicao_remedio(Restricao_Remedio requisicao_remedio) {
		this.requisicao_remedio = requisicao_remedio;
	}

	public void setAluno(Aluno resultado) {
		this.restricao.setAluno(resultado);
	}

	public List<Restricao> getRestricaos(Long id) {
		RestricaoDAO r = new RestricaoDAO();
		return r.listRestricao(id);
	}

	public Aluno getaluno() {
		return restricao.getAluno();
	}

	public void setupNewRestricao() {
		restricao = new Restricao();
		restricao.setRequisicao_Alimento(new ArrayList<Restricao_Alimento>());
		restricao.setRequisicao_Remedio(new ArrayList<Restricao_Remedio>());
	}

	public List<Exception> validar(Aluno aluno, String gravidade, String alimento, String sintomas, String conduta) {
		List<Exception> errList = new ArrayList<Exception>();
		this.requisicao_alimento = new Restricao_Alimento();
		try {
			validateAluno(aluno);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateGravidade(gravidade);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateAlimento(alimento);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateSintomas(sintomas);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateConduta(conduta);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				restricao.addRestricaoAlimento(requisicao_alimento);
				//saveDocumento(this.documento);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Documento - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	private void validateConduta(String conduta) throws Exception {
		if (conduta == null || conduta.equals("")) {
			throw new Exception("Defina a Conduta a ser tomada!");
		}
		requisicao_alimento.setCondutas(conduta);
	}

	private void validateSintomas(String sintomas) throws Exception {
		if (sintomas == null || sintomas.equals("")) {
			throw new Exception("Defina o(s) Sintomas da Restricao!");
		}
		requisicao_alimento.setSintomas(sintomas);
	}

	private void validateAlimento(String alimento) throws Exception {
		if (alimento == null || alimento.equals("")) {
			throw new Exception("Defina o Alimento!");
		}
		requisicao_alimento.setAlimento(alimento);
	}

	private void validateGravidade(String gravidade) throws Exception {
		if (gravidade == null || gravidade.equals("")) {
			throw new Exception("Defina a gravidade!");
		}
		requisicao_alimento.setAlimento(gravidade);
	}

	private void validateAluno(Aluno aluno) throws Exception {
		if (aluno == null) {
			throw new Exception("Defina o Aluno do Documento!");
		}
		if (restricao.getAluno() == null) {
			restricao.setAluno(aluno);
		}
	}

}
