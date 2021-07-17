/**
 * 
 */
package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Ex5.CanBo;
import com.vti.entity.Ex5.CongNhan;
import com.vti.entity.Ex5.Gender;
import com.vti.entity.Ex5.KySu;
import com.vti.entity.Ex5.NhanVien;

/**
 * @author luant
 *
 */
public class QLCB {
	Scanner scanner;
	
	private List<CanBo> canBos;
	
	public QLCB()
	{
		canBos =  new ArrayList<CanBo>();
		scanner = new Scanner(System.in);
	}
	
	public List<CanBo> getCanBos() {
		return canBos;
	}

	public void setCanBos(List<CanBo> canBos) {
		this.canBos = canBos;
	}

	public void addCanBo()
	{
		CanBo canBo = new CanBo();
		System.out.println("Moi ban nhap vao loai can bo muon them: ");
		System.out.println("1. Cong nhan");
		System.out.println("2. Ky su");
		System.out.println("3. Nhan vien");
		
		int choose = scanner.nextInt();
		scanner.nextLine();
		
		switch (choose) {
		case 1:
			
			canBo = new CongNhan();
			canBo.input();
			canBos.add(canBo);
			break;
			
		case 2:
			canBo = new KySu();
			canBo.input();
			canBos.add(canBo);
			break;
			
		case 3:
			canBo = new NhanVien();
			canBo.input();
			canBos.add(canBo);
			break;

		default:
			System.out.println("Ban da chon sai, moi chon lai!");
			break;
		}
		
		
		
	}
	
	public void timKiemTheoTen()
	{
		System.out.print("Moi ban nhap ten can bo: ");
		String name = scanner.nextLine();
		
		for (CanBo canBo : canBos) {
			if (canBo.getName().equalsIgnoreCase(name.trim())) {
				System.out.println(canBo);
				
			}
			else {
				System.out.println("Khong co ten phu hop, moi ban nhap lai");
			}
		}
	}
	
	public void hienThiThongTin()
	{
		for (CanBo canBo : canBos) {
			System.out.println(canBo);
		}
	}
	
	public void xoaCanBo()
	{
		System.out.println("Nhap ID cua can bo mun xoa: ");
		int id = scanner.nextInt();
		for (CanBo canBo : canBos) {
			if (canBo.getId() == id) {
				canBos.remove(canBo);
			}
		}
	}
}
