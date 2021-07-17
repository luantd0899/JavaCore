/**
 * 
 */
package com.vti.backend.Ex1.Question1;

import com.vti.entity.Ex1.Question1.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * @author luant
 *
 */
public class MyNews implements IMyNews {

	private List<News> newss;
	private Scanner scanner;
	
	
	
	public MyNews() {
		newss = new ArrayList<com.vti.entity.Ex1.Question1.News>();
		scanner = new Scanner(System.in);
	}

	@Override
	public void insertNews() {
		System.out.println("Nhap so tin tuc ma ban muon them: ");
		int n = scanner.nextInt();
		News news = new News();
		for (int i = 0; i < n; i++) {
			System.out.println("Tin tuc thu: " + (i+1));
			news.input();
			newss.add(news);
			System.out.println("===");
		}
		
		
	}

	@Override
	public void viewListNews() {
		int a = 1;
		for (News news : newss) {
			System.out.println("Tin tuc thu: "+ a);
			news.display();
			a++;
			System.out.println("===");
		}
		
	}

	@Override
	public void averageRate() {
		News news = new News();
		System.out.print("Nhap so luong cac so de tinh trung binh: ");
		int n = scanner.nextInt();
		int []number = new int[n];
		for (int i = 0; i < number.length; i++) {
			System.out.println("Nhap so thu: " + (i+1));
			number[i] = scanner.nextInt();
		}
		System.out.println("Average Rate: " + news.calculate(number));;
		
		
	}
	
}
