/**
 * 
 */
package com.vti.entity.Ex1.Question2;

import java.util.Scanner;

import org.omg.PortableServer.ID_UNIQUENESS_POLICY_ID;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author luant
 *
 */
public  class ThiSinh {
	
	private int soBD;
	private String hoTen;
	private String diaChi;
	private String uuTien;
	private Khoi khoi;
	
	
	
	
	
	public ThiSinh() {
		khoi = new Khoi();
	}
	
	public int getSoBD() {
		return soBD;
	}
	public void setSoBD(int soBD) {
		this.soBD = soBD;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getUuTien() {
		return uuTien;
	}
	public void setUuTien(String uuTien) {
		this.uuTien = uuTien;
	}
	public Khoi getKhoi() {
		return khoi;
	}
	public void setKhoi(Khoi khoi) {
		this.khoi = khoi;
	}
	
	public  void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id: ");
		this.soBD = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhap ho ten: ");
		hoTen = scanner.nextLine();
		
		System.out.println("Nhap dia chi: ");
		diaChi = scanner.nextLine();
		
		System.out.println("Nhao do uu tien: ");
		uuTien = scanner.nextLine();
		
		khoi.input();
	}
	public void output()
	{
		System.out.println("SBD: " + soBD);
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Do uu tien: " + uuTien);
		khoi.output();
	}
	
	
	
}
 