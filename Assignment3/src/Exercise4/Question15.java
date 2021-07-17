/**
 * 
 */
package Exercise4;

/**
 * @author luant
 *
 */
public class Question15 {
	public static void main(String[] args) {
		String  string = "ban an cut";
		string = string.trim();
		
		String []s1 = string.split(" ");
		String []s2 = new String[s1.length];
		
		for(int i =0 ; i<s1.length; i++)
		{
			System.out.print(s1[i] + " ");
		}
		
		int k =0;
		for (int j = s2.length -1; j >= 0; j--) {
				s2[j] = s1[k];
				k++;
		}
		
		System.out.println();
		for(int i = 0 ; i<s2.length; i++)
		{
			System.out.print(s2[i] + " ");
		}
	
	}
}
