/**
 * 
 */
package entity.ex2.question10;


import java.util.Date;

import com.sun.xml.internal.bind.v2.model.core.ID;


import utils.ScannerUtils;

/**
 * @author luant
 *
 */
public class Group {
	int groupId;
	String groupName;
	int creatorId;
	Date createDate;
	Account[] accounts;
	
	public Group()
	{
		accounts = new Account[100];
		
	}
	
	private void input()
	{
		System.out.println("Nhap id: ");
		groupId = ScannerUtils.inputInt("Please input number, Again!!!");
		
		System.out.println("Nhap ten: ");
		groupName = ScannerUtils.inputString("Please input a group name, Again!!!");
		confirmAddAccount();
		
	}
	
	private void confirmAddAccount()
	{
		System.out.println("Ban co muon add Account 0(1- Co; 2- Khong): ");
		int choose;
		while(true)
		{
			choose = ScannerUtils.inputInt("Please input number, Again!!!");
			switch(choose)
			{
			case 1:
				return;
				
			case 2:
				addAccount();
				return;
				
				default:
					System.out.println("Chi duoc nhap 1 hoac 2, moi nhap lai!");
					break;
			}
			
		}
	}
	
	private void addAccount()
	{
		System.out.println("Nhap so luong Account: ");
		int n = ScannerUtils.inputInt("Please input number, Again!!!");
		for (int i = 0; i < n; i++) {
			accounts[i] = new Account();
		}
	}
	
	@Override
	public String toString() {
		String result = "Group { id = " + groupId + ", GroupName = '" + groupName + '\''
				+ ", accounts= " + accounts.toString() + ", CreateDate = " +createDate + '}';
		return result;
	}
	
}
