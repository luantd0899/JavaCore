/**
 * 
 */
package com.vti.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "DetailDepartment")
@PrimaryKeyJoinColumn(name = "DepartmentID")   // Cot trong SQL
public class DetailDepartment extends Department implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
//	@Column(name = "DepartmentID")
//	@Id
//	private short departmentId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AddressID", referencedColumnName = "AddressID")
	//@Column(name = "AddressId", nullable = false, unique = true)
	private Address address;
	
	@Column(name = "EmulationPoint")
	private short emulationPoint;
	
	public DetailDepartment(){
		
	}

//	public short getDepartmentId() {
//		return departmentId;
//	}
//
//	public void setDepartmentId(short departmentId) {
//		this.departmentId = departmentId;
//	}

	

	public short getEmulationPoint() {
		return emulationPoint;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setEmulationPoint(short emulationPoint) {
		this.emulationPoint = emulationPoint;
	}

	@Override
	public String toString() {
		
		return super.toString() + ", address=" + address.getName() + ", emulationPoint=" + emulationPoint + "]";
	}
	
	

}
