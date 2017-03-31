package com.meeting.service;

import java.util.List;

import com.meeting.entity.Transaction;

public interface TransactionService {
	
	public List<Transaction> findByCustomer(String name);
	
	public void save(Transaction transaction);
	
	public void delete(Transaction transaction);
	
	public List<Transaction> findAll();	
	
}


