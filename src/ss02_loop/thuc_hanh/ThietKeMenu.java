package ss02_loop.thuc_hanh;
import java.util.Scanner;
public class ThietKeMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the 4 triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle 1");
                    for(int i=0;i<5;i++){
                        for(int j=5;j>i;j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Draw the triangle 2");
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Draw the triangle 3");
                    for(int i=0;i<5;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print(" ");
                        }
                        for(int l=5;l>i;l--){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Draw the triangle 4");
                    for(int i=0;i<5;i++){
                        for(int j=5;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int j=0;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the isosceles triangle");
                    for(int i=1;i<=5;i++){
                        for(int j=5;j>=i;j--){
                            System.out.print(" ");
                        }
                        for(int k=1; k<=2*i-1;k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i=0;i<3;i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
