package com.mypack.entity;

import javax.persistence.Id;

public class Student {

	int id;
	String chuan;
	String wo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String chuan, String wo) {
		super();
		this.id = id;
		this.chuan = chuan;
		this.wo = wo;
	}
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChuan() {
		return chuan;
	}
	public void setChuan(String chuan) {
		this.chuan = chuan;
	}
	public String getWo() {
		return wo;
	}
	public void setWo(String wo) {
		this.wo = wo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", chuan=" + chuan + ", wo=" + wo + "]";
	}
	
	
	
	
	
}
