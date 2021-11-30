package nhap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Nhap {
    //    static int solution(String inputStr) {
//        String[] character = inputStr.split("");
//        ArrayList array = new ArrayList<>();
//        int count =0;
//        for(int i=0;i<inputStr.length();i++){
//            for (int j=0;j<inputStr.length();j++){
//                array.add(character[j]);
//            }
//        }
//        return array.size();
//    }
    private static String solution(int[] a, int[] b) {
        String str = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    str += b[j];
                }
            }
        }
        return str;
//        int[] arr = new int[str.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Interger.parseInt(str[i]);
//        }
//
//        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};
        System.out.println(solution(a,b));

    }

}

 