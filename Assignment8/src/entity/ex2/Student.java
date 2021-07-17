/**
 * 
 */
package entity.ex2;

/**
 * @author luant
 *
 */
public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String dateOfBirth;
	private float gpa;

	public Student(int id, String name, String date, float gpa) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = date;
		this.gpa = gpa;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gpa=" + gpa + "]";
	}
	
	

}
