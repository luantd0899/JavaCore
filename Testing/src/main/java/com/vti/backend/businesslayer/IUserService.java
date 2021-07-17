/**
 * 
 */
package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

/**
 * @author luant
 *
 */
public interface IUserService {
	
	List<User> getListUsers() throws SQLException, ClassNotFoundException;

	User getUserById(int id) throws SQLException, ClassNotFoundException;

	int deleteUser(int id) throws ClassNotFoundException, SQLException;

	boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;

	User login(String email, String password) throws Exception;
}
