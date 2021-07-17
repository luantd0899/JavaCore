/**
 * 
 */
package backend.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import Utils.JDBCUtils;
import entity.ex2.Department;

/**
 * @author luant
 *
 */
public class DepartmentDao {
	
	private JDBCUtils jdbcUtils;
	
	
	
	public DepartmentDao() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		jdbcUtils = new JDBCUtils();
	}
	
	public List<Department> departments () throws ClassNotFoundException, SQLException
	{
		List<Department> departmentList = new ArrayList<Department>();
		
		String sql = "Select * from department";
		
		Statement statement = jdbcUtils.connect().createStatement();
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next())
		{
			Department department = new Department();
			department.setDepartmentId(resultSet.getInt("DepartmentID"));
			department.setDepartmentName(resultSet.getString("DepartmentName"));
			
			departmentList.add(department);
		}
		
		jdbcUtils.disconnect();
		
		return departmentList;
	}
	
}
