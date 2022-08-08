package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main_Create {

	public static void main(String[] args) {
		Customer cust = new Customer();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		cust.setName("Abhishek");
		cust.setCity("Mumbai");
		cust.setAccountType("Saving");
		System.out.println("Conneceted");

		session.save(cust);
		tx.commit();
		session.close();
	}

}
