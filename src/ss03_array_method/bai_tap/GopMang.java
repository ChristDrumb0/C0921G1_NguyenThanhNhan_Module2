package ss03_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int arr2[] = new int[5];
        int l = arr2.length+arr.length;
        System.out.println("Nhập vào mảng 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập vào mảng 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        int result [] = new int[l];
        //cách 1
////        int arr3[] = new int[(arr.length + arr2.length)];
//        //int [][]array = new int[4][5];
//        int[] arr3 = Arrays.copyOf(arr,arr2.length+arr.length);
//
//        for (int i =0 ; i < arr2.length; i++){
//            arr3[i+arr.length]=arr2[i];
//        }
//
//        for(int n:arr3){
//            System.out.print(n+ " ");
//        }
        //cách 2
        System.arraycopy(arr,0,result,0, arr.length);
        System.arraycopy(arr2,0,result, arr.length,arr2.length);
        System.out.println(Arrays.toString(result));
    }
}
