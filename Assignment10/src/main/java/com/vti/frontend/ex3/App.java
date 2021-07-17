/**
 * 
 */
package com.vti.frontend.ex3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.ex2.DepartmentDAO;
import com.vti.backend.ex3.CallProcedure;
import com.vti.entity.ex2.Department;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		CallProcedure callProcedure = new CallProcedure();
		System.out.println("Nhap id can xoa: ");
		int id = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!!!");
		callProcedure.deleteDepartmentByID(id);
		
		
		List<Department> departments = new DepartmentDAO().getListDepartment();
		for (Department department : departments) {
			System.out.println(department);
		}
	}
}	
