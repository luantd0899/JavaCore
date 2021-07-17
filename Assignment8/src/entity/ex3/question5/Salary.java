/**
 * 
 */
package entity.ex3.question5;

/**
 * @author luant
 *
 */
public class Salary<T> {
 	
	private T salary;

	public Salary(T salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}
	
	
	
	
	
}
