package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Stack<Integer> binaryConvert = new Stack<>();
        while(number!=0){
            int decimal = number%2;
            binaryConvert.push(decimal);
            number/=2;

        }

        while(!binaryConvert.isEmpty()){
            System.out.print(binaryConvert.pop());
        }
//        for (int i = binaryConvert.size()-1; i >0 ; i--) {
//            System.out.print(binaryConvert.get(i));
//        }

    }
}
