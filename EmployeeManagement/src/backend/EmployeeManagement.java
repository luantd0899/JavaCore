package backend;

import entity.CanBo;
import entity.CongNhan;
import entity.KySu;
import entity.NhanVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement implements IEmployeeManagement {

    private List<CanBo> canBos;
    private Scanner scanner;

    public EmployeeManagement() {
        canBos = new ArrayList<>();
        canBos.add(new CongNhan(100, "luan tran duc ", 20, "Male", "Nam Dinh", 9));
        canBos.add(new CongNhan(101, "nam nguyen ngoc", 20, "Male", "Nam Dinh", 9));
        canBos.add(new CongNhan(102, "ha tran thi", 20, "Male", "Nam Dinh", 9));
        scanner = new Scanner(System.in);
    }

    @Override
    public void addCanBo() {

        CanBo canBo = null;
        boolean x = true;
        while (x){
            System.out.println("Ban muon them can bo nao: ");
            System.out.println("1- Cong nhan; 2- Ky su; 3- Nhan vien; 0- Back");
            System.out.println("Moi ban chon: ");
            int choose = scanner.nextInt();

            switch (choose){
                case 1:
                    canBo = new CongNhan();
                    canBo.inputInfo();
                    canBos.add(canBo);
                    break;

                case 2:
                    canBo = new KySu();
                    canBo.inputInfo();
                    canBos.add(canBo);
                    break;

                case 3:
                    canBo = new NhanVien();
                    canBo.inputInfo();
                    canBos.add(canBo);
                    break;

                case 0:
                    x = false;
                    break;

                default:
                    System.out.println("Ban da nhap sai, moi nhap lai!");
                    break;


            }
        }
    }

    @Override
    public void timKiemTheoTen() {
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        List<CanBo> list = new ArrayList<>();
        for (CanBo c :
                canBos) {
            if (c.getName().contains(name)){
                list.add(c);
            }
        }

        //

        for (CanBo cb: list) {
            System.out.println(cb);
        }
    }

    @Override
    public void hienThiThongTin() {
        for (CanBo cb :
                canBos) {
            System.out.println(cb);
        }
    }

    @Override
    public void xoaCanBo() {
        System.out.println("Nhap id can bo can xoa: ");
        int id = scanner.nextInt();

        if (!isCanBoExsist(id)){
            System.out.println("Khong tim thay CanBo");
        }else {
            for (CanBo cb : canBos) {
                if (cb.getId() == id)
                canBos.remove(cb);
            }
        }
    }

    private boolean isCanBoExsist(int id){
        for (CanBo canbo:
             canBos) {
            if (canbo.getId() == id)
                return true;
        }
        return false;
    }


}
