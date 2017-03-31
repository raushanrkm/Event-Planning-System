package com.meeting.webflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import com.meeting.entity.Hall;
import com.meeting.entity.Reservation;
import com.meeting.entity.Schedule;
import com.meeting.service.HallService;
import com.meeting.service.ReservationService;

@Component
public class RegistrationHelper {

	@Autowired
	HallService hallService;
	@Autowired
	ReservationService reservationService;

	// @PreAuthorize("hasRole('ROLE_USER')")
	public List<Hall> getAllHalls(Schedule schedule) {
		// return reservationservice.findOne();
		// reservationService.getOne();
		List<Hall> halls = hallService.getAllAvailableHall(schedule);
		System.out.println("halllist size" + halls.size());
		return halls;
	}

	public Hall patchHall(Long hallId ){
		
				System.out.println("patchHall");
				return hallService.findOne(hallId); 
	}
	public Reservation bindSchedule(Schedule newSchedule, Reservation reservation){
		
		reservation.setSchedule(newSchedule);
		return reservation;
}
	
	
	public Reservation calculateCostwithTax(Reservation reservation){
		return reservationService.generateTotalCost(reservation);
		
	}

	public void saveReservation(Reservation reservation){
		
		
		reservationService.saveForm(reservation);
		
	}
}
