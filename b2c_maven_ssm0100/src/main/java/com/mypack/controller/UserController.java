package com.mypack.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mypack.entity.User;
import com.mypack.service.UserServiceIF;

@Controller
@Transactional
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceIF userService;
	
	@RequestMapping("/login")
	public String login(User user, HttpSession session) {
		User u=userService.queryUserByName(user.getUsername());
		if(u!=null) {
			if(user.getPassword().equals(u.getPassword())) {
				session.setAttribute("user", user);
				return "index";
			}
		}
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/register")
	public String register(User user) {
		String regexPhone = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		String regexPassword = "^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$";
		String regexEamil = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		if(user.getPhone().length()==11) {
			Pattern p = Pattern.compile(regexPhone);
			Matcher m = p.matcher(user.getPhone());
			boolean flag = m.matches();
			if(flag) {
				Pattern p1 = Pattern.compile(regexPassword);
				Matcher m1 = p1.matcher(user.getPassword());
				boolean flag1 = m1.matches();
				if(flag1) {
					Pattern p2 = Pattern.compile(regexEamil);
					Matcher m2 = p2.matcher(user.getEmail());
					boolean flag2 = m2.matches();
					if(flag2) {
						boolean flag3=userService.insertUser(user);
						if(flag3) {
							return "redirect:/login.jsp";
						}else {
							return "redirect:/register.jsp";
						}
					}else {
						return "redirect:/register.jsp";
					}
				}else {
					return "redirect:/register.jsp";
				}
			}else {
				return "redirect:/register.jsp";
			}
		}else {
			return "redirect:/register.jsp";
		}
		
		
	}
	
	@RequestMapping("/ajax")
	@ResponseBody
	public String registerAjax(HttpServletRequest request) {
		String username = request.getParameter("username");
		User u=userService.queryUserByName(username);
		
		//判断用户名是否存在
		if(u!=null) {
			return "0";
			
		}
		else{
			return "1";
		}
		
	}
	
	@RequestMapping("/retrieve")
	public String retrieve(String verification) {
		int verification1 = Integer.parseInt(verification);
		if(verification!=null) {
			if(verification1==userService.returnRandom()) {
				return "redirect:/reset.jsp";
			}else {
				return "redirect:/retrieve.jsp";
			}
		}else {
			return "redirect:/retrieve.jsp";
		}
		
		
	}
	
	@RequestMapping("/ajaxVe")
	@ResponseBody
	public String ajaxVe(HttpServletRequest request, HttpSession session) {
		String email=request.getParameter("email");
		session.setAttribute("email", email);
		boolean flag=userService.emailVer(email);
		if(flag) {
			return "0";
		}else {
			return "1";
		}
	}
	
	@RequestMapping("/resetPassword")
	public String resetPassword(String password, HttpSession session) {
		String email=(String)session.getAttribute("email");
		if(email==null) {
			return "redirect:/reset.jsp";
		}
		int uId=userService.queryUserIdByEmail(email);
		User user = new User();
		user.setPassword(password);
		user.setuId(uId);
		
		boolean flag=userService.updateUserPasswordById(user);
		if(flag) {
			return "redirect:/login.jsp";
		}else {
			return "redirect:/reset.jsp";
		}
		
	}
}
