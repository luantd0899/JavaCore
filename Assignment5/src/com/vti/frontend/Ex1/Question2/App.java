/**
 * 
 */
package com.vti.frontend.Ex1.Question2;

import java.util.Scanner;


import com.vti.backend.Ex1.Question2.TuyenSinh;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		TuyenSinh tuyenSinh = new TuyenSinh();
		Scanner scanner = new Scanner(System.in);
		System.out.println("=================Quan Ly Tuyen Sinh=================");
		System.out.println("1. Them moi thi sinh ");
		System.out.println("2. Hien thi thong tin thi sinh va khoi thi");
		System.out.println("3. Tim kiem theo so bao danh");
		System.out.println("0. End!!!");
		System.out.println("====================================================");
		
		do {
			System.out.println("====================");
			System.out.print("Moi ban chon: ");
			int choose = scanner.nextInt();
			
			
			switch (choose) {
			case 1:
				tuyenSinh.addThiSinh();
				break;

			case 2:
				tuyenSinh.showThiSinh();
				break;
				
			case 3:
				tuyenSinh.searchThiSinh();
				break;
				
			case 0:
				return;
				
			default:
				System.out.println("Ban da nhap sai, moi nhap lai!!");
				break;
			}
			
			
			
		} while (true);
	}
}
