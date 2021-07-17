/**
 * 
 */
package com.vti.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.vti.entity.Position;
import com.vti.utils.HibernateUtils;

/**
 * @author luant
 *
 */
public class PositionRepository {
	private HibernateUtils hibernateUtils;
	
	public PositionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}
	
	public List<Position> getAllPosition(){
		Session session = null;
		
		try {
			
			// get Session
			session = hibernateUtils.openSession();
			
			// create HQL Query
			Query<Position> query = session.createQuery("FROM Position");
			return query.list();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
