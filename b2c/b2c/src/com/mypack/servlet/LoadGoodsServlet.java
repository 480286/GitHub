package com.mypack.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.GoodsDaoIF;
import com.mypack.dao.GoodsDaoImpl;
import com.mypack.entity.Goods;

public class LoadGoodsServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ids=request.getParameter("goodsId");
		int id=Integer.parseInt(ids);
		GoodsDaoIF goodDao = new GoodsDaoImpl();
		Goods good=goodDao.queryOneGoods(id);
		request.setAttribute("good", good);
		RequestDispatcher rd = request.getRequestDispatcher("goodsDetails.jsp");
		rd.forward(request, response);
		
	}
}
