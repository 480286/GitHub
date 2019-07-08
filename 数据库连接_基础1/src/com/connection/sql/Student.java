package com.connection.sql;

public class Student {

	int id;
	String name;
	int age;
	String addres;
	String birthday;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, int age, String addres, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addres = addres;
		this.birthday = birthday;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddres() {
		return addres;
	}
	
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public void show(){
		System.out.println("学号"+getId()+"姓名"+getName()+"年龄"+getAge()+"地址"+getAddres()+"出生日期"+getBirthday());
	}
	
}
