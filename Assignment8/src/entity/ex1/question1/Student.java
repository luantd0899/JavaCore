/**
 * 
 */
package entity.ex1.question1;

/**
 * @author luant
 *
 */
public class Student {
	
	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		String result = "ID: " + id + "\n" + "Name: " + name;
		return result;
	}
	
	
	
	
	
	
}
