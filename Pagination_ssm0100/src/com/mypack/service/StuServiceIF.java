package com.mypack.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.mypack.entity.Student;

public interface StuServiceIF {

	public abstract List<Student> queryAllStu();

	public abstract Student queryStuById(int id);

	public abstract boolean updateStu();

	public abstract boolean addStu();

	public abstract boolean deleteStu();
	
	public PageInfo<Student> queryAllStuByPage(int currentpage, int pageSize);

}