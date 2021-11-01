package ss3_1_mang.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMaTrangVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp độ dài ma trận vuông");
        int l = scanner.nextInt();
        System.out.println("Nhập vào mảng");
        int array[][] = new int[l][l];
        for (int i = 0; i<l;i++){
            for (int j  = 0;j<l;j++){
                array[i][j] = scanner.nextInt();
            }
        }

        for (int[] n : array){
            for (int x : n) {
                System.out.print(x+"\t");
            }
            System.out.println(" ");
        }

        int sum = 0;

            for (int i = 0;i<array.length;i++){
                for(int j=0; j<array[i].length;j++){
                    if(j==i){
                        sum+= array[i][j];
                    }

                }

            }

        System.out.println("tổng cột được chọn là: "+ sum);
    }
}
