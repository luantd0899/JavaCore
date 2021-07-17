/**
 * 
 */
package Exercise2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 * @author luant
 *
 */
public class Question1 {
	public static void main(String[] args) {
		
		
		Account accounts[] = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			System.out.println("User " +(i+1) );
			System.out.println(accounts[i].email = "Email" + (i+1));
			System.out.println(accounts[i].username = "Username" + (i+1));
			
		}
	}
}	
