package com.mypack.entity;

public class Addr {

	int addressId;
	String receiver;
	String region;
	String detailAddr;
	String phone;
	User user;
	public Addr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addr(int addressId, String receiver, String region,
			String detailAddr, String phone, User user) {
		super();
		this.addressId = addressId;
		this.receiver = receiver;
		this.region = region;
		this.detailAddr = detailAddr;
		this.phone = phone;
		this.user = user;
	}
	
	
	public Addr(String receiver, String region, String detailAddr, String phone) {
		super();
		this.receiver = receiver;
		this.region = region;
		this.detailAddr = detailAddr;
		this.phone = phone;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
	
}
