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
    public static int solution(String inputStr)
    {
        Set<String> result = new HashSet<>();

        for (int i = 0; i < inputStr.length(); i++) {
            for (int j = i + 1; j <= inputStr.length(); j++) {

                result.add(inputStr.substring(i, j));
            }
        }

        return result.size();
    }

    // Driver Code
    public static void main(String[] args)
    {
        String inputStr = "abca";
        System.out.println(solution(inputStr));
    }
}

 