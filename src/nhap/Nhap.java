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

    int studyLevel;

    public Nhap(int studyLevel) {
        this.studyLevel = studyLevel;
    }

    public String getTest() {
        switch (studyLevel) {
            case 1:
                return "Intermediate";
            case 2:
                return "College";
            case 3:
                return "University";
            case 4:
                return "Post Graduated";

            default:
                return "-1";
        }

    }

    @Override
    public String toString() {
        return "Nhap{" +
                "studyLevel=" + getTest() +
                '}';
    }

    public static void main(String[] args) {
        Nhap nhap = new Nhap(2);
        System.out.println(nhap);

    }
}

 