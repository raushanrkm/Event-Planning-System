package com.meeting.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
public class Venue implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	private Long id;
	
	@Override
	public String toString() {
		return "Venue [name=" + name + ", address=" + address + "]";
	}
	private String name;
	
	
	@OneToOne
	private Address address;
	@OneToOne
	private Schedule schedule;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="venue")
	
	private List <Hall> halls;
	public List<Hall> getHalls() {
		return halls;
	}
	public void setHalls(List<Hall> halls) {
		this.halls = halls;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
}