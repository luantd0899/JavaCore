package app;

import backend.Controller;
import entity.CanBo;
import entity.CongNhan;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        Controller controller = new Controller();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("================Employee Management================");
//        while (true){
//            menu();
//            System.out.println("Moi ban chon");
//
//            int choose = scanner.nextInt();
//            switch (choose){
//                case 1:
//                    System.out.println("Them moi can bo");
//                    controller.addCanBo();
//                    break;
//
//                case 2:
//                    System.out.println("Tim kiem theo ten");
//                    controller.timKiemTheoTen();
//                    break;
//
//                case 3:
//                    System.out.println("Hien thi thong tin");
//                    controller.hienThiThongTin();
//                    break;
//
//                case 4:
//                    System.out.println("Xoa can bo");
//                    controller.xoaCanBo();
//                    break;
//
//                case 5:
//                    System.out.println("Thoat chuong trinh");
//                    return;
//
//                default:
//                    System.out.println("Ban da nhap sai, moi nhap lai!");
//                    break;
//            }
//        }

        CanBo canBo = new CongNhan();
        canBo.inputInfo();

    }

    private static void menu(){
        System.out.println("1. Them Can Bo");
        System.out.println("2. Tim kiem theo ten");
        System.out.println("3. Hien thi thong tin");
        System.out.println("4. Xoa can bo");
        System.out.println("5. Thoat chuong trinh!");
    }
}
