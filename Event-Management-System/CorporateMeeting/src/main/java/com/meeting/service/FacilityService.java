package com.meeting.service;

import java.util.List;

import com.meeting.entity.Facility;


/*
 * @Author: Yashika Goyal
 * 
 * */

public interface FacilityService {
	
	public void save(Facility facilty);

	public void delete(Facility facilty);

	List<Facility> listAllFacility();

	List<Facility> listFacilityByReservation();
}
