/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserResponsitory;
import com.vti.backend.datalayer.UserResponsitory;
import com.vti.entity.User;

/**
 * @author luant
 *
 */

// Class UserService trỏ đến tầng DataLayer nên sẽ gọi được các phương thức trong tầng Datalayer;
public class UserService implements IUserService{
	
	private IUserResponsitory iUserResponsitory;
	
	public UserService()
	{
		iUserResponsitory = new UserResponsitory();
	}
	
	
	public List<User> getListUser() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return iUserResponsitory.getListUser();
	}

	public void findUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserResponsitory.findUserById(id);
		
	}

	public void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserResponsitory.deleteUserById(id);
		
	}

	// trỏ đến phương thức add - Admin ( int expInYear)
	public void addUser(String fullname, String email, String role, int expInYear)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserResponsitory.addUser(fullname, email, role, expInYear);
		
	}

	// trỏ đến phương thức add - Employee ( String proSkill)
	public void addUser(String fullname, String email, String role, String proSkill)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserResponsitory.addUser(fullname, email, role, proSkill);
		
	}

	public void login(String role, String email, String password)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserResponsitory.login(role, email, password);
		
	}

}
