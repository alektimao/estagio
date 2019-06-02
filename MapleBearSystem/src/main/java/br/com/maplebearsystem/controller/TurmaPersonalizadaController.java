package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.DocumentoDAO;
import br.com.maplebearsystem.dao.Requisicao_ProductDAO;
import br.com.maplebearsystem.dao.TurmaPersonalizadaDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.model.TurmaPersonalizada;

public class TurmaPersonalizadaController {

	private TurmaPersonalizada turma;
	private List<Aluno> listaAluno;
	public TurmaPersonalizadaController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public TurmaPersonalizadaController(TurmaPersonalizada turma) {
		super();
		this.turma = turma;
	}

	public TurmaPersonalizada getTurmaPersonalizada() {
		return turma;
	}

	public void setTurmaPersonalizada(TurmaPersonalizada turma) {
		this.turma = turma;
	}

	public void setupNewTurmaPersonalizada() {
		turma = new TurmaPersonalizada();
		turma.setAlunos(new ArrayList<Aluno>());
	}

	public List<Exception> validar(List<Aluno> aluno, String turma, String responsavel, String info, String infoTurma) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateAluno(aluno);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateTurma(turma);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateResponsavel(responsavel);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				saveTurma(this.turma);
				//saveDocumento(this.documento);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Documento - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	public void saveTurma(TurmaPersonalizada turma) {
		
		TurmaPersonalizadaDAO dao = new TurmaPersonalizadaDAO();
		dao.save(turma);
	}

	private void validateAluno(List<Aluno> aluno) throws Exception{
		
		if (aluno == null || aluno.size() == 0) {
			throw new Exception("Defina o Aluno da Turma!");
		}
		turma.setAlunos(aluno);
	}

	private void validateTurma(String turma) throws Exception{
		
		if (turma == null || turma.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome da Turma!");
		}
		
		this.turma.setNometurma(turma);
		
	}

	private void validateResponsavel(String responsavel) throws Exception{
		if (responsavel == null || responsavel.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome do Responsavel da Turma!");
		}
		
	}

	public void removeAluno(Aluno turma2) {
		turma.removeAlunos(turma2);		
	}
}
