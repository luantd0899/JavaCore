package com.vti.demofinalexamjavacore.backend.businesslayer;

import java.sql.SQLException;

import com.vti.demofinalexamjavacore.entity.Userr;

public interface IUserService {
void getAllUsers() throws SQLException, ClassNotFoundException;
	
	void getUserById(int id) throws SQLException, ClassNotFoundException;
	
	void deleteUserById(int id) throws ClassNotFoundException, SQLException;
	
	void createUser(Userr user);
}
