/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.Employee;
import com.vti.repository.EmployeeRepository;

/**
 * @author luant
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		
		List<Employee> employees = employeeRepository.getAllEmployees();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
