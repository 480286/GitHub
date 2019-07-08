package com.mypack.service;

import com.mypack.entity.User;

public interface UserServiceIF {

	User queryUserByName(String username);

	User queryUserByPhone(String phone);

	User queryUserByEmail(String eamil);

	boolean addUser(User user);

	boolean updateUserByPhone(User user);

	boolean updateUserByEmail(User user);

}