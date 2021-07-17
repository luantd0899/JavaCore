package com.vti.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private byte accountID;

	@Column(nullable=false)
	private byte workingNumberOfYear;

	//bi-directional one-to-one association to Account
	@OneToOne
	@JoinColumn(name="AccountID", nullable=false, insertable=false, updatable=false)
	private Account account;

	public Employee() {
	}

	public byte getAccountID() {
		return this.accountID;
	}

	public void setAccountID(byte accountID) {
		this.accountID = accountID;
	}

	public byte getWorkingNumberOfYear() {
		return this.workingNumberOfYear;
	}

	public void setWorkingNumberOfYear(byte workingNumberOfYear) {
		this.workingNumberOfYear = workingNumberOfYear;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}