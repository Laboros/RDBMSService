package com.vodafone.rdbms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vodafone.rdbms.util.HibernateUtil;

public class HibernateDAO<T> {
	
	public static <T> T save(T entity) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(entity);
			
		session.getTransaction().commit();
			
		session.close();

		return entity;
	}
	
}
