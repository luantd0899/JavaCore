/**
 * 
 */
package backend;

import java.util.Scanner;

import entity.ScannerUtils;

/**
 * @author luant
 *
 */
public class TestScanner {
	
	
	private Scanner scanner;

	public TestScanner() {
		scanner = new Scanner(System.in);
		
	}
	
	public void nhapTen()
	{
		System.out.println(ScannerUtils.inputFullName());
	}
	
	public void nhapTuoi()
	{
		System.out.println(ScannerUtils.inputAge());
	}
	public void nhapEmail()
	{
		System.out.println(ScannerUtils.inputEmail());
	}
	
	
	
	
	
}
