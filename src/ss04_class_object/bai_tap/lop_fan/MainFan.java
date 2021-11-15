package ss04_class_object.bai_tap.lop_fan;

import java.util.Scanner;

public class MainFan {
    private static Fan setFan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào speed");
        int speed = scanner.nextInt();
        System.out.println("Nhập vào check");
        boolean check = scanner.nextBoolean();
        System.out.println("Nhập vào radius");
        double radius = scanner.nextDouble();
        scanner.skip("\\R");
        System.out.println("Nhập vào color");
        String color = scanner.nextLine();

        Fan fan = new Fan(speed, check, radius,color);
        return fan;
    }
    public static void main(String[] args) {
        Fan fan1 = setFan();
        Fan fan2 = setFan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
