package com.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.UserDao;
import com.mypack.entity.User;
@Transactional
@Service
public class UserServiceImpl implements UserServiceIF{
	@Autowired
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	public User queryOneUser(String username) {
		
		return userDao.queryOneUser(username);
	}

	public void insertUser(User user) {
		userDao.insertUser(user);
		
	}

}
