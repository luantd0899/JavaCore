/**
 * 
 */
package com.vti.entity;

import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class User {
	
	private static int count = 0;
	
	private int id;
	private String fullname;
	private String email;
	private String password;
	
	public User()
	{
		count++;
		this.id = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	
	public void input()
	{
		System.out.println("ID: " + id);
		
		System.out.println("Nhap fullname: " );
		this.fullname = ScannerUtils.inputFullName();
		
		System.out.println("Nhap email: ");
		this.email = ScannerUtils.inputEmail();
		
		System.out.println("Nhap password: ");
		this.password = ScannerUtils.inputPassword();
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}
