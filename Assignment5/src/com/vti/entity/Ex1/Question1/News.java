/**
 * 
 */
package com.vti.entity.Ex1.Question1;

import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author luant
 *
 */
public class News implements INews {

	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	@Override
	public void display() {

		System.out.println("ID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Publish Date: " + publishDate);
		System.out.println("Author: " + author);
		System.out.println("Content: " + content);
		System.out.println("Average Rate: " + averageRate);

	}

	@Override
	public float calculate(int[] rate) {
		int tong = 0;
		for (int i = 0; i < rate.length; i++) {
			tong += rate[i];
		}
		averageRate = tong / rate.length;

		return averageRate;

	}
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ID: " );
		id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhap Title: ");
		title = scanner.nextLine();
		
		System.out.println("Nhap publish date: ");
		publishDate = scanner.nextLine();
		
		System.out.println("Nhap Author: ");
		author = scanner.nextLine();
		
		System.out.println("Nhap content: ");
		content = scanner.nextLine();
		
		System.out.println("Nhap average rate: ");
		averageRate = scanner.nextFloat();
	
	}

}
