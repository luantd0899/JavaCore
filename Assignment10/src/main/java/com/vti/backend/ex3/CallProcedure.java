/**
 * 
 */
package com.vti.backend.ex3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.vti.backend.ex2.DepartmentDAO;
import com.vti.utils.JDBCUtils;

/**
 * @author luant
 *
 */
public class CallProcedure {
	
	
	public void deleteDepartmentByID(int id) throws Exception
	{
		DepartmentDAO departmentDAO = new DepartmentDAO();
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		if (!departmentDAO.checkIDDepartment(id)) {
			throw new Exception("Khong co Department can tim!!!");
		}
		else {
			
			String sql = "{Call deleteDepartment(?)}";
			
			CallableStatement callableStatement = connection.prepareCall(sql);
			callableStatement.setInt(1, id);
			
			int effectedRecordAmount = callableStatement.executeUpdate();
			System.out.println("Effected Record Amount: " + effectedRecordAmount);
			jdbcUtils.disconnect();
			
		}
		
		
	}
	
}
