/**
 * 
 */
package backend.ex1.question3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Utils.JDBCUtils;
import Utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class InputPosition {
	
	public void inputPosition() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		Scanner scanner = new Scanner(System.in);
		JDBCUtils jdbcUtils = new JDBCUtils();
		
		String sql = "Insert into `Position`(positionID, positionName) values"
				+ 							"(?			, 	?		)";
		
		System.out.println("Nhap id: ");
		int id = ScannerUtils.inputInt("ban phai nhap so, moi nhap lai!!!!");
		
		System.out.println("Nhap positionName: ");
		String name = ScannerUtils.inputString("Ban phai nhap kieu String, moi nhap lai!!!");
		
		PreparedStatement preparedStatement = jdbcUtils.connect().prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("So ban ghi thay doi: " + effectedRecordAmount);
		
	}
	
	
	
}
