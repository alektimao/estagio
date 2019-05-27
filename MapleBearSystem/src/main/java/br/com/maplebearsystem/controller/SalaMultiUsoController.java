package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.SalaMultiUsoDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.SalaMultiUso;
import br.com.maplebearsystem.model.TurmaPersonalizada;
import br.com.maplebearsystem.model.validators.FieldValidators;

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
	}

	public void validar(List<TurmaPersonalizada> turma, String de, String ate, String dia, String responsavel,String info) {
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
			validateInfo(info);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				saveSalaMultiUso(this.sala);
			} catch (Exception e) {
				System.out.println("Error: Failed to save SalaMultiUso - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}

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

	private void validateDiaSemana(String dia) throws Exception {
		if (dia == null || dia.equals("")) {
			throw new Exception("Defina o(s) dia(s) da atividade!");
		}
		switch (dia.toUpperCase()) {
		case "SEGUNDA-FEIRA":
			sala.setDiadasemana(dia);
			break;
		case "TERÇA-FEIRA":
			sala.setDiadasemana(dia);
			break;
		case "QUARTA-FEIRA":
			sala.setDiadasemana(dia);
			break;
		case "QUINTA-FEIRA":
			sala.setDiadasemana(dia);
			break;
		case "SEXTA-FEIRA":
			sala.setDiadasemana(dia);
			break;
		case "SABADO-FEIRA":
			sala.setDiadasemana(dia);
			break;
		default:
			throw new Exception("Dia da Semana Invalido!");
		}
	}

	private void validateHoraFim(String ate) throws Exception {
		if (ate == null || ate.equals("")) {
			throw new Exception("Defina a hora final da atividade!");
		}
		if (!FieldValidators.validadeHoras(ate)) {
			throw new Exception("Hora final da atividade invalida!");
		}
		if (this.sala.getDe() != null && Integer.parseInt(ate.split(":")[0]) < Integer.parseInt(this.sala.getDe().split(":")[0])) {
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
		if (this.sala.getAte() != null && Integer.parseInt(de.split(":")[0]) > Integer.parseInt(this.sala.getAte().split(":")[0])) {
			throw new Exception("Hora inicial deve ser menor que a final!");
		}
		sala.setDe(de);
	}

	private void validateTurma(List<TurmaPersonalizada> turma) throws Exception {
		if (turma.size() > 0) {
			throw new Exception("Defina o Aluno do SalaMultiUso!");
		}
		sala.setTurma(turma);
	}

	private void saveSalaMultiUso(SalaMultiUso documento) {

		SalaMultiUsoDAO dao = new SalaMultiUsoDAO();
		dao.save(documento);
	}
}
