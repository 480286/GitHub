package com.mypack.service;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.Goods;

public interface GoodsServiceIF {

	public PageInfo<Goods> queryAllGoods(int currentPage, int pageSize);
	
	Goods queryOneGoods(int gId);

}