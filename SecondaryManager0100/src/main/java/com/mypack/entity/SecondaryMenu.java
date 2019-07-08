package com.mypack.entity;

public class SecondaryMenu {

	int id;				//二级菜单id
	String valuename1;	//二级菜单内容
	String valuename2;
	String valuename3;
	String valuename4;
	String valuename5;
	String valuename6;
	String valuename7;
	String valuename8;
	int a_id;
	public SecondaryMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SecondaryMenu(int id, String valuename1, String valuename2, String valuename3, String valuename4,
			String valuename5, String valuename6, String valuename7, String valuename8, int a_id) {
		super();
		this.id = id;
		this.valuename1 = valuename1;
		this.valuename2 = valuename2;
		this.valuename3 = valuename3;
		this.valuename4 = valuename4;
		this.valuename5 = valuename5;
		this.valuename6 = valuename6;
		this.valuename7 = valuename7;
		this.valuename8 = valuename8;
		this.a_id = a_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValuename1() {
		return valuename1;
	}
	public void setValuename1(String valuename1) {
		this.valuename1 = valuename1;
	}
	public String getValuename2() {
		return valuename2;
	}
	public void setValuename2(String valuename2) {
		this.valuename2 = valuename2;
	}
	public String getValuename3() {
		return valuename3;
	}
	public void setValuename3(String valuename3) {
		this.valuename3 = valuename3;
	}
	public String getValuename4() {
		return valuename4;
	}
	public void setValuename4(String valuename4) {
		this.valuename4 = valuename4;
	}
	public String getValuename5() {
		return valuename5;
	}
	public void setValuename5(String valuename5) {
		this.valuename5 = valuename5;
	}
	public String getValuename6() {
		return valuename6;
	}
	public void setValuename6(String valuename6) {
		this.valuename6 = valuename6;
	}
	public String getValuename7() {
		return valuename7;
	}
	public void setValuename7(String valuename7) {
		this.valuename7 = valuename7;
	}
	public String getValuename8() {
		return valuename8;
	}
	public void setValuename8(String valuename8) {
		this.valuename8 = valuename8;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	@Override
	public String toString() {
		return "SecondaryMenu [id=" + id + ", valuename1=" + valuename1 + ", valuename2=" + valuename2 + ", valuename3="
				+ valuename3 + ", valuename4=" + valuename4 + ", valuename5=" + valuename5 + ", valuename6="
				+ valuename6 + ", valuename7=" + valuename7 + ", valuename8=" + valuename8 + ", a_id=" + a_id + "]";
	}
	
	
	
	
	
	
	
	
	
}
