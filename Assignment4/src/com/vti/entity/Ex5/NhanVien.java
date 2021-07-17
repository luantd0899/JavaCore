/**
 * 
 */
package com.vti.entity.Ex5;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class NhanVien  extends CanBo{
	private String congViec;
	Scanner scanner =  new Scanner(System.in);
	
	public NhanVien()
	{
		
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	
	
	@Override
	public void input()
	{
		super.input();
		System.out.println("Nhap Cong viec: ");
		this.congViec = scanner .nextLine();
	}
	
	@Override
	public String toString() {
		String result = super.toString() + "Cong viec: " + congViec;
		return result;
	}
	
}
