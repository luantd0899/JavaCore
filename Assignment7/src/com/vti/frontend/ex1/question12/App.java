/**
 * 
 */
package com.vti.frontend.ex1.question12;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.ex1.question1.Question12;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		Question12 question12 = new Question12(1, "luan");
		Question12 question122 = new Question12(2, "nam");
		Question12 question123 = new Question12(3, "ha");
		
		List<Question12> question12s = new ArrayList<Question12>();
		for (Question12 question124 : question12s) {
			System.out.println(question124);
		}
	}
}
