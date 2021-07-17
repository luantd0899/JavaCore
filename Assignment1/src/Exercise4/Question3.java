/**
 * 
 */
package Exercise4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] name = {"luan", "nam", "ha"};
		Random random = new Random();
		int a = random.nextInt((name.length) );
		System.out.println(name[a]);
		
		//Question 1
		int b = random.nextInt();
		System.out.println(b);
		
		System.out.println("--------------------------");
		System.out.println("Input your name: ");
		String namee = scanner.nextLine();
		System.out.println(namee);
	}
}
