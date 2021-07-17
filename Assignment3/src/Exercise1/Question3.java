/**
 * 
 */
package Exercise1;

/**
 * @author luant
 *
 */
public class Question3 {
	public static void main(String[] args) {
		int a = 234567;
		
		
		// Convert to String
		String string = String.valueOf(a);
		char s1 = string.charAt(string.length()-1);
		char s2 = string.charAt(string.length()- 2);
		System.out.println("Hai so cuoi: " + s2 + s1);
		System.out.println("-----------");
		
		// /100
		int result = a % 100;
		System.out.println("Hai so cuoi: " + result);
	} 
}
