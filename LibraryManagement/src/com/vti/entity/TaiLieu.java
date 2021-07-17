/**
 * 
 */
package com.vti.entity;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class TaiLieu {
	private static int count = 0;
	private int maTaiLieu;
	private String tenNXB;
	private int soBanPH;

	public TaiLieu() {
		this.maTaiLieu = ++count;
	}

	public TaiLieu(int maTaiLieu, String tenNXB, int soBanPH) {
		this.maTaiLieu = ++count;
		this.tenNXB = tenNXB;
		this.soBanPH = soBanPH;
	}

	public int getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(int maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public int getSoBanPH() {
		return soBanPH;
	}

	public void setSoBanPH(int soBanPH) {
		this.soBanPH = soBanPH;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ma tai lieu: " + this.maTaiLieu);
		System.out.println("Nhap ten NXB: ");
		this.tenNXB = scanner.nextLine();

		System.out.println("Nhap so ban phat hanh: ");
		this.soBanPH = scanner.nextInt();
	}

	public void output() {
		System.out.println("Ma tai lieu: " + maTaiLieu);
		System.out.println("Ten NXB: " + tenNXB);
		System.out.println("So ban phat hanh: " + soBanPH);

	}

}
