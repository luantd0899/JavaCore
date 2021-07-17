/**
 * 
 */
package com.vti.entity.Ex2.Question2;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Person {
	private String name;
	private Gender gender;
	private String dateOfBrith;
	private String address;
	
	
	
	public Person() {
		super();
	}



	public Person(String name, Gender gender, String dateOfBrith, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBrith = dateOfBrith;
		this.address = address;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Gender getGender() {
		return gender;
	}



	public void setGender(String gender) {
		if (gender.trim().equalsIgnoreCase("Male")) {
			this.gender = Gender.MALE;
		}
		else if (gender.trim().equalsIgnoreCase("Female")) {
			this.gender = Gender.FEMALE;
		}
		else {
			System.out.println("Gender must MALE or FEMALE");
			inputGender();
			
		}
	}



	public String getDateOfBrith() {
		return dateOfBrith;
	}



	public void setDateOfBrith(String dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	public void inputGender()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap gioi tinh: ");
		String gender = scanner.nextLine();
		setGender(gender);
	}
	
	public void putInfo()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		name = scanner.nextLine();
		inputGender();
		
		System.out.println("Nhap ngay sinh: ");
		dateOfBrith = scanner.nextLine();
		
		System.out.println("Nhap dia chi: ");
		address = scanner.nextLine();
			
	}
	
	public void output()
	{
		System.out.println("Ho ten: " + name);
		System.out.println("Gioi tinh: " + getGender());
		System.out.println("Ngay sinh: " + dateOfBrith);
		System.out.println("Dia chi: " + address);
	}
	
	
}
