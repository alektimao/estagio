package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.SalaMultiUsoDAO;
import br.com.maplebearsystem.dao.TurmaPersonalizadaDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.SalaMultiUso;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.WeekDays;
import br.com.maplebearsystem.model.validators.FieldValidators;
import javafx.util.Callback;

public class SalaMultiUsoController {

	private SalaMultiUso sala;

	public SalaMultiUsoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public SalaMultiUso getSalaMultiUso() {
		return sala;
	}

	public void setSalaMultiUso(SalaMultiUso sala) {
		this.sala = sala;
	}

	public void setupNewSalaMultiUso() {
		sala = new SalaMultiUso();
		sala.setTurma(new ArrayList<TurmaPersonalizada>());
	}

	public List<Exception> validar(List<TurmaPersonalizada> turma, String de, String ate, WeekDays dia,
			String responsavel, String info, String atividade) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateTurma(turma);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateHoraIni(de);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateHoraFim(ate);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateDiaSemana(dia);
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
			validateNomeAtividade(atividade);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateInfo(info);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			saveSalaMultiUso(this.sala);
		}
		return errList;
	}

	private void validateNomeAtividade(String responsavel) throws Exception {
		if (responsavel == null || responsavel.equals("")) {
			throw new Exception("Defina o nome da Atividade!");
		}
		sala.setNomeatividade(responsavel);
	}

	private void validateInfo(String info) {
		if (info == null) {
			info = "";
		}
		sala.setInfo(info);
	}

	private void validateResponsavel(String responsavel) throws Exception {
		if (responsavel == null || responsavel.equals("")) {
			throw new Exception("Defina o Responsavel da Atividade!");
		}
		sala.setResponsavelativade(responsavel);

	}

	private void validateDiaSemana(WeekDays dia) throws Exception {
		if (dia == null) {
			throw new Exception("Defina o dia da atividade!");
		}
		sala.setDiadasemana(dia);
	}

	private void validateHoraFim(String ate) throws Exception {
		if (ate == null || ate.equals("")) {
			throw new Exception("Defina a hora final da atividade!");
		}
		if (!FieldValidators.validadeHoras(ate)) {
			throw new Exception("Hora final da atividade invalida!");
		}
		if (this.sala.getDe() != null
				&& Integer.parseInt(ate.split(":")[0]) < Integer.parseInt(this.sala.getDe().split(":")[0])) {
			throw new Exception("Hora final deve ser maior que a inicial!");
		}
		sala.setAte(ate);
	}

	private void validateHoraIni(String de) throws Exception {
		if (de == null || de.equals("")) {
			throw new Exception("Defina a hora final da atividade!");
		}
		if (!FieldValidators.validadeHoras(de)) {
			throw new Exception("Defina a hora inicial da atividade!");
		}
		if (this.sala.getAte() != null
				&& Integer.parseInt(de.split(":")[0]) > Integer.parseInt(this.sala.getAte().split(":")[0])) {
			throw new Exception("Hora inicial deve ser menor que a final!");
		}
		sala.setDe(de);
	}

	private void validateTurma(List<TurmaPersonalizada> turma) throws Exception {
		if (turma.size() == 0) {
			throw new Exception("Defina a(s) Turmas da SalaMultiUso!");
		}
		sala.setTurma(turma);
	}

	private void saveSalaMultiUso(SalaMultiUso documento) {

		SalaMultiUsoDAO dao = new SalaMultiUsoDAO();
		dao.save(documento);
	}

	public void remove(TurmaPersonalizada turma) {
		// TODO Auto-generated method stub

	}

	public List<SalaMultiUso> getAllSalaMultiUso() {
		SalaMultiUsoDAO dao = new SalaMultiUsoDAO();

		return dao.listAllSalaMultiUso();
	}

	public  List<SalaMultiUso> getAllSalaMultiUso(String filter) {
		
		SalaMultiUsoDAO dao = new SalaMultiUsoDAO();

		return dao.listAllSalaMultiUso(filter);
	}

	public void deleteSalaMultiUso(SalaMultiUso itemToRemove) {
		// TODO Auto-generated method stub
		
	}
}
