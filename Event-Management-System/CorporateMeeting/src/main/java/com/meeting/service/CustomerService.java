package com.meeting.service;

import org.springframework.stereotype.Service;

import com.meeting.entity.Customer;
@Service
public interface CustomerService {

	public Customer findCustomer(Long id);
	public Customer findCustomerByUsername(String username);
	public Customer findAll();
	public void saveCustomer(Customer memberToBeAdded);
	
	
}
