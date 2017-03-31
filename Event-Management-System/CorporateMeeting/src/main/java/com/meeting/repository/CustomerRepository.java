package com.meeting.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meeting.entity.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long>{
	
	public Customer findCustomerByUsername(String username);
}
