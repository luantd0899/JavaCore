/**
 * 
 */
package com.vti.utils;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class ScannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt(String errMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}

	public static float inputFloat(String errMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}

	public static long inputLong(String errMessage) {
		while (true) {
			try {
				return Long.parseLong(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}

	public static double inputDouble(String errMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errMessage);
			}
		}
	}

	public static String inputString(String errMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (input.isEmpty()) {
				System.err.println(errMessage);				

			} else {
				return input;
			}
		}
	}

	public static int inputAge() {
		while (true) {
			int age = inputInt("Ban phai nhap so, moi nhap lai!!!");
			if (age <= 0) {
				System.err.println("Tuoi phai lon hon 0, moi nhap lai!!!");
			} else {
				return age;
			}
		}
	}

	public static int inputAgeGreaterThan18() {
		while (true) {
			int age = inputAge();
			if (age < 18) {
				System.out.println("Cam tre em duoi 18 tuoi!!!");
			} else {
				return age;
			}
		}
	}

	public static String inputFullName() {
		while (true) {
			String fullName = inputString("Ten khong duoc de trong, moi ban nhap lai!!!");
			fullName.trim();
			fullName.replaceAll("\\s+", " ");
			String[] name = fullName.split(" ");
			int count = 0;
			String result = "";
			for (int i = 0; i < name.length; i++) {
				count++;
				result += String.valueOf(name[i].charAt(0)).toUpperCase() + name[i].substring(1) + " ";
			}
			if (count >= 2) {
				return result;
			} else {
				System.out.println("Ten cua ban phai co nhieu hon hai ki tu, moi nhap lai!!");
			}
		}

	}

	public static String inputEmail() {
		while (true) {
			String email = inputString("Email khong duoc de trong, moi ban nhap lai!!!");
			email.trim();
			if (email.contains("@") && email.length() >= 5) {
				return email;
			} else {
				System.err.println("Email phai chua ki tu '@' va do dai phai lon hon 5");
			}
		}
	}
	
	public static String inputPassword()
	{
		while(true)
		{
			
			String password = inputString("Password khong duoc de trong, moi nhap lai!");
			if (password.contains(" ")) {
				System.err.println("Password khong chua dau cach, moi ban nhap lai");
			}if (password.length() < 6 || password.length() > 12) {
				System.err.println("Password phai dai tu 6 den 12 ki tu, moi ban nhap lai");
			}else if(!checkUpperCase(password))
			{
				System.err.println("Password phai co it nhat mot ki tu viet hoa, moi nhap lai");
			}
			else {
				return password;
			}
		}
	}
	
	public static boolean checkUpperCase(String string)
	{
		for (int i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i)) == true) {
				return true;
			}
		}
		return false;
	}
	
	
	// chi nhap duoc Admin or Employee
	public static String inputRole()
	{
		while(true)
		{
			String role = inputString("Role khong duoc de trong, moi nhap lai!");
			if (role.equalsIgnoreCase("Admin") || role.equalsIgnoreCase("Employee")) {
				return role;
			}
			else {
				System.err.println("Role phai la ADMIN or EMPOYEE, moi ban nhap lai!");
			}
		}
	}
	
	public static int intput4()
	{
		while(true)
		{
			int input = inputInt("Ban phai nhap so, moi ban nhap lai!!");
			if (input == 4) {
				return input;
			}
			else {
				System.err.println("Ban chi nhap duoc 4, moi ban nhap lai!");
			}
		}
	}
	
	public static int inputId()
	{
		while(true)
		{
			int input = inputInt("Ban phai nhap so, moi nhap lai!");
			if (input > 0) {
				return input;
			}
			else {
				System.err.println("So phai lon hon 0, moi ban nhap lai!");
			}
		}
	}

}
