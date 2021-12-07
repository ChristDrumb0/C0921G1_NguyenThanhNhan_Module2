package exam.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationExam {
    static Scanner sc = new Scanner(System.in);
    private static final String DATE_REGEX = "^((0[1-9])|([1-2]\\d)+|([3][0-1])+)\\/((0[1-9])|(1[0-2]))\\/((19[2-9]\\d)|(200[0-3]))$";
    private static final String NAME_REGEX = "^[A-Z][a-z]+((\\s[A-Z][a-z]+){0,5})$";
    public static boolean validateName(String regex) {
        return Pattern.matches(NAME_REGEX, regex);
    }
    public static String checkName() {
        String name;
        while (true) {
            try {

                name = sc.nextLine();
                if (!validateName(name)) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("follow format ex:Apple");

            }

        }
        return name;
    }


}
