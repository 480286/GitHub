package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.User;
import com.mypack.service.UserServiceIF;

@Controller
public class UserController {

	@Autowired
	UserServiceIF userService;
	
	@RequestMapping("/register")
	public String register(User user){
		
		boolean flag=userService.addUser(user);
		if(flag){
			return "redirect:/login.jsp";
		}else{
			return "redirect:/register.jsp";
		}
	}
	
	@RequestMapping("/login")
	public String login(User u){
		User user=userService.queryUserByUsername(u.getUsername());
		System.out.println("111111111111111111111111111111111111111111111111111");
		if(user!=null){
			if(u.getPassword().equals(user.getPassword())){
				return "redirect:/list";
			}else{
				return "redirect:/login.jsp";
			}
		}else{
			return "redirect:/login.jsp";
		}
	}
	
}
