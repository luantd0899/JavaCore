/**
 * 
 */
package fontend;

import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.tree.FixedHeightLayoutCache;

import backend.DeleteEmployee;
import backend.InsertEmployee;
import backend.UpdateEmployee;

/**
 * @author luant
 *
 */
public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		Boolean check = true;
		
		
		do {
			System.out.println("=======Chương trình quản lý nhân viên======");
			System.out.println("Các chức năng của phần mềm:");
			System.out.println("1- Hiển thị thông tin nhân viên.");
			System.out.println("2- Thêm nhân viên.");
			System.out.println("3- Sửa nhân viên.");
			System.out.println("4- Xóa nhân viên.");
			System.out.println("0- Thoát chương trình.");
			System.out.println("Mời bạn nhập lựa chọn");
			int n = scanner.nextInt();
			switch (n) {
			case 1:
				showEmployee();
				break;

			case 2:
				insertEmployee();
				break;
			case 3:
				updateEmployee();
				break;
				
			case 4:
				deleteEmployee();
				break;
			case 0:
				check =false;
			default:
				System.out.println("Bạn đã nhập sai");
				break;
			}
		
		} while (check);
	}
	
	public static void showEmployee() throws ClassNotFoundException, SQLException
	{
		backend.showEmployee showEmployee = new backend.showEmployee();
		showEmployee.showInfor();
	}
	
	public static void insertEmployee() throws ClassNotFoundException, SQLException
	{
		InsertEmployee insertEmployee = new InsertEmployee();
		insertEmployee.choosePosition();
	}
	
	public static void updateEmployee()
	{
		UpdateEmployee updateEmployee = new UpdateEmployee();
		
	}
	
	public static void deleteEmployee() throws ClassNotFoundException, SQLException
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập AccountID bạn muốn xóa: ");
		int id = scanner.nextInt();
		DeleteEmployee deleteEmployee = new DeleteEmployee();
		deleteEmployee.deleteEmployee(id);
	}
}
