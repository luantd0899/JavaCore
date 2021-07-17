package com.vti.backend;

import java.sql.*;

public class Excercise1 {
	Connection connection;
	
	public void Question1() throws Exception
	{
		try {
			String url = "jdbc:mysql://localhost:3306/Testing_System_Assignment1?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connect Success!!");
		} catch (Exception e) {
			System.out.println("Connect Fail!!: " + e);
		}
		
		
	}
	
	public void Question2_showPosition() throws Exception
	{
		Question1();
		String sql = "Select * from Position";
		
		Statement stm = connection.createStatement();
		
		ResultSet rSet  =  stm.executeQuery(sql);
		
		int i = 0 ;
		while(rSet.next())
		{
			System.out.println("==========Position number: " + (++i) + "==========");
			System.out.println("PositionID: " + rSet.getInt(1));
			System.out.println("PositionName: " + rSet.getNString(2));
		}
	}
}
