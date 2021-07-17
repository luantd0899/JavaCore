/**
 * 
 */
package entity.ex3.question5;

import java.util.Arrays;

/**
 * @author luant
 *
 */
public class Employee<T> {
	private int id;
	private String name;
	private Salary<T> [] salaries;
	
	

	
	
	
	public Employee(int id, String name, Salary<T>[] salaries) {
		super();
		this.id = id;
		this.name = name;
		this.salaries = salaries;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Salary<T>[] getSalaries() {
		return salaries;
	}


	public void setSalaries(Salary<T>[] salaries) {
		this.salaries = salaries;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaries=" + Arrays.toString(salaries) + "]";
	}

	public T getFinalSalary()
	{
		return (T) salaries[salaries.length - 1];
	}



	
	
	
}
