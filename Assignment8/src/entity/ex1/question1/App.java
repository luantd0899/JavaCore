/**
 * 
 */
package entity.ex1.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		Student student1 = new Student(1,"Luan");	
		Student student2 = new Student(2,"Luan");
		Student student3 = new Student(3,"Luan");
		Student student4 = new Student(4,"Nam");
		Student student5 = new Student(5,"Ha");
		Student student6 = new Student(6,"Viet");
		Student student7 = new Student(7,"Anh");
		Student student8 = new Student(8,"Em");
		Student student9 = new Student(9,"Minh");
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		
		showStudentList(students);
		
		
		
		// tong so phan tu
		System.out.print("Tong so phan tu: " + students.size());
		System.out.println();
		
		System.out.println("Lay phan tu thu 4:");
		layPhantuThu4(students);
		
		// Lay pt dau va cuoi
		System.out.println("lay phan tu dau va cuoi: ");
		inPhantuDauVaCuoi(students);
		
		// them Phan tu vao vi tri dau va cuoi
		themPhanTu(students);
		
		// Dao nguoc List
		System.out.println("== Dao  nguoc List");
		daoNguocList(students);
		
		// tim Student by ID
		findStudentById(students);
		
		// Find student by Name
		findStudentByName(students);
		
		// show Student which like name;
		showStudentLikeName(students);
		
		//Xoa ten cua Student co id =2;
		
		
		
	}
	public static void showStudentList(List<Student> students)
	{
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public static void layPhantuThu4(List<Student> students)
	{
		Student student = students.get(3);
		System.out.println(student);
	}
	
	public static void inPhantuDauVaCuoi(List<Student> students)
	{
		Student student = students.get(0);
		Student student2 = students.get(students.size()-1);
		
		System.out.println("Phan tu dau");
		System.out.println(student );
		
		System.out.println("Phan tu cuoi");
		System.out.println(student2);
	}
	
	public static void themPhanTu(List<Student> students)
	{
		System.out.println("Them phan tu vao vi tri dau cua List:");
		List<Student> firstStudents = new ArrayList<Student>();
		Student firstStudent = new Student(1111, "Tran Duc Luan");
		firstStudents.add(firstStudent);
		students.addAll(0, firstStudents);
		showStudentList(students);
		
		
		System.out.println("Them phan tu vao vi tri cuoi cua List:");
		List<Student> lastStudents = new ArrayList<Student>();
		Student lastStudent = new Student(9999, "Tran Duc Nam");
		lastStudents.add(lastStudent);
		students.addAll(students.size(), lastStudents);
		
		showStudentList(students);
		
	}
	
	public static void daoNguocList(List<Student> students)
	{
		Collections.reverse(students);
		showStudentList(students);
	}
	
	public static void findStudentById(List<Student> students)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id: ");
		int id = scanner.nextInt();
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				System.out.println(students.get(i));
			}
		}
	}
	
	public static void findStudentByName(List<Student> students)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap name: ");
		String name = scanner.nextLine();
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().contains(name)) {
				System.out.println(students.get(i));
			}
		}
	}
	
	public static void showStudentLikeName(List<Student> students)
	{
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = 1; j < students.size(); j++) {
				if (students.get(i).getName().equalsIgnoreCase(students.get(j).getName())) {
					System.out.println(students.get(i) + "\n" +  students.get(j));
				}
			}
		}
	}
	
	public static void deleteStudentName(List<Student> students)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id can xoa: ");
		int id = scanner.nextInt();
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.get(i).setName("");
			}
		}
	}
	
	public static void deleteStudent(List<Student> students)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap id can xoa: ");
		int id = scanner.nextInt();
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.remove(students.get(i));
			}
		}
	}
	
	public static void addListToList(List<Student> students)
	{
		List<Student> studentCopies = new ArrayList<Student>();
		studentCopies.addAll(0, students);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
