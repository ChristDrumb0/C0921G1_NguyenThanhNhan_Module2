package ss3_array_method.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Nhập phần tử cần xóa");
        int x = scanner.nextInt();
        boolean flag = true;
        int indexDel = 0;
        for (int i =0;i<arr.length;i++){
            if (x == arr[i]){
                flag = false;
                indexDel = i;
                break;
            }
        }
        if (flag){
            System.out.println("Phần tử không có trong mảng");
        }else{
            for (int i = indexDel; i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
            System.out.printf("Phần tử %d có tại vị trí thứ %d của mảng", x,(indexDel+1));
            System.out.println("");
            System.out.println("mảng mới là:");
            for (int n:arr){
                System.out.print(n+" ");
            }
        }


    }

}
