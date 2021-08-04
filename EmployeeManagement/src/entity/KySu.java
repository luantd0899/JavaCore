package entity;

import java.util.Scanner;

public class KySu extends CanBo{
    private String major;

    public KySu() {
        super();
    }

    public KySu(int id, String name, int age, String gender, String address, String major) {
        super(id, name, age, gender, address);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Major: ");
        this.major = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + this.major;
    }
}
