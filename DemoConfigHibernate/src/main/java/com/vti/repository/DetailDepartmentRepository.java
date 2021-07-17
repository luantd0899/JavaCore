/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.DetailDepartment;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class DetailDepartmentRepository {
	private HibernateUtils hibernateUtils;
	
	public DetailDepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<DetailDepartment> getAllDepartments(){
		Session session = null;
		
		try {
			
			// get Session
			session = hibernateUtils.openSession();
			
			// create HQL Query
			Query<DetailDepartment> query = session.createQuery("FROM DetailDepartment");
			return query.list();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
