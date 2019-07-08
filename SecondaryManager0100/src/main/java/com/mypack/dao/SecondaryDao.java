package com.mypack.dao;

import java.util.List;

import com.mypack.entity.SecondaryMenu;

public interface SecondaryDao {
	
	public List<SecondaryMenu> queryAllMenuByA_Id(int a_Id);
	
	//二级查询单个
	public SecondaryMenu queryOneMenuById(int id);
	
	//二级修改单个
	public boolean updateMenu(SecondaryMenu menu);
	
	//二级添加单个
	public boolean addMenu(SecondaryMenu menu);
	
	//二级删除单个
	public boolean deleteMenu(int id);

	
	
}
