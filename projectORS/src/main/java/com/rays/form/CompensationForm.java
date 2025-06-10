package com.rays.form;	

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CompensationDTO;
import com.rays.dto.UserDTO;

public class CompensationForm extends BaseForm {

	@NotEmpty(message = "please enter staffMember")
	private String staffMember;

	@NotNull(message = "please enter paymentAmount")
	private Double paymentAmount;

	@NotNull(message = "please enter dateApplied")
	private Date dateApplied;

	@NotEmpty(message = "please enter state")
	private String state;

	public String getStaffMember() {
		return staffMember;
	}

	public void setStaffMember(String staffMember) {
		this.staffMember = staffMember;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public BaseDTO getDto() {
		CompensationDTO dto = initDTO(new CompensationDTO());
		dto.setStaffMember(staffMember);
		dto.setPaymentAmount(paymentAmount);
		dto.setDateApplied(dateApplied);
		dto.setState(state);

		return dto;
	}

}
