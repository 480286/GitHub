package com.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.UserDao;
import com.mypack.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserServiceIF {

	@Autowired
	UserDao userDao;
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryAllUser()
	 */
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryOneUser(com.mypack.entity.User)
	 */
	public User queryOneUser(User user) {
		return userDao.findOne(user.getUsername());
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryUserById(int)
	 */
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#insertUser(com.mypack.entity.User)
	 */
	public void insertUser(User user) {
		userDao.save(user);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#validateUser(java.lang.String)
	 */
	public User validateUser(String username) {
		return userDao.findOne(username);
	}
	
	
}
