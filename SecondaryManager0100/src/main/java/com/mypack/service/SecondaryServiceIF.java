package com.mypack.service;

import java.util.List;

import com.mypack.entity.SecondaryMenu;

public interface SecondaryServiceIF {
	
	//二级菜单根据一级菜单id查询
	public List<SecondaryMenu> queryAllMenuByA_Id(int a_Id);
	
	//二级菜单根据二级菜单id查询
	SecondaryMenu queryOneMenuById(int id);

	//二级修改单个
	boolean updateMenu(SecondaryMenu menu);

	//二级添加单个
	boolean addMenu(SecondaryMenu menu);

	//二级删除单个
	boolean deleteMenu(int id);

}