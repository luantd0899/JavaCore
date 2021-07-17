/**
 * 
 */
package Exercise5;

/**
 * @author luant
 *
 */
public class Question5 {
	public static void main(String[] args) {
		Department department = new Department();
		department.departmentId = 1;
		department.departmentName = "Phong A";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Phong A";
		
		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Phong C";
		
		Department department4 = new Department();
		department4.departmentId = 4;
		department4.departmentName = "Phong D";
		
		Department departments[]  = {department, department2};
		
		for (int i = 0; i < departments.length-1; i++) {
			
			if (departments[i].departmentName.equals(departments[i+1].departmentName)) {
				System.out.println("Yes");
			}
			
			else {
				System.out.println("No");
			}
			
		}
	}
}
