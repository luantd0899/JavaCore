package com.vti.demofinalexamjavacore.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.vti.demofinalexamjavacore.entity.Userr;
import com.vti.demofinalexamjavacore.utils.JDBCUtils;

public class UserRepository implements IUserRepository{
	
	private JDBCUtils jdbcUtils;
	

	public UserRepository() {
		jdbcUtils = new JDBCUtils();
	}

	public void getAllUsers() throws SQLException, ClassNotFoundException {
		
		Connection connection = jdbcUtils.connect();
		
		Statement statement = connection.createStatement();
		
		String sql = "SELECT id, fullName, email FROM usertbl";
		
		ResultSet resultSet = statement.executeQuery(sql);
		int i = 0;
		while(resultSet.next()) {
			System.out.println("=======================Thông tin của User thứ: " + (++i) + "=======================");
			System.out.println("ID: " + resultSet.getInt("id"));
			System.out.println("FullName: " + resultSet.getString("fullName"));
			System.out.println("Email: " + resultSet.getString("email"));
			i = i++;
			System.out.println("======================================================================================");
		}
		
		jdbcUtils.disconnect();
		
	}

	public void getUserById(int id) throws SQLException, ClassNotFoundException  {
		Connection connection = jdbcUtils.connect();
		
		String sql = "SELECT id, fullName, email FROM usertbl WHERE id = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			System.out.println("=======================Thông tin của User có ID là " + id + "=======================");
			System.out.println("ID: " + resultSet.getInt("id"));
			System.out.println("FullName: " + resultSet.getString("fullName"));
			System.out.println("Email: " + resultSet.getString("email"));
		}else {
			System.out.println("Không có user nào phù hợp!!!");
		}
		
		jdbcUtils.disconnect();
		
	}

	public void deleteUserById(int id) throws SQLException, ClassNotFoundException  {
		Connection connection = jdbcUtils.connect();
		
		String sql = "DELETE FROM usertbl WHERE id = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		
		int affect_row = preparedStatement.executeUpdate();
		
		if (affect_row > 0 ) {
			System.out.println("Xóa thành công!!!");
		}else {
			System.out.println("Không có User nào phù hợp!!!");
		}
		
	}

	public void createUser(Userr user) {
		// TODO Auto-generated method stub
		
	}

}
