package ss1_intro_java.bai_tap;

import java.util.Scanner;

public class NumberInWord {

    public static String oneNum(int num) {
        String result = "";
        switch (num) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                break;
        }
        return result;
    }

    public static String twoNum(int num) {
        String result = "";
        if (num >= 10 && num <= 19) {
            if (num == 10) {
                result = "ten";
            } else if (num % 10 <= 3) {
                switch (num % 10) {
                    case 1:
                        result = "eleven";
                        break;
                    case 2:
                        result = "twelve";
                        break;
                    case 3:
                        result = "thirteen";
                        break;
                }

            } else {
                result = oneNum(num % 10) + "teen";
            }
        } else {
            if (num >= 20 && num <= 29) {
                if (num == 20) {
                    result = "twenty";
                } else {
                    result = "twenty " + oneNum(num % 10);
                }
            } else if (num >= 30 && num <= 39) {
                if (num == 30) {
                    result = "thirty";
                } else {
                    result = "thirty " + oneNum(num % 10);
                }
            } else if (num >= 40 && num <= 49) {
                if (num == 40) {
                    result = "forty";
                } else {
                    result = "forty " + oneNum(num % 10);
                }
            } else if (num >= 50 && num <= 59) {
                if (num == 50) {
                    result = "fifty";
                } else {
                    result = "fifty " + oneNum(num % 10);
                }
            } else {
                result = oneNum(num / 10) + "ty " + oneNum(num % 10);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        String result = "";
        if (number == 0)
            result = "zero";
        else if (number > 0 && number <= 9) {
            result = oneNum(number);
        } else if (number >= 10 && number <= 99) {
            result = twoNum(number);
        } else if (number >= 100 && number <= 999) {
            if (number % 100 / 10 == 0) {
                if (number % 10 == 0) {
                    result = oneNum(number / 100) + " hundred";
                } else {
                    result = oneNum(number / 100) + " hundred and " + oneNum(number % 10);
                }

            } else {
                result = oneNum(number / 100) + " hundred and " + twoNum(number % 100);
            }

        } else {
            System.out.println("out of ability");
        }
        System.out.println(result);
    }


//    final static String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
//    final static String twos[] = {" ", " ", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
//    private static void numberToWord(int num, String val) {
//        System.out.print(num > 19 ? twos[num / 10] + " " + ones[num % 10] : ones[num]);
//        System.out.print(num > 0 ? val : "");
//    }
//    public static void main(String[] args) {
//        System.out.print("Input a number:");
//        int num = new Scanner(System.in).nextInt();
//        numberToWord(((num / 100) % 10), " HUNDRED AND");
//        numberToWord((num % 100), " ");
//    }
//}
}
