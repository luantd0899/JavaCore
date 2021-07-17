/**
 * 
 */
package com.vti.backend.Ex2.Question1;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Ex2.Question1.Student;

/**
 * @author luant
 *
 */
public class StudentManagement {
	private Student[] students;
	
	
	public StudentManagement()
	{
		students = new Student[10];
	}
	
	public void init()
	{
		students[0] = new Student(1, "Luan", 1);
		students[1] = new Student(2, "Uyen", 1);
		students[2] = new Student(3, "Nam", 1);
		students[3] = new Student(4, "Ha", 2);
		students[4] = new Student(5, "Viet", 2);
		students[5] = new Student(6, "Anh", 2);
		students[6] = new Student(7, "Em", 3);
		students[7] = new Student(8, "Linh", 3);
		students[8] = new Student(9, "Phong", 3);
		
	}
	
	public void allDiemDanh()
	{
		for (Student student : students) {
			student.diemDanh();
		}
	}
	
	public void nhomHocBai()
	{
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGroup() == 1) {
				students[i].hocBai();
			}
		}
	}
	
	public void nhomDonVeSinh()
	{
		for (int i = 0; i < students.length; i++) {
			if (students[i].getGroup() == 2) {
				students[i].donVeSinh();
			}
		}
	}
	
}
