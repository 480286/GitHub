package com.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.UserDao;
import com.mypack.entity.User;

@Transactional
@Service
public class UserServiceImpl implements UserServiceIF {

	@Autowired
	UserDao userDao;
	
	@Override
	public User queryUserByName(String username) {
		return userDao.queryUserByName(username);
	}
	
	@Override
	public User queryUserByPhone(String phone) {
		return userDao.queryUserByPhone(phone);
	}
	
	@Override
	public User queryUserByEmail(String eamil) {
		return userDao.queryUserByEmail(eamil);
	}
	
	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}
	
	@Override
	public boolean updateUserByPhone(User user) {
		return userDao.updateUserByPhone(user);
	}
	
	@Override
	public boolean updateUserByEmail(User user) {
		return userDao.updateUserByEmail(user);
	}
}
