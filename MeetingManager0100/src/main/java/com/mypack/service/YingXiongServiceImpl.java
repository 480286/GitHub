package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypack.dao.YingXiongDao;
import com.mypack.entity.YingXiong;
@Transactional
@Service
public class YingXiongServiceImpl implements YingXiongServiceIF{
	@Autowired
	YingXiongDao yxDao;
	
	public YingXiongDao getYxDao() {
		return yxDao;
	}

	public void setYxDao(YingXiongDao yxDao) {
		this.yxDao = yxDao;
	}

	public List<YingXiong> queryAllYX() {
		// TODO Auto-generated method stub
		return yxDao.queryAllYX();
	}

	public YingXiong queryOneYX(int id) {
		// TODO Auto-generated method stub
		return yxDao.queryOneYX(id);
	}


	public void insertOneYX(YingXiong yx) {
		// TODO Auto-generated method stub
		yxDao.insertOneYX(yx);
	}

	public void deleteOneYX(int id) {
		// TODO Auto-generated method stub
		yxDao.deleteOneYX(id);
		
	}


	public void updateOneYX(YingXiong yx) {
		// TODO Auto-generated method stub
		yxDao.updateOneYX(yx);
	}
	
	public PageInfo<YingXiong> queryOneAllYXPage(int currentPage,int pageSize){
		PageHelper.startPage(currentPage,pageSize);
		
		List<YingXiong> lst = yxDao.queryAllYX();
		
		PageInfo<YingXiong> pf = new PageInfo<YingXiong>(lst);
		return pf;
	}


	public PageInfo<YingXiong> queryFenLei(int currentPage, int pageSize,YingXiong yx) {
		PageHelper.startPage(currentPage,pageSize);
		List<YingXiong> lst = yxDao.queryYingXiong(yx);
		PageInfo<YingXiong> pf = new PageInfo<YingXiong>(lst);
		return pf;
	}

	
	

	
	
}
