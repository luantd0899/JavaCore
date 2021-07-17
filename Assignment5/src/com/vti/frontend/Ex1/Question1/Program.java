/**
 * 
 */
package com.vti.frontend.Ex1.Question1;

import java.util.Scanner;


import com.sun.glass.ui.Menu;
import com.sun.org.apache.regexp.internal.recompile;
import com.vti.backend.Ex1.Question1.MyNews;


/**
 * @author luant
 *
 */
public class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MyNews myNews = new MyNews();
		System.out.println("==========News==========");
		menu();
		System.out.println("========================");
		do {
			System.out.print("Moi ban nhap lua chon: ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				myNews.insertNews();
				break;
				
			case 2:
				myNews.viewListNews();
				break;
				
			case 3:
				myNews.averageRate();
				break;
				
				case 0:
					return;

			default:
				System.out.println("Ban da nhap sai, moi nhap lai!!");
				break;
			}
			System.out.println("===================================");
		} while (true);
	}
	
	public static void menu()
	{
		System.out.println("1. Insert View");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("0. Exit");
	}
}
