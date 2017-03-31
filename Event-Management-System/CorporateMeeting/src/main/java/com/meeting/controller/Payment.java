
//@Author:Samikshya Adhikari
package com.meeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meeting.service.TransactionService;

@Controller
public class Payment {
	
	@Autowired
	TransactionService transactionService;
	
	
	@RequestMapping(value="/goPayment",method=RequestMethod.GET)
	public String paymentPage(@ModelAttribute("payment")Payment payment)
	{
		return "payment";
	}
	
    @RequestMapping(value="/goPayment",method=RequestMethod.POST)
	public String processPaymentPage(@ModelAttribute("payment")Payment addPayment, Model model )
	{
    	//transactionService.findByCustomer()
    	//transactionService.save(transaction);
    	
    	//model.addAttribute(addPayment);
		return "NewFile";
    	
	}

}
