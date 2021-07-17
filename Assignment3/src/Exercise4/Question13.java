/**
 * 
 */
package Exercise4;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String scString = scanner.nextLine();
		
		for (int i = 0; i < scString.length(); i++) {
			if (checkNumber(scString.charAt(i)) == true) {
				System.out.println("False!!!!");
				
			}
			
		}
		System.out.println("True");
		
	}
	
	public static boolean checkNumber(char number)
	{
		if (number >=0 && number <=9) {
			return true;
		}
		return false;
	}
}
