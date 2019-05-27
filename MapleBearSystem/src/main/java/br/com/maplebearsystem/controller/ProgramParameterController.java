package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.ProgramParameterDAO;
import br.com.maplebearsystem.model.Employee;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.ProgramParameter;
import br.com.maplebearsystem.model.Employee.SoftwareOperatorLevel;

public class ProgramParameterController {

	private static ProgramParameterController _instance;
	private List<Exception> administratorErrorList;
	private Employee loggedUser;

	private List<Exception> organizationErrorList;
	private PessoaController pessoaAdminController;
	private PessoaController pessoaOrganizationController;
	private ProgramParameter programParameter;

	private ProgramParameterController() {

	}

	public Employee getLoggedUser() {
		return loggedUser;
	}

	public PessoaController getPessoaAdminController() {
		return pessoaAdminController;
	}

	public PessoaController getPessoaOrganizationController() {
		return pessoaOrganizationController;
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
				if (aux.getAdministrator() == null || aux.getOrganization() == null) {
					return true;
				}
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return true;
	}

	public List<Exception> save() {

		List<Exception> errorList = new ArrayList<Exception>();

		if (!organizationErrorList.isEmpty())
			errorList.addAll(organizationErrorList);
		if (!administratorErrorList.isEmpty())
			errorList.addAll(administratorErrorList);

		if (errorList.isEmpty()) {
			try {
				this.programParameter.getAdministrator()
						.setPessoa((PessoaFisica) pessoaAdminController.getStagedPessoa());
				this.programParameter.setOrganization((PessoaJuridica) pessoaOrganizationController.getStagedPessoa());

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

	public void setLoggedUser(Employee loggedUser) {
		this.loggedUser = loggedUser;
	}

	public void setPessoaAdminController(PessoaController pessoaAdminController) {
		this.pessoaAdminController = pessoaAdminController;
	}

	public void setPessoaOrganizationController(PessoaController pessoaOrganizationController) {
		this.pessoaOrganizationController = pessoaOrganizationController;
	}

	public void setProgramParameter(ProgramParameter programParameter) {
		this.programParameter = programParameter;
	}

	public void setupParameterizationMode() {
		this.pessoaAdminController = new PessoaController();
		this.pessoaOrganizationController = new PessoaController();

		if (programParameter == null) {
			this.setupNewProgramParameter();
			return;
		}

		if (programParameter.getAdministrator() != null) {
			pessoaAdminController.setupEditPessoa(programParameter.getAdministrator().getPessoa());
		} else {
			pessoaAdminController.setupNewPessoaFisica();
		}

		if (programParameter.getOrganization() != null) {
			pessoaOrganizationController.setupEditPessoa(programParameter.getOrganization());
		} else {
			pessoaOrganizationController.setupNewPessoaJuridica();
		}
	}

	public List<Exception> validateSetAdministrator(String adminName,
			String adminRG,
			String adminCPF,
			String adminEmail,
			String adminUsername,
			String adminPassword,
			String adminPasswordRepeated) {

		List<Exception> errorList = new ArrayList<Exception>();
		this.administratorErrorList = errorList;

		if (programParameter == null) {
			programParameter = new ProgramParameter();
		}

		try {
			pessoaAdminController.setName(adminName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaAdminController.validateSetPessoaFisicaCPF(adminCPF);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaAdminController.validateSetPessoaFisicaRG(adminRG);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaAdminController.validateSetPessoaEmail(adminEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			this.programParameter.getAdministrator().setLogin(adminUsername);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			if (adminPassword.equals(adminPasswordRepeated))
				this.programParameter.getAdministrator().setPsswdHash(adminPassword);
			else
				throw new Exception("Os campos de password digitados não coincidem entre-si");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		return errorList;
	}

	public List<Exception> validateSetOrganization(String orgName,
			String orgRazaoSocial,
			String orgIE,
			String orgCNPJ,
			String orgIMunicipal,
			String orgEmail) {

		List<Exception> errorList = new ArrayList<Exception>();
		this.organizationErrorList = errorList;

		try {
			pessoaOrganizationController.setName(orgName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaOrganizationController.validateSetPessoaJuridicaCNPJ(orgCNPJ);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaOrganizationController.validateSetPessoaJuridicaIEstadual(orgIE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaOrganizationController.validateSetPessoaEmail(orgEmail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaOrganizationController.validateSetPessoaJuridicaIMunicipal(orgIMunicipal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		try {
			pessoaOrganizationController.setRazaoSocial(orgRazaoSocial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errorList.add(e);
		}

		return errorList;
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
		pessoaAdminController = new PessoaController();
		pessoaOrganizationController = new PessoaController();

		pessoaAdminController.setupNewPessoaFisica();
		pessoaOrganizationController.setupNewPessoaJuridica();

		Employee administrator = new Employee();
		administrator.setPessoa((PessoaFisica) pessoaAdminController.getStagedPessoa());
		administrator.setLevel(SoftwareOperatorLevel.ADMINISTRATOR);

		programParameter.setAdministrator(administrator);

		programParameter.setOrganization((PessoaJuridica) pessoaOrganizationController.getStagedPessoa());

	}

}
