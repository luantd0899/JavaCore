/**
 * 
 */
package Exercise3;

import java.text.SimpleDateFormat;

import assignment.Exam;

/**
 * @author luant
 *
 */
public class Question4 {
	public static void main(String[] args) {
		String pattern = "yyyy-MM";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Exam exam = new Exam();
		Exam exam2 = new Exam();
		Exam[] exams = {exam, exam2};
		for (Exam examm : exams) {
			String date = simpleDateFormat.format(examm.createDate);
			System.out.println(exam.code + ": " + date);
		}
	}
}
