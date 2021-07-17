/**
 * 
 */
package com.vti.entity;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * @author luant
 *
 */
public class Demo {
	public static void main(String[] args) {
		Session session = null;
		try {
			// get Session
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			Group group = new Group();
			group.setGroupName("Team AAAA");
			group.setCreatorId(2);
			group.setDate(new Date());
			session.save(group);
			
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
		
		//Add entity
		configuration.addAnnotatedClass(Group.class);
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory();
		
	}
}
