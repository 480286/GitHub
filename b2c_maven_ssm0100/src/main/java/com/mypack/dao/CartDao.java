package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Cart;

public interface CartDao {

	public boolean insertGoods(Cart cart);
	
	public Cart queryCartBygId(int gId);
}
