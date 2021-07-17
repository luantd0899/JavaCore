/**
 * 
 */
package com.vti.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

/**
 * @author luant
 *
 */
public class Account {
	int accouintId;
	String email;
	String username;
	String fullName;
	int departmentId;
	int positionId;
	Date createDate;
	Group[] groups;
	public int getAccouintId() {
		return accouintId;
	}
	public void setAccouintId(int accouintId) {
		this.accouintId = accouintId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroups() {
		return groups;
	}
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "Account [accouintId=" + accouintId + ", email=" + email + ", username=" + username + ", fullName="
				+ fullName + ", departmentId=" + departmentId + ", positionId=" + positionId + ", createDate="
				+ createDate + ", groups=" + Arrays.toString(groups) + "]";
	} 
	
	
	
	
	
	
}
