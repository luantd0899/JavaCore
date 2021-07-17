/**
 * 
 */
package com.vti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author luant
 *
 */

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Column(name = "AccountID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short accountId;
	
	@Column(name = "WorkingNumberOfYear", nullable = false)
	private short workingNumberOfYear;
	
	public Employee() {
		
	}

	public short getAccountId() {
		return accountId;
	}

	public void setAccountId(short accountId) {
		this.accountId = accountId;
	}

	public short getWorkingNumberOfYear() {
		return workingNumberOfYear;
	}

	public void setWorkingNumberOfYear(short workingNumberOfYear) {
		this.workingNumberOfYear = workingNumberOfYear;
	}
	
	
	
}
