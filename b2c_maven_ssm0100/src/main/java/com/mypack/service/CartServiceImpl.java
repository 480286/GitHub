package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.CartDao;
import com.mypack.entity.Cart;

@Service
@Transactional
public class CartServiceImpl implements CartServiceIF {

	@Autowired
	CartDao cartDao;
	
	/* (non-Javadoc)
	 * @see com.mypack.service.CartServiceIF#insertGoods(com.mypack.entity.Cart)
	 */
	public boolean insertGoods(Cart cart) {
		return cartDao.insertGoods(cart);
	}
	
	public Cart queryCartBygId(int gId) {
		return cartDao.queryCartBygId(gId);
	}
	
}
