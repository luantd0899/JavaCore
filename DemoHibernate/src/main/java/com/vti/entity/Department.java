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

/**
 * @author luant
 *
 */

@Entity
@Table(name = "Department", catalog = "Testing_System_Assignment1")
public class Department implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "DepartmentId")
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "DepartmentName",length = 100, nullable = false, unique = false)
	private String name;
	
	public Department()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
