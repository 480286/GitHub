package com.mypack.entity;

public class Classes {

	int cid;
	String cname;
	Teacher teacher;
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classes(int cid, String cname, Teacher teacher) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teacher = teacher;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + ", teacher="
				+ teacher + "]";
	}
	
	
}
