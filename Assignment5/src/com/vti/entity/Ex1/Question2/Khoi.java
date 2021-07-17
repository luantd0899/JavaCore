/**
 * 
 */
package com.vti.entity.Ex1.Question2;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Khoi {
	private String khoi;
	private String monThi;

	public Khoi()
	{
		
	}
	
	
	public String getKhoi() {
		return khoi;
	}

	public void setKhoi(String khoi) {
		if (!khoi.trim().equalsIgnoreCase("a") && !khoi.trim().equalsIgnoreCase("b") && !khoi.trim().equalsIgnoreCase("c")) {
			System.out.println("Ban da nhap sai, moi nhap lai!!!");
			input();
		}
	}
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap khoi(A/B/C): ");
		khoi = scanner.nextLine();
		setKhoi(khoi);
		if (khoi.trim().equalsIgnoreCase("a")) {
			monThi = "Toan, Ly, Hoa";
		}
		else if(khoi.trim().equalsIgnoreCase("b"))
		{
			monThi = "Toan, Hoa, Sinh";
		}
		else if(khoi.trim().equalsIgnoreCase("c")){
			monThi = "Van, Su, Dia";
		}
		else {
			monThi ="Khong co!";
		}
		
	}
	
	public void output()
	{
		System.out.println("Khoi: " + khoi.toUpperCase());
		System.out.println("Mon thi: " + monThi);
	}
	
}
