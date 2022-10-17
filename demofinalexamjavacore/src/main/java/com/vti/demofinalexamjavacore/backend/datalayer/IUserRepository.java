package com.vti.demofinalexamjavacore.backend.datalayer;

import java.sql.SQLException;

import com.vti.demofinalexamjavacore.entity.Userr;

public interface IUserRepository {
	
	void getAllUsers() throws SQLException, ClassNotFoundException;
	
	void getUserById(int id) throws SQLException, ClassNotFoundException;
	
	void deleteUserById(int id) throws ClassNotFoundException, SQLException;
	
	void createUser(Userr user);
}
