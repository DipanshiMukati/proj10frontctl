package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CustomerDTO;



@Repository
<<<<<<< HEAD
public class CustomerDAOImpl extends BaseDAOImpl<CustomerDTO> implements CustomerDAOInt {
=======
public class CustomerDAOimpl extends BaseDAOImpl<CustomerDTO> implements CustomerDAOInt {
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1

	@Override
	protected List<Predicate> getWhereClause(CustomerDTO dto, CriteriaBuilder builder, Root<CustomerDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getClientName())) {

			whereCondition.add(builder.like(qRoot.get("clientName"), dto.getClientName() + "%"));
		}

		if (!isEmptyString(dto.getLocation())) {

			whereCondition.add(builder.like(qRoot.get("location"), dto.getLocation() + "%"));
		}
		
<<<<<<< HEAD
		if (!isEmptyString(dto.getContactNumber())) {

			whereCondition.add(builder.like(qRoot.get("contactNumber"), dto.getContactNumber()));
=======
		if (!isZeroNumber(dto.getContactNumber())) {

			whereCondition.add(builder.equal(qRoot.get("contactNumber"), dto.getContactNumber()));
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
		}

		if (!isEmptyString(dto.getImportance())) {

			whereCondition.add(builder.like(qRoot.get("importance"), dto.getImportance() + "%"));
		}

		

		return whereCondition;
	}

	@Override
	public Class<CustomerDTO> getDTOClass() {
		// TODO Auto-generated method stub
				return CustomerDTO.class;
	}

}
