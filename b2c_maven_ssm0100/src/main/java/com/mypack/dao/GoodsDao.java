package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Goods;

public interface GoodsDao {

	public List<Goods> queryAllGoods(); 
	
	public Goods queryOneGoods(int gId);
}
