/**
 * 
 */
package entity.ex1.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		Set<Student> students = new TreeSet<Student>();
		students.add(new Student(1, "Dan"));
		students.add(new Student(2, "Choi"));
		students.add(new Student(3, "Cun"));
		
		students.add(new Student(4, "Nguyen"));
		students.add(new Student(5, "R"));
		students.add(new Student(6, "6"));
		
		// Question4
		students.add(new Student(7, "Luan"));
		students.add(new Student(8, "Luan"));
		students.add(new Student(9, "Nam"));
		
	
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		
	}
	
	
	
	
	
	
}
