/**
 * 
 */
package Exercise2;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author luant
 *
 */
public class Account {
	public int accouintId;
	public String email;
	public String username;
	public String fullName;
	
	@Override
	public String toString() {
		
		String result = "ID: " + accouintId + "\n" + "Email: " + email + "\n" + "Username: " + username;
		return result;
	}
	
	
	
	
	
}
