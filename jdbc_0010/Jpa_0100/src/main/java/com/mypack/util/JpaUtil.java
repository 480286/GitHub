package com.mypack.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	public static EntityManagerFactory em=Persistence.createEntityManagerFactory("myutil");
	
	
	public static EntityManager getEntityManager() {
		return em.createEntityManager();
	}
}
