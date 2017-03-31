package com.meeting.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Future;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Schedule implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6755198865385419242L;
	@Id
	@GeneratedValue
	
	private Long id;
	
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date date;
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
		
		
		
	}
	
}