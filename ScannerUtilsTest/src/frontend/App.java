/**
 * 
 */
package frontend;

import java.util.Scanner;

import backend.TestScanner;
import entity.ScannerUtils;

/**
 * @author luant
 *
 */
public class App {
	public static void main(String[] args) {
		TestScanner testScanner = new TestScanner();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap so luong student ban muon add!!!");
		int number = ScannerUtils.inputInt("Ban phai nhap so, moi nhap lai!!");
		for (int i = 0; i < number; i++) {
			System.out.println("Nhap ten: ");
			testScanner.nhapTen();
			
			System.out.println("Nhap tuoi: ");
			testScanner.nhapTuoi();
			
			System.out.println("Nhap email: ");
			testScanner.nhapEmail();
		}
	}
}
