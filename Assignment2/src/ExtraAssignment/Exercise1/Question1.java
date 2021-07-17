/**
 * 
 */
package ExtraAssignment.Exercise1;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap so thuc(don vi: cm): ");
		float number = scanner.nextFloat();
		
		float k = (float) (number/(30.48));
		
		System.out.println("So tuong ung(don vi: foot) la: " + k);
		
	}
}
