package com.rays.form;

<<<<<<< HEAD
=======
import javax.validation.constraints.Digits;
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

<<<<<<< HEAD
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;

public class CustomerForm extends BaseForm {

	@NotEmpty(message = "Please enter client name")
	@Size(min = 3, max = 15, message = "Client name must be between 3 and 15 characters")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Only letters are allowed")
	private String clientName;


	@NotEmpty(message = "Please enter location")
	@Size(min = 3, max = 15, message = "Location must be between 3 and 15 characters")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Only letters are allowed")
	private String location;

	@NotNull(message = "Please enter contact number")
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Number must start with 6-9 and be 10 digits")
	private String contactNumber;

=======
import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;
import com.rays.dto.InventoryDTO;

public class CustomerForm extends BaseForm {

	@Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabets are allowed")
	@Size(max = 20, message = "Maximum 20 characters are allowed")
	@NotEmpty(message = "please enter client name")
	private String clientName;

	@Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabets are allowed")
	@Size(max = 20, message = "Maximum 20 characters are allowed")
	@NotEmpty(message = "please enter location")
	private String location;

	@Pattern(regexp = "^6\\d{9}$", message = "Contact number must start with 6 and be exactly 10 digits")
	@NotNull(message = "Please enter contactNumber")
	private Long contactNumber;
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1

	@NotEmpty(message = "please enter importance")
	private String importance;

<<<<<<< HEAD
	
	

=======
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public String getClientName() {
		return clientName;
	}

<<<<<<< HEAD

=======
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

<<<<<<< HEAD

=======
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public String getLocation() {
		return location;
	}

<<<<<<< HEAD

=======
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public void setLocation(String location) {
		this.location = location;
	}

<<<<<<< HEAD

	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


=======
	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public String getImportance() {
		return importance;
	}

<<<<<<< HEAD
	@Override
	public CustomerDTO getDto() {

		CustomerDTO dto = initDTO(new CustomerDTO());
		dto.setClientName(clientName);
		dto.setLocation(location);
		dto.setContactNumber(contactNumber);
		dto.setImportance(importance);
		return dto;
	}


=======
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public void setImportance(String importance) {
		this.importance = importance;
	}

<<<<<<< HEAD
}
=======
	public BaseDTO getDto() {

		CustomerDTO dto = initDTO(new CustomerDTO());

		dto.setClientName(clientName);
		dto.setLocation(location);
		dto.setContactNumber(contactNumber);
		dto.setImportance(importance);

		System.out.println("all data are done ");

		return dto;
	}
}
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
