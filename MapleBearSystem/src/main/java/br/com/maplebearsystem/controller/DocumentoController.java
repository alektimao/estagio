package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.dao.DocumentoDAO;
import br.com.maplebearsystem.dao.FornecedorDAO;
import br.com.maplebearsystem.dao.FornecedorProductDAO;
import br.com.maplebearsystem.dao.Requisicao_ProductDAO;
import br.com.maplebearsystem.model.Aluno;
import br.com.maplebearsystem.model.Documento;
import br.com.maplebearsystem.model.FornecedorProduct;

public class DocumentoController {

	private Documento documento;
	private List<Documento> listadocumentos;
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
	public Aluno getaluno() {
		return documento.getAluno();
	}
	public void setAluno(Aluno aluno) {
		this.documento.setAluno(aluno);
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public void setupNewDocumento() {
		documento = new Documento();
		listadocumentos = new ArrayList<Documento>();
	}

	public List<Exception> validar(Aluno aluno, String documento, String pasta, String sala) {
		List<Exception> errList = new ArrayList<Exception>();
		this.documento = new Documento();
		
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
		try {
			validateSala(sala);
		} catch (Exception e) {
			errList.add(e);
			System.out.println("Info: input validation error: " + e.getMessage() + e.getCause());
		}
		if (errList.isEmpty()) {
			try {
				listadocumentos.add(this.documento);
				//saveDocumento(this.documento);
			} catch (Exception e) {
				System.out.println("Error: Failed to save Documento - " + e.getMessage());
				errList.add(new Exception("Falha ao Salvar"));
			}
		}
		return errList;
	}

	public void saveDocumento(Documento documento) {
		
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
		this.documento.setPasta(pasta);
	}
	
	private void validateSala(String sala) throws Exception{
		if (sala == null || sala.equals("")) {
			//nome2 = "";
			throw new Exception("Defina o Nome da Sala!");
		}
		this.documento.setSala(sala);
	}

	public List<Documento> getListadocumentos() {
		return listadocumentos;
	}

	public void setListadocumentos(List<Documento> listadocumentos) {
		this.listadocumentos = listadocumentos;
	}

	public void removeDocumento(Documento doc) {
		listadocumentos.remove(doc);
		DocumentoDAO dao = new DocumentoDAO();
		dao.delete(doc);
	}

	public void getDocAluno(Long id) {
		DocumentoDAO dao = new DocumentoDAO();

		this.listadocumentos = dao.listDocumento(id);
	}
}
