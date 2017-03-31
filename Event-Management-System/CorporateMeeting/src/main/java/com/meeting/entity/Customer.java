package com.meeting.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6226829148135697502L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToOne
	private Address address;
	private String username;
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", username=" + username + "]";
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	


}
