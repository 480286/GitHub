package com.mypack.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypack.dao.AddressDaoIF;
import com.mypack.dao.AddressDaoImpl;
import com.mypack.entity.Address;

/**
 * Servlet implementation class LoadServlet
 */
@WebServlet("/LoadServlet")
public class LoadServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String ids=request.getParameter("id");
		Integer id=Integer.parseInt(ids);
		AddressDaoIF addressDao=new AddressDaoImpl();
		Address address=addressDao.queryOneAddress(id);
		HttpSession session = request.getSession();
		session.setAttribute("address", address);
		response.sendRedirect("/jdbc_0010/update.jsp");
	}

}
