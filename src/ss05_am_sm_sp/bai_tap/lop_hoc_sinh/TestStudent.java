package ss05_am_sm_sp.bai_tap.lop_hoc_sinh;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        String name = "No Name";
        student1.setName(name);
        System.out.println(student1.getName());
        String classes = "C09";
        student1.setClasses(classes);
        System.out.println(student1.getClasses());


    }
}
