/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Salary;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class SalaryRepository {
	private HibernateUtils hibernateUtils;
	
	public SalaryRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<Salary> getAllSalaries(){
		
		Session session = null;
		
		try {
			// Get Session
			session = hibernateUtils.openSession();
			
			// Create HQL Query
			Query<Salary> query = session.createQuery("FROM Salary");
			return query.list();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
