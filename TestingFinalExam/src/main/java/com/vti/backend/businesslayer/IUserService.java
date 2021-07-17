/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserReponsitory;
import com.vti.entity.User;

/**
 * @author luant
 *
 */
public interface IUserService {
	
	List<User> getListUser() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException;
	void findUserById(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	int logIn(String email, String password, String role) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	void logOut();
	void addUser(String role, String fullName, String email, int expInYear) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	void addUser(String role, String fullName, String email, String proSkill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	void changePasswordById(int id, String newPassword) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
	
}
