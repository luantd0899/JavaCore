/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.vti.entity.Address;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class AddressRepository {
	
	private HibernateUtils hibernateUtils;
	
	public AddressRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<Address> getAllAddress(){
		Session session = null;
		
		try {
			
			// get Session
			session = hibernateUtils.openSession();
			
			// create HQL Query
			Query<Address> query = session.createQuery("FROM Address");
			return query.list();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
