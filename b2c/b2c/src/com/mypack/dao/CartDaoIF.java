package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Item;
import com.mypack.entity.User;

public interface CartDaoIF {

	public boolean addCart(Item item);
	public List<Item> queryAllCart(User user);
	public boolean updateCart(Item item);
	public boolean deleteCart(int itemId);
}
