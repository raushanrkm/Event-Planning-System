package com.meeting.webflow;

import java.security.Principal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import com.meeting.entity.Customer;
import com.meeting.entity.Hall;
import com.meeting.entity.Reservation;
import com.meeting.entity.Schedule;
import com.meeting.service.CustomerService;
import com.meeting.service.HallService;
import com.meeting.service.ReservationService;



@Component
public class UserValidationHelper {
	

	
	@Autowired
	ReservationService reservationService;
	@Autowired
	
	CustomerService customerService;
	
	
	

	public Reservation validate(String username){
		//	return reservationservice.findOne();
			//reservationService.getOne();
			
			Customer customer=customerService.findCustomerByUsername(username);
			Reservation res=new Reservation();
			Schedule schedule=new Schedule();
			schedule.setDate(new Date());
			res.setSchedule(schedule);
			res.setHall(new Hall());
			res.setTotalCost(0.0);

			System.out.println();
			res.setCustomer(customer);
			System.out.println(customer.getName());

			System.out.println("PreAuthorised");
			//res.setCustomer(customer);

			
			return res;
		}
	
	
}
