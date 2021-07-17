/**
 * 
 */
package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

/**
 * @author luant
 *
 */
public class UserController {

	private IUserService iUserService;

	public UserController() {
		iUserService = new UserService();
	}

	public List<User> getListUsers() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		return iUserService.getListUser();
	}

	public int login(String email, String password, String role)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		 return iUserService.logIn(email, password, role);
	}

	public void addUSer(String role, String fullName, String email, int expInYear)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserService.addUser(role, fullName, email, expInYear);
	}

	public void addUser(String role, String fullName, String email, String proSkill)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserService.addUser(role, fullName, email, proSkill);
	}
	
	public void findUserById(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		iUserService.findUserById(id);
	}
	
	public void deleteUserById(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		iUserService.deleteUserById(id);
	}
	
	public void changePasswordById(int id, String newPassword)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserService.changePasswordById(id, newPassword);
		
	}

}
