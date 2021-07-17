/**
 * 
 */
package com.vti.program;

import java.util.List;
import com.vti.entity.User;
import com.vti.repository.UserRepopsitory;



public class App {
	public static void main(String[] args) {
		UserRepopsitory userRepopsitory = new UserRepopsitory();
		
		List<User> users = userRepopsitory.getAllUsers();
		
		for (User user : users) {
			System.out.println(user);
		}
	}
}
