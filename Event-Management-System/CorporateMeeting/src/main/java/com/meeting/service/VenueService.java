//@Author Raushan Kumar mahaseth

package com.meeting.service;

import java.util.List;

import com.meeting.entity.Schedule;
import com.meeting.entity.Venue;

public interface VenueService{
	
	public List<Venue> getAllAvailableVenue(Schedule schedule);

}
