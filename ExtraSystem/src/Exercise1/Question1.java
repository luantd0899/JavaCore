/**
 * 
 */
package Exercise1;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Moi ban nhap so vao (don vi: cm): ");
		float number = scanner.nextFloat();
		
		change(number);
	}
	
	public static void change(float m)
	{
		float k = (float) (m / 30.48);
		System.out.println("So tuong ung la: " +k + " foot");
	}
	
	
}
