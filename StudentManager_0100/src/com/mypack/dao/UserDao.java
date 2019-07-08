package com.mypack.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.mypack.entity.User;

public interface UserDao {

	@Select("select * from user where username=#{username}")
	public User queryUserByName(String username);
	
	@Insert("insert into user values(#{username},#{password})")
	public boolean addUser(User user);
}
