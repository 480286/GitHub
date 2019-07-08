package com.mypack.service;

import java.util.Random;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mypack.dao.UserDao;
import com.mypack.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserServiceIF {
	
	int nums;

	@Autowired
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#queryUserByName(java.lang.String)
	 */
	public User queryUserByName(String username) {
		return userDao.queryUserByName(username);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#insertUser(com.mypack.entity.User)
	 */
	public boolean insertUser(User user) {
		return userDao.insertUser(user);
	}
	
	/* (non-Javadoc)
	 * @see com.mypack.service.UserServiceIF#insertUser(com.mypack.entity.User)
	 */
	public String queryUserByPhone(String phone) {
		return userDao.queryUserByPhone(phone);
	}
	
	public boolean emailVer(String email) {
		Random random = new Random();
		int num = random.nextInt(9999-1000+1)+1000;
		nums = num;
		String msg = Integer.toString(num);
		HtmlEmail emails = new HtmlEmail();
		try {
			emails.setHostName("smtp.qq.com");
			emails.setCharset("utf-8");
			emails.addTo(email);
			emails.setFrom("480286753@qq.com", "逸云商城");
			emails.setAuthentication("480286753@qq.com", "gfncjgqvsmfbbiaj");
			emails.setSubject("逸云商城验证码");
			emails.setMsg(msg);
			emails.send();
			System.out.println("邮件发送成功！");
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("邮件发送失败！");
		}
		return true;
		
	}
	
	public int returnRandom() {
		
		return nums;
	}
	
	public int queryUserIdByEmail(String email) {
		return userDao.queryUserIdByEmail(email);
	}
	
	public boolean updateUserPasswordById(User user) {
		return userDao.updateUserPasswordById(user);
	}

}
