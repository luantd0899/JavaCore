/**
 * 
 */
package Exercise5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question4 {
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Date of bidth(dd/MM/yyyy): ");
		String dateStr = scanner.nextLine();
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		//System.out.println(date.format(dateStr));
	}
}
