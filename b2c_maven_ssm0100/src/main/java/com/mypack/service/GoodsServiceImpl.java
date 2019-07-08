package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypack.dao.GoodsDao;
import com.mypack.entity.Goods;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsServiceIF {

	@Autowired
	GoodsDao goodsDao;
	
	/* (non-Javadoc)
	 * @see com.mypack.service.GoodsServiceIF#queryGoodsAll()
	 */
	public PageInfo<Goods> queryAllGoods(int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		List<Goods> goodsLst = goodsDao.queryAllGoods();
		PageInfo<Goods> pf = new PageInfo<Goods>(goodsLst);
		return pf;
	}
	
	public Goods queryOneGoods(int gId) {
		return goodsDao.queryOneGoods(gId);
	}


}
