package ss4_class_object.thuc_hanh.lop_hinh_chu_nhat;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhập Vào chiều rộng");
        double width = scanner.nextDouble();
        System.out.print("Nhập vào chiều cao");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("hình chữ nhật: "+rectangle.display());
        System.out.println("có diện tích: "+rectangle.getArea());
        System.out.println("có chu vi: "+rectangle.getPerimeter());
    }
}
