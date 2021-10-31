package ss2_vong_lap.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra");
        int so = sc.nextInt();
        if(so > 2 ){
            boolean flag = true;
            for(int i = 2; i < so;i++){
                if(so%i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(so+" là số nguyên tố");

            }else {
                System.out.println(so+" không phải là số nguyên tố");
            }
        }
        else{
            System.out.println(so+" là số nguyên tố");
        }

    }

}
