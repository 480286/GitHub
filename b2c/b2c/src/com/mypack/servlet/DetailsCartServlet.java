package com.mypack.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypack.dao.CartDaoIF;
import com.mypack.dao.CartDaoImpl;
import com.mypack.dao.GoodsDaoIF;
import com.mypack.dao.GoodsDaoImpl;
import com.mypack.entity.Goods;
import com.mypack.entity.Item;
import com.mypack.entity.User;

public class DetailsCartServlet<Itme> extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse respones)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userName=(String) request.getSession().getAttribute("name");
		User user=new User();
		user.setUserName(userName);
		
		String ids=request.getParameter("goodsId");
		int goodId=Integer.parseInt(ids);
		String amount=request.getParameter("amount");
		int nums=Integer.parseInt(amount);
		GoodsDaoIF goodsDao=new GoodsDaoImpl();
		Goods good=goodsDao.queryOneGoods(goodId);
		CartDaoIF cartDao=new CartDaoImpl();
		Item item=new Item(good, nums, user);
		boolean flag=cartDao.addCart(item);
		
		if(flag==true){
			respones.sendRedirect("ListCartServlet");
		} else{
			respones.sendRedirect("goodsDetails.jsp");
		}
 
	}
}
