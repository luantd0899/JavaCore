/**
 * 
 */
package entity.ex2.question3;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			int a[] = {1,2,3};
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Khong co phan tu trong mang");
		}
	}
	
	
}
