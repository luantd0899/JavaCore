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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author luant
 *
 */

@Entity
@Table(name = "Department")
@Inheritance(strategy = InheritanceType.JOINED)
public class Department implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "DepartmentID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "DepartmentName", length = 30, nullable = false, unique = true)
	private String departmentName;
	
	public Department() {
		
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
	
	
	
}
