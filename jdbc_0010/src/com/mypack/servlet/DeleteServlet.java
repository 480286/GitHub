package com.mypack.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.AddressDaoIF;
import com.mypack.dao.AddressDaoImpl;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		AddressDaoIF addressDao=new AddressDaoImpl();
		boolean flag=addressDao.deletAddress(id);
		if(flag) {
			response.sendRedirect("/jdbc_0010/ListServlet");
		}
	}

}
