/**
 * 
 */
package com.vti.repository;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Group;
import com.vti.entity.User;

/**
 * @author luant
 *
 */
public class UserRepopsitory {
	private SessionFactory sessionFactory;
	
	public UserRepopsitory() {
		sessionFactory = buildSessionFactory();
	}
	
	private SessionFactory buildSessionFactory() {
		
		// Load Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		// Add entity
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Group.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
	

	public List<User> getAllUsers(){
		Session session = null;
		try {
			//Get Session
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			// HQL
			@SuppressWarnings("deprecation")
			Query<User> query = session.createQuery("FROM User");
			session.getTransaction().commit();
			
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void addUser(User user) {
		Session session = null;
		try {
			//Get Session
			session = sessionFactory.openSession();
			
			// HQL
			session.save(user);
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void updateUser(User user) {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			session.update(user);
			session.getTransaction().commit();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void deleteUSer(short id) {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			// Get Department
			User user = session.load(User.class, id);
			
			// Delete
			session.delete(user);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public User getUserById(short id) {
		Session session = null;
		try {
			// Get session
			session = sessionFactory.openSession();
			
			// Get department by id
			User user = session.get(User.class, id);
			
			return user;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
