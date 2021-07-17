/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

/**
 * @author luant
 *
 */
public class UserResponsitory implements IUserResponsitory{
	
	public boolean checkIDUser(int id) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "SELECT * FROM `user` WHERE id = ?";
		
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
	
	public void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		if (!checkIDUser(id)) {
			System.out.println("Không tìm thấy User có id là: " + id);
		}
		else {
			JDBCUtils jdbcUtils = new JDBCUtils();
			Connection connection = jdbcUtils.connect();
			
			String sql = "SELECT  a.id, a.fullName, a.email, a.`role`\r\n" + 
						 "FROM	`user` AS a\r\n" + 
						 "LEFT JOIN	project AS b\r\n" + 
						 "ON a.projectId = b.projectId WHERE id = ?";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("FullName: " + resultSet.getString("fullName"));
				System.out.println("Role: " + resultSet.getString("role"));
			}
			jdbcUtils.disconnect();
		}
		
	}
	
	public List<User>  getListManager() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		List<User> users = new ArrayList<User>();
		
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		String sql = "SELECT  a.id, a.fullName, a.email, a.`role`\r\n" + 
					 "FROM	`user` AS a\r\n" + 
					 "LEFT JOIN	project AS b\r\n" + 
					 "ON a.projectId = b.projectId WHERE a.`role` = 'MANAGER'";
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setFullName(resultSet.getString("fullName"));
			user.setEmail(resultSet.getString("email"));
			user.setRole(resultSet.getString("role"));
			users.add(user);
		}
		return users;
	}
	
	public int login(String email, String password, String role) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "SELECT * FROM `user` WHERE email = ? AND `password` = ? AND `role` = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, role);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			System.out.println("Xin chào: " + resultSet.getString("fullName"));
			if (resultSet.getString("role").equalsIgnoreCase("MANAGER")) {
				menuManager();
				return 1;
			}
			else {
				menuEmployee();
				return 2;
			}
		}
		else {
			System.out.println("Sai tên tài khoản hoặc mật khẩu!");
			return 0;
		}
	}
	
	private void menuManager()
	{
		System.out.println("1. Tìm kiếm User theo ID");
		System.out.println("2. Hiển thị Manager");
		System.out.println("3. Đăng xuất");
		System.out.println("4. Đổi mật khẩu");
		System.out.println("5. Hiển thị User theo ID Project");
		System.out.println("0. Thoát chương trình!");
	}
	private void menuEmployee()
	{
		System.out.println("Program is being completed!");
	}
	
	public void changePasswordById(int id, String newPassword) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		if (checkIDUser(id)) {
			JDBCUtils jdbcUtils = new JDBCUtils();
			Connection connection = jdbcUtils.connect();
			String sql = "UPDATE `user` SET `password` = ? WHERE id = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, newPassword);
			preparedStatement.setInt(2, id);
			
			preparedStatement.execute();
			System.out.println("Thay đổi mật khẩu thành công!!!");
			
			jdbcUtils.disconnect();
		}
		else {
			System.out.println("Không tồn tại User có id là: " +id);
		}
	}
	
	public List<User> showUserByIdProject(int idProject) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		List<User> users = new ArrayList<User>();
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		String sql = "SELECT  a.id, a.fullName, a.email, a.`role`\r\n" + 
					 "FROM	`user` AS a\r\n" + 
					 "LEFT JOIN	project AS b\r\n" + 
					 "ON a.projectId = b.projectId WHERE b.projectId = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, idProject);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setFullName(resultSet.getString("fullName"));
			user.setEmail(resultSet.getString("email"));
			user.setRole(resultSet.getString("role"));
			users.add(user);
		}
		return users;
	}
	
}
