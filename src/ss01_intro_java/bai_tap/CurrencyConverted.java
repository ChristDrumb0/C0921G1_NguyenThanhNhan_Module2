package ss1_intro_java.bai_tap;
import java.util.Scanner;
public class CurrencyConverted {
    public static void main(String[] args) {
        double vnd = 23300;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD cần quy đổi");
        double usd = scanner.nextDouble();
        double result = usd*vnd;
        System.out.println( result + " VND");


    }

}
