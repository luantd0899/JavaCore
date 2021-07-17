/**
 * 
 */
package Exercise4;

/**
 * @author luant
 *
 */
public class Question6 {
	public static void main(String[] args) {
		String name = "Tran Duc Luan";
		name = name.trim();
		
		String [] array = name.split(" ");
		String firstname = array[0];
		String lastname = array[array.length-1];
		String middlename = "";
		
		for (int i = 1; i < array.length-1; i++) {
			middlename += array[i] + " "; 
		}
		
		System.out.println("First Name: " + firstname);
		System.out.println("Middle Name: " + middlename);
		System.out.println("Last Name: " + lastname);
	}
}
