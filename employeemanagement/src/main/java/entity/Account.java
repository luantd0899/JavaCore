/**
 * 
 */
package entity;

import java.sql.Date;

/**
 * @author luant
 *
 */
public class Account {
	private int accountID;
	private String email;
	private String username;
	private String password;
	private String fullName;
	private Department departmentID;
	private Position positionID;
	private Date createDate;
	
	
	public Account() {
		super();
	}


	public Account(int accountID, String email, String username, String password, String fullName,
			Department departmentID, Position positionID, Date createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createDate = createDate;
	}


	public int getAccountID() {
		return accountID;
	}


	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Department getDepartmentID() {
		return departmentID;
	}


	public void setDepartmentID(Department departmentID) {
		this.departmentID = departmentID;
	}


	public Position getPositionID() {
		return positionID;
	}


	public void setPositionID(Position positionID) {
		this.positionID = positionID;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
