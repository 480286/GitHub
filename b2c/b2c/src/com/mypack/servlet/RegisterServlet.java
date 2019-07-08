package com.mypack.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.UserDaoIF;
import com.mypack.dao.UserDaoImpl;
import com.mypack.entity.User;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user = new User(username, password);
		UserDaoIF userDao = new UserDaoImpl();
		boolean flag=userDao.addUser(user);
		if(flag==true){
			response.sendRedirect("login.jsp");
		} else{
			response.sendRedirect("register.jsp");
		}
	}
}
