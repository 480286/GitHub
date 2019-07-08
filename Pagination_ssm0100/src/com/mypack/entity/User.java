package com.mypack.entity;

public class User {

	String username;
	String password;
	String tel;
	String qq;
	String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String tel, String qq,
			String email) {
		super();
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.qq = qq;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", tel=" + tel + ", qq=" + qq + ", email=" + email + "]";
	}
	
}
