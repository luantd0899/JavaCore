/**
 * 
 */
package com.vti.entity;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten tac gia: ");
		tenTacGia = scanner.nextLine();

		System.out.println("Nhap so trang: ");
		soTrang = scanner.nextInt();
	}

	@Override
	public void output() {
		super.output();
		System.out.println("Ten tac gia: " + tenTacGia);
		System.out.println("So trang: " + soTrang);
	}

}
