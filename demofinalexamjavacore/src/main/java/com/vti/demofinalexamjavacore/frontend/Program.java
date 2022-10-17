package com.vti.demofinalexamjavacore.frontend;

import java.sql.SQLException;
import java.util.Scanner;

import com.vti.demofinalexamjavacore.backend.presentationlayer.UserController;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		menu();
	}
	
	private static void menu() throws ClassNotFoundException, SQLException {
		UserController userController = new UserController();
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Chương trình quản lý User");
			System.out.println("1. - In ra thông tin của tất cả User");
			System.out.println("2. - Nhập vào ID và in ra thông tin của User đó");
			System.out.println("3. - Nhập vào ID và Xóa toàn bộ thông tin của User đó");
			System.out.println("4. - Tạo User");
			System.out.println("5. - Exit!!!");
			System.out.println("Mời bạn chọn: ");
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:
				userController.getAllUser();
				break;
			case 2:
				
				System.out.println("Nhập ID của USER cần tìm: ");
				int id = scanner.nextInt();
				userController.getUserById(id);
				break;
			case 3:
				System.out.println("3. - Nhập vào ID và Xóa toàn bộ thông tin của User đó");
				
				System.out.println("Nhập ID của USER cần xóa: ");
				int idForDelete = scanner.nextInt();
				userController.deleteUserById(idForDelete);
				break;
			case 4:
				System.out.println("4. - Tạo User");
				break;
			case 5:
				System.out.println("Thoát chương trình!!!");
				return;

			default:
				System.out.println("Bạn đã nhập sai, mời nhập lại!!!");
				break;
			}
		}
	}
}
