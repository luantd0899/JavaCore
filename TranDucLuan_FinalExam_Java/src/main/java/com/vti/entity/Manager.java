/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class Manager extends User{
	private int expInYear;

	public Manager()
	{
		
	}
	
	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}
	
	@Override
	public String toString() {
		super.toString();
		String result = "ExpInYear: " + expInYear;
		return result;
	}
	
	
}
