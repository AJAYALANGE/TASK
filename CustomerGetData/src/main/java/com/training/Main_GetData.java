package com.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class Main_GetData {

	public static void main(String[] args) {
		Customer cust = new Customer();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Customer c = session.load(Customer.class,2);
	    System.out.println("ID :"+c.getId()+" Name:"+c.getName()+" City:"+c.getCity()+" Account Type:"+c.getAccountType());
		System.out.println("Conneceted");

		session.save(cust);
		tx.commit();
		session.close();
	}

}
