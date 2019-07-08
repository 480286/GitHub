package com.mypack.dao;

import java.util.List;

import com.mypack.entity.CaiDan_Yi;

public interface CaiDan_YiDao {
	
	//一级菜单查询所有	
	public List<CaiDan_Yi> queryAllCaiDan();
	
	//一级菜单查询单个
	public CaiDan_Yi queryOneCaiDan(int id);
	
	//一级菜单修改单个
	public boolean updateCaiDan(CaiDan_Yi menu);
	
	//一级菜单添加单个
	public boolean addCaiDan(CaiDan_Yi menu);
	
	//一级菜单删除单个
	public boolean deleteCaiDan(int id);
	
}
