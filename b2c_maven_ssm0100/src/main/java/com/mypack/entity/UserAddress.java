package com.mypack.entity;

public class UserAddress {

	int addId;
	String address;
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserAddress(int addId, String address) {
		super();
		this.addId = addId;
		this.address = address;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserAddress [addId=" + addId + ", address=" + address + "]";
	}
	
}
