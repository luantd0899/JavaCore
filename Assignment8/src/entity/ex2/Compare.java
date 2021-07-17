/**
 * 
 */
package entity.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author luant
 *
 */
public class Compare {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Anh", "23/03/1999", 5f));
		students.add(new Student(2, "Anh", "23/03/1999", 3f));
		students.add(new Student(5, "Minh", "30/03/1999", 1f));
		students.add(new Student(3, "La", "15/03/1999", 6f));
		students.add(new Student(4, "Mot", "17/03/1999", 10f));
		students.add(new Student(11, "Gia", "10/03/1999", 2f));
		students.add(new Student(6, "Dinh", "05/03/1999", 4f));
		
		System.out.println("====================Comparable====================");
		System.out.println("Truoc khi sap xep: ");
		showStudent(students);
		
		System.out.println("Sau khi sap xep: ");
		Collections.sort(students);
		showStudent(students);
		
		System.out.println("====================Comparator====================");
		System.out.println("Sau khi sap xep: ");
		students.sort((s1, s2) -> {
			
			if (s1.getName().compareTo(s2.getName()) > 0) {
				return 1;
			}
			else if (s1.getName().compareTo(s2.getName()) < 0) {
				return -1;
			} else {
				if (s1.getDateOfBirth().compareTo(s2.getDateOfBirth()) > 0) {
					return 1;
				}
				else if (s1.getDateOfBirth().compareTo(s2.getDateOfBirth()) < 0) {
					return -1;
				}
				else {
					return (int) (s1.getGpa() - s2.getGpa());
				}
			}
			
		});
		
		showStudent(students);
		
		
	}
	
	public static void showStudent(List<Student> students)
	{
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	

	
	
	
	
	
}











