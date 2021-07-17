/**
 * 
 */
package Exercise5;

/**
 * @author luant
 *
 */
public class Department {
	int departmentId;
	String departmentName;
	

	@Override
	public String toString() {
		String result = "ID: " + departmentId + "\n" + "Name: " + departmentName;
		return result;
	}
}
