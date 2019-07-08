package com.mypack.dao;

import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mypack.entity.YingXiong;

public interface YingXiongDao {
	
	public List<YingXiong> queryAllYX();
	
	public YingXiong queryOneYX(int id);

	public void insertOneYX(YingXiong yx);
	
	public void deleteOneYX(int id);
	
	public void updateOneYX(YingXiong yx);
	
	public List<YingXiong> queryYingXiong(YingXiong yx);
	
	
}
