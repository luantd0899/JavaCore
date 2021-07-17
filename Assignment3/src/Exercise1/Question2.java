/**
 * 
 */
package Exercise1;

import java.util.Random;

/**
 * @author luant
 *
 */
public class Question2 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt((99999 - 0) + 1);
		
		while(a < 10000)
		{
			a = a*10;
		}
		
		System.out.println(a);
		
	}
}
