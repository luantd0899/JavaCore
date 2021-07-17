/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.User;

/**
 * @author luant
 *
 */
public interface IUserService {
	void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	List<User>  getListManager() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	int login(String email, String password, String role) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	void changePasswordById(int id, String newPassword) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	List<User> showUserByIdProject(int idProject) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	
}
