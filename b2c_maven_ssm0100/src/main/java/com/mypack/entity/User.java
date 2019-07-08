package com.mypack.entity;

import java.sql.Date;

public class User {

	int uId;
	String username;
	String password;
	String phone;
	Date registerTime;									//当前时间
	String email;
	GoodsEvaluation goodsEvaluation;					//商品评价
	UserAddress address;								//用户地址
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uId, String username, String password, String phone, Date registerTime, String email,
			GoodsEvaluation goodsEvaluation, UserAddress address) {
		super();
		this.uId = uId;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.registerTime = registerTime;
		this.email = email;
		this.goodsEvaluation = goodsEvaluation;
		this.address = address;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public GoodsEvaluation getGoodsEvaluation() {
		return goodsEvaluation;
	}
	public void setGoodsEvaluation(GoodsEvaluation goodsEvaluation) {
		this.goodsEvaluation = goodsEvaluation;
	}
	public UserAddress getAddress() {
		return address;
	}
	public void setAddress(UserAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", registerTime=" + registerTime + ", email=" + email + ", goodsEvaluation=" + goodsEvaluation
				+ ", address=" + address + "]";
	}
	
	
	
	
	
}
