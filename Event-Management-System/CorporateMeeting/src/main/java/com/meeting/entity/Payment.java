//@Author:Samikshya Adhikari

package com.meeting.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Payment implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = -5889297774475477449L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@NotEmpty(message="{NotEmpty}")
@Column(name="PaymentMethod")
private  String paymentMethod;


@NotEmpty(message="{NotEmpty}")
@Column(name="Amount")
private Double amount;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public String getPaymentMethod() {
	return paymentMethod;
}
public void setPaymentMethod(String paymentMethod) {
	this.paymentMethod = paymentMethod;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}
