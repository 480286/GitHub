package com.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.UserDao;
import com.mypack.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserServiceIF {

	//×Ô¶¯×°Åä
	@Autowired
	UserDao userDao;
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryUserByUsername()
	 */
	public User queryUserByUsername(String username){
		return userDao.queryUserByUsername(username);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#addUser()
	 */
	public boolean addUser(User user){
		return userDao.addUser(user);
	}
}
