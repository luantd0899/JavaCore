/**
 * 
 */
package com.vti;

import java.util.List;
import java.util.Scanner;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

/**
 * @author luant
 *
 */
public class program {
	public static void main(String[] args) {
		DepartmentRepository departmentRepository = new DepartmentRepository();
		List<Department> departments = departmentRepository.getAllDepartments();
		
		System.out.println("==========Get All Department==========");
		for (Department department : departments) {
			System.out.println(department);
		}
		
		System.out.println("Nhap id: ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("==========Get Department By ID==========");
		Department department = departmentRepository.getDepartmentById(id);
		System.out.println(department);
		
		System.out.println("==========Get Department By Name==========");
		
		Department department2 = departmentRepository.getDepartmentByName("HR");
		System.out.println(department2);
		
//		System.out.println("==========Create Department==========");
//		Department department3 = new Department();
//		department3.setName("LEuLEu");
//		departmentRepository.createDepartment(department3);
		
		
//		System.out.println("==========Update Department==========");
//		departmentRepository.updateDepartment(4, "Security0");
		
//		System.out.println("==========Update Department2==========");
//		Department department4 = departmentRepository.getDepartmentById(4);
//		//department4.setName("HR");
//		//departmentRepository.updateDepartment2(department4);
		
		
		System.out.println("==========Delete Department==========");
		departmentRepository.deleteDepartment(9);
		
	}
}
