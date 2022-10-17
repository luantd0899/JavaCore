package com.vti.demofinalexamjavacore.backend.presentationlayer;

import java.sql.SQLException;

import com.vti.demofinalexamjavacore.backend.businesslayer.IUserService;
import com.vti.demofinalexamjavacore.backend.businesslayer.UserService;

public class UserController {
	
	private IUserService userService;

	public UserController() {
		userService = new UserService();
	}
	
	public void getAllUser() throws ClassNotFoundException, SQLException {
		userService.getAllUsers();
	}
	
	public void getUserById(int id) throws ClassNotFoundException, SQLException {
		userService.getUserById(id);
	}
	
	public void deleteUserById(int id) throws ClassNotFoundException, SQLException {
		userService.deleteUserById(id);
	}
	
	
}
