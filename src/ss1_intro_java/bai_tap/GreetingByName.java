package ss1_intro_java.bai_tap;
import java.util.Scanner;
public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name );
    }
}
