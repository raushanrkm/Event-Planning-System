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
import com.meeting.repository.VenueRepository;
import com.meeting.service.ReservationService;
import com.meeting.service.VenueService;
@Service
@Transactional
public class VenueServiceImpl implements VenueService {
	@Autowired
	public VenueRepository venueRepository;
	@Autowired
	public  ReservationService reservationService;
	@Autowired
	public HallRepository hallRepository;
	
	public List<Venue> getAllAvailableVenue(Schedule schedule)
	{	
		
		
		return null;
		
		
	}

	
	
	

}
