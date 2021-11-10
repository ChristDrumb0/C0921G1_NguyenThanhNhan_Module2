package case_study.menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 6) {
            System.out.println("Main menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    while (choice != 4) {
                        System.out.println("Employee Management menu");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Employee Management");
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Add new employee");
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("Edit employee");
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 2:
                    while (choice != 4){
                        System.out.println("Customer Management menu");
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Display list facility");
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Add new facility");
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("Display list facility maintenance");
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 3:
                    while (choice != 4){
                        System.out.println("Facility Management menu");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Display list facility");
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Add new facility");
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("Display list facility maintenance");
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                System.out.println("***********************");

                                break;

                        }
                    }
                    break;
                case 4:
                    while (choice != 6){
                        System.out.println("Booking Management menu");
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Display list facility");
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Add new facility");
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                System.out.println("Display list facility maintenance");
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Display list contracts");
                                System.out.println("***********************");
                                break;
                            case 5:
                                System.out.println("***********************");
                                System.out.println("Edit contracts");
                                System.out.println("***********************");
                                break;
                            case 6:
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }

                    }
                    choice = 0;
                    break;


                case 5:
                    while (choice != 6){
                        System.out.println("Promotion Management menu");
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        System.out.println("Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                System.out.println("Display list customers use service");
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                System.out.println("Display list customers get voucher");
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 6:
                    System.exit(6);
                    break;
                default:
                    System.out.println("Not a choice");

            }
        }
    }
}
