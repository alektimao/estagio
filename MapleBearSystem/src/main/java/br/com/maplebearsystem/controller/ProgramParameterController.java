package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.ProgramParameterDAO;
import br.com.maplebearsystem.model.Funcionario;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.ProgramParameter;


public class ProgramParameterController {

	private static ProgramParameterController _instance;
	private List<Exception> administratorErrorList;

	private List<Exception> organizationErrorList;
	private ProgramParameter programParameter;

	private ProgramParameterController() {

	}

	public ProgramParameter getProgramParameter() {
		return programParameter;
	}

	public boolean isProgramParameterizationNeeded() {

		ProgramParameterDAO dao = new ProgramParameterDAO();
		ProgramParameter aux;
		try {
			aux = dao.find();
			if (aux == null)
				return true;
			else {
				programParameter = aux;
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return true;
	}

	public List<Exception> save() {

		List<Exception> errorList = new ArrayList<Exception>();

		if (errorList.isEmpty()) {
			try {
				
				save(this.programParameter);
			} catch (Exception saveException) {
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	public ProgramParameter save(ProgramParameter programParameter) throws Exception {

		ProgramParameterDAO dao = new ProgramParameterDAO();

		return dao.save(programParameter);

	}

	public void setProgramParameter(ProgramParameter programParameter) {
		this.programParameter = programParameter;
	}

	public void setupParameterizationMode() {

		if (programParameter == null) {
			this.setupNewProgramParameter();
			return;
		}
	}

	public List<Exception> validateSetAdministrator(String adminToken,
			String adminChave,
			String adminUsername,
			String adminPassword) {

		List<Exception> errorList = new ArrayList<Exception>();
		this.administratorErrorList = errorList;

		if (programParameter == null) {
			programParameter = new ProgramParameter();
		}
		try {
			_instance.validateToken(adminToken);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			_instance.validateChave(adminChave);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			_instance.ValidateMasterlogin(adminUsername);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}
		try {
			_instance.ValidateMastersenha(adminPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		return errorList;
	}
	
	private void ValidateMastersenha(String adminPassword) {
		this.programParameter.setMastersenha(adminPassword);
		
	}

	private void ValidateMasterlogin(String adminUsername) {
		this.programParameter.setMasterlogin(adminUsername);
		
	}

	private void validateChave(String adminChave) {
		this.programParameter.setMasterchave(adminChave);
		
	}

	private void validateToken(String adminToken) {
		this.programParameter.setMasterToken(adminToken);
		
	}

	public static synchronized ProgramParameterController getInstance() {

		if (_instance == null) {
			synchronized (ProgramParameterController.class) {
				_instance = new ProgramParameterController();
			}
		}

		return _instance;

	}

	public void setupNewProgramParameter() {
		programParameter = new ProgramParameter();
	}

}
