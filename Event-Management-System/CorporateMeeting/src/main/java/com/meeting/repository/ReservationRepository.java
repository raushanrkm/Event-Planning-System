package com.meeting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.meeting.entity.Customer;
import com.meeting.entity.Facility;
import com.meeting.entity.Reservation;


/*
 * @Author: Yashika Goyal
 * 
 * */

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	@Query("Select p from Reservation p") //TO-DO for Yashika
	public Reservation listReservationByCustomer();
	@Query("Select r from Reservation r where r.customer=:customer")
	public List<Reservation> findReservationByCustomer(@Param("customer") Customer customer);
}
