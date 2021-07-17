/**
 * 
 */
package entity.ex2.question1;

import java.util.InputMismatchException;

/**
 * @author luant
 *
 */
public class Question1 {
	
	public static void main(String[] args) {
		try {
			int a = 5; int b = 0;
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Khong duoc chia cho 0");
		}finally {
			System.out.println("Devide complete!!!!!");
		}
	}
	
	
	public static float devide(int a, int b)
	{
		float result = a/b;
		return result;
	}
}
