package com.mypack.test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.mypack.entity.User;
import com.mypack.util.JpaUtil;


public class Test {

	@org.junit.Test
	public void testQueryAll() {
		EntityManager em=null;
		EntityTransaction tx=null;
		try {
			em = JpaUtil.getEntityManager();
			tx = em.getTransaction();
			
			tx.begin();
			String jpl = "select u from User u";
			Query q = em.createQuery(jpl);
			List<User> userLst = q.getResultList();
			Iterator<User> it=userLst.iterator();
			while(it.hasNext()) {
				User user=it.next();
				System.out.println("id:"+user.getId()+"/tname:"+user.getUserName()+"/tpassword:"+user.getPassword());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			em.close();
		}
		
		
	}
	
	@org.junit.Test
	public void testUpdate() {
		EntityManager em=JpaUtil.getEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		User u = new User();
		u.setId(4);
		u.setUserName("山本五十六");
		u.setPassword("666666");
		em.merge(u);		//merge 修改条件是必须一次性修改所有属性
		tx.commit();
		em.close();
	}
	
	@org.junit.Test
	public void testInsert() {
		
		EntityManager em=null;
		EntityTransaction tx=null;
		try {
			em=JpaUtil.getEntityManager();
			tx=em.getTransaction();
			tx.begin();
			
			User u = new User();
			u.setUserName("星辰大帝");
			u.setPassword("334433");
			em.persist(u);
			
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(em!=null) {
				em.close();
			}
		}
	}
	
	@org.junit.Test
	public void testDelete() {
		EntityManager em=null;
		try {
			em = JpaUtil.getEntityManager();
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			User u = em.find(User.class, 5);
			em.remove(u);
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			em.close();
		}
		
	}
}
