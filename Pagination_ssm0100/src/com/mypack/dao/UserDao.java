package com.mypack.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.mypack.entity.User;

public interface UserDao {

	@Select("select * from users where username=#{username}")
	public User queryUserByUsername(String username);
	
	@Insert("insert into users values(#{username},#{password},#{tel},#{qq},#{email})")
	public boolean addUser(User user);
}
