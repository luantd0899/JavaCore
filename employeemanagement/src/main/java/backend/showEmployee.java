/**
 * 
 */
package backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import entity.Department;
import jdbc.JdbcConnect;

/**
 * @author luant
 *
 */
public class showEmployee {
	
	public void showInfor() throws ClassNotFoundException, SQLException
	{
		JdbcConnect jdbcConnect = new JdbcConnect();
		Connection connection = jdbcConnect.connect();
		String sql = " SELECT		`Account`.AccountID, `Account`.FullName, `Account`.Email, `Account`.Username, `Account`.`Password`, `Position`.PositionName"
				+    " FROM		     `Position`"
				+    " JOIN		     `Account`"
				+    " ON			 `Position`.PositionID = `Account`.PositionID"
				+    " ORDER BY	     AccountID";
		
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		int count =0;
		while(resultSet.next())
		{
			System.out.println("==========ID: " + (++count) +"==========");
			System.out.println("AccountID: " + resultSet.getInt("AccountID"));
			System.out.println("FullName: " + resultSet.getString("FullName"));
			System.out.println("Email: "+ resultSet.getString("Email"));
			System.out.println("Username: " + resultSet.getString("Username"));
			System.out.println("Password: " + resultSet.getString("Password"));
			System.out.println("Position: " + resultSet.getNString("PositionName"));
			
		}
		
	}
}
