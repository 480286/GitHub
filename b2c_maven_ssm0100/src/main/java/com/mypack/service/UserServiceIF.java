package com.mypack.service;

import com.mypack.entity.User;

public interface UserServiceIF {

	User queryUserByName(String username);

	boolean insertUser(User user);

	public String queryUserByPhone(String phone);
	
	public boolean emailVer(String email);
	
	public int returnRandom();
	
	public int queryUserIdByEmail(String email);
	
	public boolean updateUserPasswordById(User user);
}