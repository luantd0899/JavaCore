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
	private IUserService userService;
	
	public UserController()
	{
		userService = new UserService();
	}
	
	public void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		userService.findUserById(id);
	}
	public List<User>  getListManager() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		return userService.getListManager();
	}
	public int login(String email, String password, String role) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		return userService.login(email, password, role);
	}
	public void changePasswordById(int id, String newPassword) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		userService.changePasswordById(id, newPassword);
	}
	public List<User> showUserByIdProject(int idProject) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		return userService.showUserByIdProject(idProject);
	}
}
