/**
 * 
 */
package com.vti.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.vti.entity.Account;


@Entity
@Table(name = "`Group`")
public class Group {
	
	@Column(name = "GroupID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short groupId;
	
	@Column(name = "GroupName", length = 50, nullable = false, unique = true)
	private String groupName;
	
	@ManyToOne
	@JoinColumn(name = "CreatorID", nullable = false)
	private Account creator;
	
	@Column(name = "CreateDate", updatable = false)
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private Date createDate;
	
	
	@OneToMany(mappedBy = "group")
	private List<GroupAccount> accounts;

	public List<GroupAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<GroupAccount> accounts) {
		this.accounts = accounts;
	}

	public short getGroupId() {
		return groupId;
	}

	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", creator=" + creator.getFullName() + ", createDate="
				+ createDate + "]";
	}
	
	
}
