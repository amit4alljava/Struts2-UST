package com.srivastava.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDAO {

	public boolean addUser(User userObject){
		boolean isAdded = false;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(userObject);
		transaction.commit();
		session.close();
		sessionFactory.close();
		isAdded = true;
		return isAdded;
	}
}
