package com.vti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author TrungLD
 *
 *         CRUD Steps <br>
 *         Step 1: Setup library <br>
 *         Step 2: Get a connection to database <br>
 *         Step 3: Create a statement object <br>
 *         Step 4: Execute SQL query <br>
 *         Step 5: Handling Result Set <br>
 *         Step 6: Close connection <br>
 *
 */
public class Jdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		read();

		//execute();
	}

	public static void read() throws ClassNotFoundException, SQLException {

		// Step 1: Setup library
		// TODO

		// Step 2: Get a connection to database
		String url = "jdbc:mysql://localhost:3306/Testing_System_Assignment1?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Step 3: Create a statement object
		Statement statement = connection.createStatement();

		// Step 4: Execute SQL query
		String sql = "SELECT * " + "FROM Department";
		ResultSet resultSet = statement.executeQuery(sql);

		// Step 5: Handling Result Set
		while (resultSet.next()) {
			System.out.println("DepartmentID: " + resultSet.getInt("DepartmentID"));
			System.out.println("departmentName: " + resultSet.getString("departmentName"));
		}

		// Step 6: Close connection
		connection.close();
	}

	public static void execute() throws ClassNotFoundException, SQLException {

		// Step 1: Setup library
		// TODO

		// Step 2: Get a connection to database
		String url = "jdbc:mysql://localhost:3306/Testing_System_Assignment1?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";

		// Register the driver class with DriverManager
		Class.forName("com.mysql.cj.jdbc.Driver"); // đăng kí đại chỉ mới

		// Get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		// Step 3: Create a statement object, optional
		Statement statement = connection.createStatement();

		// Step 4: Execute SQL query
		String sql = "INSERT INTO Department (DepartmentName) " + "VALUES (?) ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// Input data + set parameter
		String departmentName = "vti-rocket10";
		preparedStatement.setString(1, departmentName);

		int result = preparedStatement.executeUpdate();

		// Step 5: Handling Result Set
		System.out.println("Result execute: " + result);

		// Step 6: Close connection
		connection.close();
	}

}
