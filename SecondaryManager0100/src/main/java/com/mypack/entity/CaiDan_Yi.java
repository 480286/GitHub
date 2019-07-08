package com.mypack.entity;


public class CaiDan_Yi {

	int id;
	String valuename1;
	String valuename2;
	String valuename3;
	String valuename4;
	public CaiDan_Yi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CaiDan_Yi(String valuename1, String valuename2, String valuename3, String valuename4) {
		super();
		this.valuename1 = valuename1;
		this.valuename2 = valuename2;
		this.valuename3 = valuename3;
		this.valuename4 = valuename4;
	}

	public CaiDan_Yi(int id, String valuename1, String valuename2, String valuename3, String valuename4) {
		super();
		this.id = id;
		this.valuename1 = valuename1;
		this.valuename2 = valuename2;
		this.valuename3 = valuename3;
		this.valuename4 = valuename4;
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
	@Override
	public String toString() {
		return "CaiDan_Yi [id=" + id + ", valuename1=" + valuename1 + ", valuename2=" + valuename2 + ", valuename3="
				+ valuename3 + ", valuename4=" + valuename4 + "]";
	}

	
	
	
	
}
