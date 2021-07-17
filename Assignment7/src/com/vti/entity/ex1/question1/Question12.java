/**
 * 
 */
package com.vti.entity.ex1.question1;

/**
 * @author luant
 *
 */
public class Question12 {
	private static String college = "Dai hoc back khoa";
	private int id;
	private String name;
	
	

	public Question12(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String result = "ID: " + id + "\n" + "Name: " + name + "College" + college;
		return result;
	}
	
	
}