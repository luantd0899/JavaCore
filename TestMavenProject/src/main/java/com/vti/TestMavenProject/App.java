package com.vti.TestMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
    {
    	Properties properties = new Properties();
    	properties.load(new FileInputStream("src/main/resource/database.properties"));
    	properties.load(new FileInputStream("src/main/resource/message.properties")) ;
    	
    	String url =properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");
		
		
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connection Success!");
		
		
		//Step 3: Create a statement object
		String sql = "Select * from Department";
		
		// Step 4: Excute Query
		Statement statement = connection.createStatement();
		
		
		ResultSet resultset = statement.executeQuery(sql);	
		
		
		// Step 5: Xu li ket qua
		while(resultset.next())
		{
			System.out.print(resultset.getInt("DepartmentID") + " ");
			System.out.println(resultset.getString("DepartmentName"));
		}
    }
}
