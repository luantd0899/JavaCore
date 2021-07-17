/**
 * 
 */
package phantichsothanhsonguyento;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		PhanTichSoNguyenTo();
		
	}
	
	public static void PhanTichSoNguyenTo()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Nhap so: ");
			int a = scanner.nextInt();
			
			if (chekSNT(a) == true) {
				System.out.println("Day la so nguyen to, moi ban nhap lai!");
			}
			else {
				
				int count = 0;
				int result[] = new int[a/2];
				for (int i = 2; i < a/2; i++) {
					if (a % i == 0) {
						for (int j = count; j < result.length; j++) {
							a = a/i;
							result[j] = a;
							count++;
						}
					}
					else {
						i++;
					}
				}
				// sap xep
				for (int i = 0; i < result.length-1; i++) {
					for (int j = 1; j < result.length; j++) {
						if (result[i] > result[j]) {
							int temp = result[i];
							result[i] = result[j];
							result[j] = temp;
						}
					}
				}
				
				for (int i = 0; i < result.length; i++) {
					System.out.print(result[i] + " . ");
				}
			}
			return;
		}
	}
	
	public static boolean chekSNT(int a)
	{
		int count =0 ;
		for (int i = 2; i < a; i++) {
			if (a % i ==0) {
				count++;
			}
			
		}
		if (count == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
