package com.mypack.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.YingXiong;

public interface YingXiongServiceIF {

	public List<YingXiong> queryAllYX();
	
	public YingXiong queryOneYX(int id);
	
	public void insertOneYX(YingXiong yx);
	
	public void deleteOneYX(int id);
	
	public void updateOneYX(YingXiong yx);
	
	public PageInfo<YingXiong> queryOneAllYXPage(int currentPage,int pageSize);

	public PageInfo<YingXiong> queryFenLei(int currentPage,int pageSize,YingXiong yx);
	
}
