/**
 * 
 */
package com.vti.frontend;

import java.util.Scanner;
import com.vti.*;
import com.vti.backend.QLTL;

/**
 * @author luant
 *
 */
public class Program {
	public static void main(String[] args) {
		QLTL qltl = new QLTL();
		Scanner scanner = new Scanner(System.in);

		System.out.println("==========Library Management==========");
		System.out.println("1. Them moi tai lieu");
		System.out.println("2. Xoa tai lieu");
		System.out.println("3. Hien thi thong tin tai lieu");
		System.out.println("4. Tim kiem tai lieu");
		System.out.println("5. Thoat chuong trinh");
		System.out.println("======================================");
		boolean check = true;
		do {
			System.out.print("Moi ban chon chuc nang: ");
			int choose = scanner.nextInt();
			switch (choose) {

			case 1:
				qltl.addTaiLieu();
				break;

			case 2:
				qltl.deleteTaiLieu();
				break;

			case 3:
				qltl.showTaiLieu();
				break;

			case 4:
				qltl.searchTaiLieu();
				break;

			case 5:
				System.out.println("Thoat chuong trinh thanh cong!!!");
				check = false;
				break;

			default:
				System.out.println("Ban da nhap sai chuc nang, moi nhap lai!!!");
				break;
			}

		} while (check);
	}
}
