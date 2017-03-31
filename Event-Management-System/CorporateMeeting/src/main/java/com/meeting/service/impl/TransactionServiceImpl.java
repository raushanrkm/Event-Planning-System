package com.meeting.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.entity.Transaction;
import com.meeting.repository.TransactionRepository;
import com.meeting.service.TransactionService;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{
	@Autowired
	TransactionRepository transactionRepository;
	
	public List<Transaction> findByCustomer(String name){
		return transactionRepository.findByCustomerName(name);
	}
	
	public void save(Transaction transaction){
		transactionRepository.save(transaction);
	}
	
	public void delete(Transaction transaction){
		transactionRepository.delete(transaction);
	}
	
	public List<Transaction> findAll(){
		return (List<Transaction>)transactionRepository.findAll();
	}
}
