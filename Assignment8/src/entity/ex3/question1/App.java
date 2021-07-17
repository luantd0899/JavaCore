/**
 * 
 */
package entity.ex3.question1;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		printStudent();
	}
	
	public static void printStudent()
	{
			Student<Integer> student = new Student<Integer>(1, "Luan");
			System.out.println(student.getId());
			System.out.println(student.getName());
			
			
			Student<Float> student2 = new Student<Float>(2f, "Nam");
			Student<Double> student3 = new Student<Double>(4.0, "Ha");
		
	}
}
