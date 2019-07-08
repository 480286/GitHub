package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.StuDao;
import com.mypack.entity.Student;

@Service
@Transactional
public class StuServiceImpl implements StuServiceIF {

	@Autowired
	StuDao stuDao;

	public StuDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(StuDao stuDao) {
		this.stuDao = stuDao;
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#queryAllStu()
	 */
	public List<Student> queryAllStu(){
		return stuDao.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#queryStuById(int)
	 */
	public Student queryStuById(int id) {
		return stuDao.findOne(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StuServiceIF#listAllStuByPage(int, int)
	 */
	public Page<Student> listAllStuByPage(int currentPage, int pageSize){
		Pageable page = new PageRequest(currentPage, pageSize);
		return stuDao.findAll(page);
	}
	
}
