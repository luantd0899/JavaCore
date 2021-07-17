package com.vti.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.*;

import com.vti.entity.Department;

public class DepartmentDao {

	
	public List<Department> getDepartment() throws IOException, SQLException, ClassNotFoundException
	{
		List<Department> departments = new ArrayList<Department>();
		JdbcUtils jdbcUtils = new JdbcUtils();
		String sql = "Select * from Department";
		Connection connection = jdbcUtils.connect();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next())
		{
			System.out.println("DepartmentID: " + resultSet.getInt("DepartrmentID"));
			System.out.println("DepartmentName: " + resultSet.getNString("DepartmentName"));
			Department department = new Department();
			departments.add(department);
		}
		
		return departments;
		
	}
}
