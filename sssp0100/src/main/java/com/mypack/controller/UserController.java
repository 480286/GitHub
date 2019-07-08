package com.mypack.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.User;
import com.mypack.service.UserServiceIF;

@Controller
public class UserController {

	@Autowired
	UserServiceIF userService;
	
	@RequestMapping("/login")
	public String login(User user, HttpSession session) {
		User u=userService.queryOneUser(user);
		if(u!=null) {
			if(u.get)
		}
	}
	
}
