package com.mypack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.User;
import com.mypack.service.UserServiceIF;

@Controller
public class UserController {
	@Autowired
	UserServiceIF usi;
	
	
	public UserServiceIF getUsi() {
		return usi;
	}

	public void setUsi(UserServiceIF usi) {
		this.usi = usi;
	}

	@RequestMapping("/dengLu")
	public String dengLu(User user){
		User u= usi.queryOneUser(user.getUsername());
		if(u!=null){
			if(u.getPassword().equals(user.getPassword())){
				System.out.println("登陆成功");
				return "redirect:xinXi";
			}else{
				System.out.println("密码错误");
			}
		}else{
			System.out.println("用户名不存在");
		}
		return "redirect:index.jsp";
		
	}
	
	@RequestMapping("/zhuCe")
	public String zhuCe(User user){
		if(user.getUsername()==null||user.getPassword()==null){
			System.out.println("账号或密码不能为空");
			return"redirect:zhuce.jsp";
		}
		User u= usi.queryOneUser(user.getUsername());
		if(u==null){
			usi.insertUser(user);
			System.out.println("注册成功");
			return "redirect:index.jsp";
		}else{
			System.out.println("该账户名称已存在");
			return"redirect:zhuce.jsp";
		}
	}
}
