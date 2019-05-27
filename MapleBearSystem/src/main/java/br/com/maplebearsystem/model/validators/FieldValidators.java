/**
 * 
 */
package br.com.maplebearsystem.model.validators;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class FieldValidators {

	public static boolean validadeBrazilianCEPFormat(String cep) {
		return cep.matches("\\d{5}-\\d{3}");
	}

	public static boolean validadeHoras(String horas) {
		Pattern pattern;
		Matcher matcher;
		
		pattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");

		matcher = pattern.matcher(horas);
		return matcher.matches();

	}

	public static boolean validateBrazilianCNPJ(String cnpj) {

		String cnpjM = cnpj.replace(".", "");
		cnpjM = cnpjM.replace("/", "");
		cnpjM = cnpjM.replace("-", "");

		cnpjM = ("00000000000000" + cnpjM).substring(cnpjM.length());

		// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
		if (cnpjM.equals("00000000000000") || cnpjM.equals("11111111111111") || cnpjM.equals("22222222222222")
				|| cnpjM.equals("33333333333333") || cnpjM.equals("44444444444444") || cnpjM.equals("55555555555555")
				|| cnpjM.equals("66666666666666") || cnpjM.equals("77777777777777") || cnpjM.equals("88888888888888")
				|| cnpjM.equals("99999999999999") || (cnpjM.length() != 14))
			return (false);

		char dig13, dig14;
		int sm, i, r, num, peso;

		// "try" - protege o código para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) {
				// converte o i-ésimo caractere do CNPJ em um número:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posição de '0' na tabela ASCII)
				num = (int) (cnpjM.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig13 = '0';
			else
				dig13 = (char) ((11 - r) + 48);

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 12; i >= 0; i--) {
				num = (int) (cnpjM.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';
			else
				dig14 = (char) ((11 - r) + 48);

			// Verifica se os dígitos calculados conferem com os dígitos informados.
			if ((dig13 == cnpjM.charAt(12)) && (dig14 == cnpjM.charAt(13)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static boolean validateBrazilianCNPJFormat(String cpf) {
		return cpf.matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$");
	}

	public static boolean validateBrazilianCPF(String cpfM) {

		String cpf = cpfM.replace(".", "");
		cpf = cpf.replace("-", "");

		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do CPF em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static boolean validateBrazilianCPFFormat(String cpf) {
		return cpf.matches("[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");
	}

	public static boolean validateBrazilianRGFormat(String rg) {

		return rg.matches(RegexCharsets.CHARSET_PESSOAFISICA_RG.getValue());
	}

	public static boolean validateBrazilianRGNumber(Integer RG) throws Exception {
		throw new Exception("Not implemented yet");
	}

	/**
	 * Super REGEX RFC 5322 Official Standard
	 */
	public static boolean validateEmail(String emailAddress) {
		return (emailAddress.matches(
				"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"));
	}

	public enum RegexCharsets {

		CHARSET_EQUIPMENT_BRANDNAME("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_MODEL("[a-zA-Z0-9\\s\\.\\-\\ª\\º]*"), CHARSET_EQUIPMENT_PATNUMBER("[a-zA-Z0-9\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_SERIALNUMBER("[a-zA-Z0-9\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_TYPETEXT("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\-\\ª\\º]*"),
		CHARSET_PARTPRODUCT_DESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_PARTPRODUCT_EXTENDEDDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_PARTPRODUCT_OTHERNUMBERS("[A-Z0-9\\s\\,\\.\\-\\ª\\º]*"),
		CHARSET_PARTPRODUCT_PARTNUMBER("[A-Z0-9\\.\\-\\ª\\º]*"), CHARSET_PARTPRODUCT_STOCKQUANTITY("[0-9]*"),
		CHARSET_PESSOA_NAME("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\-\\ª\\º]*"), CHARSET_PESSOAFISICA_RG("[A-Z0-9\\.\\-]*"),
		CHARSET_PESSOAJURIDICA_IESTADUAL("[0-9\\-\\.]*"), CHARSET_PESSOAJURIDICA_IMUNICIPAL("[0-9\\- ]*"),
		CHARSET_PESSOAJURIDICA_RAZAOSOCIAL("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\-\\ª\\º]*"),
		CHARSET_SERVICE_DESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_SERVICE_EXTENDEDDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_DAMAGES("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_ITEMSANDACESSORIES("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_NOTES("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_PAGECOUNTER("[0-9]*"),
		CHARSET_WORKORDER_PROBLEMDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_PROBLEMDIAGNOSED("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_SCHEDULECONTACTNAME("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\/]*"),
		CHARSET_DESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*");

		private String value;

		RegexCharsets(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

}
