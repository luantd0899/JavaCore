/**
 * 
 */
package Exercise1;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: " );
		int a = scanner.nextInt();
		
		System.out.println("Nhap so thu hai: " );
		int b = scanner.nextInt();
		
		System.out.println("Thuong hai so: " + thuongHaiSo(a, b));
		
		scanner.close();
	}
	
	public static int thuongHaiSo(int a, int b)
	{
		int result = a / b ;
		return result;
	}
}
