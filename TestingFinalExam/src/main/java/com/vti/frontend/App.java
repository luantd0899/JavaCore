/**
 * 
 */
package com.vti.frontend;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
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
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		UserController userController = new UserController();
		List<User> users = userController.getListUsers();
		System.out.println("Trước tiên, bạn phải đăng nhập!");
		checkLogin(userController, users);
	}

	private static void xuLiLogic(UserController userController, List<User> users)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		while (true) {
			
			System.out.println("Mời bạn chọn: ");
			int choose = ScannerUtils.inputInt("Bạn phải nhập số, mời nhập lại!");
			switch (choose) {
			case 1:
				System.out.println("Hiển thị User");
				for (User user : users) {
					user.getInfor();
					System.out.println("=====");
				}
				break;

			case 2:
				System.out.println("Nhap id can tim: ");
				int id = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!");
				userController.findUserById(id);
				break;

			case 3:
				System.out.println("Nhap id can xoa: ");
				int id2 = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!");
				userController.deleteUserById(id2);
				break;

			case 4:
				System.out.println("Dang xuat thanh cong");
				while (true) {
					System.out.println("Ban co muon tiep tuc khong(1-co/ 2- khong): ");
					int n = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!");
					switch (n) {
					case 1:
						checkLogin(userController, users);
						return;
					case 2:
						System.out.println("==================");
						System.out.println("Thoát chương trình");
						return;
					default:
						System.out.println("Ban da chon sai, moi chon lai!");
						break;
					}
				}

			case 5:

				System.out.println("Tạo thêm User mới");
				System.out.println("Ban muon them Admin hay Employee: ");
				String role = ScannerUtils.inputRole();

				System.out.println("Nhap fullName: ");
				String fullName = ScannerUtils.inputFullName();

				System.out.println("Nhap email: ");
				String email2 = ScannerUtils.inputEmail();

				if (role.equalsIgnoreCase("Admin")) {
					System.out.println("Nhap so nam kinh nghiem: ");
					int expInYear = ScannerUtils.inputInt("Ban phai nhap so");
					userController.addUSer(role, fullName, email2, expInYear);
				} else {
					System.out.println("Nhap proSkill: ");
					String proSkill = ScannerUtils.inputString("ProSkill khong duoc de trong, moi nhap lai!");
					userController.addUser(role, fullName, email2, proSkill);
				}

				System.out.println("Them user thanh cong!");
				System.out.println("Ten tai khoan: " + email2);
				System.out.println("Password: " + "123456A");
				break;
				
			case 6:
				System.out.println("Nhap id cua user: ");
				int id3 = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!");
				
				System.out.println("Nhap mat khau moi: ");
				String newPassword = ScannerUtils.inputPassword();
				userController.changePasswordById(id3, newPassword);
				break;

			case 0:
				System.out.println("==================");
				System.out.println("Thoát chương trình");
				return;

			default:
				System.out.println("Bạn đã chọn sai, mời nhập lại!");
				break;
			}
		}
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
		System.out.println("Ban muon dang nhap theo tu cach Admin hay Employee: ");
		String role = ScannerUtils.inputRole();

		System.out.println("Nhap email: ");
		String email = ScannerUtils.inputEmail();

		System.out.println("Nhap Password: ");
		String password = ScannerUtils.inputPassword();

		return userController.login(email, password, role);

	}

}
