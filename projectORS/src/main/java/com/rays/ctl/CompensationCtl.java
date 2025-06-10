package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CompensationDTO;
import com.rays.form.CompensationForm;
import com.rays.service.CompensationServiceInt;

@RestController
@RequestMapping(value = "Compensation")
public class CompensationCtl extends BaseCtl<CompensationForm, CompensationDTO, CompensationServiceInt> {

	@Autowired
	CompensationServiceInt compensationService;

	@GetMapping("/preload")
	public ORSResponse preload() {
	    ORSResponse res = new ORSResponse(true);
	    CompensationDTO dto = new CompensationDTO();
	    List<DropdownList> list = compensationService.search(dto, userContext);
	    res.addResult("Compensationlist", list);
	    return res;
	}
	
	@GetMapping("name/{name}")
	public ORSResponse get(@PathVariable String name) {
		ORSResponse res = new ORSResponse(true);
		CompensationDTO dto = baseService.findByName(name, userContext);
		
		if (dto != null) {
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMessage("Record not found");
		}
		return res;
	}
}



