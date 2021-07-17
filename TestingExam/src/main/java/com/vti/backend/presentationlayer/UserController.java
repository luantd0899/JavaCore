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

	
	// Khai báo kiểu Interface IUserService
	private IUserService iUserService;
	
	
	
	public UserController()
	{
		// trỏ đến class con UserService
		iUserService = new UserService();
	}
	
	public List<User> getListUser() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		return iUserService.getListUser();
	}
	
	public void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		iUserService.findUserById(id);
	}
	
	public void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		iUserService.deleteUserById(id);
	}
	
	public void addUser(String fullname, String email, String role, int expInYear) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		iUserService.addUser(fullname, email, role, expInYear);
	}
	
	public void addUser(String fullname, String email, String role, String proSkill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		iUserService.addUser(fullname, email, role, proSkill);
	}
	
	public void login(String role, String email, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		iUserService.login(role, email, password);
	}
	
	
	
}
