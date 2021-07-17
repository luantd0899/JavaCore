/**
 * 
 */
package com.vti.frontend.ex2.question2;

import com.vti.entity.ex2.question2.Student;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("luan");
		
		System.out.println(student);
		Student.study();
	}
}
