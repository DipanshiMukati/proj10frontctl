package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.CompensationDTO;
import com.rays.dto.CustomerDTO;

public interface CompensationServiceInt extends BaseServiceInt<CompensationDTO> {
	public CompensationDTO findByName(String name, UserContext userContext) ;


}
