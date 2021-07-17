/**
 * 
 */
package Exercise5;

/**
 * @author luant
 *
 */
public class Question3 {
	public static void main(String[] args) {
		Department department = new Department();
		department.departmentId = 1;
		department.departmentName = "Sale";
		
		System.out.println(department.hashCode());
	}
}
