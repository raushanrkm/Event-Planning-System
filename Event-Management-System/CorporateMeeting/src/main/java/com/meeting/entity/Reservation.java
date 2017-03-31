package com.meeting.entity;

import java.io.Serializable;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;




@Entity
public class Reservation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4458894758457360596L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull()
	private Double totalCost;
	@OneToOne()
	Customer customer;
	@Override
	public String toString() {
		return "Reservation [totalCost=" + totalCost + ", schedule=" + schedule + ", hall=" + hall + ", facility="
				+ facility + "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	@Valid
	@OneToOne(cascade=CascadeType.ALL)
	private Schedule schedule;

	@Valid
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Hall hall;

	@Valid
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Facility> facility;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public List<Facility> getFacility() {
		return facility;
	}

	public void setFacility(List<Facility> facility) {
		this.facility = facility;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

}
