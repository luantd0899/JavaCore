/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author luant
 *
 */

@Entity
public class UserGroup implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private UserGroupPK entryId;
	
	public UserGroup() {
		
	}

	public UserGroupPK getEntryId() {
		return entryId;
	}

	public void setEntryId(UserGroupPK entryId) {
		this.entryId = entryId;
	}
	
	
}
