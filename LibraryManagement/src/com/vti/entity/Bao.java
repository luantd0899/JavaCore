/**
 * 
 */
package com.vti.entity;

import java.util.Scanner;


public class Bao extends TaiLieu {
	private int ngayPH;

	public int getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(int ngayPH) {
		if (ngayPH > 0 && ngayPH <= 31) {
			this.ngayPH = ngayPH;
		}
		else {
			System.out.println("Ngay khong hop le, moi nhap lai!");
			input();
			
		}
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ngay phat hanh: ");
		this.ngayPH = scanner.nextInt();
		setNgayPH(ngayPH);
		
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Ngay phat hanh: " + ngayPH);

	}

}
