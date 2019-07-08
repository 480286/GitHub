package com.mypack.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.mypack.entity.Student;

public interface StuServiceIF {

	List<Student> queryAllStu();

	Student queryStuById(int id);

	Page<Student> listAllStuByPage(int currentPage, int pageSize);

}