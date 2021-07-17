/**
 * 
 */
package com.vti.frontend.Ex2.Question1;

import java.util.ArrayList;
import java.util.List;

import com.vti.backend.Ex2.Question1.StudentManagement;
import com.vti.entity.Ex2.Question1.Student;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		
		StudentManagement studentManagement = new StudentManagement();
		studentManagement.init();
		studentManagement.allDiemDanh();
		studentManagement.nhomHocBai();
		studentManagement.nhomDonVeSinh();
		
		
	}
}
