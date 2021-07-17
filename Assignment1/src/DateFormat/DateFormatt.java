/**
 * 
 */
package DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author luant
 *
 */
public class DateFormatt {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("-----------------------------");
		String pattern = "dd-MMMMM-yyyy ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(simpleDateFormat.format(date));
	}
}
