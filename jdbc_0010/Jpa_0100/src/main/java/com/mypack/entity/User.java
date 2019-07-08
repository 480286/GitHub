package com.mypack.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
@javax.persistence.Table
public class User {

	int id;
	String username;
	String password;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length = 20, nullable = false)
	public String getUserName() {
		return username;
	}
	public void setUserName(String name) {
		this.username = name;
	}
	
	@Column(length = 20, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
