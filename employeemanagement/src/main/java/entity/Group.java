/**
 * 
 */
package entity;

import java.sql.Date;

/**
 * @author luant
 *
 */
public class Group {
	private int groupID;
	private String groupName;
	private Date createDate;
	
	
	public Group() {
		super();
	}


	public Group(int groupID, String groupName, Date createDate) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
		this.createDate = createDate;
	}


	public int getGroupID() {
		return groupID;
	}


	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
