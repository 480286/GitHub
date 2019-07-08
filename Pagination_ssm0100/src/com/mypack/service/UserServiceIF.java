package com.mypack.service;

import com.mypack.entity.User;

public interface UserServiceIF {

	public abstract User queryUserByUsername(String username);

	public abstract boolean addUser(User user);

}