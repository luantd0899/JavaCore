/**
 * 
 */
package Exercise5;

/**
 * @author luant
 *
 */
public class Question6 {
	public static void main(String[] args) {
		String departments[] = {"Accounting", "Boss of director", "Marketing", "Sale", "Waiting room"};
		
		for (int i = 0; i < departments.length ; i++) {
			for (int j = 0; j < departments.length -1; j++) {
				if (departments[i].compareToIgnoreCase(departments[j]) < 0 ) {
					String temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i]);
		}
	}
}
