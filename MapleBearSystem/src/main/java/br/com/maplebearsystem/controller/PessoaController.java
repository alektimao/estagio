/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.maplebearsystem.controller.UserInputException;
import br.com.maplebearsystem.controller.UserInputExceptionCombo;


import br.com.maplebearsystem.dao.PessoaDAO;
import br.com.maplebearsystem.model.Address;
import br.com.maplebearsystem.model.City;
import br.com.maplebearsystem.model.Pessoa;
import br.com.maplebearsystem.model.PessoaFisica;
import br.com.maplebearsystem.model.PessoaJuridica;
import br.com.maplebearsystem.model.Phone;
import br.com.maplebearsystem.model.Phone.PhoneType;
import br.com.maplebearsystem.model.constants.PessoaConstants;
import br.com.maplebearsystem.model.validators.FieldValidators;
import br.com.maplebearsystem.ui.util.TextUtils;

/**
 *
 * @author Gabriel L. P. Abreu
 */
public class PessoaController {

	private Address detachedAddress;
	private Phone detachedPhone;
	private PessoaDAO pessoaDAO;
	private UserInputExceptionCombo primaryAddressErrorList;
	private UserInputExceptionCombo primaryPhoneErrorList;
	private Address stagedAddress;
	private Pessoa stagedPessoa;
	private Phone stagedPhone;

	public PessoaController() {
		pessoaDAO = new PessoaDAO();
	}

	private void addAddress() {
		stagedAddress.setPessoa(stagedPessoa);
		stagedPessoa.getAddresses().add(stagedAddress);
	}

	private void addPhone() {
		stagedPessoa.addPhone(stagedPhone);
	}

	public void checkOrSwitchToPessoaFisica() {
		if (stagedPessoa == null) {
			setupNewPessoaFisica();
		} else if (!(stagedPessoa instanceof PessoaFisica)) {
			if (stagedPessoa.getId() != null)
				throw new UnsupportedOperationException(
						"Error: cannot convert pesisted PessoaJuridica to PessoaFisica");

			PessoaFisica newpessoa = new PessoaFisica();

			newpessoa.setAddresses(stagedPessoa.getAddresses());
			newpessoa.setPhones(stagedPessoa.getPhones());
			newpessoa.setName(stagedPessoa.getName());
			newpessoa.setEmail(stagedPessoa.getEmail());

			this.stagedPessoa = newpessoa;
		}
	}

	public void checkOrSwitchtoPessoaJuridica() {
		if (stagedPessoa == null) {
			setupNewPessoaJuridica();
		} else if (!(stagedPessoa instanceof PessoaJuridica)) {
			if (stagedPessoa.getId() != null)
				throw new UnsupportedOperationException(
						"Error: cannot convert pesisted PessoaFisica to PessoaJuridica");

			PessoaJuridica newpessoa = new PessoaJuridica();

			newpessoa.setAddresses(stagedPessoa.getAddresses());
			newpessoa.setPhones(stagedPessoa.getPhones());
			newpessoa.setName(stagedPessoa.getName());
			newpessoa.setEmail(stagedPessoa.getEmail());

			this.stagedPessoa = newpessoa;

		}

	}

	public void deletePessoa(Pessoa pessoa) throws UserInputException {
		PessoaDAO pdao = new PessoaDAO();
		pdao.delete(pessoa);
	}

