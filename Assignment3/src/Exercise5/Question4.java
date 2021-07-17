/**
 * 
 */
package Exercise5;

/**
 * @author luant
 *
 */
public class Question4 {
	public static void main(String[] args) {
		Department department = new Department();
		department.departmentId = 1;
		department.departmentName = "Phong A";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Phong B";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Phong C";
		
		Department department4 = new Department();
		department4.departmentId = 4;
		department4.departmentName = "Phong D";
		
		Department departments[]  = {department, department2, department3, department4};
		
		for (int i = 0; i < departments.length; i++) {
			
			if (departments[i].departmentName.equals("Phong A")) {
				System.out.println(departments[i]);
			}
			
		}
		
		
		
		
		
		
	}
}
