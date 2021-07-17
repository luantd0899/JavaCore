/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.Salary;
import com.vti.repository.SalaryRepository;

/**
 * @author luant
 *
 */
public class SalaryTest {
	public static void main(String[] args) {
		SalaryRepository salaryRepository = new SalaryRepository();
		
		List<Salary> salaries = salaryRepository.getAllSalaries();
		
		for (Salary salary : salaries) {
			System.out.println(salary);
		}
	}
}
