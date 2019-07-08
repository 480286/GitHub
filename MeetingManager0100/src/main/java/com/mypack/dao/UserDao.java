package com.mypack.dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.mypack.entity.User;

public interface UserDao {
	
	public User queryOneUser(String username);
	
	public void insertUser(User user);
}
