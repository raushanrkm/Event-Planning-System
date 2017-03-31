package com.meeting.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meeting.entity.Facility;
import com.meeting.repository.FacilityRepository;
import com.meeting.service.FacilityService;


/*
 * @Author: Yashika Goyal
 * 
 * */

@Service
@Transactional
public class FacilityServiceImpl implements FacilityService{

	@Autowired
	FacilityRepository facilityRepository;
	
	@Override
	public void save(Facility facilty) {
		// TODO Auto-generated method stub
		facilityRepository.save(facilty);
		
	}

	@Override
	public void delete(Facility facilty) {
		// TODO Auto-generated method stub
		facilityRepository.delete(facilty);
	}

	@Override
	public List<Facility> listAllFacility() {
		// TODO Auto-generated method stub
		return (List<Facility>) facilityRepository.findAll();
	}

	@Override
	public List<Facility> listFacilityByReservation() {
		// TODO Auto-generated method stub
		return (List<Facility>) facilityRepository.listFacilityByReservation();
	}

}
