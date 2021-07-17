/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.DetailDepartment;
import com.vti.repository.DetailDepartmentRepository;

/**
 * @author luant
 *
 */
public class DetailDepartmentTest {
	public static void main(String[] args) {
		DetailDepartmentRepository departmentRepository = new DetailDepartmentRepository();
		
		List<DetailDepartment> departments = departmentRepository.getAllDepartments();
		for (DetailDepartment detailDepartment : departments) {
			System.out.println(detailDepartment);
		}
	}
}
