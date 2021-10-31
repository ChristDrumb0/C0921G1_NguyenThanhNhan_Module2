package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class TinhLaiSuatVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("nhập số tiền gửi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng: ");
        month = scanner.nextInt();
        System.out.println("Nhập tỉ lệ phần trăm năm: ");
        interestRate = scanner.nextDouble();

        double moneyOut = 0;
        for(int i = 0; i < month; i++){
            moneyOut += money * (interestRate/100)/12 * month;
        }
        System.out.println("Số tiền nhận được là: "+ moneyOut);
    }
}
