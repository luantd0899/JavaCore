/**
 * 
 */
package Exercise5;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhap so thu: " + (i+1));
			int a = scanner.nextInt();
			number[i] = a;
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println("So thu " + (i+1) + ": " + number[i]);
			
		}
		
		
	}
}
