package ss3_1_mang.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp độ dài mảng chính");
        int l = scanner.nextInt();
        System.out.println("Nhâp độ dài mảng phụ");
        int lSub = scanner.nextInt();
        System.out.println("Nhập vào mảng");
        int arr[][] = new int[l][lSub];
        for (int i = 0; i<l;i++){
            for (int j  = 0;j<lSub;j++){
                arr[i][j] = scanner.nextInt();
            }

        }

        for (int[] n : arr){
            for (int x : n) {
                System.out.print(x+"\t");
            }
            System.out.println("");
        }
        //Duyệt số lớn nhất
        int max = arr[0][0];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i<l;i++) {
            for (int j = 0; j < lSub; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là %d tại vị trí arr[%d][%d]", max,index1,index2);
    }
}
