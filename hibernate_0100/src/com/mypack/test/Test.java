package com.mypack.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mypack.entity.User;

@SuppressWarnings("deprecation")
public class Test {

	@org.junit.Test
	public void testQueryAll() {
		Configuration cfg = new Configuration().configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tran = session.beginTransaction();
		
		Criteria criteria=session.createCriteria(User.class);
		List<User> lst=criteria.list();
		for (User user : lst) {
			System.out.println(user);
		}
		
		
		tran.commit();
		session.close();
	}
	
	@org.junit.Test
	public void testQueryBetween() {
		Configuration cfg = new Configuration().configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tran = session.beginTransaction();
		
		Query query = session.createQuery("from User where id between 2 and 5");
		List<User> lst = query.list();
		for (User user : lst) {
			System.out.println(user);
		}
		
		
		tran.commit();
		session.close();
	}
	
	@org.junit.Test
	public void testQueryOne() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		
		User user = session.load(User.class, 3);
		System.out.println(user);
		
		tran.commit();
		session.close();
	}
	
	@org.junit.Test
	public void testUpdateOne() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		
		User user = session.get(User.class, 7);
		user.setUsername("�����߻�");
		user.setPassword("666");
		session.update(user);
		
		tran.commit();
		session.close();
	}
	
	@org.junit.Test
	public void testAddOne() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		
		User user = new User(12, "sss", "bbb");
		session.saveOrUpdate(user);
		
		tran.commit();
		session.close();
	}
	
	@org.junit.Test
	public void testDeleteOne() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		
		User user = session.get(User.class, 3);
		session.delete(user);
		
		tran.commit();
		session.beginTransaction();
		 
	}

}
