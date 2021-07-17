package com.vti.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detaildepartment database table.
 * 
 */
@Entity
@Table(name="detaildepartment")
@NamedQuery(name="Detaildepartment.findAll", query="SELECT d FROM Detaildepartment d")
public class Detaildepartment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private byte departmentID;

	private byte emulationPoint;

	//bi-directional one-to-one association to Department
	@OneToOne
	@JoinColumn(name="DepartmentID", nullable=false, insertable=false, updatable=false)
	private Department department;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="AddressID")
	private Address address;

	public Detaildepartment() {
	}

	public byte getDepartmentID() {
		return this.departmentID;
	}

	public void setDepartmentID(byte departmentID) {
		this.departmentID = departmentID;
	}

	public byte getEmulationPoint() {
		return this.emulationPoint;
	}

	public void setEmulationPoint(byte emulationPoint) {
		this.emulationPoint = emulationPoint;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}