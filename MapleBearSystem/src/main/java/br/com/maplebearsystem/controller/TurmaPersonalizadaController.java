package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import br.com.maplebearsystem.dao.AlocarDAO;
import br.com.maplebearsystem.dao.DocumentoDAO;
import br.com.maplebearsystem.dao.Requisicao_ProductDAO;
import br.com.maplebearsystem.dao.TurmaPersonalizadaDAO;
import br.com.maplebearsystem.model.Alocar;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.WeekDays;
import javafx.util.Callback;

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
		List<Aluno> aluno = new ArrayList<Aluno>();
		turma = new TurmaPersonalizada();
		turma.setAlunos(aluno);
	}

	public List<Exception> validar(List<Aluno> aluno, String turma, String responsavel, String infoTurma, List<WeekDays> list) {
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
			validateInfo(infoTurma);
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
		try {
			validateDias(list);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			//try {
				saveTurma(this.turma);
//				
//				saveTurma(this.turma);
//			} catch (Exception e) {
//				System.out.println("Error: Failed to save Documento - " + e.getMessage());
//				errList.add(new Exception("Falha ao Salvar"));
//			}
		}
		return errList;
	}

	private void validateInfo(String infoTurma) throws Exception {
		if (turma == null || turma.equals("")) {
			throw new Exception("Defina alguma informação da atividade!");
		}
		turma.setInfo(infoTurma);
	}

	private void validateDias(List<WeekDays> list) throws Exception {
		if (list == null || list.size() == 0) {
			throw new Exception("Defina os dias da Turma!");
		}
		turma.setDiasDaSemana(list);
	}

	public void saveTurma(TurmaPersonalizada turma) {
			TurmaPersonalizadaDAO dao = new TurmaPersonalizadaDAO();
			dao.save(turma);			
	}

	private void validateAluno(List<Aluno> aluno) throws Exception{		
		if (aluno == null || aluno.size() == 0) {
			throw new Exception("Defina o Aluno da Turma!");
		}
		for (Aluno aluno2 : aluno) {
			this.turma.addAlunos(aluno2);
		}
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
		this.turma.setResponsavel(responsavel);
	}

	public void removeAluno(Aluno turma2) {
		turma.removeAlunos(turma2);		
	}

	public List<TurmaPersonalizada> getAllTurmaPersonalizada() {
		TurmaPersonalizadaDAO dao = new TurmaPersonalizadaDAO();

		return dao.listAllTurmaPersonalizada();
	}

	public List<TurmaPersonalizada> getAllTurmaPersonalizada(String filter) {
		TurmaPersonalizadaDAO dao = new TurmaPersonalizadaDAO();

		return dao.listTurmaPersonalizada(filter);
	}

	public void deleteTurmaPersonalizada(TurmaPersonalizada itemToRemove) {
		// TODO Auto-generated method stub	
	}

	public void setupEdit(TurmaPersonalizada resultado) {
		this.turma = resultado;	
	}

	public List<TurmaPersonalizada> getAllTurmaPersonalizada(WeekDays dia) {
		TurmaPersonalizadaDAO dao = new TurmaPersonalizadaDAO();

		List<TurmaPersonalizada> result = dao.listAllTurmaPersonalizada();
		List<TurmaPersonalizada> retorno = new ArrayList<TurmaPersonalizada>();
		for (TurmaPersonalizada turmaPersonalizada : result) {
			if (turmaPersonalizada.getDiasDaSemana().contains(dia)) {
				retorno.add(turmaPersonalizada);
			}
		}
		return retorno;
	}

	public List<TurmaPersonalizada> getAllTurmaPersonalizada(String filter, WeekDays dia) {
		TurmaPersonalizadaDAO dao = new TurmaPersonalizadaDAO();
		List<TurmaPersonalizada> result = dao.listTurmaPersonalizada(filter);
		List<TurmaPersonalizada> retorno = new ArrayList<TurmaPersonalizada>();
		for (TurmaPersonalizada turmaPersonalizada : result) {
			if (turmaPersonalizada.getDiasDaSemana().contains(dia)) {
				retorno.add(turmaPersonalizada);
			}
		}
		return retorno;
	}

}
