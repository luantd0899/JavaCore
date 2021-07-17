/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Employee;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class EmployeeRepository {
	private HibernateUtils hibernateUtils;

	public EmployeeRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<Employee> getAllEmployees() {
		Session session = null;

		try {
			// Get Session
			session = hibernateUtils.openSession();
			
			// create HQL Query
			Query<Employee> query = session.createQuery("FROM Employee");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
