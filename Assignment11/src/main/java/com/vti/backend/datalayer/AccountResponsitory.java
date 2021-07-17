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

import com.vti.entity.Account;
import com.vti.utils.JDBCUtils;

/**
 * @author luant
 *
 */
public class AccountResponsitory implements IAccountResponsitory{
	
	
	private List<Account> accounts;
	private Connection connection;
	
	public AccountResponsitory()
	{
		accounts = new ArrayList<Account>();
	}
	

	public void login(String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		connection = jdbcUtils.connect();
		
		String sql = "SELECT * FROM `Account` WHERE username = ? AND  `Password` = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			System.out.println("Xin chao: " + username);
		}
		else {
			System.out.println("Sai ten tai khoan hoac mat khau");
		}
		jdbcUtils.disconnect();
	}

	public List<Account> getListAccount() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		connection = jdbcUtils.connect();
		
		String sql = "SELECT * FROM `Account`";
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next())
		{
			Account account = new Account();
			account.setAccouintId(resultSet.getInt("AccountID"));
			account.setEmail(resultSet.getString("Email"));
			account.setUsername(resultSet.getString("Username"));
			account.setFullName(resultSet.getString("FullName"));
			account.setDepartmentId(resultSet.getInt("DepartmentId"));
			account.setPositionId(resultSet.getInt("PositionId"));
			account.setCreateDate(resultSet.getDate("CreateDate"));
			
			accounts.add(account);
		}
		
		jdbcUtils.disconnect();
		return accounts;
		
	}

	
}
