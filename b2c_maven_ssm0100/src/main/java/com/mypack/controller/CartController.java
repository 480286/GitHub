package com.mypack.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypack.entity.Cart;
import com.mypack.entity.Goods;
import com.mypack.entity.User;
import com.mypack.service.CartServiceIF;

@Transactional
@Controller
@RequestMapping("/cart")
public class CartController {
	
	List<Goods> goodsLst;

	@Autowired
	CartServiceIF cartService;
	
	@RequestMapping("/count")
	public String countCart(Goods goods, int num, HttpSession session) {
		Cart cart = new Cart();
		cart.setCartNum(num);
		cart.setUser((User)session.getAttribute("user"));
		cart.setGoods(goods);
		cartService.insertGoods(cart);
		return "redirect:/cart/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		return "";
	}
}
