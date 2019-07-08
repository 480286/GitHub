package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.CaiDan_YiDao;
import com.mypack.entity.CaiDan_Yi;
@Transactional
@Service
@ComponentScan("com.mypack.dao")
public class CaiDan_YiImpl implements CaiDan_YiIF {
	
	@Autowired
	CaiDan_YiDao caidan_yiDao;

	//һ�����������ѯ����
	public List<CaiDan_Yi> queryAllCaiDan() {
		// TODO Auto-generated method stub
		return caidan_yiDao.queryAllCaiDan();
	}
	
	//һ���˵���ѯ����
	public CaiDan_Yi queryOneCaiDan(int id) {
		return caidan_yiDao.queryOneCaiDan(id);
	}
	
	//һ���˵��޸ĵ���
	public boolean updateCaiDan(CaiDan_Yi menu) {
		return caidan_yiDao.updateCaiDan(menu);
	}
	
	//һ���˵���ӵ���
	public boolean addCaiDan(CaiDan_Yi menu) {
		return caidan_yiDao.addCaiDan(menu);
	}
	
	//һ���˵�ɾ������
	public boolean deleteCaiDan(int id) {
		return caidan_yiDao.deleteCaiDan(id);
	}

}
