package com.vti.demofinalexamjavacore.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
	private Connection connection;
	
	public Connection connect() throws SQLException, ClassNotFoundException
	{
		if (connection == null || connection.isClosed()) {
			String url = "jdbc:mysql://localhost:3306/usermanagement";
			String username = "root";
			String password = "root";
		
		
		// Step 1: Resigter driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2: Get a database connnection
		connection = DriverManager.getConnection(url, username, password);
		}
		return connection;
	}
	
	public void disconnect() throws SQLException
	{
		connection.close();
	}
	
}
