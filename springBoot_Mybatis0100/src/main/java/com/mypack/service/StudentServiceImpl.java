package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.StudentDao;
import com.mypack.entity.Student;

@Transactional
@Service
@ComponentScan("com.mypack.dao")			//扫描组件，使其用注解的方式注入
public class StudentServiceImpl implements StudentServiceIF{

	@Autowired
	StudentDao stuDao;
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StudentServiceIF#queryOneStu(int)
	 */
	@Override
	public Student queryOneStu(int id) {
		return stuDao.queryOneStu(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StudentServiceIF#queryAllStu()
	 */
	@Override
	public List<Student> queryAllStu(){
		return stuDao.queryAllStu();
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StudentServiceIF#addStu(com.mypack.entity.Student)
	 */
	@Override
	public boolean addStu(Student stu) {
		return stuDao.addStu(stu);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StudentServiceIF#deleteStu(int)
	 */
	@Override
	public boolean deleteStu(int id) {
		return stuDao.deleteStu(id);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.StudentServiceIF#updateStu(com.mypack.entity.Student)
	 */
	@Override
	public boolean updateStu(Student stu) {
		return stuDao.updateStu(stu);
	}
}
