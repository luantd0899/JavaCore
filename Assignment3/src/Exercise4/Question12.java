/**
 * 
 */
package Exercise4;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question12 {
	public static void main(String[] args) {
		String string = "hello world";
		String chuoiDaoNguoc  = "";
		for (int i = string.length()-1; i >= 0; i--) {
			chuoiDaoNguoc += string.charAt(i);
		}
		
		System.out.println(chuoiDaoNguoc);
	}
}
