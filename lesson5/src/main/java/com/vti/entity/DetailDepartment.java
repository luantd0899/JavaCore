/**
 * 
 */
package com.vti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author luant
 *
 */

@Entity
@Table(name = "DetailDepartment")
@PrimaryKeyJoinColumn(name = "DepartmentID")
public class DetailDepartment extends Department {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "AddressID")
	private short addressId;
	
	@Column(name = "EmulationPoint")
	private short emulationPoint;
	
	public DetailDepartment() {
		
	}

	public short getAddressId() {
		return addressId;
	}

	public void setAddressId(short addressId) {
		this.addressId = addressId;
	}

	public short getEmulationPoint() {
		return emulationPoint;
	}

	public void setEmulationPoint(short emulationPoint) {
		this.emulationPoint = emulationPoint;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());;
		return "DetailDepartment [addressId=" + addressId + ", emulationPoint=" + emulationPoint + "]";
	}


	
	
}
