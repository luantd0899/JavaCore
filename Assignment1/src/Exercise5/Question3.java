/**
 * 
 */
package Exercise5;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First name: ");
		String firstname = scanner.nextLine();
		
		System.out.println("Last name: ");
		String lastname = scanner.nextLine();
		
		System.out.println("Fullname: " + firstname + " " + lastname);
	}
}
