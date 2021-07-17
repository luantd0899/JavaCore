/**
 * 
 */
package Exercise5;



/**
 * @author luant
 *
 */
public class Question2 {
	public static void main(String[] args) {
		Department department = new Department();
		department.departmentId = 1;
		department.departmentName = "Sale";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Marketting";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "HR";
		Department[] departments = {department, department2, department3};
		
		for (int i = 0; i < departments.length; i++) {
			
			System.out.println(departments[i]);
		}
	}
}
