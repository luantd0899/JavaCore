/**
 * 
 */
package com.vti.test;

import java.util.List;

import com.vti.entity.GroupAccount;
import com.vti.repository.GroupAccountRepository;

/**
 * @author luant
 *
 */
public class GroupAccountTest {
	public static void main(String[] args) {
		GroupAccountRepository groupAccountRepository = new GroupAccountRepository();
		
		List<GroupAccount> groupAccounts = groupAccountRepository.getAllGroupAccounts();
		
		for (GroupAccount groupAccount : groupAccounts) {
			System.out.println(groupAccount);
		}
	}
}
