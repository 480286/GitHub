package com.mypack.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypack.dao.UserDaoIF;
import com.mypack.dao.UserDaoImpl;
import com.mypack.entity.User;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		User user = new User(username, password);
		UserDaoIF userDao = new UserDaoImpl();
		User u = userDao.queryUserByUserName(user);
		if(u!=null){
			if(u.getPassword().equals(user.getPassword())){
				String name=user.getUserName();
				HttpSession session=request.getSession();
				session.setAttribute("name", name);
				response.sendRedirect("ListGoodsServlet");
			} else {
				response.sendRedirect("login.jsp");
			}
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
