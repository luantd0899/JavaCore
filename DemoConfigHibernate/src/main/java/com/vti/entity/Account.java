/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;


@Entity
@Table(name = "`Account`")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "AccountID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short accountId;
	
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(name = "Username", length = 50, nullable =  false, unique = true)
	private String username;
	
	@Column(name = "FirstName", length = 50, nullable = false)
	private String firstName;
	
	@Column(name = "LastName", length = 50, nullable = false)
	private String lastName;
	
	@Formula("concat(FirstName, ' ', LastName)")
	private String fullName;
	
	@ManyToOne
	@JoinColumn(name = "DepartmentID", nullable = false)
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "PositionID", nullable = false)
	private Position positionId;
	
	//private Salary salaryId;
	
	@Column(name = "CreateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createDate;
	
	@OneToMany(mappedBy = "creator")
	private List<Group> createdGroup;
	
	@OneToMany(mappedBy = "account")
	private List<GroupAccount> groups;
	
	
	// Getter Setter
	public List<GroupAccount> getGroups() {
		return groups;
	}
	public void setGroups(List<GroupAccount> groups) {
		this.groups = groups;
	}
	public List<Group> getCreatedGroup() {
		return createdGroup;
	}
	public void setCreatedGroup(List<Group> createdGroup) {
		this.createdGroup = createdGroup;
	}
	
	public short getAccountId() {
		return accountId;
	}
	public void setAccountId(short accountId) {
		this.accountId = accountId;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPositionId() {
		return positionId;
	}
	public void setPositionId(Position positionId) {
		this.positionId = positionId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	// To String
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", username=" + username + ", firstName="
				+ firstName + ", lastName=" + lastName + ", fullName=" + fullName + ", department=" + department.getDepartmentName()
				+ ", position=" + positionId.getPositionName() + ", createDate=" + createDate + ", Group= " + createdGroup;
	}
	
	
	
}
