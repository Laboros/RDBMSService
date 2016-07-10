package com.vodafone.rdbms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.vodafone.rdbms.pojo.Employee;
import com.vodafone.rdbms.util.HibernateUtil;

public class HibernateDAO {
	
	public static Employee save(Employee employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Long id = (Long) session.save(employee);
		employee.setId(id);
			
		session.getTransaction().commit();
			
		session.close();

		return employee;
	}
	
}
