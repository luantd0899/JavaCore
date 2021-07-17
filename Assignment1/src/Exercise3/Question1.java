/**
 * 
 */
package Exercise3;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Locale;
import assignment.*;

/**
 * @author luant
 *
 */
public class Question1 {
	public static void main(String[] args) {
		Locale locale = new Locale("vi", "VN");
		Account account = new Account();
		account.createDate = LocalDate.now();
		Exam exam = new Exam();
		exam.code = 1;
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT,
				locale);
		
		String date = dateformat.format(account.createDate);

		System.out.println(exam.code + ": " + date);
	}
}
