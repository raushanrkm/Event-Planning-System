package com.meeting.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity 
public class Hall implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 8060935997061824532L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne()
	private Venue venue;
	
	String hallname;
	@NotNull
	Double cost;
	
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getHallname() {
		return hallname;
	}
	public void setHallname(String hallName) {
		this.hallname = hallName;
	}
	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}
	private Long capacity;
	@Override
	public String toString() {
		return "Hall [id=" + id + ", venue=" + venue + ", hallname=" + hallname + ", cost=" + cost + ", capacity="
				+ capacity + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}


}