	public void deleteStagedPessoa() {
		try {
			deletePessoa(this.stagedPessoa);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Pessoa> findPessoas() {
		return pessoaDAO.listAll();
	}

	public List<Pessoa> findPessoas(String filter) {
		return pessoaDAO.findByName(filter);
	}

	public List<PessoaFisica> findPessoasFisicas() {
		return pessoaDAO.listFisicaAll();
	}

	public List<PessoaFisica> findPessoasFisicas(String filter) {
		return pessoaDAO.findFisicaByName(filter);
	}

	public List<PessoaJuridica> findPessoasJuridicas() {
		return pessoaDAO.listJuridicaAll();
	}

	public List<PessoaJuridica> findPessoasJuridicas(String filter) {
		return pessoaDAO.findJuridicaByName(filter);
	}

	public Pessoa getStagedPessoa() {
		return stagedPessoa;
	}

	public void removeAddress() throws Exception {
		try {
			stagedPessoa.removeAddress(detachedAddress);
		} catch (Exception e) {
			throw new Exception();
		}

	}

	public void removePhone() throws Exception {
		try {
			stagedPessoa.removePhone(detachedPhone);
		} catch (Exception e) {
			throw new Exception();
		}

	}

	public void reset() {
		stagedPessoa = null;
	}

	public void save() {
		try {
			pessoaDAO.save(stagedPessoa);
		} catch (Exception e) {
			System.out.println("Failure: failed to save " + stagedPessoa.getName() + " - " + e.getMessage());
		}

	}

	public void saveAddress() throws UserInputException {
		if (stagedPessoa.getAddresses() == null) {
			stagedPessoa.setPhones(new ArrayList<Phone>());
		}

		if (detachedAddress != null && stagedPessoa.getAddresses().contains(detachedAddress)) {
			updateAddress();
		} else {
			addAddress();
		}

	}

	public void savePessoa() {
		this.savePessoa(this.stagedPessoa);
	}

	public void savePessoa(Pessoa pessoa) {
		PessoaDAO dao = new PessoaDAO();

		dao.save(pessoa);

	}

	public void savePessoa(String name, String otherName, String rgie, String cpfcnpj, String imunicipal, String email)
			throws UserInputExceptionCombo, Exception {

		UserInputExceptionCombo errorList = new UserInputExceptionCombo();

		try {
			validateSetPessoaName(name);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		if (stagedPessoa instanceof PessoaJuridica) {

			try {
				validateSetPessoaJuridicaRSocial(otherName);
			} catch (UserInputException e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaJuridicaIMunicipal(imunicipal);
			} catch (UserInputException e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaJuridicaIEstadual(rgie);
			} catch (UserInputException e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaJuridicaCNPJ(cpfcnpj);
			} catch (UserInputException e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

		} else {
			try {
				validateSetPessoaFisicaRG(rgie);
			} catch (UserInputException e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaFisicaCPF(cpfcnpj);
			} catch (UserInputException e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}
		}

		try {
			validateSetPessoaEmail(email);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}
		if (!primaryPhoneErrorList.isEmpty())
			errorList.addAll(primaryPhoneErrorList);
		if (!primaryAddressErrorList.isEmpty())
			errorList.addAll(primaryAddressErrorList);

		if (!errorList.isEmpty()) {
			throw errorList;
		}
		try {
			this.savePessoa(this.stagedPessoa);
		} catch (Exception saveException) {
			throw new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage());
		}

	}

	public void savePhone() throws UserInputException {

		if (stagedPessoa.getPhones() == null) {
			stagedPessoa.setPhones(new ArrayList<Phone>());
		}

		if (detachedPhone != null && stagedPessoa.getPhones().contains(detachedPhone)) {
			updatePhone();
		} else {
			addPhone();
		}

	}

	public void setContactName(String contactName) throws UserInputException {

		String text = contactName;

		if (text.length() > PessoaConstants.MAXLEN_CONTACTNAME.getValue()) {
			throw new UserInputException(
					"Campo Nome do Contato deve possuir " + "no máximo " + PessoaConstants.MAXLEN_CONTACTNAME.getValue()
							+ "caracteres");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setContactName(text);

	}

	public void setRazaoSocial(String text) throws UserInputException {

		String textM = text;

		if (textM == null || "".equals(textM)) {
			textM = "";
		}

		textM = textM.replaceAll("^\\s+|\\s+$", "");

		if (textM.length() > PessoaConstants.MAXLEN_RSOCIAL.getValue()) {
			throw new UserInputException(
					"Campo Razão Social deve possuir no máximo " + PessoaConstants.MAXLEN_RSOCIAL.getValue()
							+ "caracteres");
		}

		if (!(stagedPessoa instanceof PessoaJuridica)) {
			throw new UserInputException("Razão social só pode ser atribuida a uma stagedPessoa Juridica");
		}

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setRazaoSocial(textM);

	}

	@Deprecated
	public void setStagedPhone(Phone phone) {
		this.stagedPhone = phone;
	}

	public void setupEditAddress(Address address) {
		detachedAddress = address;
		stagedAddress = new Address();
	}

	public void setupEditPessoa(Pessoa pessoa) {
		this.stagedPessoa = pessoa;
	}

	public void setupEditPhone(Phone phone) {
		detachedPhone = phone;
		stagedPhone = new Phone();
	}

	public void setupNewAddress() {
		detachedAddress = null;
		stagedAddress = new Address();
	}

	public void setupNewPessoaFisica() {
		stagedPessoa = new PessoaFisica();
	}

	public void setupNewPessoaJuridica() {
		stagedPessoa = new PessoaJuridica();
	}

	public void setupNewPhone() {
		detachedPhone = null;

	}

	public void setupNewStagedAddress() {
		stagedAddress = new Address();
		detachedAddress = null;
	}

	public void setupNewStagedPhone() {
		stagedPhone = new Phone();
		detachedPhone = null;
	}

	private void updateAddress() {
		detachedAddress.setAddress(stagedAddress.getAddress());
		detachedAddress.setAddressComplement(stagedAddress.getAddressComplement());
		detachedAddress.setDistrict(stagedAddress.getDistrict());
		detachedAddress.setCity(stagedAddress.getCity());
		detachedAddress.setPostalCode(stagedAddress.getPostalCode());
		detachedAddress.setPessoa(stagedPessoa);
	}

	private void updatePhone() {
		detachedPhone.setDdd(stagedPhone.getDdd());
		detachedPhone.setNumber(stagedPhone.getNumber());
		detachedPhone.setTelcomCompany(stagedPhone.getTelcomCompany());
		detachedPhone.setType(stagedPhone.getType());
		detachedPhone.setPessoa(stagedPessoa);
	}

	public void validateSaveAddress(String postalCode,
			String address,
			String addressNumber,
			String district,
			String addressComplement,
			City city) throws UserInputExceptionCombo, Exception {

		UserInputExceptionCombo errorList = new UserInputExceptionCombo();

		try {
			validateSetAddressPostalCode(postalCode);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressString(address);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressNumberString(addressNumber);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressDistrict(district);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressComplement(addressComplement);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressCity(city);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		if (!errorList.isEmpty()) {
			throw errorList;
		}
		try {
			saveAddress();
		} catch (Exception e) {
			throw new Exception("Erro desconhecido ao salvar o telefone");
		}

	}

	public void validateSavePhone(String phoneNumber, String telecomCompany, PhoneType phoneType)
			throws UserInputExceptionCombo, Exception {

		UserInputExceptionCombo errorList = new UserInputExceptionCombo();

		try {
			validateSetPhoneNumber(phoneNumber);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetTelcomCompany(telecomCompany);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetPhoneType(phoneType);
		} catch (UserInputException e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		if (!errorList.isEmpty()) {
			throw errorList;
		}

		try {
			savePhone();
		} catch (Exception e) {
			throw new Exception("Erro desconhecido ao salvar o telefone");
		}
	}

	public void validateSavePrimaryAddress(String postalCode,
			String address,
			String addressNumber,
			String district,
			String addressComplement,
			City city) throws Exception {

		UserInputExceptionCombo errorList = new UserInputExceptionCombo();
		this.primaryAddressErrorList = errorList;

		// if there's nothing to save
		if ((postalCode == null || postalCode.equals("")) && (address == null || addressNumber.equals(""))
				&& (addressNumber == null || addressNumber.equals("")) && (district == null || district.equals("")))
			return;

		try {
			if (this.stagedPessoa.getAddresses() == null) {
				this.stagedPessoa.setAddresses(new ArrayList<Address>());
				setupNewStagedAddress();
			} else {
				if (this.stagedPessoa.getAddresses().isEmpty()) {
					setupNewStagedAddress();
				} else {
					this.setupEditAddress(this.stagedPessoa.getPrimaryAddress());
				}
			}
		} catch (Exception e) {
			System.out.println("Error: failed to set staged or detachedAddress " + e.getCause() + e.getMessage());
			throw e;
		}

		validateSaveAddress(postalCode, address, addressNumber, district, addressComplement, city);
	}

	public void validateSavePrimaryPhone(String phoneNumber, String telecomCompany, PhoneType phoneType)
			throws Exception {

		UserInputExceptionCombo errorList = new UserInputExceptionCombo();
		this.primaryPhoneErrorList = errorList;

		// if there's nothing to save
		if ((phoneNumber == null || phoneNumber.equals("")) && (telecomCompany == null || telecomCompany.equals("")))
			return;

		try {
			if (this.stagedPessoa.getPhones() == null) {
				this.stagedPessoa.setPhones(new ArrayList<Phone>());
				setupNewStagedPhone();
			} else {
				if (this.stagedPessoa.getPhones().isEmpty()) {
					this.setupNewStagedPhone();
				} else {
					this.setupEditPhone(this.stagedPessoa.getPrimaryPhone());
				}
			}
		} catch (Exception e) {
			System.out.println("Error: failed to set staged or detachedPhone " + e.getCause() + e.getMessage());
			throw e;
		}

		validateSavePhone(phoneNumber, telecomCompany, phoneType);

	}

	public void validateSetAddressCity(City selectedItem) throws Exception {

		if (selectedItem == null) {
			throw new UserInputException("Cidade não selecionada");
		}

		stagedAddress.setCity(selectedItem);

	}

	public void validateSetAddressComplement(String addressComplement) throws UserInputException {

		String text = addressComplement;

		if (text == null || "".equals(text)) {
			stagedAddress.setAddressComplement("");
			return;
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_ADDRESSCOMPLEMENT.getValue()) {
			throw new UserInputException(
					"Campo Complemento deve possuir no máximo " + PessoaConstants.MAXLEN_ADDRESSCOMPLEMENT.getValue()
							+ "caracteres");
		}

		stagedAddress.setAddressComplement(text);
	}

	public void validateSetAddressDistrict(String district) throws UserInputException {

		String text = district;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo Bairro deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_CITY.getValue()) {
			throw new UserInputException(
					"Campo Bairro deve possuir no máximo " + PessoaConstants.MAXLEN_CITY.getValue() + "caracteres");
		}

		stagedAddress.setDistrict(text);

	}

	public void validateSetAddressNumberString(String addressNumber) throws UserInputException {

		String text = addressNumber;
		if (text == null) {
			text = "";
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_ADDRESS.getValue()) {
			throw new UserInputException(
					"Campo Numero deve possuir no máximo " + PessoaConstants.MAXLEN_ADDRESS.getValue() + "caracteres");
		}

		stagedAddress.setAddressNumber(text);

	}

	public void validateSetAddressPostalCode(String postalCode) throws UserInputException {

		String text = postalCode;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo CEṔ deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validadeBrazilianCEPFormat(text)) {
			throw new UserInputException("Campo CEP deve possuir o formato 00000-000");
		}

		if (text.length() > PessoaConstants.MAXLEN_POSTALCODE.getValue()) {
			throw new UserInputException(
					"Campo CEP deve possuir no máximo " + PessoaConstants.MAXLEN_POSTALCODE.getValue() + "caracteres");
		}

		stagedAddress.setPostalCode(text);

	}

	public void validateSetAddressString(String addressString) throws UserInputException {

		String text = addressString;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo Endereço deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_ADDRESS.getValue()) {
			throw new UserInputException(
					"Campo Endereço deve possuir no máximo " + PessoaConstants.MAXLEN_ADDRESS.getValue()
							+ "caracteres");
		}

		stagedAddress.setAddress(text);
	}

	public void validateSetPessoaEmail(String email) throws UserInputException {

		String text = email;

		if (text == null) {
			text = "";
		}
		if (!"".equals(text))
		{
			text = text.replaceAll("^\\s+|\\s+$", "");
			
			if (!FieldValidators.validateEmail(text)) {
				throw new UserInputException("Campo Email possui formato invalido");
			}			
		}

//		if (text == null || "".equals(text)) {
//			throw new UserInputException("Campo Email deve ser preenchido");
//		}


		stagedPessoa.setEmail(text);

	}

	public void validateSetPessoaFisicaCPF(String cpf) throws UserInputException {

		String text = cpf;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo CPF deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateBrazilianCPFFormat(text)) {
			throw new UserInputException("Campo CPF deve possuir o " + "formato 000.000.000-00");
		}

		if (!FieldValidators.validateBrazilianCPF(text)) {
			throw new UserInputException("Campo CPF Inválido");
		}

		// TODO Improve method polymorphism security

		((PessoaFisica) stagedPessoa).setCpf(text);
	}

	public void validateSetPessoaFisicaRG(String rg) throws UserInputException {

		String text = rg;

		if (text == null) {
			text = "";
		}

//		if (text == null || "".equals(text)) {
//			throw new UserInputException("Campo RG deve ser preenchido");
//		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateBrazilianRGFormat(text)) {
			throw new UserInputException("Campo RG com formato invalido");
		}

		// TODO Improve method polymorphism security

		((PessoaFisica) stagedPessoa).setRg(text);
	}

	public void validateSetPessoaJuridicaCNPJ(String cnpj) throws UserInputException {

		String text = cnpj;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo CNPJ deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateBrazilianCNPJFormat(text)) {
			throw new UserInputException("Campo CNPJ deve possuir o " + "formato 00.000.000/0000-00");
		}

		if (!FieldValidators.validateBrazilianCNPJ(text)) {
			throw new UserInputException("Campo CNPJ Inválido!");
		}

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setCnpj(text);
	}

