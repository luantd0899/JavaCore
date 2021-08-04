package entity;

import java.util.Scanner;

public  class CanBo {
    private static int count = 0;

    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;


    public CanBo() {
        this.id = ++count;
    }

    public CanBo(int id, String name, int age, String gender, String address) {

        this.id = ++count;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("Male")){
            this.gender = "Male";
        }else if (gender.equalsIgnoreCase("Female")){
            this.gender = "Female";
        }else if (gender.equalsIgnoreCase("Other")){
            this.gender = "Unknown";
        }else {
            System.out.println("Ban da nhap sai, moi nhap lai!");
            inputInfo();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        System.out.println("ID: " + this.id);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap name:" );
        this.name = scanner.nextLine();

        System.out.println("Nhap Age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhap gioi tinh: ");
        setGender(scanner.nextLine());

        System.out.println("Nhap Address: ");
        this.address = scanner.nextLine();
    }

    @Override
    public String toString() {
        String result = "ID: " + this.id + ", Name: " + this.name;
        return  result;
    }
}
