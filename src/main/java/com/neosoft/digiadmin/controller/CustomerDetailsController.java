package com.neosoft.digiadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	import com.neosoft.digiadmin.entity.CustomerDetails;
import com.neosoft.digiadmin.serviceimpl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerDetailsController {
	
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/save-customer")
	public String saveCustomerDetails(@RequestBody CustomerDetails cust) {
		customerServiceImpl.saveCustomerDetails(cust);
		return "Customer Saved successfully";
	}
	
	
	
	@GetMapping("/customer-details/{mobNo}/{email}")
	public ResponseEntity<CustomerDetails> getCustomerByEmailAndMob(@PathVariable long mobNo,@PathVariable String email ){
		CustomerDetails custData = customerServiceImpl.getCustomerByEmailAndMob(mobNo, email);
	    return new ResponseEntity<>(custData,HttpStatus.OK);
	}
}
		


