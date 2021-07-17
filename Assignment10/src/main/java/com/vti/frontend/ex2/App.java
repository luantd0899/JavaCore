/**
 * 
 */
package com.vti.frontend.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.ex2.DepartmentDAO;
import com.vti.entity.ex2.Department;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		
		// Test oke
		question1();
		
		
	}
	
	private static void question1() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		List<Department> departments = new DepartmentDAO().getListDepartment();
		for (Department department : departments) {
			System.out.println(department);
		}
	}
	
	
	// Question 2,3
	private static void question2() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		System.out.println("Input department id: ");
		int id = ScannerUtils.inputInt("Ban phai nhap so lon hon 0, moi nhap lai");

		List<Department> department = new DepartmentDAO().getDepartmentsByID();
		System.out.println(department);
	}
	
	// Question 4
	private static void question4() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		System.out.println("Input departmentName: ");
		String name = ScannerUtils.inputString("Khong dc de trong, moi nhap lai");
		
		boolean result  = new DepartmentDAO().checkNameDepartment(name);
		System.out.println(result);
	}
	
	// Question 5
	private static void question5() throws Exception
	{
		System.out.println("Input department Name: ");
		String name = ScannerUtils.inputString("Khong dc de trong");

		DepartmentDAO departmentDAO = new DepartmentDAO();
		departmentDAO.createDepartment(name);
		System.out.println("create success!");
	}
	
	// Question 6
	private static void question6() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception
	{
		System.out.println("Input department id: ");
		int id = ScannerUtils.inputInt("Ban phai nhap so lon hon khong, moi nhap lai!!!");

		System.out.println("Input department new name: ");
		String newName = ScannerUtils.inputString("Khong dc de trong");

		new DepartmentDAO().updateDepartmentName(id, newName);
		System.out.println("update success!");
	}
	
	 // Question 7
	private static void question7() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException, Exception {
		System.out.println("Input department id: ");
		int id = ScannerUtils.inputInt("ban phai nhap so lon hon 0");

		new DepartmentDAO().deleteDepartmentByID(id);
		System.out.println("delete success!");
	}
	
}
