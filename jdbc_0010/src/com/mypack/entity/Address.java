package com.mypack.entity;

public class Address {

	int add_id;
	String add_name;
	String add_ssx;
	String add_xq;
	String add_yb;
	String add_tel;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int add_id, String add_name, String add_ssx, String add_xq, String add_yb, String add_tel) {
		super();
		this.add_id = add_id;
		this.add_name = add_name;
		this.add_ssx = add_ssx;
		this.add_xq = add_xq;
		this.add_yb = add_yb;
		this.add_tel = add_tel;
	}
	
	public Address(String add_name, String add_ssx, String add_xq, String add_yb, String add_tel) {
		super();
		this.add_name = add_name;
		this.add_ssx = add_ssx;
		this.add_xq = add_xq;
		this.add_yb = add_yb;
		this.add_tel = add_tel;
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getAdd_name() {
		return add_name;
	}
	public void setAdd_name(String add_name) {
		this.add_name = add_name;
	}
	public String getAdd_ssx() {
		return add_ssx;
	}
	public void setAdd_ssx(String add_ssx) {
		this.add_ssx = add_ssx;
	}
	public String getAdd_xq() {
		return add_xq;
	}
	public void setAdd_xq(String add_xq) {
		this.add_xq = add_xq;
	}
	public String getAdd_yb() {
		return add_yb;
	}
	public void setAdd_yb(String add_yb) {
		this.add_yb = add_yb;
	}
	public String getAdd_tel() {
		return add_tel;
	}
	public void setAdd_tel(String add_tel) {
		this.add_tel = add_tel;
	}
	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", add_name=" + add_name + ", add_ssx=" + add_ssx + ", add_xq=" + add_xq
				+ ", add_yb=" + add_yb + ", add_tel=" + add_tel + "]";
	}
	
	
}
