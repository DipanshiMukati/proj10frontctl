package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

public class OrderForm extends BaseForm {

	@NotNull(message = "please enter quantity")
	private long quantity;

	@NotEmpty(message = "please enter product")
	private String product;

	@NotNull(message = "please enter date")
	private Date date;

	@NotNull(message = "please enter amount")
	private long amount;

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	public BaseDTO getDTO() {
		OrderDTO dto =  initDTO(new OrderDTO());
		dto.setQuantity(quantity);
		dto.setProduct(product);
		dto.setDate(date);
		dto.setAmount(amount);
		return dto;
		
		
		
	}
}