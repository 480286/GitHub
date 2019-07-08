package com.mypack.dao;

import com.mypack.entity.User;

public interface UserDao {

	public User queryUserByName(String username);
	
	public User queryUserByPhone(String phone);
	
	public User queryUserByEmail(String eamil);
	
	public boolean addUser(User user);
	
	public boolean updateUserByPhone(User user);
	
	public boolean updateUserByEmail(User user);
}
