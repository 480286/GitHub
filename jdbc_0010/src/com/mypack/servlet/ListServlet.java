package com.mypack.servlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		AddressDaoIF addressDao=new AddressDaoImpl();
		List<Address> lst=addressDao.queryAllAddress();
		HttpSession session = request.getSession();
		session.setAttribute("lst", lst);
		response.sendRedirect("list.jsp");
	}

}
