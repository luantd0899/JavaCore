/**
 * 
 */
package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author luant
 *
 */
public class JDBCUtils {
	private Properties properties;
	private Connection connection;
	
	public JDBCUtils() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException
	{
		properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));
		properties.load(new FileInputStream("src/main/resource/message.properties"));
		connect();
	}
	
	public Connection connect() throws SQLException, ClassNotFoundException
	{
		if (connection != null && !connection.isClosed()) {
			return connection;
		}
		
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");
		
		// Step 1: Resigter driver class with DriverManager
		Class.forName(driver);
		
		// Step 2: Get a database connnection
		connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}
	
	public void disconnect() throws SQLException
	{
		connection.close();
	}
}
