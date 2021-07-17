/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class Admin extends User{
	
	private int expInYear;

	public Admin(int id, String fullName, String email, String password, int expInYear) {
		super(id, fullName, email, password, Role.ADMIN);
		this.expInYear = expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [ExpInYear=" + expInYear + ", getId()=" + getId() + ", getFullName()=" + getFullName()
		+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
		+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
		+ "]";
	}

	
	
	
	
}
