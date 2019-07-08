package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.determine.Determine;
import com.mypack.entity.User;
import com.mypack.service.UserServiceIF;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceIF userService;
	
	@Autowired
	Determine determine;
	
	@RequestMapping("/login")
	public String login(String users,String password) {
		boolean flag1=determine.determineName(users);
		if(flag1) {
			User user=userService.queryUserByName(users);
			if(user!=null&&user.getPassword().equals(password)) {
				return "list";
			}
		}else{
			boolean flag2=determine.determinePhone(users);
			if(flag2) {
				User user=userService.queryUserByPhone(users);
				if(user!=null&&user.getPassword().equals(password)) {
					return "list";
				}
			}else {
				boolean flag3=determine.determineEmail(users);
				if(flag3) {
					User user = userService.queryUserByEmail(users);
					if(user!=null&&user.getPassword().equals(password)) {
						return "list";
					}else {
						return "login";
					}
				}else {
					return "login";
				}
			}
		}
		return null;
		
	}
	
	@RequestMapping("/register")
	public String register(User user) {
		
		boolean flag=userService.addUser(user);
		if(flag) {
			return "login";
		}else {
			return "register";
		}
		
	}
	
	@RequestMapping("/resetpassword")
	public String resetpassword(String users, String password) {
		User u = new User();
		boolean flag1=determine.determinePhone(users);
		if(flag1) {
			User user=userService.queryUserByPhone(users);
			if(user!=null) {
				u.setPhone(users);
				u.setPassword(users);
				boolean flag=userService.updateUserByPhone(u);
				if(flag) {
					return "login";
				}
			}else {
				return "reset";
			}
		}else {
			boolean flag2=determine.determineEmail(u.getEmail());
			if(flag2) {
				User user = userService.queryUserByEmail(u.getEmail());
				if(user!=null) {
					u.setEmail(users);
					u.setPassword(password);
					boolean flag=userService.updateUserByEmail(u);
					if(flag) {
						return "login";
					}
					
				}else {
					return "reset";
				}
			}else {
				return "reset";
			}
		}
		return null;
	}
	
}
