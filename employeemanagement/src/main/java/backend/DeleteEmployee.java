/**
 * 
 */
package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.JdbcConnect;

/**
 * @author luant
 *
 */
public class DeleteEmployee {
	public void deleteEmployee(int id) throws ClassNotFoundException, SQLException
	{
		JdbcConnect jdbcConnect = new JdbcConnect();
		Connection connection = jdbcConnect.connect();
		String sql = "DELETE FROM Account WHERE AccountID = " + id;
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int resultSet = preparedStatement.executeUpdate();
	}
}
