/**
 * 
 */
package entity.ex2.question11;

import java.time.LocalDate;


import java.util.Date;

import backend.question11.InvalidAgeInputingException;
import utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class Account {
	private int accouintId;
	private String email;
	private String username;
	private String fullName;
	private int age;
	public Date createDate;
	
	public Account()
	{
		input();
	}
	
	private void input()
	{
		System.out.println("Nhap id: ");
		accouintId = ScannerUtils.inputInt("Please input a number, Again!!!");
		
		System.out.println("Nhap email: ");
		email = ScannerUtils.inputString("Please input a string, Again!!!");
		
		System.out.println("Nhap username: ");
		username = ScannerUtils.inputString("Please input a string, Again!!!");
		
		System.out.println("Nhap fullName: ");
		fullName = ScannerUtils.inputString("Please input a string, Again!!!");
		
		System.out.println("Nhap tuoi: ");
		age = inputAccoutnAge();
		
	}
	//Question11: Khi người dùng nhập vào tuổi <= 0 thì throw ra Exception  
	//InvalidAgeInputingException với message là: "The age must be greater than 0"
	
	private int inputAge() throws InvalidAgeInputingException
	{
		while(true)
		{
			int age = ScannerUtils.inputInt("Please input a number, Again!!!");
			if (age < 0) {
				throw new InvalidAgeInputingException("Tuoi phai lon hon 0, Again!!!");
			}
			else {
				return age;
			}
		}
	}
	
//	Question 12: Tiếp tục Question 11
//	Trong class Account. Sử dụng method inputAge() từ ScannerUtils, hãy viết method inputAccountAge() với yêu cầu như sau:
//	Khi hệ thống gặp exception InvalidAgeInputingException thì sẽ in ra message.
//	Và khi người dùng nhập vào tuổi < 18 thì in ra text "Your age must be greater than 18" và yêu cầu người dùng nhập lại tuổi
	
	private int inputAccoutnAge() // must greater than 17
	{
		while(true)
		{
			try {
				int a = inputAge();
				
				if (a < 18) {
					System.out.println("Age must be greater than 17");
				}
				else {
					return age;
				}
			} catch (InvalidAgeInputingException e) {
				System.out.println(e.getMessage());
			
		}
	}
	}
	
	@Override
	public String toString() {
		return "Account{" + "id=" + accouintId + ", email='" + email + '\'' + ", username='" + username + '\'' + ", fullname='"
				+ fullName + '\'' + ", age=" + age + '}';
	}
	
}
