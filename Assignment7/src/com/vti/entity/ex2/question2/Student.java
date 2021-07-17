/**
 * 
 */
package com.vti.entity.ex2.question2;

import java.util.Scanner;

import org.omg.IOP.ComponentIdHelper;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author luant
 *
 */
public class Student {
	
	private final int id =5;
	private String name;
	
	
	public Student() {
		
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	// Question 234
	
	public static final void study()
	{
		System.out.println("Dang hoc bai!!!");
	}
	
	@Override
	public String toString() {
		String result = "ID: " + id + "\n " + "Name: " + name;
		return result;
	}
	
	
	
	
}
