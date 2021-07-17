/**
 * 
 */
package Exercise4;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so ky tu trong ten cua ban: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		String [] name = new String[number];
		for (int i = 0; i < name.length; i++) {
			System.out.println("Ky tu thu: " + (i+1));
			String n1 = scanner.nextLine();
			name[i] = n1;
		}
		System.out.println("Ten cua ban la:" );
		for (String string : name) {
			System.out.print(string);
		}
		
		
	}
}
