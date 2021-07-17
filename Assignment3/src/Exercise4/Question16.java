/**
 * 
 */
package Exercise4;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question16 {
	public static void main(String[] args) {
		String string = "Xin chao viet nam hi";
		string = string.trim();
		int number = 5;
		
		if (string.length() % number == 0) {
			for (int i = 0; i < string.length(); i+=5) {
				System.out.println(string.substring(i, i+5));
			}
		}
		else {
			System.out.println("Khong the chia chuoi thanh cac phan bang nhau");
		}
		
		
	}
}
