//@author Ashutosh Ghimire

package com.meeting.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Authority implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7080465762444186919L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private User user;
	private String role;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = "ROLE_"+role;
	}
}
