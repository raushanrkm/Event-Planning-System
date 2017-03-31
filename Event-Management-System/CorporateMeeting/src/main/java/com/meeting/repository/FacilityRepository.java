package com.meeting.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meeting.entity.Facility;
import com.meeting.entity.Reservation;

/*
 * @Author: Yashika Goyal
 * 
 * */

@Repository
public interface FacilityRepository extends CrudRepository<Facility, Long>{
	
	@Query("select p from Facility p") ////TO-DO for Yashika updated by ashutosh
	public Facility listFacilityByReservation();

}
