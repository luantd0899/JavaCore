/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author luant
 *
 */
@Embeddable
public class UserGroupPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private short userId;
	
	private short groupId;
	
	public UserGroupPK(){
		
	}

	public short getUserId() {
		return userId;
	}

	public void setUserId(short userId) {
		this.userId = userId;
	}

	public short getGroupId() {
		return groupId;
	}

	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}
	
	
	
}
