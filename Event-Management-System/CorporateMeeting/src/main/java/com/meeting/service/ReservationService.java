
package com.meeting.service;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.entity.Customer;
import com.meeting.entity.Reservation;
import com.meeting.entity.Schedule;


/*
 * @Author: Yashika Goyal
 * 
 * */
//workings

public interface ReservationService{

	public void save(Reservation reservation);
	
	public void delete(Reservation reservation);
	
	public List<Reservation> listAllReservation();
	
	public List<Reservation> listReservationByCustomer();
	
	public List<Reservation> listReservationBySchedule(Schedule schedule);
	
	//public List<Reservation> listReservationSchedule();

	public Reservation generateTotalCost(Reservation reservation);
	
	public List<Reservation> findReservationByCustomer(Customer customer);

	public void saveForm(Reservation reservation);
	
	public Reservation findOne(Long ReservationId);

	public List<Reservation> listReservationByCustomer(Customer customer);
	
	public Reservation findReservationById(Long id);

	public List<Date> listReservationSchedule();
	
	
}
