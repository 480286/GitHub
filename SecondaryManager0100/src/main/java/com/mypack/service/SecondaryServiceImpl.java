package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.SecondaryDao;
import com.mypack.entity.SecondaryMenu;

@Service
@Transactional
public class SecondaryServiceImpl implements SecondaryServiceIF {

	@Autowired
	SecondaryDao secondaryDao;

	//�����˵�����һ���˵�id��ѯ
	public List<SecondaryMenu> queryAllMenuByA_Id(int a_Id){
		return secondaryDao.queryAllMenuByA_Id(a_Id);
	}
	
	
	//�����޸ĵ���
	/* (non-Javadoc)
	 * @see com.mypack.service.SecondaryServiceIF#updateMenu(com.mypack.entity.SecondaryMenu)
	 */
	public boolean updateMenu(SecondaryMenu menu) {
		return secondaryDao.updateMenu(menu);
	}
	
	//������ӵ���
	/* (non-Javadoc)
	 * @see com.mypack.service.SecondaryServiceIF#addMenu(com.mypack.entity.SecondaryMenu)
	 */
	public boolean addMenu(SecondaryMenu menu) {
		return secondaryDao.addMenu(menu);
	}
	
	//����ɾ������
	/* (non-Javadoc)
	 * @see com.mypack.service.SecondaryServiceIF#deleteMenu(int)
	 */
	public boolean deleteMenu(int id) {
		return secondaryDao.deleteMenu(id);
	}

	//�����˵����ݶ����˵�id��ѯ
	public SecondaryMenu qqueryOneMenuById(int id) {
		// TODO Auto-generated method stub
		return secondaryDao.queryOneMenuById(id);
	}


	@Override
	public SecondaryMenu queryOneMenuById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
