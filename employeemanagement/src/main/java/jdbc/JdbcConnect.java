/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author luant
 *
 */
public class JdbcConnect {
	
	private Connection connection;
	
	public JdbcConnect()
	{
		
	}
	

	
	public Connection connect() throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/Employee?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect Success!");
		
		return connection;
	}
	
	public void disconnect() throws SQLException
	{
		connection.close();
	}
}
