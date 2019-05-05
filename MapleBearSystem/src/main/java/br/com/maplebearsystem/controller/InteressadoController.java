package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.InteressadosDAO;
import br.com.maplebearsystem.model.Interessados;
import br.com.maplebearsystem.model.validators.FieldValidators;

public class InteressadoController {

	private Interessados partInteressados;

	public InteressadoController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Interessados Methods

	public Interessados getInteressados() {
		return partInteressados;
	}

	public void setupEditInteressados(Interessados partInteressados) {
		this.partInteressados = partInteressados;

	}

	public void setupNewInteressados() {
		partInteressados = new Interessados();

	}

	public List<Exception> saveInteressados(String nome, String motivo, LocalDate data, String phoneNumber,
			String phoneNumber2, String email1, String email2) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (partInteressados == null) {
			partInteressados = new Interessados();
		}

		try {
			setInteressadosName(nome);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setInteressadosMotivo(motivo);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setInteressadosEmail1(email1);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setInteressadosEmail2(email2);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setInteressadosTelefone(phoneNumber, phoneNumber2);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}
		try {
			setInteressadosData(data);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		if (errorList.isEmpty()) {
			try {
				saveInteressados(this.partInteressados);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Interessados Já cadastrado"));
				System.out.println("Info: Interessados \"" + partInteressados.getNome() + "\" already registered - "
						+ e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	public void saveInteressados(Interessados partInteressados) {
		InteressadosDAO dao = new InteressadosDAO();
		dao.save(partInteressados);
	}

	public void deleteInteressados() {
		InteressadosDAO dao = new InteressadosDAO();
		dao.delete(partInteressados);

	}

	public void setInteressadosName(String description) throws Exception {

		if (description == null || description.equals("")) {
			throw new Exception("Campo Nome deve ser preenchido");
		}

		// trim trailing and leading white spaces
		description = description.replaceAll("^\\s+|\\s+$", "");

		if (!description.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_DESCRIPTION.getValue())) {
			throw new Exception("Campo Nome possui caracteres Inválidos");
		}

		partInteressados.setNome(description);

	}

	public void setInteressadosMotivo(String extendedDescription) throws Exception {

		String text = extendedDescription;
		if (text == null) {
//			throw new Exception("Campo Descrição Detalhada deve ser preenchido");
			text = "";
		}

		// trim trailing and leading white spaces
		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!text.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_EXTENDEDDESCRIPTION.getValue())) {
			throw new Exception("Campo Motivo possui caracteres Inválidos");
		}

		partInteressados.setMotivo(text);

	}

	public void setInteressadosEmail1(String email) throws Exception {

		String text = email;

		if (text == null) {
			text = "";
		}

//		if (text == null || "".equals(text)) {
//			throw new Exception("Campo Email deve ser preenchido");
//		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateEmail(text)) {
			throw new Exception("Campo Email possui formato invalido");
		}

		partInteressados.setEmail1(text);

	}

	public void setInteressadosEmail2(String email) throws Exception {

		String text = email;

		if (text == null) {
			text = "";
		}

//		if (text == null || "".equals(text)) {
//			throw new Exception("Campo Email deve ser preenchido");
//		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateEmail(text)) {
			throw new Exception("Campo Email possui formato invalido");
		}

		partInteressados.setEmail2(text);

	}

	public void setInteressadosTelefone(String phoneNumber, String phoneNumber2) throws Exception {

		if (phoneNumber == null || phoneNumber.equals(""))
			throw new Exception("Campo Telefone deve ser preenchido");

		partInteressados.setTelefone1(phoneNumber);

		if (phoneNumber2 != null && !phoneNumber.equals(""))
			partInteressados.setTelefone2(phoneNumber2);

	}

	public void setInteressadosData(LocalDate data) throws Exception {
		if (data == null) {
			throw new Exception("Data não selecionada");
		}
		if (data.getDayOfYear() < 19) {
			throw new Exception("Data inválida");
		}
		partInteressados.setData(Date.valueOf(data));
	}

// ENDSECTION Interessados Methods

// SECTION Controller to DAO Methods
	public List<Interessados> getInteressadoss() {
		InteressadosDAO dao = new InteressadosDAO();

		return dao.listAllInteressados();
	}

	public List<Interessados> getInteressadoss(String filter) {
		InteressadosDAO dao = new InteressadosDAO();

		return dao.listInteressados(filter);
	}

// ENDSECTION Controller to DAO Methods

}
