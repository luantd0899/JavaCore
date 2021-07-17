/**
 * 
 */
package com.vti.entity.ex4Question2;

/**
 * @author luant
 *
 */
public class Account {
	private String id;
	private String name;
	private int balance;
	
	
	public Account(String id, String name, int balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int credit(int amount)
	{
		return balance + amount;
	}
	public int debit(int amount)
	{
		return this.balance - amount ;
	}
	
	public void tranferTo(Account account, int amount)
	{
		debit(amount);
		account.credit(amount);
	}
	
}
