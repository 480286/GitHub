package com.mypack.determine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Determine {

	public boolean determineName(String users) {
		String pattern="^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(users);
		
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean determinePhone(String users) {
		String pattern="^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\\\d{8}$";
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(users);
		
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean determineEmail(String users) {
		String pattern="^([a-z0-9A-Z]+[-|\\\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\\\.)+[a-zA-Z]{2,}$";
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(users);
		
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
}
