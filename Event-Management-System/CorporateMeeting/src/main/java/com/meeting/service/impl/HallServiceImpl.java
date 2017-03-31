package com.meeting.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.entity.Hall;
import com.meeting.entity.Reservation;
import com.meeting.entity.Schedule;
import com.meeting.entity.Venue;
import com.meeting.repository.HallRepository;
import com.meeting.service.HallService;
import com.meeting.service.ReservationService;
@Service
@Transactional
public class HallServiceImpl implements HallService{
@Autowired
	public HallRepository hallRepository;
@Autowired
public  ReservationService reservationService;

	@Override
	public List<Hall> getAllAvailableHall(Schedule schedule) {
		
	 //   List<Reservation>allReserveHall =reservationService.listReservationBySchedule( schedule);
        List<Hall>halls= (List<Hall>) hallRepository.findAll();
       // halls.removeAll(allReserveHall);
		return halls;
				
	}

	@Override
	public Hall findOne(Long id) {
		// TODO Auto-generated method stub
		return hallRepository.findOne(id);
		
	}

	

}
