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

import com.vti.entity.Admin;
import com.vti.entity.Employee;
import com.vti.entity.User;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class UserReponsitory implements IUserReponsitory{
	
	private List<User> users;
	
	public UserReponsitory()
	{
		users = new ArrayList<User>();
	}

	public List<User> getListUser() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "Select * from `user`";
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setEmail(resultSet.getString("email"));
			user.setFullName(resultSet.getString("fullName"));
			user.setPassword(resultSet.getString("password"));
			user.setRole(resultSet.getString("role"));
			
			
			users.add(user);
			
		}
		
		jdbcUtils.disconnect();
		
		return users;
	}

	public void findUserById(int id) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "Select * from `user` WHERE id = ? ";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			System.out.println("ID: " + resultSet.getInt("id"));
			System.out.println("FullName: " + resultSet.getString("fullName"));
		}
		else {
			System.out.println("Khong co User can tim!!!");
		}
		
		
	}

	public void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		if (!checkIDUser(id)) {
			System.out.println("Khong ton tai User co id = " + id);
		}
		else {
			JDBCUtils jdbcUtils = new JDBCUtils();
			Connection connection = jdbcUtils.connect();
			String sql = "DELETE FROM `user` WHERE id = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int effectedRecodAmount = preparedStatement.executeUpdate();
			System.out.println("Xoa thanh cong!!!");
			System.out.println("Effected Record Amount: " + effectedRecodAmount);
			
		}
		
	}

	public int logIn(String email, String password, String role) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "Select * from `user` WHERE email = ? AND `password` = ? AND `role` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, role);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			
			System.out.println("Xin chao: " + resultSet.getString("fullName"));
			if (role.equalsIgnoreCase("Admin")) {
				menuAdmin();
				return 1;
			}
			else {
				menuEmployee();
				return 2;
				
			}
			
		}
		else {
			System.out.println("Sai ten tai khoan hoac mat khau");
			return 0;
		}
		
		
	}
	private void menuAdmin() {
		System.out.println("1. Hiển thị User");
		System.out.println("2. Tìm kiếm User theo ID");
		System.out.println("3. Xóa User theo ID");
		System.out.println("4. Đăng xuất");
		System.out.println("5. Thêm User mới");
		System.out.println("6. Đổi mật khẩu");
		System.out.println("0. Thoát chương trình");
	}
	
	private void menuEmployee()
	{
		System.out.println("Program is being completed!!!");
		
	}

	public void logOut() {
		// TODO Auto-generated method stub
		
	}

	public void addUser(String role, String fullName, String email, int expInYear) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		
		String sql = "INSERT	INTO		`user`	(	fullName			,	 email				,	`password`		,	`role`			,	expInYear		, proSkill	)\r\n" + 
						"VALUE						(		?				, 		?				,	'123456'		,		?			, 		?			,	null	)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, fullName);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, role);
		preparedStatement.setInt(4, expInYear);
		
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		jdbcUtils.disconnect();
		
		showUserAdded(email);
	

	}
	public void addUser(String role, String fullName, String email, String proSkill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		
		String sql = "INSERT	INTO		`user`	(	fullName			,	 email				,	`password`		,	`role`			,	expInYear		, proSkill	)\r\n" + 
						"VALUE						(		?				, 		?				,	'123456A'		,		?			, 		null		,	?		)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, fullName);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, role);
		preparedStatement.setString(4, proSkill);
		
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		jdbcUtils.disconnect();
		
		showUserAdded(email);
	}
	
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

	public List<User> showUserAdded(String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "Select * from `user` WHERE email = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next())
		{
			User user = new User();
			int id = resultSet.getInt("id");
			user.setEmail(resultSet.getString("email"));
			user.setFullName(resultSet.getString("fullName"));
			user.setPassword(resultSet.getString("password"));
			
			users.add(user);
			
		}
		
		jdbcUtils.disconnect();
		
		return users;
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
			System.out.println("Thay doi mat khau thanh cong!!!");
			
			jdbcUtils.disconnect();
		}
		else {
			System.out.println("Khong ton tai User co id = " +id);
		}
	}
	
	

	
	
}
