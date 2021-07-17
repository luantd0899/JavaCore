/**
 * 
 */
package com.vti.backend;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.Sach;
import com.vti.entity.TaiLieu;
import com.vti.entity.TapChi;

/**
 * @author luant
 * @param <E>
 *
 */
public class QLTL implements IQLTL{

	private List<TaiLieu> taiLieus;
	Scanner scanner;

	public QLTL() {
		taiLieus = new ArrayList<TaiLieu>();
		scanner = new Scanner(System.in);
	}

	public void addTaiLieu() {
		TaiLieu taiLieu = new TaiLieu();
		System.out.println("Ban muon them tai lieu nao:");
		menuu();
		int menu = scanner.nextInt();

		switch (menu) {
		case 1:
			taiLieu = new Sach();
			taiLieu.input();
			taiLieus.add(taiLieu);
			break;

		case 2:
			taiLieu = new Bao();
			taiLieu.input();
			taiLieus.add(taiLieu);
			break;

		case 3:
			taiLieu = new TapChi();
			taiLieu.input();
			taiLieus.add(taiLieu);
			break;

		default:
			System.out.println("Ban da nhap sai, moi nhap lai");
			break;
		}
		
		System.out.println("Them tai lieu thanh cong!!!!!");
	}

	public void deleteTaiLieu() {
		
		System.out.println("Nhap ma tai lieu can xoa: ");
		int ma = scanner.nextInt();
		for (TaiLieu taiLieu : taiLieus) {
			if (taiLieu.getMaTaiLieu() == ma) {
				taiLieus.remove(taiLieu);
			}
		}
		System.out.println("Xoa tai lieu thanh cong!!!!");
	}

	
	public void showTaiLieu() {
		int a = 0;
		for (TaiLieu taiLieu : taiLieus) {
			a++;
			System.out.println("==========");
			System.out.println("Tai lieu thu: " + a);
			taiLieu.output();
		}
	}

	public void searchTaiLieu() {
		System.out.println("Ban muon tim kiem loai tai lieu nao: ");
		menuu();
		int choose = scanner.nextInt();
		switch(choose)
		{
			case 1:
				for (TaiLieu taiLieu : taiLieus) {
					if (taiLieu instanceof Sach) {
						taiLieu.output();
					}
				}
				break;
			case 2:
				for (TaiLieu taiLieu : taiLieus) {
					if (taiLieu instanceof Bao) {
						taiLieu.output();
					}
				}
				break;
				
			case 3:
				for (TaiLieu taiLieu : taiLieus) {
					if (taiLieu instanceof TapChi) { // instanceoof: check kieu doi tuong
						taiLieu.output();
					}
				}
				break;
		}
	}

	public void menuu() {
		System.out.println("1. Sach.");
		System.out.println("2. Bao.");
		System.out.println("3. Tap chi.");
	}

}
