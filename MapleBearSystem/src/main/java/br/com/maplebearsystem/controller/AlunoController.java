package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.AlunoDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.net.sponteeducacional.api.WsResponsaveis;

public class AlunoController {

	private Aluno partAluno;

	public AlunoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Aluno Methods

	public Aluno getAluno() {
		return partAluno;
	}

	public void setupEditAluno(Aluno partAluno) {
		this.partAluno = partAluno;

	}

	public void setupNewAluno() {
		partAluno = new Aluno();

	}

	public List<Exception> saveinfoAluno(String Nome, Integer idalunowebservice, String cpf, String rg,
			String numeromatricula, String datanascimento, String TurmaAtual, WsResponsaveis[] wsResponsaveis,
			String bairro, String cidade, String cep, String endereco, String numeroendereco) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (partAluno == null) {
			partAluno = new Aluno();
		}

		try {
			setAlunoNome(Nome);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setCep(cep);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setNumEnd(numeroendereco);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setCidade(cidade);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setResponsavel(wsResponsaveis);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setEndereco(endereco, bairro);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setAlunoNome(Nome);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setAlunoidalunowebservice(idalunowebservice);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setAlunoCpf(cpf);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setAlunoRg(rg);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setAlunoNumeroMatricula(numeromatricula);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setAlunoTurma(TurmaAtual);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			String[] data = datanascimento.split("/");
			validateData(Date.valueOf(data[2] + "-" + data[1] + "-" + data[0]));
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		if (errorList.isEmpty()) {
			try {
				saveAluno(this.partAluno);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Parte / Produto Já cadastrado"));
				System.out
						.println("Info: Aluno \"" + partAluno.getNome() + "\" already registered - " + e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	private void setNumEnd(String numeroendereco) {

		String cid = "";
		if (numeroendereco != null && !numeroendereco.equals("")) {
			partAluno.setNumeroendereco(cid);
		}
	}

	private void setCep(String cep) {

		String cid = "";
		if (cep != null && !cep.equals("")) {
			partAluno.setCep(cid);
		}
	}

	private void setCidade(String cidade) {
		String cid = "";
		if (cidade != null && !cidade.equals("")) {
			partAluno.setCidade(cid);
		}

	}

	private void setEndereco(String endereco, String bairro) {
		String end = "";
		if (endereco == null || endereco.equals("")) {
			partAluno.setEndereco("");
		} else {
			end = endereco;
		}
		if (bairro == null || bairro.equals("")) {
			partAluno.setEndereco(end);
		} else {
			partAluno.setEndereco(end + "-" + bairro);
		}

	}

	private void setResponsavel(WsResponsaveis[] wsResponsaveis) throws Exception {
		if (wsResponsaveis.length > 0) {
			if (wsResponsaveis[0] != null) {
				partAluno.setResponsavel(wsResponsaveis[0].getNome());
			}
			if (wsResponsaveis[1] != null) {
				partAluno.setResponsavel2(wsResponsaveis[1].getNome());
			}
		}
	}

	public void saveAluno(Aluno partAluno) {
		AlunoDAO dao = new AlunoDAO();
		dao.save(partAluno);
	}

	public void deleteAluno(Aluno partAluno) {
		AlunoDAO dao = new AlunoDAO();
		dao.delete(partAluno);
	}

	private void setAlunoTurma(String TurmaAtual) throws Exception {

//		if (TurmaAtual == null || TurmaAtual.equals("")) {
//			throw new Exception("Turma Atual Inválido");
//		}

		partAluno.setTurmaAtual(TurmaAtual);

	}

	public void setAlunoNome(String nome) throws Exception {

		if (nome == null || nome.equals("")) {
			throw new Exception("Nome Inválido");
		}

		partAluno.setNome(nome);

	}

	public void setAlunoidalunowebservice(Integer id) throws Exception {

		if (id == null || id == 0) {
			throw new Exception("Id Aluno Inválido");
		}
		partAluno.setIdalunowebservice(id);

	}

	public void setAlunoCpf(String cpf) throws Exception {

//		if (cpf == null || cpf.equals("")) {
//			throw new Exception("Cpf Inválido");
//		}

		partAluno.setCpf(cpf);

	}

	public void setAlunoRg(String rg) throws Exception {

//		if (rg == null || rg.equals("")) {
//			throw new Exception("RG Inválido");
//		}

		partAluno.setRg(rg);

	}

	public void setAlunoNumeroMatricula(String matricula) throws Exception {

		if (matricula == null || matricula.equals("")) {
			throw new Exception("Numero Matricula Inválida");
		}
		partAluno.setNumeromatricula(matricula);

	}

	private void validateData(Date date) throws Exception {
		if (date == null) {
			throw new Exception("Data de Nascimento Inválida");
		}

		partAluno.setDatanascimento(date);
	}

// ENDSECTION Aluno Methods

// SECTION Controller to DAO Methods

	public List<Aluno> getAlunos() {
		AlunoDAO dao = new AlunoDAO();

		return dao.listAllAluno();
	}

	public List<Aluno> getAlunos(String cpf, String nome, String numero) {
		AlunoDAO dao = new AlunoDAO();

		return dao.listAlunosBusca(cpf, nome, numero);
	}

	public Aluno getAlunoId(Integer filter) {
		AlunoDAO dao = new AlunoDAO();
		Aluno result = new Aluno();
		try {
			result = dao.listAlunoId(filter);
		} catch (NoSuchElementException e) {
			result = null;
		}
		return result;
	}

// ENDSECTION Controller to DAO Methods

}
