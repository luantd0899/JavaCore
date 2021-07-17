/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class Employee extends User{
	private int projectId;
	private String proSkill;
	
	public Employee()
	{
		
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	@Override
	public String toString() {
		super.toString();
		String result = "ProjectID: " + projectId
					+	"\n"	+ "ProSkill: " + proSkill;
		return result;
	}
	
	
}
