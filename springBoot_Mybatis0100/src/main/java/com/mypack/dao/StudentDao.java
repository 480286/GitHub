package com.mypack.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mypack.entity.Student;

@Mapper
public interface StudentDao {

	public Student queryOneStu(int id);
	
	public List<Student> queryAllStu();
	
	public boolean addStu(Student stu);
	
	public boolean deleteStu(int id);

	public boolean updateStu(Student stu);
}
