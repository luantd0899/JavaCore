/**
 * 
 */
package com.vti.entity;

import java.time.LocalDate;

/**
 * @author luant
 *
 */
public class Group {
	private int groupId;
	private String groupName;
	private int creatorId;
	private LocalDate createDate;
	private Account[] accounts;
	
	
	public Group() {
		
	}


	public Group(int groupId, String groupName, int creatorId, LocalDate createDate, Account[] accounts) {
		
		this.groupId = groupId;
		this.groupName = groupName;
		this.creatorId = creatorId;
		this.createDate = createDate;
		this.accounts = accounts;
	}


	public int getGroupId() {
		return groupId;
	}


	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public int getCreatorId() {
		return creatorId;
	}


	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	
	
	
	
	
}
