/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

/**
 * @author luant
 *
 */
public interface IAccountResponsitory {
	public void login(String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	public List<Account> getListAccount() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
}
