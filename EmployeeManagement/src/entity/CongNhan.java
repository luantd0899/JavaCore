package entity;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int level;

    public CongNhan() {
        super();
    }

    public CongNhan(int id, String name, int age, String gender, String address, int level) {
        super(id, name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap level: ");
        this.level = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + ", Level: " + this.level;
    }
}
