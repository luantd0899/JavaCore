/**
 * 
 */
package com.vti.entity.Ex5;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class CanBo {
	protected static int count = 0;
	protected int  id;
	protected String name;
	protected int age;
	protected Gender gender;
	protected String address;
	
	
	public CanBo()
	{
		this.id = count++;
	}
	
	public CanBo(int id, String name, int age, Gender gender, String address) {
		
		this.id = ++count;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}





	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("ID: " + id);
		System.out.println("Nhap ten can bo: ");
		this.name = scanner.nextLine();
		
		System.out.println("Nhap tuoi: ");
		this.age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhap gioi tinh(MALE/FEMALE): ");
		String gender = scanner.nextLine();
		if (gender.equalsIgnoreCase("Male")) {
			gender = "MALE";
		}
		else {
			gender = "FEMALE";
		}
		
		
		
	}
	
	@Override
	public String toString() {
		String result = "ID: " + id + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "Gender: " + gender + "\n" + "Address: " + address;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}
