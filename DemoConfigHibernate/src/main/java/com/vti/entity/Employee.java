/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "`Employee`")
@PrimaryKeyJoinColumn(name = "AccountID")
public class Employee extends Account implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "WorkingNumberOfYear", nullable = false)
	private short workingNumberOfYear;
	
	public Employee() {
		super();
	}

	public short getWorkingNumberOfYear() {
		return workingNumberOfYear;
	}

	public void setWorkingNumberOfYear(short workingNumberOfYear) {
		this.workingNumberOfYear = workingNumberOfYear;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", workingNumberOfYear=" + workingNumberOfYear + "]";
	}
	
	

}
