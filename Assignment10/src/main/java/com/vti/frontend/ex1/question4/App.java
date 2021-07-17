/**
 * 
 */
package com.vti.frontend.ex1.question4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.ex1.question4.UpdatePosition;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		UpdatePosition updatePosition = new UpdatePosition();
		updatePosition.updatePositionn();
	}
}
