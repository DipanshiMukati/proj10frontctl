package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.CompensationDAOInt;
import com.rays.dto.CompensationDTO;

@Service
@Transactional
public class CompensationServiceImpl extends BaseServiceImpl<CompensationDTO, CompensationDAOInt> implements CompensationServiceInt {
 
	@Autowired
	CompensationDAOInt  compensatioDAO;
	
	
	@Transactional(readOnly = true)
	public CompensationDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("staffMember", name, userContext);
	}

}
