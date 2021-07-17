/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.Account;
import com.vti.repository.AccountRepository;

/**
 * @author luant
 *
 */
public class AccountTest {
	public static void main(String[] args) {
		AccountRepository accountRepository = new AccountRepository();
		
		List<Account> accounts = accountRepository.getAllAccounts();
		
		for (Account account : accounts) {
			System.out.println(account);
		}
	}
}	
