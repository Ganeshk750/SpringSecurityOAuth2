package com.ganesh.rentcloud.profileservice.service;

import java.util.List;

import com.ganesh.rentcloud.commons.model.Customer;

public interface CustomerService {
	
	Customer save(Customer customer);
	
	List<Customer> getAllCustomer();

}
