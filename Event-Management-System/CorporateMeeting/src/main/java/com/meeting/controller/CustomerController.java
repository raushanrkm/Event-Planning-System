package com.meeting.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;

import com.meeting.entity.Customer;
import com.meeting.service.CustomerService;




@Controller
@RequestMapping()
//@SessionAttributes("customerUsername")
public class CustomerController {
	
	@Autowired
	private CustomerService  customerService;

	
  	@RequestMapping("/customer")
  	@PreAuthorize("hasRole({'ROLE_USER','ROLE_ADMIN')") 
	public String getMemberById(HttpServletRequest request,Model model) {
  		Principal principal=request.getUserPrincipal();
  		String memberUsername=principal.getName();
		Customer customer = customerService.findCustomerByUsername(memberUsername);
		model.addAttribute("customer", customer);

 		return "customer";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
  	@PreAuthorize("hasRole('ROLE_ADMIN')")    // If global-method-security enabled in Dispatcher config
	public String getAddNewMemberForm(@ModelAttribute("newCustomer") Customer customer) {
	   return "addCustomer";
	}
	   
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewMemberForm(@ModelAttribute("newCustomer") @Valid Customer memberToBeAdded, BindingResult result, HttpServletRequest request) {
		if(result.hasErrors()) {
			return "addCustomer";
		}

			 //  Error caught by ControllerAdvice IF no authorization...
		customerService.saveCustomer(memberToBeAdded);

	   	return "redirect:/customer";
 
	}
	
 
}
