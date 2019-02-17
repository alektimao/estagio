package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: PartProductMovement
 *
 */
@Entity
//@IdClass(PartProductMovementID.class)
public class ProductMovement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	@ManyToOne
//	@JoinColumn(name = "partProductID", referencedColumnName = "id")
	private Product partProduct;
//	@Id
	@ManyToOne
//	@JoinColumn(name = "paymentID", referencedColumnName = "id")
	private Funcionario funcionario;
	private Date date;
	private Integer quantity;
	private MovementType type;
	private String reason;

	public ProductMovement() {

	}

	public Product getPartProduct() {
		return partProduct;
	}

	public Date getDate() {
		return date;
	}

	public MovementType getType() {
		return type;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setPartProduct(Product partProduct) {
		this.partProduct = partProduct;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setType(MovementType type) {
		this.type = type;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void setFuncionario(Funcionario employee) {
		this.funcionario = employee;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public enum MovementType {
		INCREASE("Acréscimo"), DECREASE("Decréscimo");

		String type;

		MovementType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return this.type;
		}

	}

}
