/**
 * 
 */
package com.vti.frontend.ex1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		AccountController accountController = new AccountController();
		System.out.println("Nhap name: ");
		String username = ScannerUtils.inputString("Khong dc de trong");
		System.out.println("Nhap pass: ");
		String password = ScannerUtils.inputString("Khong dc de trong");
		accountController.login(username, password);
	}
}

