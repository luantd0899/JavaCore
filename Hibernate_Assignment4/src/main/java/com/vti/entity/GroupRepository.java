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
public class GroupRepository {
	
	private Session session;
	
	public GroupRepository() {
		session = buildSessionFactory().openSession();
	}
	
	private SessionFactory buildSessionFactory() {
		
		// Load Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		// Add entity
		configuration.addAnnotatedClass(Group.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	// Create Group
	public void createGroup() {
		
	}
	
}
