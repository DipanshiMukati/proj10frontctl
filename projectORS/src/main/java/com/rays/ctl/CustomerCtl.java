<<<<<<< HEAD

package com.rays.ctl;

import java.util.HashMap;
=======
package com.rays.ctl;

>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CustomerDTO;
import com.rays.form.CustomerForm;
import com.rays.service.CustomerServiceInt;

@RestController
@RequestMapping(value = "Customer")
<<<<<<< HEAD
public class CustomerCtl extends BaseCtl<CustomerForm, CustomerDTO, CustomerServiceInt> { 
	
	 @GetMapping("/preload")
		public ORSResponse preload() {
			ORSResponse res = new ORSResponse(true);
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			map.put(1, "High");
			map.put(2, "Medium");
			map.put(3, "Low");
			
			res.addResult("customerlist", map);
			return res;
		}

	

=======
public class CustomerCtl extends BaseCtl<CustomerForm, CustomerDTO, CustomerServiceInt> {

	@Autowired
	private CustomerServiceInt customerService;

	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload");
		ORSResponse res = new ORSResponse(true);
		CustomerDTO dto = new CustomerDTO();
		List<DropdownList> list = customerService.search(dto, userContext);
		res.addResult("custlist", list);
		return res;
	}
>>>>>>> 8677795785b7a2aff59cdad239ed1e3ae7fe7cd1
}
