package ss3_1_mang.bai_tap;

import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int l = scanner.nextInt();
        System.out.println("Nhập vào phần tử của mảng");
        int arr[] = new int[l];
        for (int j = 0; j<l;j++){
            arr[j]=scanner.nextInt();
        }
        int index = 0;
        int min = arr[0];
        for(int i = 0 ; i<l;i++){
            if(min>arr[i]){
                min=arr[i];
                index = i;
            }
        }
        for (int n :arr) {
            System.out.print(n);
        }
        System.out.println("");
        System.out.printf("Số nhỏ nhất của mảng là %d tại vị trí %d",min,index+1);
    }
}
