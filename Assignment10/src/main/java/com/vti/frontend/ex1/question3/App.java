/**
 * 
 */
package com.vti.frontend.ex1.question3;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.ex1.question3.CreatePosition;



/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		CreatePosition createPosition = new CreatePosition();
		createPosition.newPosition();
	}
}
