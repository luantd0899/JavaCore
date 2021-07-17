/**
 * 
 */
package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;

/**
 * @author luant
 *
 */
public class AccountController {
	
	private IAccountService iAccountService;
	
	public AccountController()
	{
		iAccountService = new AccountService();
	}
	
	public void getListAccount() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException
	{
		
		iAccountService.getListAccount();
		
	}
	
	public void login(String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{
		iAccountService.login(username, password);
	}
	
}