	public void validateSetPessoaJuridicaIEstadual(String iestadual) throws UserInputException {

		String text = iestadual;

		if (text == null) {
			text = "";
		}

		if (text.length() > PessoaConstants.MAXLEN_INSCESTADUAL.getValue()) {
			throw new UserInputException(
					"Campo Inscrição Estadual deve possuir " + "no máximo "
							+ PessoaConstants.MAXLEN_INSCESTADUAL.getValue() + "caracteres");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setIestadual(text);

	}

	public void validateSetPessoaJuridicaIMunicipal(String imunicipal) throws UserInputException {

		String text = imunicipal;

		if (text == null) {
			text = "";
		}

		if (text.length() > PessoaConstants.MAXLEN_INSCMUNICIPAL.getValue()) {
			throw new UserInputException(
					"Campo Inscrição Municipal deve possuir " + "no máximo "
							+ PessoaConstants.MAXLEN_INSCMUNICIPAL.getValue() + "caracteres");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setImunicipal(text);

	}

	private void validateSetPessoaJuridicaRSocial(String razaoSocial) throws UserInputException {

		String text = razaoSocial;

		if (text == null || text.equals("")) {
			((PessoaJuridica) stagedPessoa).setRazaoSocial("");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!text.matches(FieldValidators.RegexCharsets.CHARSET_PESSOAJURIDICA_RAZAOSOCIAL.getValue())) {
			throw new UserInputException("Campo \"Razão Social\" possui caracteres inválidos!");
		}

		((PessoaJuridica) stagedPessoa).setRazaoSocial(text);

	}

	public void validateSetPessoaName(String name) throws UserInputException {

		String text = name;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo \"Nome\" não foi preenchido! Preencha-o antes de continuar.");
		}

		text = TextUtils.trimLeadingAndTrailingWhiteSpaces(text);

		if (text.length() > PessoaConstants.MAXLEN_NAME.getValue()) {
			throw new UserInputException(
					"Campo nome deve possuir no máximo " + PessoaConstants.MAXLEN_NAME + "caracteres");
		}

		stagedPessoa.setName(text);
	}

	public void validateSetPhoneNumber(String phoneNumber) throws UserInputException {

		String text = phoneNumber;

		if (text == null || "".equals(text)) {
			throw new UserInputException("Campo Telefone deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		String[] snumber = text.split(" ");

		snumber[0] = snumber[0].substring(1, 3);

		Integer ddd = new Integer(snumber[0]);

		Integer number = new Integer(snumber[1]);

		stagedPhone.setNumber(number);
		stagedPhone.setDdd(ddd);
	}

	public void validateSetPhoneType(Phone.PhoneType phoneType) throws UserInputException {

		if (phoneType == null) {
			throw new UserInputException("Tipo de telefone não selecionado");
		}

		stagedPhone.setType(phoneType);
	}

	public void validateSetTelcomCompany(String text) throws UserInputException {

		if (text == null) {
			stagedPhone.setTelcomCompany("");
		} else {
			stagedPhone.setTelcomCompany(text.replaceAll("^\\s+|\\s+$", ""));
		}
	}

}