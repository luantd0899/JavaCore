/**
 * 
 */
package com.vti.entity;

import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class Admin extends User{
	private int expInYear;
	
	public Admin()
	{
		super();
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
	@Override
	public void input()
	{
		super.input();
		System.out.println("Nhap so nam kinh nghiem: ");
		this.expInYear = ScannerUtils.inputInt("ban phai nhap so, moi nhap lai!");
	}

	@Override
	public String toString() {
		return "Admin [expInYear=" + expInYear + ", getExpInYear()=" + getExpInYear() + ", getId()=" + getId()
				+ ", getFullname()=" + getFullname() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

	
}
