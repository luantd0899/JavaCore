/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Account;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class AccountRepository {
	private HibernateUtils hibernateUtils;
	
	public AccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<Account> getAllAccounts(){
		Session session = null;
		
		try {
			// Get Session
			session = hibernateUtils.openSession();
			
			// create HQL Query
			Query<Account> query = session.createQuery("FROM Account");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
