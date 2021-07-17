/**
 * 
 */
package com.vti.backend;

import com.*;
import com.vti.entity.Student;

/**
 * @author luant
 *
 */
public class Exercise4 {
	public void Question1()
	{
		float gpa = 1;
		float gpa2 = 9;
		Student student  = new Student("Luan", "Nam Dinh");
		student.setGpa(gpa);
		student.plusGpa(gpa2);
		System.out.println(student);
	}
}

