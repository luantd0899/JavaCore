/**
 * 
 */
package Exercise4;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = scanner.nextLine();
		name.substring(0).toUpperCase();
		System.out.println(name);
	}
}
