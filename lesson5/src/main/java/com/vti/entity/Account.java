package com.vti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Account")
public class Account 
{
	@Column(name = "AccountID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private short accountId;
	
	@Column(name = "Email", length = 50, nullable = false, unique = true)
    private String email;
	
	@Column(name = "Username", length = 50, nullable = false, unique = true)
    private String username;
    
    public Account() {
    	
    }

	public short getAccountId() {
		return accountId;
	}

	public void setAccountId(short accountId) {
		this.accountId = accountId;
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
    
    
}
