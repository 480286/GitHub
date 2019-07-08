package com.mypack.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.GoodsDaoIF;
import com.mypack.dao.GoodsDaoImpl;
import com.mypack.entity.Goods;


public class ListGoodsServlet extends HttpServlet {


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		GoodsDaoIF goodDao = new GoodsDaoImpl();
		List<Goods> goodsLst=goodDao.queryAllGoods();
		ServletContext application=this.getServletContext();
		application.setAttribute("goodsLst", goodsLst);
		response.sendRedirect("list.jsp");
	}
}
