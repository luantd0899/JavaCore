/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountResponsitory;
import com.vti.backend.datalayer.IAccountResponsitory;
import com.vti.entity.Account;

/**
 * @author luant
 *
 */
public class AccountService implements IAccountService{
	
	private IAccountResponsitory iAccountResponsitory;
	
	public AccountService()
	{
		iAccountResponsitory = new AccountResponsitory();
	}
	
	
	public List<Account> getListAccount() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		return iAccountResponsitory.getListAccount();
	}
	
	
	public void login(String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		AccountResponsitory accountResponsitory = new AccountResponsitory();
		accountResponsitory.login(username, password);
	}

	
	
}
