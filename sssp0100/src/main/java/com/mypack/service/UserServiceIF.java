package com.mypack.service;

import com.mypack.entity.User;

public interface UserServiceIF {

	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryAllUser()
	 */
	User queryOneUser(User user);

	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryUserById(int)
	 */
	void insertUser(User user);

	User validateUser(String username);

}