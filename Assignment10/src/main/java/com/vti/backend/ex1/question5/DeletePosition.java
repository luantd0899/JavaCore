/**
 * 
 */
package com.vti.backend.ex1.question5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class DeletePosition {
	
	public void deletePosition() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		Connection connection = jdbcUtils.connect();
		System.out.println("Nhap id can xoa: ");
		int id = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!!!");
		String sql = "Delete from `Position` where positionID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, id);
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		
		jdbcUtils.disconnect();
	}
	
}
