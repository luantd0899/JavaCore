/**
 * 
 */
package entity.ex2.question4;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args){
		try {
			String department[] = {"department1", "department2", "department3"};
			getIndex(department);
		} catch (Exception e) {
			System.out.println("Khong tim thay phan tu trong mang!!!!!!");
		}
	}
	
	public static void getIndex(String department[]) throws Exception
	{
		int index = 5;
		if (index > department.length) {
			throw new Exception("khong tim thay phan tu trong mang.");
		}
	}
}
