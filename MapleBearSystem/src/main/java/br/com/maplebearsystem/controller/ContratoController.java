package br.com.maplebearsystem.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.ContratoDAO;
import br.com.maplebearsystem.dao.RequisicaoDAO;
import br.com.maplebearsystem.model.Contrato;

public class ContratoController {

	private Contrato contrato;

	public ContratoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public ContratoController(Contrato contrato) {
		super();
		this.contrato = contrato;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setProduto(Contrato produto) {
		this.contrato = produto;
	}

	public void setupNewContrato() {
		contrato = new Contrato();
	}

	public void validar(String nome, LocalDate nasc, String nacionalidade, String profissao, String estdcivil,
			String cpf, String rg, String end, String num, String comp, String cidade, String cep, String estado,
			String nome2, LocalDate nasc2, String nacionalidade2, String profissao2, String estdcivil2, String cpf2,
			String rg2, String end2, String num2, String comp2, String cidade2, String cep2, String estado2,
			String aluno, String turma, String turno, String guarda, String preco, String parcela) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateResponsavel1(nome, nasc, nacionalidade, profissao, estdcivil, cpf, rg, end, num, comp, cidade, cep,
					estado);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateResponsavel2(nome2, nasc2, nacionalidade2, profissao2, estdcivil2, cpf2, rg2, end2, num2, comp2, cidade2, cep2,
					estado2);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateClausula( aluno,  turma,  turno,  guarda,  preco,  parcela);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				saveContrato(contrato);
			} catch (Exception e) {
				System.out.println("Error: Failed to save WorkOrder - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}

	}

	private void saveContrato(Contrato contrato) {
		
		ContratoDAO dao = new ContratoDAO();
		dao.save(contrato);
	}

	private void validateClausula(String aluno, String turma, String turno, String guarda, String preco,
			String parcela) throws Exception{
		
		if (aluno == null) {
			aluno = "";
		}
		if (turma == null) {
			turma = "";
		}
		if (turno == null) {
			turno = "";
		}
		if (guarda == null) {
			guarda = "";
		}
		if (preco == null) {
			preco = "";
		}
		if (parcela == null) {
			parcela = "";
		}
		contrato.setAluno(aluno);
		contrato.setTurma(turma);
		contrato.setTurno(turno);
		contrato.setGuarda(guarda);
		contrato.setParcela(parcela);
		
	}

	private void validateResponsavel2(String nome2, LocalDate nasc2, String nacionalidade2, String profissao2,
			String estdcivil2, String cpf2, String rg2, String end2, String num2, String comp2, String cidade2,
			String cep2, String estado2) throws Exception{
		
		if (nome2 == null || nome2.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome do Responsavel 2!");
		}
		if (nacionalidade2 == null) {
			nacionalidade2 = "";
		}
		if (profissao2 == null) {
			profissao2 = "";
		}
		if (estdcivil2 == null) {
			estdcivil2 = "";
		}
		if (cpf2 == null) {
			cpf2 = "";
		}
		if (rg2 == null) {
			rg2 = "";
		}
		if (end2 == null) {
			end2 = "";
		}
		if (num2 == null) {
			num2 = "";
		}
		if (comp2 == null) {
			comp2 = "";
		}
		if (cidade2 == null) {
			cidade2 = "";
		}
		if (cep2 == null) {
			cep2 = "";
		}
		if (estado2 == null) {
			estado2 = "";
		}
		if (nasc2 == null) {
			throw new Exception("Data de nascimento do segundo responsavel não selecionada");
		}
		DateFormat df = new SimpleDateFormat ("yyyy/MM/dd");
		df.setLenient (false); // aqui o pulo do gato
		try {
		    df.parse(nasc2.toString());
		    // data válida
		} catch (ParseException ex) {
			throw new Exception("Data de nascimento inválida");
		}
		contrato.setProfissao2(profissao2);
		contrato.setResponsavel2(nome2);
		contrato.setNacionalidade2(nacionalidade2);
		contrato.setCpf2(cpf2);
		contrato.setEnd2(end2);
		contrato.setRg2(rg2);
		contrato.setComp2(comp2);
		contrato.setCidade2(cidade2);
		contrato.setCep2(cep2);
		contrato.setEstado2(estado2);
		contrato.setEstadocivil2(estdcivil2);
		contrato.setDtnasc2(Date.valueOf(nasc2));
		
	}

	private void validateResponsavel1(String nome, LocalDate nasc, String nacionalidade, String profissao,
			String estdcivil, String cpf, String rg, String end, String num, String comp, String cidade, String cep,
			String estado) throws Exception{
		if (nome == null || nome.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome do Responsavel!");
		}
		if (nacionalidade == null) {
			nacionalidade = "";
		}
		if (profissao == null) {
			profissao = "";
		}
		if (estdcivil == null) {
			estdcivil = "";
		}
		if (cpf == null) {
			cpf = "";
		}
		if (rg == null) {
			rg = "";
		}
		if (end == null) {
			end = "";
		}
		if (num == null) {
			num = "";
		}
		if (comp == null) {
			comp = "";
		}
		if (cidade == null) {
			cidade = "";
		}
		if (cep == null) {
			cep = "";
		}
		if (estado == null) {
			estado = "";
		}
		if (nasc == null) {
			throw new Exception("Data de nascimento do primeiro responsavel não selecionada");
		}
		DateFormat df = new SimpleDateFormat ("yyyy/MM/dd");
		df.setLenient (false); // aqui o pulo do gato
		try {
		    df.parse(nasc.toString());
		    // data válida
		} catch (ParseException ex) {
			throw new Exception("Data de nascimento inválida");
		}
		contrato.setProfissao2(profissao);
		contrato.setResponsavel2(nome);
		contrato.setNacionalidade2(nacionalidade);
		contrato.setCpf2(cpf);
		contrato.setEnd2(end);
		contrato.setRg2(rg);
		contrato.setComp2(comp);
		contrato.setCidade2(cidade);
		contrato.setCep2(cep);
		contrato.setEstado2(estado);
		contrato.setEstadocivil2(estdcivil);
		contrato.setDtnasc2(Date.valueOf(nasc));
		
	}
}
