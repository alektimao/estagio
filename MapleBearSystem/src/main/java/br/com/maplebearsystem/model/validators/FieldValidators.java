/**
 * 
 */
package br.com.maplebearsystem.model.validators;

/**
 * @author Gabriel L. P. Abreu
 *
 */
public class FieldValidators {
	
	public enum RegexCharsets {
		
		CHARSET_EQUIPMENT_BRANDNAME("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_MODEL("[a-zA-Z0-9\\s\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_PATNUMBER("[a-zA-Z0-9\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_SERIALNUMBER("[a-zA-Z0-9\\.\\-\\ª\\º]*"),
		CHARSET_EQUIPMENT_TYPETEXT("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\-\\ª\\º]*"),
		CHARSET_PARTPRODUCT_DESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_PARTPRODUCT_EXTENDEDDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_PARTPRODUCT_OTHERNUMBERS("[A-Z0-9\\s\\,\\.\\-\\ª\\º]*"),
		CHARSET_PARTPRODUCT_PARTNUMBER("[A-Z0-9\\.\\-\\ª\\º]*"),
		CHARSET_PARTPRODUCT_STOCKQUANTITY("[0-9]*"),
		CHARSET_SERVICE_DESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_SERVICE_EXTENDEDDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_PROBLEMDIAGNOSED("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_DAMAGES("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_NOTES("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_SERVICEDONEDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_SCHEDULECONTACTNAME("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\/]*"),
		CHARSET_WORKORDER_PROBLEMDESCRIPTION("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_ITEMSANDACESSORIES("[a-zA-ZÀ-ÿ0-9 \\(\\)\\.\\,\\-\\+\\ª\\º\\/\\'\\\"]*"),
		CHARSET_WORKORDER_PAGECOUNTER("[0-9]*");

		private String value;

		RegexCharsets(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	public static boolean validadeBrazilianCEPFormat(String cep) {
		return cep.matches("\\d{5}-\\d{3}");
	}

	public static boolean validateBrazilianCNPJFormat(String cpf) {
		return cpf.matches("\\d{2}\\.\\d{3}\\.\\d{3}\\/\\d{4}\\-\\d{2}$");
	}

	public static boolean validateBrazilianCPFFormat(String cpf) {
		return cpf.matches("[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}");
	}

	public static boolean validateBrazilianRGFormat(String rg) {

		return rg.matches("[0-9\\.\\- ]*");
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

}
