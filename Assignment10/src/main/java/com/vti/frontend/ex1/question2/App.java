/**
 * 
 */
package com.vti.frontend.ex1.question2;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.ex1.question2.GetInforPosition;



/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		
		GetInforPosition getInforPosition = new GetInforPosition();
		getInforPosition.getInforPosition();
	}
}
