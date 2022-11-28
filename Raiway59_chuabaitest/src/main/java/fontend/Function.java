package fontend;

import backend.controller.UserController;
import entity.Userss;
import util.ScannerUtil;

import java.sql.SQLException;
import java.util.List;

public class Function {

    UserController userController = new UserController();


    public void menu() throws SQLException {
        System.out.println("Chương trình quản lý User");
        System.out.println("1. Get User By ProjectId");
        System.out.println("2. Get All Manager");
        System.out.println("3. Exit");

        while (true){
            System.out.println("Nhập lựa chọn của bạn!!!");
            int choose = ScannerUtil.inputIntPositive();
            switch (choose){
                case 1:
                    System.out.println("Mời bạn nhập Project ID: ");
                    int projectId = ScannerUtil.inputIntPositive();
                    List<Userss> userssList = userController.getUserByProjectId(projectId);
                    for (Userss user : userssList) {
                        System.out.println(user);
                    }
                    break;

                case 2:
                    List<Userss> managerList = userController.getAllManager();
                    for (Userss manager : managerList) {
                        System.out.println(manager);
                    }
                    break;

                case 3:
                    System.out.println("3. Exit");
                    return;

                default:
                    System.out.println("Bạn đã nhập sai, mời nhập lại!!!!");
                    break;
            }
        }
    }

    public void login() throws SQLException {
        System.out.println("Trước tiên, bạn phải đăng nhập!!!!");
        System.out.println("Mời bạn nhập email: ");
        String email = ScannerUtil.inputEmail();

        System.out.println("Mời bạn nhập password: ");
        String password = ScannerUtil.inputPasswords();

        if (userController.login(email, password)){
            System.out.println("Đăng nhập thành công!!");
            menu();
        }else {
            System.out.println("Sai tên tài khoản hoặc mật khẩu!!");
        }

    }
}
