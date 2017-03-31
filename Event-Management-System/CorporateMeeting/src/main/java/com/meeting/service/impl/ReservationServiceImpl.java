package com.meeting.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.entity.Customer;
import com.meeting.entity.Facility;
import com.meeting.entity.Hall;
import com.meeting.entity.Reservation;
import com.meeting.entity.Schedule;
import com.meeting.repository.CustomerRepository;
import com.meeting.repository.HallRepository;
import com.meeting.repository.ReservationRepository;
import com.meeting.repository.ScheduleRepository;
import com.meeting.service.HallService;
import com.meeting.service.ReservationService;


/*
 * @Author: Yashika Goyal
 * 
 * */

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired 
	CustomerRepository customerRepository;
	@Autowired 
	HallRepository hallRepository;
	@Autowired 
	ScheduleRepository scheduleRepository;
	
	
	
	@Override
	public void save(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationRepository.save(reservation);
	}

	@Override
	public void delete(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationRepository.delete(reservation);
	}

	@Override
	public List<Reservation> listAllReservation() {

		return (List<Reservation>) reservationRepository.findAll();
	}

	@Override
	public List<Reservation> listReservationByCustomer(Customer customer) {

		return  reservationRepository.findReservationByCustomer(customer);
	}

	@Override
	public List<Reservation> listReservationBySchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public Reservation generateTotalCost(Reservation reservation) {
		// TODO Auto-generated method stub
		Double baseamount=reservation.getHall().getCost();
		Double tax=.07;
		Double totalcost=baseamount*(1+tax);
		reservation.setTotalCost(totalcost);
		return reservation;
	}

	@Override
	public List<Reservation> findReservationByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return reservationRepository.findReservationByCustomer(customer);
	}

	@Override
	public void saveForm(Reservation reservation) {
		// TODO Auto-generated method stub
		
		Customer customer=customerRepository.findOne(reservation.getCustomer().getId());
		Hall hall=hallRepository.save(reservation.getHall());
		Schedule schedule=scheduleRepository.save(reservation.getSchedule());
		reservation.setHall(hall);
		reservation.setFacility(new ArrayList());
		reservation.setSchedule(schedule);
		reservation.setCustomer(customer);
		reservationRepository.save(reservation);
		
	}

	@Override
	public Reservation findOne(Long ReservationId) {
		// TODO Auto-generated method stub
		return reservationRepository.findOne(ReservationId);
	}

	@Override
	public List<Reservation> listReservationByCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation findReservationById(Long id) {
		// TODO Auto-generated method stub
		return reservationRepository.findOne(id);
	}

	public List<Date> listReservationSchedule() {

		List<Reservation> listOfReservation = (List<Reservation>) reservationRepository.findAll();
		List<Date> datelist = new ArrayList<Date>();
		for(Reservation reservation:listOfReservation)
		{
			datelist.add(reservation.getSchedule().getDate());
		}
		
		
		return datelist;
	}
}
