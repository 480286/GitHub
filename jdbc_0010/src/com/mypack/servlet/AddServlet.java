package com.mypack.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.AddressDaoIF;
import com.mypack.dao.AddressDaoImpl;
import com.mypack.entity.Address;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String add_name=request.getParameter("add_name");
		String add_ssx=request.getParameter("add_ssx");
		String add_xq=request.getParameter("add_xq");
		String add_yb=request.getParameter("add_yb");
		String add_tel=request.getParameter("add_tel");
		
		Address address = new Address(add_name, add_ssx, add_xq, add_yb, add_tel);
		AddressDaoIF addressDao = new AddressDaoImpl();
		boolean flag=addressDao.addAddress(address);
		
		if(flag) {
			response.sendRedirect("/jdbc_0010/ListServlet");
		}
	}

}
