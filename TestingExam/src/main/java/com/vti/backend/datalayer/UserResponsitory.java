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

import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

/**
 * @author luant
 *
 */
public class UserResponsitory implements IUserResponsitory{
	
	
	private List<User> users;
	
	public UserResponsitory()
	{
		users = new ArrayList<User>();
	}
	
	
	// hien thi User
	public List<User> getListUser() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		String sql = "Select * from `user` ";
		// Khong co tham so(?) thi se dung Statement
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next())
		{
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setFullname(resultSet.getString("fullName"));
			user.setEmail(resultSet.getString("email"));
			
			users.add(user);
			
		}
		
		jdbcUtils.disconnect();
		return users;
	}
	
	// tim kiem
	public void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
	{
		
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		String sql = "Select * from `user` WHERE id = ?";
		
		
		// co tham so(?) thi se dung PrepareStatement
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		// nếu câu sQL Không tác động đến database(Select) thì dùng executeQuery
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			System.out.println("Tim thay User");
			System.out.println("ID: " + resultSet.getInt("id"));
			System.out.println("FullName: " + resultSet.getString("fullName"));
			System.out.println("Email: " + resultSet.getString("email"));
		}
		else {
			System.out.println("Khong tim thay user co id la: " + id);
		}
		
		jdbcUtils.disconnect();
	}
	
	// xoa
	public void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		if (checkIDUser(id) == false) {
			System.out.println("Khong ton tai user");
		}
		else {
			JDBCUtils jdbcUtils = new JDBCUtils();
			Connection connection = jdbcUtils.connect();
			String sql = "DELETE from `user` WHERE id = ?";
			
			
			// co tham so(?) thi se dung PrepareStatement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			// nếu câu sQL có tác động đến database(Thêm sửa xóa) thì dùng executeUpdate
			int effectedRecordAmount = preparedStatement.executeUpdate();
			
			System.out.println("Effected Record Amount: " + effectedRecordAmount);
			jdbcUtils.disconnect();
			
		}
	}
	
	
	// check user co ton tai hay khong ?
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
	
	// Tao User - Admin
	public void addUser(String fullname, String email, String role, int expInYear) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		String sql = "INSERT	INTO		`user`	(	fullName			,	 email				,	`password`		,	`role`			,	expInYear		,	proSkill	) \r\n" + 
						"VALUE						(		?				, 		?				, 	'123456A'		, 		?			, 		?			,		null	)	";
		
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		
		preparedStatement.setString(1, fullname);		// 1
		preparedStatement.setString(2, email);			// 1
		preparedStatement.setString(3, role);			// 1
		preparedStatement.setInt(4, expInYear);			// 1
		
		
		int effectedRecordAmount = preparedStatement.executeUpdate();	//2
		
		// 2  phai chay sau 1
		
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		jdbcUtils.disconnect();
		
	}
	
	
	// Tao User - Employee (Su dung Overloading)
	public void addUser(String fullname, String email, String role, String proSkill) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException 
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		String sql = "INSERT	INTO		`user`	(	fullName			,	 email				,	`password`		,	`role`			,	expInYear		,	proSkill	) \r\n" + 
						"VALUE						(		?				, 		?				, 	'123456A'		, 		?			, 		null		,		?		)	";
		
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		// Gán vị trí vào các dâu hỏi chấm
		preparedStatement.setString(1, fullname);
		preparedStatement.setString(2, email);
		preparedStatement.setString(3, role);
		preparedStatement.setString(4, proSkill);
		
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		jdbcUtils.disconnect();
		
	}
	
	// Dang nhap
	public void login(String role, String email, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		
		
		// email, password, role phai giong voi tham so truyen vao ben tren;
		String sql = "SELECT * FROM `user` WHERE email = ? AND `password` = ? AND `role` = ? ";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, role);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			System.out.println("Xin chao: " + resultSet.getString("fullName"));
			
		}
		else {
			System.out.println("Sai ten tai khoan hoac mat khau!!!");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
