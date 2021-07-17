/**
 * 
 */
package entity;

import java.sql.Date;

/**
 * @author luant
 *
 */
public class GroupAccount {
	private Group groupID;
	private Account accountID;
	private Date joinDate;
	
	
	public GroupAccount() {
		super();
	}


	public GroupAccount(Group groupID, Account accountID, Date joinDate) {
		super();
		this.groupID = groupID;
		this.accountID = accountID;
		this.joinDate = joinDate;
	}


	public Group getGroupID() {
		return groupID;
	}


	public void setGroupID(Group groupID) {
		this.groupID = groupID;
	}


	public Account getAccountID() {
		return accountID;
	}


	public void setAccountID(Account accountID) {
		this.accountID = accountID;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
