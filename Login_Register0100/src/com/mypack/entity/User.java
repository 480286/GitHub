package com.mypack.entity;

import java.sql.Date;

public class User {

	int userId;
	String username;
	String phone;
	String email;
	String password;
	int idNums;         //…Ì∑›÷§∫≈¬Î
	Date birthday;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String username, String phone, String email, String password, int idNums, Date birthday) {
		super();
		this.userId = userId;
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.idNums = idNums;
		this.birthday = birthday;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdNums() {
		return idNums;
	}
	public void setIdNums(int idNums) {
		this.idNums = idNums;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", idNums=" + idNums + ", birthday=" + birthday + "]";
	}
	
	
	
	
}
