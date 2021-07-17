/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vti.entity.enumerate.ESalaryName;

@Entity
@Table(name = "`Salary`")
public class Salary implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "SalaryID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short salaryId;
	
	@Column(name = "SalaryName", nullable = false, unique = true)
	private ESalaryName salaryName;
	
	public Salary() {
		
	}

	public short getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(short salaryId) {
		this.salaryId = salaryId;
	}

	public ESalaryName getSalaryName() {
		return salaryName;
	}

	public void setSalaryName(ESalaryName salaryName) {
		this.salaryName = salaryName;
	}

	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", salaryName=" + salaryName + "]";
	}
	
	

}
