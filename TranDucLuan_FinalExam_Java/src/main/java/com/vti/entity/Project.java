/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class Project {
	private int projectId;
	private int teamSize;
	private int idManager;
	private int idEmployee;
	
	public Project()
	{
		
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public int getIdManager() {
		return idManager;
	}
	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	
	@Override
	public String toString() {
		String result = "ProjectID: " + projectId
				+	"\n"	+ "TeamSize:" +teamSize
				+	"\n"	+ "IDManager: " + idManager
				+	"\n"	+ "IDEmployee: "	+idEmployee;
		return result;
	}
	
	
}
