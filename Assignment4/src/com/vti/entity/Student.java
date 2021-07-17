/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class Student {
	private int count = 0;

	private int id;
	private String name;
	private String hometown;
	private float gpa;
	
	public Student()
	{
		
	}
	
	public Student(String name, String hometown)
	{
		this.id = ++count;
		this.name = name;
		this.hometown = hometown;
		this.gpa = 0;
	}
	
	public void setGpa(float gpa)
	{
		if (gpa >=0 && gpa <=10) {
			this.gpa = gpa;
		}
	}
	
	public Float getGpa()
	{
		return gpa;
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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	
	public void plusGpa(float gpa)
	{
		if ((this.gpa+gpa) <=10) {
			this.gpa += gpa;
		}
	}
	
	@Override
	public String toString() {
		String level = "";
		if (gpa < 4) {
			level = "Yếu";
		}
		else if(gpa >=4 && gpa <6)
		{
			level = "Trung bình";
		}
		
		else if(gpa >=6 && gpa <8)
		{
			level = "Khá";
		}
		else {
			level = "Giỏi";
		}
		String result = "Name: " + name + "\n" + "Hometown: " + hometown + "\n" + "GPA: " + gpa + "\n" + "Level: " + level;
		
		return result;
	}
}	
