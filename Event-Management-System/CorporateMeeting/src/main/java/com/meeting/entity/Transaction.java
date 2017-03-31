package com.meeting.entity;

import java.io.Serializable;

//@Author:Samikshya Adhikari

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Transaction implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4620455275441920264L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
    @Valid
    @Column(name="Reservation")
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Reservation> reservation;
    @Valid
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="Payment_Id")
	private Payment payment;
    
    @NotNull(message="{NotNull}")
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @Column(name="Date")
	private Date date;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Reservation> getReservation() {
		return reservation;
	}
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
