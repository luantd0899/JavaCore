package entity;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String work;

    public NhanVien() {
        super();
    }

    public NhanVien(int id, String name, int age, String gender, String address, String work) {
        super(id, name, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Work: ");
        this.work = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Work: " + this.work;
    }
}
