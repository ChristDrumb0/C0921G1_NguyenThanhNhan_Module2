package case_study.controller;

import case_study.services.EmployeeService;

import java.util.Scanner;

public class MainMenu {
    EmployeeController employee = new EmployeeController();
    public void menu() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 6) {
            System.out.print("Main menu\n"+
            "1. Employee Management\n"+
            "2. Customer Management\n"+
            "3. Facility Management \n"+
            "4. Booking Management\n"+
            "5. Promotion Management\n"+
            "6. Exit\n"+
            "Enter your choice: \n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    while (choice != 4) {
                        System.out.print("Employee Management menu \n"+
                        "1. Display list employees\n"+
                        "2. Add new employee\n"+
                        "3. Edit employee\n"+
                        "4. Return main menu\n"+
                        "Enter your choice: ");
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("***********************");
                                employee.displayEmployee();
                                System.out.println("***********************");
                                break;
                            case 2:
                                System.out.println("***********************");
                                employee.addEmployee();
                                System.out.println("Đã thêm thành công");
                                employee.displayEmployee();
                                System.out.println("***********************");
                                break;
                            case 3:
                                System.out.println("***********************");
                                employee.editEmployee();
                                System.out.println("Đã sửa thành công");
                                employee.displayEmployee();
                                System.out.println("***********************");
                                break;
                            case 4:
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 2:
                    while (choice != 4){
                        System.out.print("Customer Management menu\n"+
                        "1. Display list customers\n"+
                        "2. Add new customer\n"+
                        "3. Edit customer\n"+
                        "4. Return main menu\n"+
                        "Enter your choice: \n");
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
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 3:
                    while (choice != 4){
                        System.out.print("Facility Management menu\n"+
                        "1. Display list facility\n"+
                        "2. Add new facility\n"+
                        "3. Display list facility maintenance\n"+
                        "4. Return main menu\n"+
                        "Enter your choice: \n");
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
                                System.out.println("Return main menu");
                                System.out.println("***********************");

                                break;

                        }
                    }
                    break;
                case 4:
                    while (choice != 6){
                        System.out.print("Booking Management menu\n"+
                        "1. Add new booking\n"+
                        "2. Display list booking\n"+
                        "3. Create new contracts\n"+
                        "4. Display list contracts\n"+
                        "5. Edit contracts\n"+
                        "6. Return main menu\n"+
                        "Enter your choice: \n");
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
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }

                    }
                    choice = 0;
                    break;


                case 5:
                    while (choice != 6){
                        System.out.print("Promotion Management menu\n"+
                        "1. Display list customers use service\n"+
                        "2. Display list customers get voucher\n"+
                        "3. Return main menu\n"+
                        "Enter your choice: \n");
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
                                System.out.println("***********************");
                                System.out.println("Return main menu");
                                System.out.println("***********************");
                                break;

                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("not a choice");

            }
        }
    }
}
