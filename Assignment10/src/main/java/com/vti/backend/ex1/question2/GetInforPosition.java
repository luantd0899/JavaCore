/**
 * 
 */
package com.vti.backend.ex1.question2;

import java.io.FileNotFoundException;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.utils.JDBCUtils;

/**
 * @author luant
 *
 */
public class GetInforPosition {
	
	public void getInforPosition() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "Select * from `Position`";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt("PositionID") + "- ");
			System.out.println(resultSet.getString("PositionName"));
		}
	}
	
}
