package com.meeting.repository;

import org.springframework.stereotype.Repository;

import com.meeting.entity.Transaction;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction,Long>  {
	
	@Query("select c from Customer c where c.name=:name")
	public List<Transaction> findByCustomerName(@Param("name")String name);
}
