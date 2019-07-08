package com.mypack.service;

import java.util.List;

import com.mypack.entity.Student;

public interface StudentServiceIF {

	Student queryOneStu(int id);

	List<Student> queryAllStu();

	boolean addStu(Student stu);

	boolean deleteStu(int id);

	boolean updateStu(Student stu);

}