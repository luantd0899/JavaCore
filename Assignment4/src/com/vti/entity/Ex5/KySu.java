/**
 * 
 */
package com.vti.entity.Ex5;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class KySu extends CanBo{
	
	Scanner scanner= new Scanner(System.in);
	private String nganhDaoTao;
	
	
	public KySu()
	{
		
	}
	
	public KySu(int id, String name, int age, Gender gender, String address) {
		super(id, name, age, gender, address);
		
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
	public void input()
	{
		super.input();
		System.out.println("Nhap nganh dao tao: ");
		this.nganhDaoTao = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		String result = super.toString() + "Nganh dao tao: " + nganhDaoTao;
		return result;
	}
	
}
