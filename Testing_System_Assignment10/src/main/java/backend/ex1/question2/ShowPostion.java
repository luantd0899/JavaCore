/**
 * 
 */
package backend.ex1.question2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import Utils.JDBCUtils;

/**
 * @author luant
 *
 */
public class ShowPostion {
	
	public void getInforPosition() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		String sql = "Select * from  `Position`";
		Statement statement = jdbcUtils.connect().createStatement();
		ResultSet resultset = statement.executeQuery(sql);
		
		
		while (resultset.next())
		{
			System.out.println(resultset.getInt("positionID"));
			System.out.println(resultset.getString("positionName"));
		}
		
	}
	
}
