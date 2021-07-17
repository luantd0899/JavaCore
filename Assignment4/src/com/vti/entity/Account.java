/**
 * 
 */
package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author luant
 *
 */
public class Account {
	private int accouintId;
	private String email;
	private String username;
	private String fullName;
	private Department departmentId;
	private Position positionId;
	private LocalDate createDate;
	private Group[] groups;
	
	
	
	public Account() {
		
	}



	public Account(int accouintId, String email, String username, String fullName, Department departmentId,
			Position positionId, LocalDate createDate, Group[] groups) {
		
		this.accouintId = accouintId;
		this.email = email;
		this.username = username;
		this.fullName = fullName;
		this.departmentId = departmentId;
		this.positionId = positionId;
		this.createDate = createDate;
		this.groups = groups;
	}
	
	
	public void setAccountId(int accountId)
	{
		this.accouintId = accountId;
	}
	
	public int getAccountId() {
		return accouintId;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	
	public String getFullName()
	{
		return fullName;
	}
	
	public void setDepartmentId(Department departmentId)
	{
		this.departmentId = departmentId;
	}
	
	public Department getDepartmentId()
	{
		return departmentId;
	}
	
	public Position getPositionId() {
		return positionId;
	}



	public void setPositionId(Position positionId) {
		this.positionId = positionId;
	}



	public LocalDate getCreateDate() {
		return createDate;
	}



	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}



	public Group[] getGroups() {
		return groups;
	}



	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	
	
	
	
	
}
