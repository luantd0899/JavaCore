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

import com.vti.entity.Department;

/**
 * @author luant
 *
 */
public class DepartmentRepository {

	private SessionFactory sessionFactory;

	public DepartmentRepository() {
		sessionFactory = buildSessionFactory();
	}

	private SessionFactory buildSessionFactory() {
		// Load Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// Add entiy
		configuration.addAnnotatedClass(Department.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);
	}

	public List<Department> getAllDepartments() {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();

			// Create HQL Query
			Query<Department> query = session.createQuery("FROM Department");

			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public Department getDepartmentById(int id) {
		Session session = null;
		try {
			// Get session
			session = sessionFactory.openSession();
			
			// Get department by id
			Department department = session.get(Department.class, id);
			
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	
	public Department getDepartmentByName(String name) {
		Session session = null;
		try {
			// Get session
			session = sessionFactory.openSession();
			
			// Create HQL query
			Query<Department> query = session.createQuery("FROM Department WHERE name = :name");
			
			// Set parameter
			query.setParameter("name", name);
			
			// Get result
			Department department = query.uniqueResult();
			
			return department;
			 
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void createDepartment(Department department) {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();
			
			// Get Department
			session.save(department);

			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void updateDepartment(int id, String newName) {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			// Get Department
			Department department = session.load(Department.class, id);
			
			// Update
			department.setName(newName);
			session.getTransaction().commit();

			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void updateDepartment2(Department department) {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			session.update(department);
			session.getTransaction().commit();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void deleteDepartment(int id) {
		Session session = null;
		try {
			// Get Session
			session = sessionFactory.openSession();
			session.beginTransaction();
			
			// Get Department
			Department department = session.load(Department.class, id);
			
			// Delete
			session.delete(department);
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
