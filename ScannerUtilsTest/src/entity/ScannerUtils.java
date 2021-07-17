/**
 * 
 */
package entity;

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
	
	public static long inputLong(String errMessage)
	{
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
		String input = scanner.nextLine().trim();
		while (true) {
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errMessage);
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
				System.out.println("Ten cua ban la: ");
				return result;
			} else {
				System.out.println("Ten cua ban phai co nhieu hon hai ki tu, moi nhap lai!!");
			}
		}

	}
	
	public static String inputEmail()
	{
		while(true)
		{
			String email = inputString("Email khong duoc de trong, moi ban nhap lai!!!");
			email.trim();
			if (email.contains("@") && email.length() >=5) {
				return email;
			}
			else {
				System.err.println("Email phai chua ki tu '@' va do dai phai lon hon 5");
			}
		}
	}

}
