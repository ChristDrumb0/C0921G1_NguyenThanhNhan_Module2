package case_study.utils.validation;

import ss15_debug.bai_tap.IllegalTriangleException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationRegex {
    Scanner sc = new Scanner(System.in);
    private static final String FACILITY_REGEX = "^(SV)(RO|VL|HO)\\d{4}$";

    public boolean validateFacility(String regex) {
        return Pattern.matches(FACILITY_REGEX, regex);
    }

    private static final String EMPLOYEE_REGEX = "^[A-Z]{2}\\d{4}$";

    public boolean validateEmployee(String regex) {
        return Pattern.matches(EMPLOYEE_REGEX, regex);
    }

    private static final String CUSTOMER_REGEX = "^(CUS)\\d{4}$";

    public boolean validateCustomer(String regex) {
        return Pattern.matches(CUSTOMER_REGEX, regex);
    }

    public String checkIdEmp() {
        String id;
        while (true) {
            try {
                System.out.println("Nhập id");
                id = sc.nextLine();
                if (!validateEmployee(id)) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("nhập lại theo format");
            }

        }
        return id;
    }

    public String checkIdCus() {
        String id;
        while (true) {
            try {
                System.out.println("Nhập id khách hàng");
                id = sc.nextLine();
                if (!validateCustomer(id)) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("nhập lại theo format");

            }

        }
        return id;
    }

    public String checkIdFac() {
        String id;
        while (true) {
            try {
                System.out.println("Nhập id phòng");
                id = sc.nextLine();
                if (!validateFacility(id)) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("nhập lại theo format");
            }

        }
        return id;
    }

    public double checkArea() {
        double area;
        while (true) {
            try {
                area = Double.parseDouble(sc.nextLine());
                if (area < 0 || area > 30) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Nhập trong khoảng 0-30");
            }

        }

        return area;
    }

    public double checkRental() {
        double rental;
        while (true) {
             try{
                 rental = Double.parseDouble(sc.nextLine());
                 if(rental<0){
                     throw new IllegalArgumentException();
                 }
                 break;
             }catch (IllegalArgumentException e){
                 System.err.println("Nhập số dương");
             }
        }
        return rental;
    }
    public int checkStories(){
        int stories;
        while (true){
            try{
                stories = Integer.parseInt(sc.nextLine());
                if(stories<0 || stories>20){
                    throw new IllegalArgumentException();
                }
                break;
            }catch (IllegalArgumentException e){
                System.err.println("Nhập số nguyên dương nhỏ hơn 20");
            }
        }
        return stories;
    }

}
