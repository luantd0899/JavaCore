/**
 * 
 */
package entity.ex3.question1;

import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Student<T> {
	private T id;
	private String name;
	
	public Student(T id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {

	this.id = id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

	
}