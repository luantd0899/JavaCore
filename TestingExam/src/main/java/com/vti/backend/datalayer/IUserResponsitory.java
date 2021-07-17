/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

/**
 * @author luant
 *
 */
public interface IUserResponsitory {
	
	
	List<User> getListUser() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	void addUser(String fullname, String email, String role, int expInYear) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	void addUser(String fullname, String email, String role, String proSkill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	void login(String role, String email, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
}
