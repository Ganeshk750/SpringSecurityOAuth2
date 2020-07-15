package com.ganesh.rentcloud.profileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.rentcloud.commons.model.Customer;
import com.ganesh.rentcloud.profileservice.service.CustomerService;

@RestController
@RequestMapping(value="/services")
public class ProfileController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(value="/profile")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@GetMapping(value="/profiles")
	public List<Customer> getAllProfile(){
		return customerService.getAllCustomer();
	}
	
	

}
