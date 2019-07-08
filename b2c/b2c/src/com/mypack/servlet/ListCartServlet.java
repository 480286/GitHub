package com.mypack.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypack.dao.CartDaoIF;
import com.mypack.dao.CartDaoImpl;
import com.mypack.entity.Item;
import com.mypack.entity.User;

public class ListCartServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		String userName=(String) session.getAttribute("name");
		User user=new User();
		user.setUserName(userName);
		CartDaoIF cartDao=new CartDaoImpl();
		List<Item> cartLst=cartDao.queryAllCart(user);
		session.setAttribute("cartLst", cartLst);
		System.out.println(cartLst);
		response.sendRedirect("cart.jsp");
	}
}
