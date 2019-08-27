/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.maplebearsystem.controller;

import java.util.ArrayList;
import java.util.List;

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

/**
 *
 * @author Gabriel L. P. Abreu
 */
public class PessoaController {

	private Address detachedAddress;
	private Phone detachedPhone;
	private PessoaDAO pessoaDAO;
	private List<Exception> primaryAddressErrorList;
	private List<Exception> primaryPhoneErrorList;
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

	private void validateSetPessoaJuridicaRSocial(String razaoSocial) throws Exception {

		String text = razaoSocial;

		if (text == null || text.equals("")) {
			((PessoaJuridica) stagedPessoa).setRazaoSocial("");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!text.matches(FieldValidators.RegexCharsets.CHARSET_PESSOAJURIDICA_RAZAOSOCIAL.getValue())) {
			throw new Exception("Campo \"Razão Social\" possui caracteres inválidos!");
		}

		((PessoaJuridica) stagedPessoa).setRazaoSocial(text);

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

	public void deletePessoa(Pessoa pessoa) throws Exception {
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

	public List<PessoaJuridica> getJuridicas() {
		return pessoaDAO.listJuridicaAll();
	}

	public List<PessoaJuridica> getJuridicas(String filter) {
		return pessoaDAO.findJuridicaByName(filter);
	}

	public List<Pessoa> getPessoas() {
		return pessoaDAO.listAll();
	}

	public List<Pessoa> getPessoas(String filter) {
		return pessoaDAO.findByName(filter);
	}

	public List<PessoaFisica> getPessoasFisica() {
		return pessoaDAO.listFisicaAll();
	}

	public List<PessoaFisica> getPessoasFisica(String filter) {
		return pessoaDAO.findFisicaByName(filter);
	}

	public List<PessoaJuridica> getPessoasJuridica() {
		return pessoaDAO.listJuridicaAll();
	}

	public List<PessoaJuridica> getPessoasJuridica(String filter) {
		return pessoaDAO.findJuridicaByName(filter);
	}

	public Pessoa getStagedPessoa() {
		return stagedPessoa;
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

	public void saveAddress() throws Exception {
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

	public List<Exception> savePessoa(String name,
			String otherName,
			String rgie,
			String cpfcnpj,
			String imunicipal,
			String email) {

		List<Exception> errorList = new ArrayList<Exception>();

		try {
			setName(name);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		if (stagedPessoa instanceof PessoaJuridica) {

			try {
				validateSetPessoaJuridicaRSocial(otherName);
			} catch (Exception e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaJuridicaIMunicipal(imunicipal);
			} catch (Exception e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaJuridicaIEstadual(rgie);
			} catch (Exception e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaJuridicaCNPJ(cpfcnpj);
			} catch (Exception e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

		} else {
			try {
				validateSetPessoaFisicaRG(rgie);
			} catch (Exception e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}

			try {
				validateSetPessoaFisicaCPF(cpfcnpj);
			} catch (Exception e) {
				System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
				errorList.add(e);
			}
		}

		try {
			validateSetPessoaEmail(email);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}
		if (!primaryPhoneErrorList.isEmpty())
			errorList.addAll(primaryPhoneErrorList);
		if (!primaryAddressErrorList.isEmpty())
			errorList.addAll(primaryAddressErrorList);
		if (this.stagedAddress == null || this.stagedPhone == null) {
			errorList.add(new Exception("Pessoa sem endereço ou telefone \n"));
		}
		if (errorList.isEmpty()) {
			try {
				this.savePessoa(this.stagedPessoa);
			} catch (Exception saveException) {
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	public void savePhone() throws Exception {

		if (stagedPessoa.getPhones() == null) {
			stagedPessoa.setPhones(new ArrayList<Phone>());
		}

		if (detachedPhone != null && stagedPessoa.getPhones().contains(detachedPhone)) {
			updatePhone();
		} else {
			addPhone();
		}

	}

	public void setContactName(String contactName) throws Exception {

		String text = contactName;

		if (text.length() > PessoaConstants.MAXLEN_CONTACTNAME.getValue()) {
			throw new Exception(
					"Campo Nome do Contato deve possuir " + "no máximo " + PessoaConstants.MAXLEN_CONTACTNAME.getValue()
							+ "caracteres");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setContactName(text);
		;

	}

	public void setName(String name) throws Exception {

		String text = name;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo \"Nome\" não foi preenchido! Preencha-o antes de continuar.");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_NAME.getValue()) {
			throw new Exception("Campo nome deve possuir no máximo " + PessoaConstants.MAXLEN_NAME + "caracteres");
		}

		stagedPessoa.setName(text);
	}

	public void setRazaoSocial(String text) throws Exception {

		String textM = text;

		if (textM == null || "".equals(textM)) {
			textM = "";
		}

		textM = textM.replaceAll("^\\s+|\\s+$", "");

		if (textM.length() > PessoaConstants.MAXLEN_RSOCIAL.getValue()) {
			throw new Exception(
					"Campo Razão Social deve possuir no máximo " + PessoaConstants.MAXLEN_RSOCIAL.getValue()
							+ "caracteres");
		}

		if (!(stagedPessoa instanceof PessoaJuridica)) {
			throw new Exception("Razão social só pode ser atribuida a uma stagedPessoa Juridica");
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

	public List<Exception> validateSaveAddress(String postalCode,
			String address,
			String addressNumber,
			String district,
			String addressComplement,
			City city) {

		List<Exception> errorList = new ArrayList<Exception>();

		try {
			validateSetAddressPostalCode(postalCode);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressString(address);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressNumberString(addressNumber);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressDistrict(district);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressComplement(addressComplement);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetAddressCity(city);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		if (errorList.isEmpty()) {
			try {
				saveAddress();
			} catch (Exception e) {
				errorList.add(new Exception("Erro desconhecido ao salvar o telefone"));
			}
		}

		return errorList;
	}

	public List<Exception> validateSavePrimaryAddress(String postalCode,
			String address,
			String addressNumber,
			String district,
			String addressComplement,
			City city) {

		List<Exception> errorList = new ArrayList<Exception>();
		this.primaryAddressErrorList = errorList;

		// if there's nothing to save
		if ((postalCode == null || postalCode.equals("")) && (address == null || addressNumber.equals(""))
				&& (addressNumber == null || addressNumber.equals("")) && (district == null || district.equals("")))
			return errorList;

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
			errorList.add(e);
			return errorList;
		}

		List<Exception> resultList = validateSaveAddress(
				postalCode,
				address,
				addressNumber,
				district,
				addressComplement,
				city);

		if (!resultList.isEmpty())
			errorList.addAll(resultList);

		return errorList;
	}

	public List<Exception> validateSavePrimaryPhone(String phoneNumber, String telecomCompany, PhoneType phoneType) {

		List<Exception> errorList = new ArrayList<Exception>();
		this.primaryPhoneErrorList = errorList;

		// if there's nothing to save
		if ((phoneNumber == null || phoneNumber.equals("")) && (telecomCompany == null || telecomCompany.equals("")))
			return errorList;

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
			errorList.add(e);
			return errorList;
		}

		List<Exception> resultList = validateSavePhone(phoneNumber, telecomCompany, phoneType);

		if (!resultList.isEmpty())
			errorList.addAll(resultList);

		return errorList;

	}

	public List<Exception> validateSavePhone(String phoneNumber, String telecomCompany, PhoneType phoneType) {

		List<Exception> errorList = new ArrayList<Exception>();

		try {
			validateSetPhoneNumber(phoneNumber);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetTelcomCompany(telecomCompany);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		try {
			validateSetPhoneType(phoneType);
		} catch (Exception e) {
			System.out.println("Input validation error: " + e.getMessage() + " - " + e.getCause());
			errorList.add(e);
		}

		if (errorList.isEmpty()) {
			try {
				savePhone();
			} catch (Exception e) {
				errorList.add(new Exception("Erro desconhecido ao salvar o telefone"));
			}
		}

		if (errorList.isEmpty()) {
			try {
				savePhone();
			} catch (Exception e) {
				errorList.add(new Exception("Erro desconhecido ao salvar o telefone"));
			}
		}

		return errorList;
	}

	public void validateSetAddressCity(City selectedItem) throws Exception {

		if (selectedItem == null) {
			throw new Exception("Cidade não selecionada");
		}

		stagedAddress.setCity(selectedItem);

	}

	public void validateSetAddressComplement(String addressComplement) throws Exception {

		String text = addressComplement;

		if (text == null || "".equals(text)) {
			stagedAddress.setAddressComplement("");
			return;
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_ADDRESSCOMPLEMENT.getValue()) {
			throw new Exception(
					"Campo Complemento deve possuir no máximo " + PessoaConstants.MAXLEN_ADDRESSCOMPLEMENT.getValue()
							+ "caracteres");
		}

		stagedAddress.setAddressComplement(text);
	}

	public void validateSetAddressDistrict(String district) throws Exception {

		String text = district;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo Bairro deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_CITY.getValue()) {
			throw new Exception(
					"Campo Bairro deve possuir no máximo " + PessoaConstants.MAXLEN_CITY.getValue() + "caracteres");
		}

		stagedAddress.setDistrict(text);

	}

	public void validateSetAddressNumberString(String addressNumber) throws Exception {

		String text = addressNumber;
		if (text == null) {
			text = "";
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_ADDRESS.getValue()) {
			throw new Exception(
					"Campo Numero deve possuir no máximo " + PessoaConstants.MAXLEN_ADDRESS.getValue() + "caracteres");
		}

		stagedAddress.setAddressNumber(text);

	}

	public void validateSetAddressPostalCode(String postalCode) throws Exception {

		String text = postalCode;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo CEṔ deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validadeBrazilianCEPFormat(text)) {
			throw new Exception("Campo CEP deve possuir o formato 00000-000");
		}

		if (text.length() > PessoaConstants.MAXLEN_POSTALCODE.getValue()) {
			throw new Exception(
					"Campo CEP deve possuir no máximo " + PessoaConstants.MAXLEN_POSTALCODE.getValue() + "caracteres");
		}

		stagedAddress.setPostalCode(text);

	}

	public void validateSetAddressString(String addressString) throws Exception {

		String text = addressString;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo Endereço deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (text.length() > PessoaConstants.MAXLEN_ADDRESS.getValue()) {
			throw new Exception(
					"Campo Endereço deve possuir no máximo " + PessoaConstants.MAXLEN_ADDRESS.getValue()
							+ "caracteres");
		}

		stagedAddress.setAddress(text);
	}

	public void validateSetPessoaEmail(String email) throws Exception {

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

		stagedPessoa.setEmail(text);

	}

	public void validateSetPessoaFisicaCPF(String cpf) throws Exception {

		String text = cpf;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo CPF deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateBrazilianCPFFormat(text)) {
			throw new Exception("Campo CPF deve possuir o " + "formato 000.000.000-00");
		}

		if (!FieldValidators.validateBrazilianCPF(text)) {
			throw new Exception("Campo CPF Inválido");
		}

		// TODO Improve method polymorphism security

		((PessoaFisica) stagedPessoa).setCpf(text);
	}

	public void validateSetPessoaFisicaRG(String rg) throws Exception {

		String text = rg;

		if (text == null) {
			text = "";
		}

//		if (text == null || "".equals(text)) {
//			throw new Exception("Campo RG deve ser preenchido");
//		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateBrazilianRGFormat(text)) {
			throw new Exception("Campo RG com formato invalido");
		}

		// TODO Improve method polymorphism security

		((PessoaFisica) stagedPessoa).setRg(text);
	}

	public void validateSetPessoaJuridicaCNPJ(String cnpj) throws Exception {

		String text = cnpj;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo CNPJ deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!FieldValidators.validateBrazilianCNPJFormat(text)) {
			throw new Exception("Campo CNPJ deve possuir o " + "formato 00.000.000/0000-00");
		}

		if (!FieldValidators.validateBrazilianCNPJ(text)) {
			throw new Exception("Campo CNPJ Inválido!");
		}

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setCnpj(text);
	}

	public void validateSetPessoaJuridicaIEstadual(String iestadual) throws Exception {

		String text = iestadual;

		if (text == null) {
			text = "";
		}

		if (text.length() > PessoaConstants.MAXLEN_INSCESTADUAL.getValue()) {
			throw new Exception(
					"Campo Inscrição Estadual deve possuir " + "no máximo "
							+ PessoaConstants.MAXLEN_INSCESTADUAL.getValue() + "caracteres");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setIestadual(text);

	}

	public void validateSetPessoaJuridicaIMunicipal(String imunicipal) throws Exception {

		String text = imunicipal;

		if (text == null) {
			text = "";
		}

		if (text.length() > PessoaConstants.MAXLEN_INSCMUNICIPAL.getValue()) {
			throw new Exception(
					"Campo Inscrição Municipal deve possuir " + "no máximo "
							+ PessoaConstants.MAXLEN_INSCMUNICIPAL.getValue() + "caracteres");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		// TODO Improve method polymorphism security

		((PessoaJuridica) stagedPessoa).setImunicipal(text);

	}

	public void validateSetPhoneNumber(String phoneNumber) throws Exception {

		String text = phoneNumber;

		if (text == null || "".equals(text)) {
			throw new Exception("Campo Telefone deve ser preenchido");
		}

		text = text.replaceAll("^\\s+|\\s+$", "");

		String[] snumber = text.split(" ");

		snumber[0] = snumber[0].substring(1, 3);

		Integer ddd = new Integer(snumber[0]);

		Integer number = new Integer(snumber[1]);

		stagedPhone.setNumber(number);
		stagedPhone.setDdd(ddd);
	}

	public void validateSetPhoneType(Phone.PhoneType phoneType) throws Exception {

		if (phoneType == null) {
			throw new Exception("Tipo de telefone não selecionado");
		}

		stagedPhone.setType(phoneType);
	}

	public void validateSetTelcomCompany(String text) throws Exception {

		if (text == null) {
			stagedPhone.setTelcomCompany("");
		} else {
			stagedPhone.setTelcomCompany(text.replaceAll("^\\s+|\\s+$", ""));
		}
	}

	public void removePhone() {
		try {
			stagedPessoa.removePhone(detachedPhone);
		} catch (Exception e) {
			throw new UnsupportedOperationException(
					"Exception handling not implemented yet - " + e.getClass() + "-" + e.getMessage());
		}

	}

	public void removeAddress() {
		try {
			stagedPessoa.removeAddress(detachedAddress);
		} catch (Exception e) {
			throw new UnsupportedOperationException(
					"Exception handling not implemented yet - " + e.getClass() + "-" + e.getMessage());
		}

	}

}
