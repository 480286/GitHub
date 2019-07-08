package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mypack.dao.StudentDao;
import com.mypack.entity.Student;

@Transactional
@Service
public class StuServiceImpl implements StuServiceIF {

	@Autowired
	StudentDao stuDao;
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#queryAllStu()
	 */
	public List<Student> queryAllStu(){
		return stuDao.queryAllStu();
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#queryStuById(int)
	 */
	public Student queryStuById(int id){
		return stuDao.queryStuById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#updateStu()
	 */
	public boolean updateStu(){
		return stuDao.updateStu();
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#addStu()
	 */
	public boolean addStu(){
		return stuDao.addStu();
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#deleteStu()
	 */
	public boolean deleteStu(){
		return stuDao.deleteStu();
	}
	
	public PageInfo<Student> queryAllStuByPage(int currentpage, int pageSize){
		PageHelper.startPage(currentpage, pageSize);
		List<Student> stuLst = stuDao.queryAllStu();
		PageInfo<Student> pf = new PageInfo<Student>(stuLst);
		return pf;
	}
}
