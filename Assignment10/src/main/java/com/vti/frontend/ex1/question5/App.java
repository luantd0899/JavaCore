/**
 * 
 */
package com.vti.frontend.ex1.question5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.ex1.question5.DeletePosition;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		DeletePosition deletePosition = new DeletePosition();
		deletePosition.deletePosition();
	}
}
