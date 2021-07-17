/**
 * 
 */
package Exercise4;

/**
 * @author luant
 *
 */
public class Question10 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "holle";
		String revert = "";
		
		for (int i = s1.length(); i >0; i--) {
			revert += s2.charAt(i);
		}
		
		if (revert.equals(s1)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
