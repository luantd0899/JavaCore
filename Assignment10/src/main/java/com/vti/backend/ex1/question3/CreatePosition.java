/**
 * 
 */
package com.vti.backend.ex1.question3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class CreatePosition {

	public void newPosition() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		JDBCUtils jdbcUtils = new JDBCUtils();
		
		String sql = "Insert into `Position`(PositionID, PositionName) "
				    + 			  "  Values (?         ,		?	 ) ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id: " );
		int id = ScannerUtils.inputInt("Please input a number, please again!!!!");
		
		System.out.println("Nhap name: ");
		String name = ScannerUtils.inputString("Khong duoc de trong, moi nhap lai!!!");
		
		PreparedStatement pePreparedStatement = jdbcUtils.connect().prepareStatement(sql);
		
		pePreparedStatement.setInt(1, id);
		pePreparedStatement.setString(2, name);
		
		int effectedRecordAmount = pePreparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
		jdbcUtils.disconnect();
				
	}
}
