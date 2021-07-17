/**
 * 
 */
package random;

import java.util.Random;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt();
		
		System.out.println(a);
		
		System.out.println("------------------------------");
		// random between 5 to 10
		
		int b = random.nextInt((10-5) + 1) + 5;
		System.out.println(b);
		
		System.out.println("Random Date");
		
	}
}
