/**
 * 
 */
package frontend.ex1.question2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.ex1.question2.ShowPostion;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		ShowPostion showPostion = new ShowPostion();
		showPostion.getInforPosition();
	}
}
