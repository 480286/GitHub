package com.mypack.service;

import com.mypack.entity.User;

public interface UserServiceIF {

	public User queryOneUser(String username);
	
	public void insertUser(User user);
}
