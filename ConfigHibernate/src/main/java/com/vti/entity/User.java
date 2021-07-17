package com.vti.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.vti.entity.Convert.GenderConverter;
import com.vti.entity.Convert.RoleConverter;
import com.vti.entity.Enum.EGender;
import com.vti.entity.Enum.ERole;



@Entity
@Table(name = "User")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "username", length = 50, nullable = false, unique = true)
	private String username;

	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;

	@Column(name = "password", length = 800, nullable = false)
	private String password;

	@Column(name = "firstName", length = 50, nullable = false)
	private String firstName;

	@Column(name = "lastName", length = 50, nullable = false)
	private String lastName;

	@Column(name = "gender", nullable = false)
	@Convert(converter = GenderConverter.class)
	private EGender gender;

	@Column(name = "date_Of_Birth", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name = "address", length = 100, nullable = false)
	private String address;

	@Column(name = "phone", length = 15, nullable = false, unique = true)
	private String phone;

	@Column(name = "role", nullable = false)
	@Convert(converter = RoleConverter.class)
	private ERole role;

	@Column(name = "status")
	private short status;
	
	@OneToOne(mappedBy = "author")
	private Group group;
	
	public User() {

	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EGender getGender() {
		return gender;
	}

	public void setGender(EGender gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ERole getRole() {
		return role;
	}

	public void setRole(ERole role) {
		this.role = role;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}
	
	

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", date=" + date
				+ ", address=" + address + ", phone=" + phone + ", role=" + role + ", status=" + status + ", Group" + group + " ]";
	}

}
