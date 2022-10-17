package com.vti.demofinalexamjavacore.entity;

public class Admin extends Userr{
	

	private int expInYear;

	public Admin(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
	
	
	
	
}
