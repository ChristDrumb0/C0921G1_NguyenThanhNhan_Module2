package ss4_class_object.bai_tap.lop_phuong_trinh_bac_hai;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.printf("Phương trình có nghiệm thứ nhất là %f và %f ",quadraticEquation.getRoot1(), quadraticEquation.getRoot2());

        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có 2 nghiệm là: "+quadraticEquation.getRoot1());
        }
        else{
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
