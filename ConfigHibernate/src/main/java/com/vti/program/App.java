/**
 * 
 */
package com.vti.program;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.User;
import com.vti.entity.Enum.EGender;
import com.vti.entity.Enum.ERole;
import com.vti.repository.UserRepopsitory;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		UserRepopsitory userRepopsitory = new UserRepopsitory();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			menu();
			System.out.println("Moi ban chon: ");
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:
				showUser(userRepopsitory);
				break;
				
			case 2:
				addUser(userRepopsitory);
				break;
				
			case 3:
				updateUser(userRepopsitory);
				break;
				
			case 4:
				deleteUser(userRepopsitory);
				break;
				
			case 0:
				System.out.println("Thoat chuong trinh thanh cong!");
				return;

			default:
				System.out.println("Ban da nhap sai, moi nhap lai!");
				break;
			}
		}
		

	}
	
	private static void menu() {
		System.out.println("1. Show User");
		System.out.println("2. Add User");
		System.out.println("3. Update User");
		System.out.println("4. Delete User");
		System.out.println("0. End Program");
	}

	private static void showUser(UserRepopsitory userRepopsitory) {
		List<User> users = userRepopsitory.getAllUsers();

		for (User user : users) {
			System.out.println(user);
		}
	}
	
	private static void addUser(UserRepopsitory userRepopsitory) {
		System.out.println("Tao User moi: ");
		User user = new User();
		user.setUsername("luantd");
		user.setEmail("luantd@gmail.com");
		user.setPassword("123456");
		user.setFirstName("Tran Duc");
		user.setLastName("Luannnnnn");
		user.setGender(EGender.MALE);
		user.setDate(new Date());
		user.setAddress("Nam Dinh");
		user.setPhone("0942273195");
		user.setRole(ERole.ADMIN);
		user.setStatus((short)1);
		userRepopsitory.addUser(user);
	}
	
	private static void updateUser(UserRepopsitory userRepopsitory) {
		System.out.println("Update User By ID: ");
		System.out.println("Nhap id cua user can update: ");
		short id = 17;
		User user = userRepopsitory.getUserById(id);
		user.setFirstName("Hello Java");
		userRepopsitory.updateUser(user);
	}
	
	private static void deleteUser(UserRepopsitory userRepopsitory) {
		System.out.println("Delete User");
		System.out.println("Nhap id cua user can xoa: ");
		short id = 17;
		userRepopsitory.deleteUSer(id);
	}
	
	
}
