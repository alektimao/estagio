package br.com.maplebearsystem.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import br.com.maplebearsystem.dao.AlunoDAO;
import br.com.maplebearsystem.dao.DocumentoDAO;
import br.com.maplebearsystem.dao.RestricaoDAO;
import br.com.maplebearsystem.dao.Restricao_AlimentoDAO;
import br.com.maplebearsystem.dao.Restricao_RemedioDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.model.Restricao;
import br.com.maplebearsystem.model.Restricao_Alimento;
import br.com.maplebearsystem.model.Restricao_Remedio;

public class RestricaoController {

	private Restricao restricao;
	private Restricao_Alimento requisicao_alimento;
	private Restricao_Alimento alteraralimento;
	private Restricao_Remedio alterarremedio;
	private Restricao_Remedio requisicao_remedio;
	private List<Restricao_Alimento> listalimento;
	private List<Restricao_Remedio> listremedio;

	public RestricaoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public Restricao_Remedio getAlterarremedio() {
		return alterarremedio;
	}

	public void setAlterarremedio(Restricao_Remedio alterarremedio) {
		this.alterarremedio = alterarremedio;
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

	public Restricao_Alimento getAlteraralimento() {
		return alteraralimento;
	}

	public void setAlteraralimento(Restricao_Alimento alteraralimento) {
		this.alteraralimento = alteraralimento;
	}

	public void setAluno(Aluno resultado) {
		this.restricao.setAluno(resultado);
	}

	public Restricao getRestricaos(Long id) {
		RestricaoDAO r = new RestricaoDAO();
		try {
			this.restricao = r.listRestricao(id);			
		} catch (NoResultException e) {
			setupNewRestricao();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		this.restricao.setRequisicao_Remedio(r.listRestricaoRem(this.restricao.getId()));
		this.restricao.setRequisicao_Alimento(r.listRestricaoAli(this.restricao.getId()));
		return this.restricao;
	}

	public Aluno getaluno() {
		return restricao.getAluno();
	}

	public void setupNewRestricao() {
		restricao = new Restricao();
		restricao.setRequisicao_Alimento(new ArrayList<Restricao_Alimento>());
		restricao.setRequisicao_Remedio(new ArrayList<Restricao_Remedio>());
	}

	public List<Exception> validar(Aluno aluno, String gravidade, String alimento, String sintomas, String conduta,
			LocalDate de, LocalDate ate) {
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
		try {
			validateDataDe(de);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
//		try {
//			validateDataAte(ate);
//		} catch (Exception e) {
//			errList.add(e);
//			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
//		}
		if (errList.isEmpty()) {
			try {
				if (alteraralimento == null) {
					restricao.addRestricaoAlimento(requisicao_alimento);	
				}
				else
				{
					restricao.AlterarRestricaoAlimento(alteraralimento);
				}
				// saveDocumento(this.documento);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Documento - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	public List<Exception> validar(Aluno aluno, String gravidade, String dosagem, String remedio, String posologia,
			String plano, String sintomas, String conduta, LocalDate de, LocalDate ate) {
		List<Exception> errList = new ArrayList<Exception>();
		this.requisicao_remedio = new Restricao_Remedio();
		try {
			validateAluno(aluno);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateGravidade2(gravidade);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateDosagem(dosagem);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateRemedio(remedio);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validatePosologia(gravidade);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validatePlano(plano);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateSintomas2(sintomas);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateConduta2(conduta);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validateDataDe2(de);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
//		try {
//			validateDataAte2(ate);
//		} catch (Exception e) {
//			errList.add(e);
//			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
//		}
		if (errList.isEmpty()) {
			try {
				if (alterarremedio == null) {
					restricao.addRestricaoRemedio(requisicao_remedio);	
				}
				else
				{
					restricao.AlterarRestricaoAlimento(alteraralimento);
				}
			}
			catch (Exception e) {
				System.out.println("Error: Failed to save Documento - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	private void validateDataAte2(LocalDate ate) throws Exception {
		if (ate == null) {
			throw new Exception("Data Fim não selecionada");
		}
		if (ate != null) {
			if (!requisicao_remedio.getDe().before(Date.valueOf(ate))) {
				throw new Exception("Data Fim deve ser depois da Data Início");
			}
		}
		if (alterarremedio != null) {
			alterarremedio.setAte(Date.valueOf(ate));
			
		}
		requisicao_remedio.setAte(Date.valueOf(ate));
	}

	private void validateDataDe2(LocalDate de) throws Exception {
		if (de == null) {
			throw new Exception("Data Início não selecionada");
		}
		if (de.getDayOfYear() < 19) {
			throw new Exception("Data inválida");
		}
		if (alterarremedio != null) {
			alterarremedio.setDe(Date.valueOf(de));			
		}
		requisicao_remedio.setDe(Date.valueOf(de));
	}

	private void validateConduta2(String conduta) throws Exception {
		if (conduta == null || conduta.equals("")) {
			throw new Exception("Defina a Conduta a ser tomada!");
		}
		if (alterarremedio != null) {
			alterarremedio.setCondutas(conduta);
			
		}
		requisicao_remedio.setCondutas(conduta);
	}

	private void validateSintomas2(String sintomas) throws Exception {
		if (sintomas == null || sintomas.equals("")) {
			throw new Exception("Defina o(s) Sintoma(s)!");
		}
		if (alterarremedio != null) {
			alterarremedio.setSintomas(sintomas);
			
		}
		requisicao_remedio.setSintomas(sintomas);

	}

	private void validatePlano(String plano) throws Exception {
		if (plano == null || plano.equals("")) {
			throw new Exception("Defina o Plano de Saúde!");
		}
		if (alterarremedio != null) {
			alterarremedio.setPlano(plano);
			
		}
		requisicao_remedio.setPlano(plano);
	}

	private void validatePosologia(String posologia) throws Exception {
		if (posologia == null || posologia.equals("")) {
			throw new Exception("Defina a Posologia!");
		}
		if (alterarremedio != null) {
			alterarremedio.setPosologia(posologia);
			
		}
		requisicao_remedio.setPosologia(posologia);

	}

	private void validateRemedio(String remedio) throws Exception {
		if (remedio == null || remedio.equals("")) {
			throw new Exception("Defina o Remédio!");
		}
		if (alterarremedio != null) {
			alterarremedio.setRemedio(remedio);
			
		}
		requisicao_remedio.setRemedio(remedio);
	}

	private void validateDosagem(String dosagem) throws Exception {
		if (dosagem == null || dosagem.equals("")) {
			throw new Exception("Defina a Conduta a ser tomada!");
		}
		if (alterarremedio != null) {
			alterarremedio.setDosagem(dosagem);			
		}
		requisicao_remedio.setDosagem(dosagem);

	}
	private void validateGravidade2(String gravidade) throws Exception {
		if (gravidade == null || gravidade.equals("")) {
			throw new Exception("Defina a gravidade!");
		}
		if (alterarremedio != null) {
			alterarremedio.setGravidade(gravidade);
			
		}
		requisicao_remedio.setGravidade(gravidade);
	}

	private void validateConduta(String conduta) throws Exception {
		if (conduta == null || conduta.equals("")) {
			throw new Exception("Defina a Conduta a ser tomada!");
		}
		if (alteraralimento != null) {
			alteraralimento.setCondutas(conduta);
			
		}
		requisicao_alimento.setCondutas(conduta);
	}

	private void validateSintomas(String sintomas) throws Exception {
		if (sintomas == null || sintomas.equals("")) {
			throw new Exception("Defina o(s) Sintomas da Restricao!");
		}
		if (alteraralimento != null) {
			alteraralimento.setSintomas(sintomas);
			
		}
		requisicao_alimento.setSintomas(sintomas);
	}

	private void validateAlimento(String alimento) throws Exception {
		if (alimento == null || alimento.equals("")) {
			throw new Exception("Defina o Alimento!");
		}
		if (alteraralimento != null) {
			alteraralimento.setAlimento(alimento);			
		}
		requisicao_alimento.setAlimento(alimento);
	}

	private void validateGravidade(String gravidade) throws Exception {
		if (gravidade == null || gravidade.equals("")) {
			throw new Exception("Defina a gravidade!");
		}
		if (alteraralimento != null) {
		alteraralimento.setGravidade(gravidade);
		}
		requisicao_alimento.setGravidade(gravidade);
		
	}

	private void validateDataAte(LocalDate ate) throws Exception {
		if (ate == null) {
			throw new Exception("Data Fim não selecionada");
		}
		if (ate != null) {
			if (!requisicao_alimento.getDe().before(Date.valueOf(ate))) {
				throw new Exception("Data Fim deve ser depois da Data Início");
			}
		}
		if (alteraralimento != null) {
			alteraralimento.setAte(Date.valueOf(ate));			
		}
		requisicao_alimento.setAte(Date.valueOf(ate));
	}

	private void validateDataDe(LocalDate de) throws Exception {
		if (de == null) {
			throw new Exception("Data Início não selecionada");
		}
		if (de.getDayOfYear() < 19) {
			throw new Exception("Data inválida");
		}
		if (alteraralimento != null) {
			alteraralimento.setDe(Date.valueOf(de));
			
		}
		requisicao_alimento.setDe(Date.valueOf(de));
	}

	private void validateAluno(Aluno aluno) throws Exception {
		if (aluno == null) {
			throw new Exception("Defina o Aluno da Restrição!");
		}
		if (restricao.getAluno() == null) {
			restricao.setAluno(aluno);
		}
	}

	public void saveRestricao() {
		RestricaoDAO dao = new RestricaoDAO();
		dao.save(restricao);
	}

	public void removeAlimento(Restricao_Alimento ali) {
		for (Restricao_Alimento restricao_Alimento : restricao.getRequisicao_Alimento()) {
			if (ali.getId() == restricao_Alimento.getId()) {
				Restricao_AlimentoDAO dao = new Restricao_AlimentoDAO();
				dao.delete2(restricao_Alimento.getId());
			}
		}
		restricao.removeRestricaoAlimento(ali);				
//		if (restricao.getRequisicao_Alimento().size()>0 || restricao.getRequisicao_Remedio().size()>0) {
//			saveRestricao();			
//		}
	}

	public void removeRemedio(Restricao_Remedio rem) {
		
		for (Restricao_Remedio restricao_Remedio : restricao.getRequisicao_Remedio()) {
			if (rem.getId() == restricao_Remedio.getId()) {
				Restricao_RemedioDAO dao = new Restricao_RemedioDAO();
				dao.delete2(restricao_Remedio.getId());
			}
		}
		restricao.removeRestricaoRemedio(rem);
//		if (restricao.getRequisicao_Alimento().size()>0 || restricao.getRequisicao_Remedio().size()>0) {
//			saveRestricao();			
//		}
	}



}
