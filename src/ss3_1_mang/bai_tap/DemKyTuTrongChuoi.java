package ss3_1_mang.bai_tap;

import java.util.Scanner;

public class DemKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String string = scanner.nextLine();
        System.out.println("Nhập vào ký tự cần tìm");
        char c = scanner.next().charAt(0);
        int count = 0;
        for (int i =0;i<string.length();i++){
            if (string.charAt(i) == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
