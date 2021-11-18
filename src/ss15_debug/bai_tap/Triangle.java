package ss15_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException{
        if(a > 0 && b > 0 && c > 0){
            if(a < b + c && b < a + c && c < a + b){
                System.out.println(a + ", " + b + ", " + c + " là 3 cạnh của 1 tam giác");
            }else {
                throw new IllegalTriangleException("Không thỏa mãng 3 cạnh của 1 tam giác");
            }
        }else {
            throw new IllegalTriangleException("Cạnh tam giác phải là số dương");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.println("Nhập vào cạnh 1");
                int a = sc.nextInt();
                System.out.println("Nhập vào cạnh 2");
                int b = sc.nextInt();
                System.out.println("Nhập vào cạnh 3");
                int c = sc.nextInt();
                Triangle triangle = new Triangle(a,b,c);
                break;
            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
