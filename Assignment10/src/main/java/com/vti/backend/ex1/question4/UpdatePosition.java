/**
 * 
 */
package com.vti.backend.ex1.question4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class UpdatePosition {
	
	public void updatePositionn() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		System.out.println("Sua Position");
		System.out.println("Nhap Name: ");
		String name = ScannerUtils.inputString("Name khong duoc de trong, moi nhap lai!!!");
		
		JDBCUtils jdbcUtils = new JDBCUtils();
		String sql = "Update `Position` SET PositionName = ? Where positionID = 5";
		
		PreparedStatement preparedStatement = jdbcUtils.connect().prepareStatement(sql);
		preparedStatement.setString(1, name);
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		
		jdbcUtils.disconnect();
	
	}
	
}
