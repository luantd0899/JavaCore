/**
 * 
 */
package com.vti.entity.Ex5;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class CongNhan extends CanBo{
	/**
	 * @param id
	 * @param name
	 * @param age
	 * @param gender
	 * @param address
	 */
	Scanner scanner = new Scanner(System.in);
	
	public CongNhan()
	{
		
	}
	
	public CongNhan(int id, String name, int age, Gender gender, String address) {
		super(id, name, age, gender, address);
		this.address = address;
	}

	private int level;
	
	

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public void input()
	{
		super.input();
		System.out.println("Nhap cap bac: ");
		this.level = scanner.nextInt();
	}
	
	@Override
	public String toString() {
		
		String result = super.toString() + "Level: " + level;
		return result;
	}
	
	
}
