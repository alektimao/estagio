package br.com.maplebearsystem.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.exception.ConstraintViolationException;

import br.com.maplebearsystem.dao.FuncionarioDAO;
import br.com.maplebearsystem.model.Ativo;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.Nivel;
import br.com.maplebearsystem.model.PessoaFisica;

public class FuncionarioController {

	private Funcionario funcionario;

	public FuncionarioController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Product Methods

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setupEditFuncionario(Funcionario Funcionario) {
		this.funcionario = Funcionario;

	}

	public void setupNewFuncionario() {
		funcionario = new Funcionario();
	}

	public void saveFuncionario(Funcionario partProduct) {
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.save(partProduct);
	}

	public void deleteFuncionario() {
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.delete(funcionario);
	}

	public List<Exception> validateSalvar(Funcionario valor) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateFuncionario(valor);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				saveFuncionario(funcionario);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Funcionario - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar Funcionario"));
			}
		}
		return errList;
	}

// ENDSECTION Product Methods

// SECTION Controller to DAO Methods

	void validateFuncionario(Funcionario valor) {
		// TODO Auto-generated method stub

	}

	public List<Funcionario> getlistFuncionario() {
		FuncionarioDAO dao = new FuncionarioDAO();

		return dao.listAllFuncionario();
	}

	public List<Funcionario> getlistFuncionario(String filter) {
		FuncionarioDAO dao = new FuncionarioDAO();

		return dao.listFuncionario(filter);
	}

	public List<Exception> salvar(Funcionario forne) {
		List<Exception> errList = new ArrayList<Exception>();
		try {
			FuncionarioDAO funcionario = new FuncionarioDAO();
			funcionario.save(forne);
		} catch (Exception e) {
			errList.add(new Exception("Falha ao Salvar Funcionario"));
		}
		return errList;
	}

	public List<Exception> salvar(PessoaFisica nome, Object ativo, String funcao, String login, Object nivel, String senha,
			LocalDate dtadimissao) {
		List<Exception> errList = new ArrayList<Exception>();
		try {
			validateNome(nome);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateAtivo(ativo);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateFuncao(funcao);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateLogin(login);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateSenha(senha);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateNivel(nivel);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateDtadm(dtadimissao);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				saveFuncionario(funcionario);
				// saveDocumento(this.documento);
			}
			catch (ConstraintViolationException e) {
				errList.add(new Exception("Utilize outro login"));
			}
			catch (Exception e) {
				if (e.getMessage().contains("ConstraintViolationException")) {
					errList.add(new Exception("Utilize outro login"));
				}
				else
				{					
					errList.add(new Exception("Falha ao Salvar"));
					System.out.println("Error: Failed to save Documento - " + e.getMessage());
				}
			}
		}
		return errList;
	}

	private void validateDtadm(LocalDate dtadimissao) throws Exception {
		if (dtadimissao == null) {
			throw new Exception("Data admissao não selecionada");
		}
		if (dtadimissao.getDayOfYear() < 19) {
			throw new Exception("Data inválida");
		}
		funcionario.setAdmissao(Date.valueOf(dtadimissao));

	}

	private void validateNivel(Object nivel) throws Exception {
		if (nivel == null) {
			throw new Exception("Defina o Nivel!");
		}
		funcionario.setNivel((Nivel) nivel);
	}

	private void validateLogin(String login) throws Exception {
		if (login == null || login.equals("")) {
			throw new Exception("Defina o Login!");
		}
		funcionario.setLogin(login);

	}

	private void validateFuncao(String funcao) throws Exception {
		if (funcao == null || funcao.equals("")) {
			throw new Exception("Defina a funcao!");
		}
		funcionario.setJob(funcao);
	}

	private void validateSenha(String senha) throws Exception {
		if (senha == null || senha.equals("")) {
			throw new Exception("Defina a senha!");
		}
		funcionario.setSenha(senha);
	}

	private void validateAtivo(Object ativo) throws Exception {
		if (ativo == null) {
			throw new Exception("Defina se esta ativo ou desativado!");
		}
		funcionario.setAtivo((Ativo) ativo);

	}

	private void validateNome(PessoaFisica nome) throws Exception {
		if (nome == null) {
			throw new Exception("busque a pessoa para cadastrar como funcionario!");
		}
		funcionario.setPessoa(nome);
	}

// ENDSECTION Controller to DAO Methods

}
