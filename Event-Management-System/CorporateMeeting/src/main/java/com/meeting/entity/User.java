package com.meeting.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1085408470043267919L;
	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String password;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Authority>authorities;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Authority> getAuthorities() {
		return authorities;
	}
	
	
	public void setAuthority(List<Authority> authorities) {
		this.authorities = authorities;
	}

}
