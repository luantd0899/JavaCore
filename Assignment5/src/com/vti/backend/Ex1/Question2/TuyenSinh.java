/**
 * 
 */
package com.vti.backend.Ex1.Question2;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import com.vti.entity.Ex1.Question2.ThiSinh;

/**
 * @author luant
 *
 */
public class TuyenSinh implements ITuyenSinh{
	private List<ThiSinh> thiSinhs;
	Scanner scanner;
	
	
	public TuyenSinh()
	{
		thiSinhs = new ArrayList<ThiSinh>();
		scanner = new Scanner(System.in);
	}
	
	
	@Override
	public void addThiSinh() {
		System.out.println("Nhap so thi sinh ma ban muon them: ");
		int n = scanner.nextInt();
		ThiSinh thiSinh = new ThiSinh();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu: " + (i+1));
			thiSinh.input();
			thiSinhs.add(thiSinh);
		}
		
	}

	@Override
	public void showThiSinh() {
		int a =1;
		for (ThiSinh thiSinh : thiSinhs) {
			System.out.println("Thi sinh thu: " + a);
			thiSinh.output();
			a++;
		}
		
	}

	@Override
	public void searchThiSinh() {
		System.out.println("Nhap so bao danh cua thi sinh: ");
		int id = scanner.nextInt();
		int count = 0;
		for (ThiSinh thiSinh : thiSinhs) {
			if (thiSinh.getSoBD() == id) {
				thiSinh.output();
				count++;
			}
		}
		if (count ==0) {
			System.out.println("Khong tim thay thi sinh");
		}
		
	}
}
