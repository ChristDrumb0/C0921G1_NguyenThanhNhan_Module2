package ss06_inheritence.bai_tap.circle_cylinder;

import java.util.Scanner;

public class MainCircleCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính");
        double r = sc.nextDouble();
        System.out.println("Nhập chiều cao");
        double h = sc.nextDouble();
        sc.skip("\\R");
        System.out.println("Nhập màu");
        String c = sc.nextLine();
        Circle circle = new Circle(r,c);
        Cylinder cylinder = new Cylinder(r,c,h);
        System.out.println("Diện tích hình tròn");
        System.out.println(circle.getArea());
        System.out.println("Thể tích hình trụ");
        System.out.println(cylinder.getVolume());
    }
}
