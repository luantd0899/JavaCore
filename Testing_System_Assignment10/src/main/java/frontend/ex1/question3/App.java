/**
 * 
 */
package frontend.ex1.question3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.ex1.question2.ShowPostion;
import backend.ex1.question3.InputPosition;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		InputPosition inputPosition = new InputPosition();
		inputPosition.inputPosition();
		
		ShowPostion showPostion = new ShowPostion();
		showPostion.getInforPosition();
	}
}
