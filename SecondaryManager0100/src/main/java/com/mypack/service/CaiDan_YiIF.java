package com.mypack.service;

import java.util.List;

import com.mypack.entity.CaiDan_Yi;

public interface CaiDan_YiIF {
	
	public List<CaiDan_Yi> queryAllCaiDan();

	public CaiDan_Yi queryOneCaiDan(int id);
	
	public boolean updateCaiDan(CaiDan_Yi menu);
	
	public boolean addCaiDan(CaiDan_Yi menu);
	
	public boolean deleteCaiDan(int id);
}
