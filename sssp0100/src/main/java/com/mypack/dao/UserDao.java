package com.mypack.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mypack.entity.User;

public interface UserDao extends JpaRepository<User, String>{

	@Query("from User")
	public List<User> queryAllUser();
	
	@Query("from User where username= :username and password= :password")
	public User login(User user);

}
