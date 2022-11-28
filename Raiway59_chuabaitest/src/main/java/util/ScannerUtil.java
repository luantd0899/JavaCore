package util;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner scanner = new Scanner(System.in);

    public static int inputIntPositive(){
        while (true) {
            try {
                int intPositive = Integer.parseInt(scanner.nextLine());
                if (intPositive > 0) {
                    return intPositive;
                } else {
                    System.err.println("Số nhập vào phải là số dương. Mời nhập lại:");
                }
            } catch (Exception e) {
                System.err.println("Nhập vào phải là số. Mời nhập lại: ");
            }
        }
    }

    public static int inputInt(){
        while (true) {
            try {
                int intPositive = Integer.parseInt(scanner.nextLine());
                if (intPositive > 0) {
                    return intPositive;
                } else {
                    System.err.println("Số nhập vào phải là số dương. Mời nhập lại:");
                }
            } catch (Exception e) {
                System.err.println("Nhập vào phải là số. Mời nhập lại: ");
            }
        }
    }

    public static String inputPhone(){
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                String numberString =  "0" + number;
                int length = numberString.length();
                if (length < 9 || length > 12) {
                    System.err.println("Độ dài SĐT phải từ 9 -> 12, mời nhập lại!");
                    continue;
                }
                System.out.println(numberString);
                return numberString;
            } catch (Exception e) {
                System.err.println("Nhập vào phải là số. Mời nhập lại: ");
            }
        }
    }

    public static String inputName(){
        while (true) {
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                System.err.println("Nhập lại:");
            } else {
                String regex = "[A-Za-z]+";
                if (string.matches(regex)){
                    System.out.println(string);
                    return string;
                } else {
                    System.out.println("Tên ko đúng định dạng, mời nhập lại!");
                }
            }
        }
    }
    public static int inputNumber(int min, int max){
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.err.println("Số nhập vào ko hợp lệ. Mời nhập lại:");
                }
            } catch (Exception e) {
                System.err.println("Nhập vào phải là số. Mời nhập lại: ");
            }
        }
    }

    public static String inputString() {
        while (true) {
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                System.err.println("Nhập lại:");
            } else {
                return string;
            }
        }
    }

    public static String inputEmail(){
        while (true) {
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                System.err.println("Nhập lại:");
            } else if (!string.endsWith("@vti.com.vn")) {
                System.err.println("Nhập lại:");
            } else {
                return string;
            }
        }
    }

    public static String inputPasswords(){
        while (true) {
            String string = scanner.nextLine().trim();
            if (string.isEmpty()) {
                System.err.println("Sai định dạng, nhập lại:");
            } else if (string.length() < 6 || string.length() > 12) {
                System.err.println("Nhập lại:");
            } else {
                return string;
            }
        }
    }
}
