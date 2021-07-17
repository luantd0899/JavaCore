package entity;

import java.util.Scanner;

public class Employee extends User{
		private String proSkill;
		
		
		public Employee()
		{
			
		}


		public Employee(String proSkill) {
			super();
			this.proSkill = proSkill;
		}


		public String getProSkill() {
			return proSkill;
		}


		public void setProSkill(String proSkill) {
			this.proSkill = proSkill;
		}
		
		
		@Override
		public void input()
		{
			super.input();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("= Nhập ProSkill: ");
			proSkill = scanner.nextLine();
		}
		
		@Override
		public void getInfor()
		{
			super.getInfor();
			
			System.out.println("= ProSkill: " + proSkill);
		}
}
