package com.meeting.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.entity.Customer;
import com.meeting.repository.CustomerRepository;
import com.meeting.service.CustomerService;
@Service
@Transactional

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer findCustomer(Long id) {
		return customerRepository.findOne(id);
	}

	@Override
	public Customer findCustomerByUsername(String username) {
		
		return customerRepository.findCustomerByUsername(username);
		
	}

	@Override
	public Customer findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PreAuthorize(value="hasRole('ROLE_ADMIN')")
	public void saveCustomer(Customer memberToBeAdded) {
		// TODO Auto-generated method stub
		
	}

}
