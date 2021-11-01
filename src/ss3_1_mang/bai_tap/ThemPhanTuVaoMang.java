package ss3_1_mang.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]= {10,4,6,7,8};
//        arr = Arrays.copyOf(arr,arr.length+1);
//        for(int n:arr){
//            System.out.print(n);
//        }

        int newArr[]= new int[arr.length+1];
        System.out.println("Nhập vào phần tử cần thêm");
        int x = scanner.nextInt();
        int index = -1;
        boolean flag = true;
        do {
            System.out.println("nhập vào vị trí cần thêm vào");
            index = scanner.nextInt();
            if(index>-1&& index<(arr.length-1)){
                flag = false;
            }else{
                System.out.println("Không thể nhập vị trí này");
            }

        }
        while (flag);
//        if (index == 0){
//            arr[0]=x;
//            for(int i = 1; i<arr.length;i++){
//               arr [i]=arr[i-1];
//            }
//        }else{
//            arr[index]=x;
//            for(int i = index+1; i<arr.length;i++){
//                arr[i]=arr[i-1];
//            }
//            for(int n : arr){
//                System.out.print(n+ " ");
//            }
//
//        }
        System.out.println(index);
        if(index == 0 ){
            newArr[0]=x;
            for(int i = 1; i<newArr.length;i++){
                newArr[i]=arr[i-1];
            }
        }else{
            for(int i = 0 ; i<index;i++){
                newArr[i]=arr[i];
            }newArr[index]=x;
            for(int i = index+1; i<newArr.length;i++){
                newArr[i]=arr[i-1];
            }
            for(int n : newArr){
                System.out.print(n+ " ");
            }

        }

    }
}
