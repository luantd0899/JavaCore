package entity;

import java.util.Scanner;

public class User {
	
		private static int counter = 100;
		private int id;
		private String fullName;
		private String email;
		private String password;
		
		public User()
		{
			id = counter++;
		}

		public User(int id, String fullName, String email, String password) {
			
			this.id = id;
			this.fullName = fullName;
			this.email = email;
			this.password = password;
		}

		public static int getCounter() {
			return counter;
		}

		public static void setCounter(int counter) {
			User.counter = counter;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
		public void input()
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("= ID : " + id);
			id = scanner.nextInt();
			
			System.out.println("= Nhập Fullname: " );
			fullName = scanner.nextLine();
			
			System.out.println("= Nhập Email: ");
			email = scanner.nextLine();
			
			System.out.println("= Nhập Password: ");
			password = scanner.nextLine();
		}
		
		public void getInfor()
		{
			System.out.println("= ID: " + id);
			System.out.println("= Fullname: " + fullName);
			System.out.println("= Email: " +email);
			System.out.println("= Password: " + password);
		}
		
}
