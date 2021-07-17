/**
 * 
 */
package com.vti.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author luant
 *
 */
public class TestHibernate {
	public static void main(String[] args) {
		
		Session session = null;
		
		try {
			// Get Session
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			Department department = new Department();
			department.setName("Hibernate");
			session.save(department);
			
			System.out.println("Create Success!");
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		
	}
	
	private static SessionFactory buildSessionFactory() {
		
		//Load Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		// Add entity
		configuration.addAnnotatedClass(Department.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
}
