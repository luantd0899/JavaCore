package com.vti.demofinalexamjavacore.entity;

public class Employee extends Userr{
	
	private String proSkill;

	public Employee(int id, String fullName, String email, String password, String proSkill) {
		super(id, fullName, email, password);
		this.proSkill = proSkill;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	
}
