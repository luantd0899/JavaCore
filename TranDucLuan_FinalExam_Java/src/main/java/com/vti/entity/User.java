/**
 * 
 */
package com.vti.entity;

/**
 * @author luant
 *
 */
public class User {
	
	private int id;
	private String fullName;
	private String email;
	private String password;
	private String role;
	
	public User()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		String result = "ID: " + id 
				+	"\n" + "FullName: " + fullName
				+	"\n" + "Email: "	+ email
				+	"\n" +	"Role: "	+ role;	
		
		return result;
	}

}
