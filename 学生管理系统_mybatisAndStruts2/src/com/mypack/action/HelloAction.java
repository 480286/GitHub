package com.mypack.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action{

	public String execute() throws Exception {
		System.out.println("HelloAction ±ª÷¥––¡À°£°£°£");
		return "success";
	}

}
