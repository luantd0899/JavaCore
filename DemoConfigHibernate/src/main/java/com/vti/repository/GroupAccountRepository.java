/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.GroupAccount;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class GroupAccountRepository {
	private HibernateUtils hibernateUtils;
	
	public GroupAccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<GroupAccount> getAllGroupAccounts(){
		Session session = null;
		try {
			// Get Session
			session = hibernateUtils.openSession();
			
			// Create HQL Query
			Query<GroupAccount> query = session.createQuery("FROM GroupAccount");
			return query.list();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
