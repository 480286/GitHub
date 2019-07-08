package com.mypack.dao;

import com.mypack.entity.User;

public interface UserDao {

	//根据用户名查询用户名和密码
	public User queryUserByName(String username);
	
	//添加用户
	public boolean insertUser(User user); 
	
	//根据手机号查询用户名
	public String queryUserByPhone(String phone);
	
	//根据email查询id
	public int queryUserIdByEmail(String email);
	
	//根据id修改用户密码
	public boolean updateUserPasswordById(User user);
}
