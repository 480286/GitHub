package com.mypack.dao;

import com.mypack.entity.User;

public interface UserDaoIF {

	public User queryUserByUserName(User user);
	public boolean addUser(User user);
}
