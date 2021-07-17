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
	public void getInfor()
	{
		super.getInfor();
		System.out.println("So nam kinh nghiem: " + expInYear);
	}
}
