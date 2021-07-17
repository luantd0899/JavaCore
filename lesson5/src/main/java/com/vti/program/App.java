/**
 * 
 */
package com.vti.program;

import java.util.List;

import com.vti.entity.Department;
import com.vti.entity.DetailDepartment;
import com.vti.repository.DepartmentRepository;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		DepartmentRepository departmentRepository = new DepartmentRepository();
		
		List<DetailDepartment> departments = departmentRepository.getAllDepartments();
		
		for (DetailDepartment department : departments) {
			System.out.println(department);
		}
	}
}
