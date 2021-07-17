/**
 * 
 */
package entity.ex2.question2;

/**
 * @author luant
 *
 */
public class Student {
	
	private static int counter = 0;
	private int id;
	private String name;
	
	public Student() {
		counter++;
		this.id = counter;
	}

	/**
	 *	@deprecated replace by {@link #getId2(Student)}}
	 *
	 */
	@Deprecated
	public int getId() {
		return id;
	}
	
	public String getIdV2() {
		return "MSV: " + id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

	
	
	
	
	
	
}
