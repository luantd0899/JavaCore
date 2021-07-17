/**
 * 
 */
package com.vti.entity;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class TapChi extends TaiLieu {
	private int soPH;
	private int thangPH;

	public int getSoPH() {
		return soPH;
	}

	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}

	public int getThangPH() {
		return thangPH;
	}

	public void setThangPH(int thangPH) {
		if (thangPH > 0 && thangPH <= 12) {
			this.thangPH = thangPH;
		}
	}

	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phat hanh: ");
		this.soPH = scanner.nextInt();

		System.out.println("Nhap thang phat hanh: ");
		this.thangPH = scanner.nextInt();
	}

	@Override
	public void output() {
		super.output();
		System.out.println("So phat hanh: " + soPH);
		System.out.println("Thang phat hanh: " + thangPH);
	}

}
