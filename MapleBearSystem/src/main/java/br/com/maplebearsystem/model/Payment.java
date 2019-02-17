package br.com.maplebearsystem.model;

import java.io.Serializable;
import java.lang.Long;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Payment
 *
 */
@Entity
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal expirationDate;
	private BigDecimal paymentDate;
	private BigDecimal billValue;
	private BigDecimal amountPaid;
	private PaymentMethod paymentMethod;
	private PaymentStatus status;

	public Payment() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(BigDecimal expirationDate) {
		this.expirationDate = expirationDate;
	}

	public BigDecimal getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(BigDecimal paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getBillValue() {
		return this.billValue;
	}

	public void setBillValue(BigDecimal billValue) {
		this.billValue = billValue;
	}

	public BigDecimal getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public enum PaymentMethod {

		MONEY("Dinheiro"), CREDITCART("Cartão de Crédito"), DEBITCART("Cartão de Débito");

		String method;

		PaymentMethod(String method) {
			this.method = method;
		}

		@Override
		public String toString() {
			return method;
		}

	}
	
	public enum PaymentStatus {

		PAID("Pago"), PENDINGPAYMENT("Pagamento Pendente"), DEBITCART("Cartão de Débito");

		String status;

		PaymentStatus(String method) {
			this.status = method;
		}

		@Override
		public String toString() {
			return status;
		}

	}

}
