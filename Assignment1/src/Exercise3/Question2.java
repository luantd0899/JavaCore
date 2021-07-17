/**
 * 
 */
package Exercise3;

import java.text.SimpleDateFormat;
import java.util.Date;

import assignment.Exam;

/**
 * @author luant
 *
 */
public class Question2 {
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd-HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Exam exam = new Exam();
		Exam exam2 = new Exam();
		
		Exam[] exams = { exam, exam2 };
		for (Exam examm : exams) {
			String date = simpleDateFormat.format(exam.createDate);
			System.out.println(exam.code + ": " + date);
		}
	}
}
