/**
 * 
 */
package com.vti.backend.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.ex2.Department;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class DepartmentDAO {

	private JDBCUtils jdbcUtils;

	public DepartmentDAO() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Department> getListDepartment() throws ClassNotFoundException, SQLException {
		List<Department> departments = new ArrayList<Department>();

		Connection connection = jdbcUtils.connect();
		String sql = "SELECT * FROM Department";

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			Department department = new Department();
			department.setDepartmentId(resultSet.getInt("DepartmentID"));
			department.setDepartmentName(resultSet.getString("DepartmentName"));

			departments.add(department);
		}

		jdbcUtils.disconnect();

		return departments;
	}
	
	// Question2-3
	public List<Department> getDepartmentsByID() throws ClassNotFoundException, SQLException
	{
		List<Department> departments = new ArrayList<Department>();

		Connection connection = jdbcUtils.connect();
		System.out.println("Nhap id cua department: ");
		int id = ScannerUtils.inputInt("ban phai nhap so, moi nhap lai!!!");
		
		String sql = "SELECT * FROM Department WHERE DepartmentID = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next())
		{
			Department department = new Department();
			department.setDepartmentId(resultSet.getInt("DepartmentID"));
			department.setDepartmentName(resultSet.getString("DepartmentName"));

			departments.add(department);
			
			
		}
		
		if (departments.size() == 0) {
			System.out.println("Khong tim thay Department!!!");
		}
		
		jdbcUtils.disconnect();
		
		return departments;
	}
	
	public boolean checkNameDepartment(String name) throws ClassNotFoundException, SQLException
	{
		Connection connection = jdbcUtils.connect();
		String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			
			jdbcUtils.disconnect();
			return true;
		}
		else {
			jdbcUtils.disconnect();
			return false;
		}
		
	}
	
	public void createDepartment(String name) throws Exception
	{
		if (checkNameDepartment(name)) {
			throw new Exception("Name is exsist!!!");
		}
		
		Connection connection = jdbcUtils.connect();
		String sql = "INSERT INTO Department(DepartmentName) VALUE(?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
		
		jdbcUtils.disconnect();
	}
	
	public boolean checkIDDepartment(int id) throws ClassNotFoundException, SQLException
	{
		Connection connection = jdbcUtils.connect();
		String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			
			jdbcUtils.disconnect();
			return true;
		}
		else {
			jdbcUtils.disconnect();
			return false;
		}
		
	}
	
	public void updateDepartmentName(int id, String newName) throws Exception
	{
		if (!checkIDDepartment(id)) {
			throw new Exception("Cannot find department which has id = " + id);
		}
		else {
			if (checkNameDepartment(newName)) {
				throw new Exception("Department Name is Exists!");
			}
			else {
				
				String sql = "UPDATE Department SET DepartmentName = ? WHERE DepartmentID = ?";
				
				PreparedStatement preparedStatement = jdbcUtils.connect().prepareStatement(sql);
				preparedStatement.setString(1, newName);
				preparedStatement.setInt(2, id);
				
				int effectRecordAmount = preparedStatement.executeUpdate();
				System.out.println("Effect Record Amount: " + effectRecordAmount);
				jdbcUtils.disconnect();
				
			}
		}
	}
	
	public void deleteDepartmentByID(int id) throws Exception
	{
		if (!checkIDDepartment(id)) {
			throw new Exception("Cannot find department which has id = " + id);
		}
		else {
			String sql = "DELETE FROM Department WHERE departmentID = ?";
			PreparedStatement preparedStatement = jdbcUtils.connect().prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			int effectRecordAmount = preparedStatement.executeUpdate();
			System.out.println("Effect Record Amount: " + effectRecordAmount);
			jdbcUtils.disconnect();
			
			
		}
	}
	
	

}
