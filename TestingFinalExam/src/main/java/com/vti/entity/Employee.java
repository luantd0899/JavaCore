/**
 * 
 */
package com.vti.entity;

import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class Employee extends User{
	private String proSkill;

	
	public Employee()
	{
		super();

	}


	public String getProSkill() {
		return proSkill;
	}


	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	
	@Override
	public void getInfor()
	{
		super.getInfor();
		System.out.println("Ky nang chuyen mon: " + proSkill);
	}
	
}
