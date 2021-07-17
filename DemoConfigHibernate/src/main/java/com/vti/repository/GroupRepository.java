/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Group;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class GroupRepository {
	private HibernateUtils hibernateUtils;
	
	public GroupRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<Group> getAllGroups(){
		
		Session session = null;
		
		try {
			//Get Session
			session = hibernateUtils.openSession();
			
			//Create HQL Query
			Query<Group> query = session.createQuery("FROM Group");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
