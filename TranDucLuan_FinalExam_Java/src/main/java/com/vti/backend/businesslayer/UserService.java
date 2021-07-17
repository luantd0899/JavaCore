/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserResponsitory;
import com.vti.backend.datalayer.UserResponsitory;
import com.vti.entity.User;

/**
 * @author luant
 *
 */
public class UserService implements IUserService {

	private IUserResponsitory userResponsitory;
	
	public UserService()
	{
		userResponsitory = new UserResponsitory();
	}
	
	public void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userResponsitory.findUserById(id);
		
	}

	public List<User> getListManager() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return userResponsitory.getListManager();
	}

	public int login(String email, String password, String role)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return userResponsitory.login(email, password, role);
		
	}

	public void changePasswordById(int id, String newPassword)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userResponsitory.changePasswordById(id, newPassword);
		
	}

	public List<User> showUserByIdProject(int idProject) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
			 {
		return userResponsitory.showUserByIdProject(idProject);
	}
	

}
