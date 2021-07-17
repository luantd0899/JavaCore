/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserReponsitory;
import com.vti.backend.datalayer.UserReponsitory;
import com.vti.entity.User;

/**
 * @author luant
 *
 */
public class UserService implements IUserService {

	private IUserReponsitory iUserReponsitory;

	public UserService() {
		iUserReponsitory = new UserReponsitory();
	}

	public List<User> getListUser() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		return iUserReponsitory.getListUser();
	}

	public void findUserById(int id) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		iUserReponsitory.findUserById(id);

	}

	public void deleteUserById(int id) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserReponsitory.deleteUserById(id);;

	}

	public int logIn(String email, String password, String role)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		 return iUserReponsitory.logIn(email, password, role);

	}

	public void logOut() {
		// TODO Auto-generated method stub

	}

	public void addUser(String role, String fullName, String email, int expInYear)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserReponsitory.addUser(role, fullName, email, expInYear);

	}

	public void addUser(String role, String fullName, String email, String proSkill)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserReponsitory.addUser(role, fullName, email, proSkill);

	}

	public void changePasswordById(int id, String newPassword)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		iUserReponsitory.changePasswordById(id, newPassword);
		
	}

}
