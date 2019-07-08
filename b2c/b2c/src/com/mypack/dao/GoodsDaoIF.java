package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Goods;

public interface GoodsDaoIF {

	public Goods queryOneGoods(int goodsId);
	public List<Goods> queryAllGoods();
}
