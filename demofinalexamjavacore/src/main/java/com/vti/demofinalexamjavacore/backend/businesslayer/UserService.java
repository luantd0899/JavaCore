package com.vti.demofinalexamjavacore.backend.businesslayer;

import java.sql.SQLException;

import com.vti.demofinalexamjavacore.backend.datalayer.IUserRepository;
import com.vti.demofinalexamjavacore.backend.datalayer.UserRepository;
import com.vti.demofinalexamjavacore.entity.Userr;

public class UserService implements IUserService{
	
	private IUserRepository userRepository;
	
	

	public UserService() {
		userRepository = new UserRepository();
	}

	public void getAllUsers() throws SQLException, ClassNotFoundException {
		userRepository.getAllUsers();
		
	}

	public void getUserById(int id) throws SQLException, ClassNotFoundException {
		userRepository.getUserById(id);
		
	}

	public void deleteUserById(int id) throws ClassNotFoundException, SQLException {
		userRepository.deleteUserById(id);
		
	}

	public void createUser(Userr user) {
		// TODO Auto-generated method stub
		
	}
	
}
