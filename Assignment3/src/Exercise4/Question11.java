/**
 * 
 */
package Exercise4;

/**
 * @author luant
 *
 */
public class Question11 {
	public static void main(String[] args) {
		String string = "Xin chao Viet nam a a a";
		demSoKyTu(string);
	}
	
	public static void demSoKyTu(String string)
	{
		int count = 0;
		String []bString = string.split("");
		for (int i = 0; i < bString.length; i++) {
			if (bString[i].equals("a")) {
				count++;
			}
		}
		System.out.println("So lan xuat hien cua ky tu 'a' trong chuoi: " + count);
	}
}
