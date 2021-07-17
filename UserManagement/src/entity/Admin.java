package entity;

import java.util.Scanner;

public class Admin extends User{
		private int expInYear;
		
		
		public Admin() {
			
		}


		public Admin(int expInYear) {
			super();
			this.expInYear = expInYear;
		}


		public int getExpInYear() {
			return expInYear;
		}


		public void setExpInYear(int expInYear) {
			this.expInYear = expInYear;
		}
		
		
		@Override
		public void input()
		{
			super.input();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("= Nhập số năm kinh nghiệm: ");
			expInYear = scanner.nextInt();
		}
		
		
		@Override
		public void getInfor()
		{
			super.getInfor();
			
			System.out.println("= Exp In Year: " + expInYear);
		}
}
