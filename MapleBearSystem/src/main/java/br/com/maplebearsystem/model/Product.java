package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.maplebearsystem.view.viewmodel.ProdutoAlterado;

/**
 * Entity implementation class for Entity: PartProduct
 *
 */
@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String extendedDescription;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String otherNumbers;
	private String partNumber;
	private String shortDescription;
	//colocar relaço e adicionar o cascade=cascadeAll
//	private Integer stockQuantity;
	@OneToOne(cascade = CascadeType.ALL)
	private Estoque estoque;
	private BigDecimal unitPrice;

	public Product() {
		super();
		this.estoque = new Estoque();
	}

	public String getExtendedDescription() {
		return this.extendedDescription;
	}

	public Long getId() {
		return this.id;
	}

	public String getOtherNumbers() {
		return this.otherNumbers;
	}

	public String getPartNumber() {
		return this.partNumber;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

//	public Integer getStockQuantity() {
//		return this.stockQuantity;
//	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public String getUnitPriceString() {
		String str = String.format("%.2f", unitPrice);
		if (str.contains(","))
			str = str.replace(",", ".");
		return str;
	}

	public void setExtendedDescription(String extendedDescription) {
		this.extendedDescription = extendedDescription;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setOtherNumbers(String otherNumbers) {
		this.otherNumbers = otherNumbers;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

//	public void setStockQuantity(Integer stockQuantity) {
//		this.stockQuantity = stockQuantity;
//	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof Product) {
			Product new_name = (Product) obj;
			if (this.id.equals(new_name.getId())) {
				return true;
			}
		}
		return super.equals(obj);
	}

}
