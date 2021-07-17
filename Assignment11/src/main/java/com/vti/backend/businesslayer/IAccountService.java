/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

/**
 * @author luant
 *
 */
public interface IAccountService {
	
	public List<Account> getListAccount() throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;
	public void login(String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
}
