/**
 * 
 */
package entity.ex2.question9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Department {
	
	
	private Scanner scanner;
	private int departmentId;
	private String departmentName;
	
	public Department(int departmentId, String departmentName) throws Exception {
		
		scanner = new Scanner(System.in);
		this.departmentId = inputId();
		this.departmentName = inputName();
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	private int inputId() throws Exception
	{
		try {
			System.out.println("Input ID: ");
			int id = scanner.nextInt();
			return id;
		} catch (Exception e) {
			throw new Exception("Please input number!!!");
		}
	}
	
	private String inputName() throws Exception
	{
		try {
			System.out.println("Please input DepartmentName: ");
			String name = scanner.nextLine();
			return name;
			
		} catch (Exception e) {
			throw new Exception("Input Wrong, Again!!!!");
		}
	}
	
	
	
}
