/**
 * 
 */
package ExtraAssignment.Exercise1;

import java.util.Scanner;

/**
 * @author luant
 *
 */
// chuyển giây thành giờ phút giây
public class Question2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập số giây: ");
		int seconds = scanner.nextInt();
		
		int hour = seconds/3600;
		seconds = seconds % 3600;
		int minute = seconds / 60;
		seconds = seconds % 60;
		
		System.out.println("Chuyển theo định dạng giờ phút giây: ");
		System.out.println(hour + ":" + minute + ":" + seconds);
		
		
		
	}
}
