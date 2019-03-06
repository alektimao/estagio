package br.com.maplebearsystem.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import br.com.maplebearsystem.dao.ProductDAO;
import br.com.maplebearsystem.model.Product;
import br.com.maplebearsystem.model.validators.FieldValidators;


public class ProductController {

	private Product partProduct;

	public ProductController() {
		// TODO Auto-generated constructor stub
	}

	public void reset() {

	}

// SECTION Product Methods

	public Product getProduct() {
		return partProduct;
	}

	public void setupEditProduct(Product partProduct) {
		this.partProduct = partProduct;

	}

	public void setupNewProduct() {
		partProduct = new Product();

	}

	public List<Exception> saveProduct(String description, String extendedDescription, String price,
			String unitQuant, String partNmber, String otherNumbers) {
		List<Exception> errorList = new ArrayList<Exception>();

		if (partProduct == null) {
			partProduct = new Product();
		}

		try {
			setProductShortDescription(description);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setProductUnitPrice(price);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setProductExtendedDescription(extendedDescription);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setProductPartNumber(partNmber);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setProductOtherNumbers(otherNumbers);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		try {
			setProductStockQuantity(unitQuant);
		} catch (Exception e) {
			// TODO log user input exception
			errorList.add(e);
			System.out.println("Info:" + e.getMessage());
		}

		if (errorList.isEmpty()) {
			try {
				saveProduct(this.partProduct);
			} catch (EntityExistsException e) {
				errorList.add(new Exception("Parte / Produto Já cadastrado"));
				System.out.println("Info: Product \"" + partProduct.getShortDescription()
						+ "\" already registered - " + e.getMessage());
			} catch (Exception saveException) {
				System.out.println("Error: failed to save " + saveException.getMessage());
				errorList.add(new Exception("Erro desconhecido ao salvar: \n" + saveException.getLocalizedMessage()));
			}
		}

		return errorList;
	}

	public void saveProduct(Product partProduct) {
		ProductDAO dao = new ProductDAO();
		dao.save(partProduct);
	}

	public void deleteProduct() {
		ProductDAO dao = new ProductDAO();
		dao.delete(partProduct);

	}

	public void setProductShortDescription(String description) throws Exception {

		if (description == null || description.equals("")) {
			throw new Exception("Campo Descrição deve ser preenchido");
		}

		// trim trailing and leading white spaces
		description = description.replaceAll("^\\s+|\\s+$", "");

		if (!description.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_DESCRIPTION.getValue())) {
			throw new Exception("Campo Descrição possui caracteres Inválidos");
		}

		partProduct.setShortDescription(description);

	}

	public void setProductExtendedDescription(String extendedDescription) throws Exception {

		String text = extendedDescription;
		if (text == null) {
//			throw new Exception("Campo Descrição Detalhada deve ser preenchido");
			text = "";
		}

		// trim trailing and leading white spaces
		text = text.replaceAll("^\\s+|\\s+$", "");

		if (!text.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_EXTENDEDDESCRIPTION.getValue())) {
			throw new Exception("Campo Descrição Detalhada possui caracteres Inválidos");
		}

		partProduct.setExtendedDescription(text);

	}

	public void setProductPartNumber(String partNumber) throws Exception {

		String textM = partNumber;

		if (textM == null) {
			// throw new Exception("Campo PartNumber deve ser preenchido");
			textM = "";
		}

		// trim trailing and leading white spaces
		textM = textM.replaceAll("^\\s+|\\s+$", "");

		if (!textM.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_PARTNUMBER.getValue())) {
			throw new Exception("Campo PartNumber possui caracteres Inválidos");
		}

		partProduct.setPartNumber(textM);

	}

	public void setProductOtherNumbers(String otherNumbers) throws Exception {

		String textM = otherNumbers;

		if (textM == null) {
			// throw new Exception("Campo PartNumber deve ser preenchido");
			textM = "";
		}

		// trim trailing and leading white spaces
		textM = textM.replaceAll("^\\s+|\\s+$", "");

		if (!textM.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_OTHERNUMBERS.getValue())) {
			throw new Exception("Campo PartNumber possui caracteres Inválidos");
		}

		partProduct.setOtherNumbers(textM);

	}

	public void setProductStockQuantity(String stockQuantity) throws Exception {

		String textM = stockQuantity;

		if (textM == null) {
			// throw new Exception("Campo PartNumber deve ser preenchido");
			textM = "";
		}

		// trim trailing and leading white spaces
		textM = textM.replaceAll("^\\s+|\\s+$", "");

		if (!textM.matches(FieldValidators.RegexCharsets.CHARSET_PARTPRODUCT_STOCKQUANTITY.getValue())) {
			throw new Exception("Campo Quantidade em Estoque possui caracteres Inválidos");
		}

		Integer integervalue;

		try {
			integervalue = new Integer(Integer.parseInt(textM));
		} catch (NumberFormatException e) {
			throw new Exception("Formato do unidade inválido");
		}

		if (integervalue.doubleValue() < 0) {
			throw new Exception("Unidade em valor negativo");
		}

		partProduct.getEstoque().setQtd(integervalue);

	}

	private void setProductUnitPrice(String text) throws Exception {

		String textM = text;

		if (text == null) {
			textM = "0.0";
		}

		// trim trailing and leading white spaces
		textM = textM.replaceAll("^\\s+|\\s+$", "");

		BigDecimal bigdecimalvalue;

		try {
			bigdecimalvalue = new BigDecimal(Double.parseDouble(textM));
		} catch (NumberFormatException e) {
			throw new Exception("Formato do preço inválido");
		}

		if (bigdecimalvalue.doubleValue() < 0) {
			throw new Exception("Preço em valor negativo");
		}

		bigdecimalvalue = bigdecimalvalue.setScale(2, RoundingMode.HALF_UP);

		partProduct.setUnitPrice(bigdecimalvalue);

	}

// ENDSECTION Product Methods

// SECTION Controller to DAO Methods

	public List<Product> getProducts() {
		ProductDAO dao = new ProductDAO();

		return dao.listAllProduct();
	}

	public List<Product> getProducts(String filter) {
		ProductDAO dao = new ProductDAO();

		return dao.listProduct(filter);
	}

// ENDSECTION Controller to DAO Methods

}
