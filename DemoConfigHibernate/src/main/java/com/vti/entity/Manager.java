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
@Table(name = "`Manager`")
@PrimaryKeyJoinColumn(name = "AccountID")
public class Manager extends Account implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ManagementNumberOfYear", nullable = false)
	private short managementNumberOfYear;
	
	public Manager() {
		super();
	}

	public short getManagementNumberOfYear() {
		return managementNumberOfYear;
	}

	public void setManagementNumberOfYear(short managementNumberOfYear) {
		this.managementNumberOfYear = managementNumberOfYear;
	}

	@Override
	public String toString() {
		return "Manager [managementNumberOfYear=" + managementNumberOfYear + "]";
	}
	
	
}
