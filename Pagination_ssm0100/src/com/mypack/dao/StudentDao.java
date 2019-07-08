package com.mypack.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mypack.entity.Student;

public interface StudentDao {

	@Select("select * from stu1")
	public List<Student> queryAllStu();
	
	@Select("select * from stu1 where id=#{id}")
	public Student queryStuById(int id);
	
	@Update("update stu1 set name=#{name},age=#{age},address=#{address} where id=#{id}")
	public boolean updateStu();
	
	@Insert("insert into stu1 values(name=#{name},age=#{age},address=#{address})")
	public boolean addStu();
	
	@Delete("delete from stu1 where id=#{id}")
	public boolean deleteStu();
}
