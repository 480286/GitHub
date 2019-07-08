package com.mypack.entity;

public class User {

	String userName;
	String password;
	String phone;
	String qq;
	String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String password, String phone, String qq,
			String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.qq = qq;
		this.email = email;
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
