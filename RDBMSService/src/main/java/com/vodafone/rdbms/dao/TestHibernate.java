package com.vodafone.rdbms.dao;

import java.sql.Date;

import com.vodafone.rdbms.pojo.Employee;

public class TestHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Hiber
		
		System.out.println("******* WRITE *******");
		Employee empl = new Employee("Jack", "Bauer", new Date(System.currentTimeMillis()), "911");
		HibernateDAO.save(empl);
	}

}
