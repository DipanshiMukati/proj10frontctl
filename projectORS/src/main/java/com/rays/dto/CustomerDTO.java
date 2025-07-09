package com.rays.dto;

<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

<<<<<<< HEAD
=======

>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
@Entity
@Table(name = "ST_CUSTOMER")
public class CustomerDTO extends BaseDTO {

	@Column(name = "CLIENT_NAME", length = 50)
	private String clientName;
<<<<<<< HEAD

	@Column(name = "LOCATION", length = 50)
	private String location;

	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;

	@Column(name = "IMPORTANCE", length = 50)
	private String importance;

=======
	
	@Column(name = "LOCATION", length = 50)
	private String location;
	
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;
	
	@Column(name = "IMPORTANCE")
	private String importance;
    
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

<<<<<<< HEAD
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
=======
	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
		this.contactNumber = contactNumber;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getKey() {
<<<<<<< HEAD
		return id + "";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return clientName;
=======
		return importance;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return importance;
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	}

	@Override
	public String getUniqueKey() {
<<<<<<< HEAD
		return "clientName"; // ya koi bhi unique field
=======
		// TODO Auto-generated method stub
		return "clientName";
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	}

	@Override
	public String getUniqueValue() {
<<<<<<< HEAD
=======
		// TODO Auto-generated method stub
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
		return clientName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		return "Client Name";
=======
		return clientName;
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("clientName", "asc");
<<<<<<< HEAD

=======
		
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
<<<<<<< HEAD
		map.put("clientName", clientName);
		return map;
	}

}
=======
		map.put("importance", importance);
		return map;
	}
}
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
