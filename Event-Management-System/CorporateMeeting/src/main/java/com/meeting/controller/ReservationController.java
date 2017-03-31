package com.meeting.controller;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.meeting.entity.Customer;
import com.meeting.entity.Reservation;
import com.meeting.service.CustomerService;
import com.meeting.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	ReservationService reservationService;
	@Autowired
	private CustomerService  customerService;

	@RequestMapping(value={"/reservation/{id}"},method= RequestMethod.GET)
	public String reservationHome(HttpServletRequest request,Model model,@PathVariable("id") Long id) {
		Principal principal=request.getUserPrincipal();
  		String memberUsername=principal.getName();
		Customer customer = customerService.findCustomerByUsername(memberUsername);
		model.addAttribute("reservation", reservationService.findReservationById(id));
		return "reservationDetail";
	}
	
	
	
	@RequestMapping(value={"/reservationHistory"},method= RequestMethod.GET)
	public String getReservationList(HttpServletRequest request,Model model) {
		Principal principal=request.getUserPrincipal();
  		String memberUsername=principal.getName();
		Customer customer = customerService.findCustomerByUsername(memberUsername);
		model.addAttribute("reservationList", reservationService.findReservationByCustomer(customer));
		return "reservationHistory";
	}
	
	@RequestMapping(value={"/reservation"},method= RequestMethod.GET)
	public String getReonList() {
		
		return "redirect:/loginSuccess";
	}
	
	
	@RequestMapping(value="/ScheduleDatesAvailable")
	@ResponseBody
	public String getAllReserved(Model model) {
		
		List<String> list  = new ArrayList<String>();
		List<Date>dateList=reservationService.listReservationSchedule();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		for(Date date:dateList)
		{
//System.out.println(date.getMonth());
		
		list.add(dateFormat.format(date));
		System.out.println(dateFormat.format(date));
		}
		
		/*model.addAttribute("greeting", "Welcome to our community, Kimosabe!!");
		model.addAttribute("tagline", "The one and only place to live, work and play!!");*/
		
	//	Date[] ListOfData = (Date[]) dateList.toArray();
		
		

		System.out.println(list);
		 String json = new Gson().toJson(list);
			System.out.println(json);


		return  json;

		
	}
	
	
	
}
