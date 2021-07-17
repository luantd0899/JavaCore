/**
 * 
 */
package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.datalayer.UserResponsitory;
import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		
		UserController userController = new UserController();
		List<User> users = new ArrayList<User>();
		
		System.out.println("ban muon dang nhap bang ADMIN hay EMPLPOYEE: ");
		String role = ScannerUtils.inputRole();
		
		System.out.println("Nhap email: ");
		String email = ScannerUtils.inputEmail();
		
		System.out.println("Nhap Password: ");
		String password = ScannerUtils.inputPassword();
		
		login(userController, role, email, password);
		
		
		System.out.println("1. Hien thi User");
		System.out.println("2. Tim kiem User");
		System.out.println("3. Xoa User theo id");
		System.out.println("4. tao user moi");
		System.out.println("0. thoat chuong trinh!");
		
		while(true)
		{
			int choose = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!");
			switch (choose) {
			case 1:
				users = userController.getListUser();
				for (User user : users) {
					System.out.println(user);
				}
				
				break;
				
			case 2:
				System.out.println("2. Tim kiem User");
				System.out.println("Nhap ID: ");
				int id = ScannerUtils.inputInt("ban phai nhap so, moi nhap lai!");
				userController.findUserById(id);
				break;
				
			case 3:
				System.out.println("3. Xoa User theo id");
				System.out.println("Nhap ID: ");
				int id2 = ScannerUtils.inputInt("ban phai nhap so, moi nhap lai!");
				userController.deleteUserById(id2);
				break;
				
			case 4:
				System.out.println("4. tao user moi");
				
				System.out.println("ban muon tao Admin hay Employee: ");
				String role2 = ScannerUtils.inputRole();
				
				System.out.println("Nhap email: ");
				String email2 = ScannerUtils.inputEmail();
				
				System.out.println("nhap fullname: ");
				String fullname = ScannerUtils.inputFullName();
				
				if (role.equalsIgnoreCase("admin")) {
					
					System.out.println("Nhap so nam kinh nghiem: ");
					int expInYear = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!");
					userController.addUser(fullname, email2, role2, expInYear);
				}
				else {
					System.out.println("Nhap ky nang chuyen mon: ");
					String proSkill = ScannerUtils.inputString("Khong duoc de trong, moi nhap lai");
					userController.addUser(fullname, email2, role2, proSkill);
				}
				break;
				
			case 0:
				System.out.println("thoat chuong trinh thanh cong!!!");
				return;
				

			default:
				System.out.println("ban da nhap sai, moi nhap lai!");
				break;
			}
		}
	}
	
	private static void login( UserController userController, String role, String email, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		userController.login(role, email, password);
	}
}
