package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Classes;

public interface ClassesDao {

	public Classes queryOneClassesById(int id);
	public List<Classes> queryAllClasses();
	public void updateOneClasses(Classes classes);
	public void insertOneClasses(Classes classes);
	public void deleteOneClasses(int id);
	
}
