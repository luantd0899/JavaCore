/**
 * 
 */
package com.vti.frontend;
import com.*;
import com.vti.backend.QLCB;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Program5 {
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap chuc nang: ");
		System.out.println("1. Them moi can bo");
		System.out.println("2. Tim kiem theo ten");
		System.out.println("3. Hien thi thong tin can bo");
		System.out.println("4. Xoa can bo theo ten");
		System.out.println("5. Thoat khoi chuong trinh");
		while(true)
		{
			System.out.print("Moi ban chon chuc nang: ");
			int choose  = scanner.nextInt();
			
			switch(choose)
			{
				case 1:
					System.out.println("Them moi can bo");
					qlcb.addCanBo();
					break;
					
				case 2:
					System.out.println("Tim kiem theo ho ten: ");
					qlcb.timKiemTheoTen();
					break;
					
				case 3:
					System.out.println("Hien thi thong tin can bo");
					qlcb.hienThiThongTin();
					break;
					
				case 4:
					System.out.println("Nhap vao ten cua can bo va delete can bo do");
					qlcb.xoaCanBo();
					break;
					
				case 5:
					System.out.println("Thoat khoi chuong trinh!!!");
					scanner.close(); // dong scanner tranh gay ton bo nho;
					return; // ket thuc luon 1 phuong thuc
				default:
					System.out.println("Ban da nhap sai chuc nang, moi nhap lai");
					break;
			}
		}
	}
}
