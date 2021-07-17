/**
 * 
 */
package com.vti.entity.ex1.question3;

/**
 * @author luant
 *
 */
public class MyMath {
	public static int max(int a, int b)
	{
		if (a<b) {
			return b;
		}
		else {
			return a;
		}
		
	}
	
	public static int sum (int a, int b)
	{
		return a+b;
	}
	
	public static int min(int a, int b)
	{
		return a > b ? b : a;
	}
}
