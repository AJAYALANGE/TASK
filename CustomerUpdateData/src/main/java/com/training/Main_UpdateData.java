package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






public class Main_UpdateData {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		 Customer c = (Customer)session.get(Customer.class, 2);
		 c.setName("Abhishek");
		 c.setCity("HYD");
		 c.setAccountType("Saving");
		 
		System.out.println("Data Updated");

		session.save(c);
		tx.commit();
		session.close();
	}

}
