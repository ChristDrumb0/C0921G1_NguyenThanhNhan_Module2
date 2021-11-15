package ss1_intro_java.thuc_hanh;
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Month that wanted to count: ");
        byte month = scanner.nextByte();

        String daysofmonth;

        switch (month){
            case 2:
                daysofmonth = "28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysofmonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysofmonth = "30";
                break;
            default:
                daysofmonth = " ";
        }

        if (!daysofmonth.equals(" ")) System.out.printf("The month %d has %s days", month, daysofmonth);
        else System.out.println("invalid input");

    }
}
