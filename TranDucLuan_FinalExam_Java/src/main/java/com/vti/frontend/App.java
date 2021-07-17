/**
 * 
 */
package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		UserController userController = new UserController();
		List<User> users = userController.getListManager();
		System.out.println("Trước tiên, bạn phải đăng nhập!");
		checkLogin(userController, users);

	}

	private static void checkLogin(UserController userController, List<User> users)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {

		while (true) {
			if (login(userController) == 1) {
				xuLiLogic(userController, users);
				return;
			}
		}
	}

	private static int login(UserController userController)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("Bạn muốn đang nhập bằng MANAGER hay EMPLOYEE: ");
		String role = ScannerUtils.inputRole();

		System.out.println("Nhập email: ");
		String email = ScannerUtils.inputEmail();

		System.out.println("Nhập Password: ");
		String password = ScannerUtils.inputPassword();

		return userController.login(email, password, role);

	}

	private static void xuLiLogic(UserController userController, List<User> users)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		while (true) {
			System.out.println("Mời bạn chọn: ");
			int choose = ScannerUtils.inputInt("Bạn phải nhập số, mời nhập lại!");
			switch (choose) {
			case 1:
				System.out.println("1. Tìm kiếm User theo ID");
				System.out.println("Nhập id cần tìm: ");
				int id = ScannerUtils.inputInt("Bạn phải nhập số, mời nhập lại!");
				userController.findUserById(id);
				break;

			case 2:
				System.out.println("2. Hiển thị Manager");
				users = userController.getListManager();
				for (User user : users) {
					System.out.println(user);
				}
				break;
			case 3:
				System.out.println("Đăng xuất thành công!");
				while (true) {
					System.out.println("Bạn có muốn tiếp tục không(1-có/ 2- không): ");
					int n = ScannerUtils.inputInt("Bạn phải nhập số, mời nhập lại!");
					switch (n) {
					case 1:
						checkLogin(userController, users);
						return;
					case 2:
						System.out.println("==================");
						System.out.println("Thoát chương trình");
						return;
					default:
						System.out.println("Bạn đã chọn sai, mời chọn lại!");
						break;
					}
				}

			case 4:
				System.out.println("Nhập id:");
				int id2 = ScannerUtils.inputInt("Bạn phải nhập số, mời nhập lại!");

				System.out.println("Nhập mật khẩu mới: ");
				String newPassword = ScannerUtils.inputPassword();
				userController.changePasswordById(id2, newPassword);
				break;

			case 5:
				System.out.println("Nhập id Project: ");
				int idProject = ScannerUtils.inputInt("Bạn phải nhập số, mời nhập lại!");
				users = userController.showUserByIdProject(idProject);
				for (User user : users) {
					System.out.println(user);
				}
				break;
			case 0:
				System.out.println("==================");
				System.out.println("Thoát chương trình!");
				return;
			default:
				System.out.println("Bạn đã nhập sai, mời nhập lại!");
				break;
			}

		}
	}
}
