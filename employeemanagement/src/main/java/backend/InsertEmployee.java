/**
 * 
 */
package backend;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

import jdbc.JdbcConnect;

/**
 * @author luant
 *
 */
public class InsertEmployee {
	
	private int accountID;
	private String accountName;
	private String username;
	private String password;
	private String email;
	public void choosePosition() throws ClassNotFoundException, SQLException
	{
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Nhập vị trí cần thêm nhân viên: ");
		System.out.println("1- Giám đốc");
		System.out.println("2- Designer");
		System.out.println("3- Sale");
		System.out.println("4- Kế toán");
		System.out.println("5- Nhân viên");
		System.out.println("Mời bạn chọn: ");
		n =scanner.nextInt();
		
		switch (n) {
		case 1:
				data();
				String sql1 = "Insert into Account (AccountID, Email, Username, Password, FullName, DepartmentID, PositionID)"
						+ " values (" + accountID +", " + email + ", " + username + ", " + password + ", " + accountName + ", 5, 2)";
				insertEmployee(sql1);
			break;
		case 2:
			data();
			String sql2 = "Insert into Account (AccountID, Email, Username, Password, FullName, DepartmentID, PositionID)"
					+ " values (" + accountID +", " + email + ", " + username + ", " + password + ", " + accountName + ", 3, 4 )";
			insertEmployee(sql2);
			break;
		case 3: 
			data();
			String sql3 = "Insert into Account (AccountID, Email, Username, Password, FullName, DepartmentID, PositionID)"
					+ " values (" + accountID +", " + email + ", " + username + ", " + password + ", " + accountName + ", 4, 3 )";
			insertEmployee(sql3);
			break;
		case 4:
			data();
			String sql4 = "Insert into Account (AccountID, Email, Username, Password, FullName, DepartmentID, PositionID)"
					+ " values (" + accountID +", " + email + ", " + username + ", " + password + ", " + accountName + ", 1, 1 )";
			insertEmployee(sql4);
			break;
		case 5:
			data();
			String sql5 = "Insert into Account (AccountID, Email, Username, Password, FullName, DepartmentID, PositionID)"
					+ " values (" + accountID +", " + email + ", " + username + ", " + password + ", " + accountName + ", 2, 5 )";
			insertEmployee(sql5);
		default:
			System.out.println("Bạn đã nhập sai!!!");
			break;
		}
	}
	
	public void insertEmployee( String sql) throws ClassNotFoundException, SQLException
	{
		JdbcConnect jdbcConnect = new JdbcConnect();
		Connection connection = jdbcConnect.connect();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int resultSet = preparedStatement.executeUpdate(sql);
		
	}
	
	public void data()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Account ID: " );
		accountID = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập tên: ");
		accountName = scanner.nextLine();
		
		System.out.println("Nhập email: " );
		email = scanner.nextLine();
		
		System.out.println("Nhập username: ");
		username = scanner.nextLine();
		
		System.out.println("Nhập password: ");
		password = scanner.nextLine();
		
		
	}
	
}
