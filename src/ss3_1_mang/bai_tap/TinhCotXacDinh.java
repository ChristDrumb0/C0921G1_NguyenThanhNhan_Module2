package ss3_1_mang.bai_tap;

import java.util.Scanner;

public class TinhCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp độ dài mảng chính");
        int l = scanner.nextInt();
        System.out.println("Nhâp độ dài mảng phụ");
        int lSub = scanner.nextInt();
        System.out.println("Nhập vào mảng");
        int array[][] = new int[l][lSub];
        for (int i = 0; i<l;i++){
            for (int j  = 0;j<lSub;j++){
                array[i][j] = scanner.nextInt();
            }

        }

        for (int[] n : array){
            for (int x : n) {
                System.out.print(x+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("Nhập vào cột cần tính tổng");
        int col = scanner.nextInt();
        int sum = 0;
        if(col>-1 && col<lSub){
            for (int i = 0;i<array.length;i++){
                sum+= array[i][col];
            }
        }
        else{
            System.out.println("Cột không phù hợp");
        }
        System.out.println("tổng cột được chọn là: "+ sum);
    }
}
