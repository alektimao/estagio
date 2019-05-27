package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.DocumentoDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;

public class DocumentoController {

	private Documento documento;

	public DocumentoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

	public DocumentoController(Documento documento) {
		super();
		this.documento = documento;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public void setupNewDocumento() {
		documento = new Documento();
	}

	public void validar(Aluno aluno, String documento, String pasta) {
		List<Exception> errList = new ArrayList<Exception>();

		try {
			validateAluno(aluno);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validatedocumento(documento);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		try {
			validatePasta(pasta);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				saveDocumento(this.documento);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Documento - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}

	}

	private void saveDocumento(Documento documento) {
		
		DocumentoDAO dao = new DocumentoDAO();
		dao.save(documento);
	}

	private void validateAluno(Aluno aluno) throws Exception{
		
		if (aluno == null) {
			throw new Exception("Defina o Aluno do Documento!");
		}
		documento.setAluno(aluno);
	}

	private void validatedocumento(String documento) throws Exception{
		
		if (documento == null || documento.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome documento!");
		}
		
		this.documento.setDocumento(documento);
		
	}

	private void validatePasta(String pasta) throws Exception{
		if (pasta == null || pasta.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome da Pasta!");
		}
		
	}
}
